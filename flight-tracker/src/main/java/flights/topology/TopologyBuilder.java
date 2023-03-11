package flights.topology;

import flights.serde.Serde;
import org.apache.kafka.common.serialization.Serdes;

import java.security.Key;
import java.util.Properties;
import java.util.stream.Stream;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import radar.AirportUpdateEvent;
import radar.FlightUpdateEvent;
import radar.FlightTransformation;

public class TopologyBuilder implements Serde {

    private Properties config;

    public TopologyBuilder(Properties properties) {
        this.config = properties;
    }

    private static final Logger logger = LogManager.getLogger(TopologyBuilder.class);

    public Topology build() {
        StreamsBuilder builder = new StreamsBuilder();
        String schemaRegistry = config.getProperty("kafka.schema.registry.url");

        KStream<String, FlightUpdateEvent> flightInputStream = builder.stream(
                config.getProperty("kafka.topic.flight.update.events"),
                Consumed.with(Serde.stringSerde, Serde.specificSerde(FlightUpdateEvent.class, schemaRegistry)));
        
        
        GlobalKTable<String, AirportUpdateEvent> airportTable = builder.globalTable(
                config.getProperty("kafka.topic.airport.update.events"),
                Consumed.with(Serde.stringSerde, Serde.specificSerde(AirportUpdateEvent.class, schemaRegistry)));

        
        flightInputStream.map((key, value) -> KeyValue.pair(key, filterData(key, value))).to("radar.flights", Produced.with(Serde.stringSerde,  Serde.specificSerde(FlightTransformation.class, schemaRegistry)));
        return builder.build();

    }





    public FlightTransformation filterData(String key, FlightUpdateEvent fue){

        FlightTransformation transformed = new FlightTransformation();


        String Od = fue.getDestination().toString().split("->")[0];
        String Do = fue.getDestination().toString().split("->")[1];


        transformed.setArrivalAirportCode(Do.substring(Do.indexOf("(") +1, Do.indexOf(")")));
        transformed.setDepartureAirportCode(Od.substring(Od.indexOf("(") +1, Od.indexOf(")")));

        transformed.setTo(Do.substring(0, Do.indexOf("(") ));
        transformed.setFrom(Od.substring(0, Od.indexOf("(") ));

        transformed.setDepartureTimestamp(fue.getSTD());
        transformed.setArrivalTimestamp(fue.getSTA());
        
        transformed.setDuration( (fue.getSTA()-fue.getSTD()) /60 );


        ZoneId zoneIdArrival = ZoneId.of(fue.getTimezones().toString().split("->")[1]);
        ZoneId zoneIdDeparture = ZoneId.of(fue.getTimezones().toString().split("->")[0]);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");

        String formattedArrival = formatter.format(ZonedDateTime.ofInstant(Instant.ofEpochSecond(fue.getSTA()), zoneIdArrival).toInstant());
        String formattedDeparture = formatter.format(ZonedDateTime.ofInstant(Instant.ofEpochSecond(fue.getSTD()), zoneIdDeparture).toInstant());

        transformed.setDepartureDatetime(formattedDeparture);
        transformed.setArrivalDatetime(formattedArrival);

        

      



        return transformed;

    }


}

/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package radar;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class AirportUpdateEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2700903320042227278L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AirportUpdateEvent\",\"namespace\":\"radar\",\"fields\":[{\"name\":\"airpot\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"country\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"latitude\",\"type\":[\"double\",\"null\"]},{\"name\":\"longitude\",\"type\":[\"double\",\"null\"]},{\"name\":\"tz\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AirportUpdateEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AirportUpdateEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AirportUpdateEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AirportUpdateEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AirportUpdateEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AirportUpdateEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AirportUpdateEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AirportUpdateEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AirportUpdateEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence airpot;
  private java.lang.CharSequence city;
  private java.lang.CharSequence country;
  private java.lang.CharSequence code;
  private java.lang.Double latitude;
  private java.lang.Double longitude;
  private java.lang.CharSequence tz;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AirportUpdateEvent() {}

  /**
   * All-args constructor.
   * @param airpot The new value for airpot
   * @param city The new value for city
   * @param country The new value for country
   * @param code The new value for code
   * @param latitude The new value for latitude
   * @param longitude The new value for longitude
   * @param tz The new value for tz
   */
  public AirportUpdateEvent(java.lang.CharSequence airpot, java.lang.CharSequence city, java.lang.CharSequence country, java.lang.CharSequence code, java.lang.Double latitude, java.lang.Double longitude, java.lang.CharSequence tz) {
    this.airpot = airpot;
    this.city = city;
    this.country = country;
    this.code = code;
    this.latitude = latitude;
    this.longitude = longitude;
    this.tz = tz;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return airpot;
    case 1: return city;
    case 2: return country;
    case 3: return code;
    case 4: return latitude;
    case 5: return longitude;
    case 6: return tz;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: airpot = (java.lang.CharSequence)value$; break;
    case 1: city = (java.lang.CharSequence)value$; break;
    case 2: country = (java.lang.CharSequence)value$; break;
    case 3: code = (java.lang.CharSequence)value$; break;
    case 4: latitude = (java.lang.Double)value$; break;
    case 5: longitude = (java.lang.Double)value$; break;
    case 6: tz = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'airpot' field.
   * @return The value of the 'airpot' field.
   */
  public java.lang.CharSequence getAirpot() {
    return airpot;
  }


  /**
   * Sets the value of the 'airpot' field.
   * @param value the value to set.
   */
  public void setAirpot(java.lang.CharSequence value) {
    this.airpot = value;
  }

  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.CharSequence getCity() {
    return city;
  }


  /**
   * Sets the value of the 'city' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.city = value;
  }

  /**
   * Gets the value of the 'country' field.
   * @return The value of the 'country' field.
   */
  public java.lang.CharSequence getCountry() {
    return country;
  }


  /**
   * Sets the value of the 'country' field.
   * @param value the value to set.
   */
  public void setCountry(java.lang.CharSequence value) {
    this.country = value;
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }


  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'latitude' field.
   * @return The value of the 'latitude' field.
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }


  /**
   * Sets the value of the 'latitude' field.
   * @param value the value to set.
   */
  public void setLatitude(java.lang.Double value) {
    this.latitude = value;
  }

  /**
   * Gets the value of the 'longitude' field.
   * @return The value of the 'longitude' field.
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }


  /**
   * Sets the value of the 'longitude' field.
   * @param value the value to set.
   */
  public void setLongitude(java.lang.Double value) {
    this.longitude = value;
  }

  /**
   * Gets the value of the 'tz' field.
   * @return The value of the 'tz' field.
   */
  public java.lang.CharSequence getTz() {
    return tz;
  }


  /**
   * Sets the value of the 'tz' field.
   * @param value the value to set.
   */
  public void setTz(java.lang.CharSequence value) {
    this.tz = value;
  }

  /**
   * Creates a new AirportUpdateEvent RecordBuilder.
   * @return A new AirportUpdateEvent RecordBuilder
   */
  public static radar.AirportUpdateEvent.Builder newBuilder() {
    return new radar.AirportUpdateEvent.Builder();
  }

  /**
   * Creates a new AirportUpdateEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AirportUpdateEvent RecordBuilder
   */
  public static radar.AirportUpdateEvent.Builder newBuilder(radar.AirportUpdateEvent.Builder other) {
    if (other == null) {
      return new radar.AirportUpdateEvent.Builder();
    } else {
      return new radar.AirportUpdateEvent.Builder(other);
    }
  }

  /**
   * Creates a new AirportUpdateEvent RecordBuilder by copying an existing AirportUpdateEvent instance.
   * @param other The existing instance to copy.
   * @return A new AirportUpdateEvent RecordBuilder
   */
  public static radar.AirportUpdateEvent.Builder newBuilder(radar.AirportUpdateEvent other) {
    if (other == null) {
      return new radar.AirportUpdateEvent.Builder();
    } else {
      return new radar.AirportUpdateEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for AirportUpdateEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AirportUpdateEvent>
    implements org.apache.avro.data.RecordBuilder<AirportUpdateEvent> {

    private java.lang.CharSequence airpot;
    private java.lang.CharSequence city;
    private java.lang.CharSequence country;
    private java.lang.CharSequence code;
    private java.lang.Double latitude;
    private java.lang.Double longitude;
    private java.lang.CharSequence tz;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(radar.AirportUpdateEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.airpot)) {
        this.airpot = data().deepCopy(fields()[0].schema(), other.airpot);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.city)) {
        this.city = data().deepCopy(fields()[1].schema(), other.city);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.country)) {
        this.country = data().deepCopy(fields()[2].schema(), other.country);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.code)) {
        this.code = data().deepCopy(fields()[3].schema(), other.code);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.latitude)) {
        this.latitude = data().deepCopy(fields()[4].schema(), other.latitude);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.longitude)) {
        this.longitude = data().deepCopy(fields()[5].schema(), other.longitude);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.tz)) {
        this.tz = data().deepCopy(fields()[6].schema(), other.tz);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing AirportUpdateEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(radar.AirportUpdateEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.airpot)) {
        this.airpot = data().deepCopy(fields()[0].schema(), other.airpot);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.city)) {
        this.city = data().deepCopy(fields()[1].schema(), other.city);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.country)) {
        this.country = data().deepCopy(fields()[2].schema(), other.country);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.code)) {
        this.code = data().deepCopy(fields()[3].schema(), other.code);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.latitude)) {
        this.latitude = data().deepCopy(fields()[4].schema(), other.latitude);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.longitude)) {
        this.longitude = data().deepCopy(fields()[5].schema(), other.longitude);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.tz)) {
        this.tz = data().deepCopy(fields()[6].schema(), other.tz);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'airpot' field.
      * @return The value.
      */
    public java.lang.CharSequence getAirpot() {
      return airpot;
    }


    /**
      * Sets the value of the 'airpot' field.
      * @param value The value of 'airpot'.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder setAirpot(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.airpot = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'airpot' field has been set.
      * @return True if the 'airpot' field has been set, false otherwise.
      */
    public boolean hasAirpot() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'airpot' field.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder clearAirpot() {
      airpot = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.CharSequence getCity() {
      return city;
    }


    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.city = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder clearCity() {
      city = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'country' field.
      * @return The value.
      */
    public java.lang.CharSequence getCountry() {
      return country;
    }


    /**
      * Sets the value of the 'country' field.
      * @param value The value of 'country'.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder setCountry(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.country = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'country' field has been set.
      * @return True if the 'country' field has been set, false otherwise.
      */
    public boolean hasCountry() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'country' field.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder clearCountry() {
      country = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public java.lang.CharSequence getCode() {
      return code;
    }


    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.code = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder clearCode() {
      code = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'latitude' field.
      * @return The value.
      */
    public java.lang.Double getLatitude() {
      return latitude;
    }


    /**
      * Sets the value of the 'latitude' field.
      * @param value The value of 'latitude'.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder setLatitude(java.lang.Double value) {
      validate(fields()[4], value);
      this.latitude = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'latitude' field has been set.
      * @return True if the 'latitude' field has been set, false otherwise.
      */
    public boolean hasLatitude() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'latitude' field.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder clearLatitude() {
      latitude = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'longitude' field.
      * @return The value.
      */
    public java.lang.Double getLongitude() {
      return longitude;
    }


    /**
      * Sets the value of the 'longitude' field.
      * @param value The value of 'longitude'.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder setLongitude(java.lang.Double value) {
      validate(fields()[5], value);
      this.longitude = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'longitude' field has been set.
      * @return True if the 'longitude' field has been set, false otherwise.
      */
    public boolean hasLongitude() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'longitude' field.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder clearLongitude() {
      longitude = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'tz' field.
      * @return The value.
      */
    public java.lang.CharSequence getTz() {
      return tz;
    }


    /**
      * Sets the value of the 'tz' field.
      * @param value The value of 'tz'.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder setTz(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.tz = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'tz' field has been set.
      * @return True if the 'tz' field has been set, false otherwise.
      */
    public boolean hasTz() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'tz' field.
      * @return This builder.
      */
    public radar.AirportUpdateEvent.Builder clearTz() {
      tz = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AirportUpdateEvent build() {
      try {
        AirportUpdateEvent record = new AirportUpdateEvent();
        record.airpot = fieldSetFlags()[0] ? this.airpot : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.city = fieldSetFlags()[1] ? this.city : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.country = fieldSetFlags()[2] ? this.country : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.code = fieldSetFlags()[3] ? this.code : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.latitude = fieldSetFlags()[4] ? this.latitude : (java.lang.Double) defaultValue(fields()[4]);
        record.longitude = fieldSetFlags()[5] ? this.longitude : (java.lang.Double) defaultValue(fields()[5]);
        record.tz = fieldSetFlags()[6] ? this.tz : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AirportUpdateEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<AirportUpdateEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AirportUpdateEvent>
    READER$ = (org.apache.avro.io.DatumReader<AirportUpdateEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.airpot);

    out.writeString(this.city);

    out.writeString(this.country);

    out.writeString(this.code);

    if (this.latitude == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeDouble(this.latitude);
    }

    if (this.longitude == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeDouble(this.longitude);
    }

    if (this.tz == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.tz);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.airpot = in.readString(this.airpot instanceof Utf8 ? (Utf8)this.airpot : null);

      this.city = in.readString(this.city instanceof Utf8 ? (Utf8)this.city : null);

      this.country = in.readString(this.country instanceof Utf8 ? (Utf8)this.country : null);

      this.code = in.readString(this.code instanceof Utf8 ? (Utf8)this.code : null);

      if (in.readIndex() != 0) {
        in.readNull();
        this.latitude = null;
      } else {
        this.latitude = in.readDouble();
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.longitude = null;
      } else {
        this.longitude = in.readDouble();
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.tz = null;
      } else {
        this.tz = in.readString(this.tz instanceof Utf8 ? (Utf8)this.tz : null);
      }

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.airpot = in.readString(this.airpot instanceof Utf8 ? (Utf8)this.airpot : null);
          break;

        case 1:
          this.city = in.readString(this.city instanceof Utf8 ? (Utf8)this.city : null);
          break;

        case 2:
          this.country = in.readString(this.country instanceof Utf8 ? (Utf8)this.country : null);
          break;

        case 3:
          this.code = in.readString(this.code instanceof Utf8 ? (Utf8)this.code : null);
          break;

        case 4:
          if (in.readIndex() != 0) {
            in.readNull();
            this.latitude = null;
          } else {
            this.latitude = in.readDouble();
          }
          break;

        case 5:
          if (in.readIndex() != 0) {
            in.readNull();
            this.longitude = null;
          } else {
            this.longitude = in.readDouble();
          }
          break;

        case 6:
          if (in.readIndex() != 0) {
            in.readNull();
            this.tz = null;
          } else {
            this.tz = in.readString(this.tz instanceof Utf8 ? (Utf8)this.tz : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











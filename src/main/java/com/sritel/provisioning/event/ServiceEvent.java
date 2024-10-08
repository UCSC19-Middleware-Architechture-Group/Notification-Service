/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.sritel.provisioning.event;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ServiceEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3483309864916947332L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ServiceEvent\",\"namespace\":\"com.sritel.provisioning.event\",\"fields\":[{\"name\":\"serviceId\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\"},{\"name\":\"activationDate\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"serviceName\",\"type\":\"string\"},{\"name\":\"serviceType\",\"type\":\"string\"},{\"name\":\"serviceDescription\",\"type\":\"string\"},{\"name\":\"serviceCategory\",\"type\":\"string\"},{\"name\":\"serviceCharge\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ServiceEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ServiceEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ServiceEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ServiceEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ServiceEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ServiceEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ServiceEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ServiceEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ServiceEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence serviceId;
  private java.lang.CharSequence email;
  private java.lang.CharSequence activationDate;
  private java.lang.CharSequence status;
  private java.lang.CharSequence serviceName;
  private java.lang.CharSequence serviceType;
  private java.lang.CharSequence serviceDescription;
  private java.lang.CharSequence serviceCategory;
  private float serviceCharge;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ServiceEvent() {}

  /**
   * All-args constructor.
   * @param serviceId The new value for serviceId
   * @param email The new value for email
   * @param activationDate The new value for activationDate
   * @param status The new value for status
   * @param serviceName The new value for serviceName
   * @param serviceType The new value for serviceType
   * @param serviceDescription The new value for serviceDescription
   * @param serviceCategory The new value for serviceCategory
   * @param serviceCharge The new value for serviceCharge
   */
  public ServiceEvent(java.lang.CharSequence serviceId, java.lang.CharSequence email, java.lang.CharSequence activationDate, java.lang.CharSequence status, java.lang.CharSequence serviceName, java.lang.CharSequence serviceType, java.lang.CharSequence serviceDescription, java.lang.CharSequence serviceCategory, java.lang.Float serviceCharge) {
    this.serviceId = serviceId;
    this.email = email;
    this.activationDate = activationDate;
    this.status = status;
    this.serviceName = serviceName;
    this.serviceType = serviceType;
    this.serviceDescription = serviceDescription;
    this.serviceCategory = serviceCategory;
    this.serviceCharge = serviceCharge;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return serviceId;
    case 1: return email;
    case 2: return activationDate;
    case 3: return status;
    case 4: return serviceName;
    case 5: return serviceType;
    case 6: return serviceDescription;
    case 7: return serviceCategory;
    case 8: return serviceCharge;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: serviceId = (java.lang.CharSequence)value$; break;
    case 1: email = (java.lang.CharSequence)value$; break;
    case 2: activationDate = (java.lang.CharSequence)value$; break;
    case 3: status = (java.lang.CharSequence)value$; break;
    case 4: serviceName = (java.lang.CharSequence)value$; break;
    case 5: serviceType = (java.lang.CharSequence)value$; break;
    case 6: serviceDescription = (java.lang.CharSequence)value$; break;
    case 7: serviceCategory = (java.lang.CharSequence)value$; break;
    case 8: serviceCharge = (java.lang.Float)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'serviceId' field.
   * @return The value of the 'serviceId' field.
   */
  public java.lang.CharSequence getServiceId() {
    return serviceId;
  }


  /**
   * Sets the value of the 'serviceId' field.
   * @param value the value to set.
   */
  public void setServiceId(java.lang.CharSequence value) {
    this.serviceId = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }


  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'activationDate' field.
   * @return The value of the 'activationDate' field.
   */
  public java.lang.CharSequence getActivationDate() {
    return activationDate;
  }


  /**
   * Sets the value of the 'activationDate' field.
   * @param value the value to set.
   */
  public void setActivationDate(java.lang.CharSequence value) {
    this.activationDate = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'serviceName' field.
   * @return The value of the 'serviceName' field.
   */
  public java.lang.CharSequence getServiceName() {
    return serviceName;
  }


  /**
   * Sets the value of the 'serviceName' field.
   * @param value the value to set.
   */
  public void setServiceName(java.lang.CharSequence value) {
    this.serviceName = value;
  }

  /**
   * Gets the value of the 'serviceType' field.
   * @return The value of the 'serviceType' field.
   */
  public java.lang.CharSequence getServiceType() {
    return serviceType;
  }


  /**
   * Sets the value of the 'serviceType' field.
   * @param value the value to set.
   */
  public void setServiceType(java.lang.CharSequence value) {
    this.serviceType = value;
  }

  /**
   * Gets the value of the 'serviceDescription' field.
   * @return The value of the 'serviceDescription' field.
   */
  public java.lang.CharSequence getServiceDescription() {
    return serviceDescription;
  }


  /**
   * Sets the value of the 'serviceDescription' field.
   * @param value the value to set.
   */
  public void setServiceDescription(java.lang.CharSequence value) {
    this.serviceDescription = value;
  }

  /**
   * Gets the value of the 'serviceCategory' field.
   * @return The value of the 'serviceCategory' field.
   */
  public java.lang.CharSequence getServiceCategory() {
    return serviceCategory;
  }


  /**
   * Sets the value of the 'serviceCategory' field.
   * @param value the value to set.
   */
  public void setServiceCategory(java.lang.CharSequence value) {
    this.serviceCategory = value;
  }

  /**
   * Gets the value of the 'serviceCharge' field.
   * @return The value of the 'serviceCharge' field.
   */
  public float getServiceCharge() {
    return serviceCharge;
  }


  /**
   * Sets the value of the 'serviceCharge' field.
   * @param value the value to set.
   */
  public void setServiceCharge(float value) {
    this.serviceCharge = value;
  }

  /**
   * Creates a new ServiceEvent RecordBuilder.
   * @return A new ServiceEvent RecordBuilder
   */
  public static com.sritel.provisioning.event.ServiceEvent.Builder newBuilder() {
    return new com.sritel.provisioning.event.ServiceEvent.Builder();
  }

  /**
   * Creates a new ServiceEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ServiceEvent RecordBuilder
   */
  public static com.sritel.provisioning.event.ServiceEvent.Builder newBuilder(com.sritel.provisioning.event.ServiceEvent.Builder other) {
    if (other == null) {
      return new com.sritel.provisioning.event.ServiceEvent.Builder();
    } else {
      return new com.sritel.provisioning.event.ServiceEvent.Builder(other);
    }
  }

  /**
   * Creates a new ServiceEvent RecordBuilder by copying an existing ServiceEvent instance.
   * @param other The existing instance to copy.
   * @return A new ServiceEvent RecordBuilder
   */
  public static com.sritel.provisioning.event.ServiceEvent.Builder newBuilder(com.sritel.provisioning.event.ServiceEvent other) {
    if (other == null) {
      return new com.sritel.provisioning.event.ServiceEvent.Builder();
    } else {
      return new com.sritel.provisioning.event.ServiceEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for ServiceEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ServiceEvent>
    implements org.apache.avro.data.RecordBuilder<ServiceEvent> {

    private java.lang.CharSequence serviceId;
    private java.lang.CharSequence email;
    private java.lang.CharSequence activationDate;
    private java.lang.CharSequence status;
    private java.lang.CharSequence serviceName;
    private java.lang.CharSequence serviceType;
    private java.lang.CharSequence serviceDescription;
    private java.lang.CharSequence serviceCategory;
    private float serviceCharge;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.sritel.provisioning.event.ServiceEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.serviceId)) {
        this.serviceId = data().deepCopy(fields()[0].schema(), other.serviceId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.activationDate)) {
        this.activationDate = data().deepCopy(fields()[2].schema(), other.activationDate);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.serviceName)) {
        this.serviceName = data().deepCopy(fields()[4].schema(), other.serviceName);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.serviceType)) {
        this.serviceType = data().deepCopy(fields()[5].schema(), other.serviceType);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.serviceDescription)) {
        this.serviceDescription = data().deepCopy(fields()[6].schema(), other.serviceDescription);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.serviceCategory)) {
        this.serviceCategory = data().deepCopy(fields()[7].schema(), other.serviceCategory);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.serviceCharge)) {
        this.serviceCharge = data().deepCopy(fields()[8].schema(), other.serviceCharge);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing ServiceEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.sritel.provisioning.event.ServiceEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.serviceId)) {
        this.serviceId = data().deepCopy(fields()[0].schema(), other.serviceId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.activationDate)) {
        this.activationDate = data().deepCopy(fields()[2].schema(), other.activationDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.serviceName)) {
        this.serviceName = data().deepCopy(fields()[4].schema(), other.serviceName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.serviceType)) {
        this.serviceType = data().deepCopy(fields()[5].schema(), other.serviceType);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.serviceDescription)) {
        this.serviceDescription = data().deepCopy(fields()[6].schema(), other.serviceDescription);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.serviceCategory)) {
        this.serviceCategory = data().deepCopy(fields()[7].schema(), other.serviceCategory);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.serviceCharge)) {
        this.serviceCharge = data().deepCopy(fields()[8].schema(), other.serviceCharge);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'serviceId' field.
      * @return The value.
      */
    public java.lang.CharSequence getServiceId() {
      return serviceId;
    }


    /**
      * Sets the value of the 'serviceId' field.
      * @param value The value of 'serviceId'.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder setServiceId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.serviceId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'serviceId' field has been set.
      * @return True if the 'serviceId' field has been set, false otherwise.
      */
    public boolean hasServiceId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'serviceId' field.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder clearServiceId() {
      serviceId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }


    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.email = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder clearEmail() {
      email = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'activationDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getActivationDate() {
      return activationDate;
    }


    /**
      * Sets the value of the 'activationDate' field.
      * @param value The value of 'activationDate'.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder setActivationDate(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.activationDate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'activationDate' field has been set.
      * @return True if the 'activationDate' field has been set, false otherwise.
      */
    public boolean hasActivationDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'activationDate' field.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder clearActivationDate() {
      activationDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.status = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder clearStatus() {
      status = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'serviceName' field.
      * @return The value.
      */
    public java.lang.CharSequence getServiceName() {
      return serviceName;
    }


    /**
      * Sets the value of the 'serviceName' field.
      * @param value The value of 'serviceName'.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder setServiceName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.serviceName = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'serviceName' field has been set.
      * @return True if the 'serviceName' field has been set, false otherwise.
      */
    public boolean hasServiceName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'serviceName' field.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder clearServiceName() {
      serviceName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'serviceType' field.
      * @return The value.
      */
    public java.lang.CharSequence getServiceType() {
      return serviceType;
    }


    /**
      * Sets the value of the 'serviceType' field.
      * @param value The value of 'serviceType'.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder setServiceType(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.serviceType = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'serviceType' field has been set.
      * @return True if the 'serviceType' field has been set, false otherwise.
      */
    public boolean hasServiceType() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'serviceType' field.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder clearServiceType() {
      serviceType = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'serviceDescription' field.
      * @return The value.
      */
    public java.lang.CharSequence getServiceDescription() {
      return serviceDescription;
    }


    /**
      * Sets the value of the 'serviceDescription' field.
      * @param value The value of 'serviceDescription'.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder setServiceDescription(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.serviceDescription = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'serviceDescription' field has been set.
      * @return True if the 'serviceDescription' field has been set, false otherwise.
      */
    public boolean hasServiceDescription() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'serviceDescription' field.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder clearServiceDescription() {
      serviceDescription = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'serviceCategory' field.
      * @return The value.
      */
    public java.lang.CharSequence getServiceCategory() {
      return serviceCategory;
    }


    /**
      * Sets the value of the 'serviceCategory' field.
      * @param value The value of 'serviceCategory'.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder setServiceCategory(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.serviceCategory = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'serviceCategory' field has been set.
      * @return True if the 'serviceCategory' field has been set, false otherwise.
      */
    public boolean hasServiceCategory() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'serviceCategory' field.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder clearServiceCategory() {
      serviceCategory = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'serviceCharge' field.
      * @return The value.
      */
    public float getServiceCharge() {
      return serviceCharge;
    }


    /**
      * Sets the value of the 'serviceCharge' field.
      * @param value The value of 'serviceCharge'.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder setServiceCharge(float value) {
      validate(fields()[8], value);
      this.serviceCharge = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'serviceCharge' field has been set.
      * @return True if the 'serviceCharge' field has been set, false otherwise.
      */
    public boolean hasServiceCharge() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'serviceCharge' field.
      * @return This builder.
      */
    public com.sritel.provisioning.event.ServiceEvent.Builder clearServiceCharge() {
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ServiceEvent build() {
      try {
        ServiceEvent record = new ServiceEvent();
        record.serviceId = fieldSetFlags()[0] ? this.serviceId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.email = fieldSetFlags()[1] ? this.email : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.activationDate = fieldSetFlags()[2] ? this.activationDate : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.status = fieldSetFlags()[3] ? this.status : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.serviceName = fieldSetFlags()[4] ? this.serviceName : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.serviceType = fieldSetFlags()[5] ? this.serviceType : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.serviceDescription = fieldSetFlags()[6] ? this.serviceDescription : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.serviceCategory = fieldSetFlags()[7] ? this.serviceCategory : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.serviceCharge = fieldSetFlags()[8] ? this.serviceCharge : (java.lang.Float) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ServiceEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<ServiceEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ServiceEvent>
    READER$ = (org.apache.avro.io.DatumReader<ServiceEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.serviceId);

    out.writeString(this.email);

    out.writeString(this.activationDate);

    out.writeString(this.status);

    out.writeString(this.serviceName);

    out.writeString(this.serviceType);

    out.writeString(this.serviceDescription);

    out.writeString(this.serviceCategory);

    out.writeFloat(this.serviceCharge);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.serviceId = in.readString(this.serviceId instanceof Utf8 ? (Utf8)this.serviceId : null);

      this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);

      this.activationDate = in.readString(this.activationDate instanceof Utf8 ? (Utf8)this.activationDate : null);

      this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);

      this.serviceName = in.readString(this.serviceName instanceof Utf8 ? (Utf8)this.serviceName : null);

      this.serviceType = in.readString(this.serviceType instanceof Utf8 ? (Utf8)this.serviceType : null);

      this.serviceDescription = in.readString(this.serviceDescription instanceof Utf8 ? (Utf8)this.serviceDescription : null);

      this.serviceCategory = in.readString(this.serviceCategory instanceof Utf8 ? (Utf8)this.serviceCategory : null);

      this.serviceCharge = in.readFloat();

    } else {
      for (int i = 0; i < 9; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.serviceId = in.readString(this.serviceId instanceof Utf8 ? (Utf8)this.serviceId : null);
          break;

        case 1:
          this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
          break;

        case 2:
          this.activationDate = in.readString(this.activationDate instanceof Utf8 ? (Utf8)this.activationDate : null);
          break;

        case 3:
          this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);
          break;

        case 4:
          this.serviceName = in.readString(this.serviceName instanceof Utf8 ? (Utf8)this.serviceName : null);
          break;

        case 5:
          this.serviceType = in.readString(this.serviceType instanceof Utf8 ? (Utf8)this.serviceType : null);
          break;

        case 6:
          this.serviceDescription = in.readString(this.serviceDescription instanceof Utf8 ? (Utf8)this.serviceDescription : null);
          break;

        case 7:
          this.serviceCategory = in.readString(this.serviceCategory instanceof Utf8 ? (Utf8)this.serviceCategory : null);
          break;

        case 8:
          this.serviceCharge = in.readFloat();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package nike.service;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Item extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6224795366703304399L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Item\",\"namespace\":\"nike.service\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"sku\",\"type\":\"long\"},{\"name\":\"quantity\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Item> ENCODER =
      new BinaryMessageEncoder<Item>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Item> DECODER =
      new BinaryMessageDecoder<Item>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Item> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Item> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Item>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Item to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Item from a ByteBuffer. */
  public static Item fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  @Deprecated public long sku;
  @Deprecated public int quantity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Item() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param sku The new value for sku
   * @param quantity The new value for quantity
   */
  public Item(java.lang.CharSequence name, java.lang.Long sku, java.lang.Integer quantity) {
    this.name = name;
    this.sku = sku;
    this.quantity = quantity;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return sku;
    case 2: return quantity;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: sku = (java.lang.Long)value$; break;
    case 2: quantity = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'sku' field.
   * @return The value of the 'sku' field.
   */
  public java.lang.Long getSku() {
    return sku;
  }

  /**
   * Sets the value of the 'sku' field.
   * @param value the value to set.
   */
  public void setSku(java.lang.Long value) {
    this.sku = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public java.lang.Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(java.lang.Integer value) {
    this.quantity = value;
  }

  /**
   * Creates a new Item RecordBuilder.
   * @return A new Item RecordBuilder
   */
  public static nike.service.Item.Builder newBuilder() {
    return new nike.service.Item.Builder();
  }

  /**
   * Creates a new Item RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Item RecordBuilder
   */
  public static nike.service.Item.Builder newBuilder(nike.service.Item.Builder other) {
    return new nike.service.Item.Builder(other);
  }

  /**
   * Creates a new Item RecordBuilder by copying an existing Item instance.
   * @param other The existing instance to copy.
   * @return A new Item RecordBuilder
   */
  public static nike.service.Item.Builder newBuilder(nike.service.Item other) {
    return new nike.service.Item.Builder(other);
  }

  /**
   * RecordBuilder for Item instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Item>
    implements org.apache.avro.data.RecordBuilder<Item> {

    private java.lang.CharSequence name;
    private long sku;
    private int quantity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(nike.service.Item.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sku)) {
        this.sku = data().deepCopy(fields()[1].schema(), other.sku);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Item instance
     * @param other The existing instance to copy.
     */
    private Builder(nike.service.Item other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sku)) {
        this.sku = data().deepCopy(fields()[1].schema(), other.sku);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public nike.service.Item.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public nike.service.Item.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'sku' field.
      * @return The value.
      */
    public java.lang.Long getSku() {
      return sku;
    }

    /**
      * Sets the value of the 'sku' field.
      * @param value The value of 'sku'.
      * @return This builder.
      */
    public nike.service.Item.Builder setSku(long value) {
      validate(fields()[1], value);
      this.sku = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'sku' field has been set.
      * @return True if the 'sku' field has been set, false otherwise.
      */
    public boolean hasSku() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sku' field.
      * @return This builder.
      */
    public nike.service.Item.Builder clearSku() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public java.lang.Integer getQuantity() {
      return quantity;
    }

    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public nike.service.Item.Builder setQuantity(int value) {
      validate(fields()[2], value);
      this.quantity = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public nike.service.Item.Builder clearQuantity() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Item build() {
      try {
        Item record = new Item();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.sku = fieldSetFlags()[1] ? this.sku : (java.lang.Long) defaultValue(fields()[1]);
        record.quantity = fieldSetFlags()[2] ? this.quantity : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Item>
    WRITER$ = (org.apache.avro.io.DatumWriter<Item>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Item>
    READER$ = (org.apache.avro.io.DatumReader<Item>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

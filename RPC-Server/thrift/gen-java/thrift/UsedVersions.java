/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-04-11")
public class UsedVersions implements org.apache.thrift.TBase<UsedVersions, UsedVersions._Fields>, java.io.Serializable, Cloneable, Comparable<UsedVersions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UsedVersions");

  private static final org.apache.thrift.protocol.TField VERSION_FOR_JAVA4_FIELD_DESC = new org.apache.thrift.protocol.TField("versionForJava4", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VERSION_FOR_JAVA5_FIELD_DESC = new org.apache.thrift.protocol.TField("versionForJava5", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VERSION_FOR_JAVA6_FIELD_DESC = new org.apache.thrift.protocol.TField("versionForJava6", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField VERSION_FOR_JAVA7_FIELD_DESC = new org.apache.thrift.protocol.TField("versionForJava7", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField VERSION_FOR_JAVA8_FIELD_DESC = new org.apache.thrift.protocol.TField("versionForJava8", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UsedVersionsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UsedVersionsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String versionForJava4; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String versionForJava5; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String versionForJava6; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String versionForJava7; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String versionForJava8; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VERSION_FOR_JAVA4((short)1, "versionForJava4"),
    VERSION_FOR_JAVA5((short)2, "versionForJava5"),
    VERSION_FOR_JAVA6((short)3, "versionForJava6"),
    VERSION_FOR_JAVA7((short)4, "versionForJava7"),
    VERSION_FOR_JAVA8((short)5, "versionForJava8");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VERSION_FOR_JAVA4
          return VERSION_FOR_JAVA4;
        case 2: // VERSION_FOR_JAVA5
          return VERSION_FOR_JAVA5;
        case 3: // VERSION_FOR_JAVA6
          return VERSION_FOR_JAVA6;
        case 4: // VERSION_FOR_JAVA7
          return VERSION_FOR_JAVA7;
        case 5: // VERSION_FOR_JAVA8
          return VERSION_FOR_JAVA8;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION_FOR_JAVA4, new org.apache.thrift.meta_data.FieldMetaData("versionForJava4", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION_FOR_JAVA5, new org.apache.thrift.meta_data.FieldMetaData("versionForJava5", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION_FOR_JAVA6, new org.apache.thrift.meta_data.FieldMetaData("versionForJava6", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION_FOR_JAVA7, new org.apache.thrift.meta_data.FieldMetaData("versionForJava7", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION_FOR_JAVA8, new org.apache.thrift.meta_data.FieldMetaData("versionForJava8", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UsedVersions.class, metaDataMap);
  }

  public UsedVersions() {
  }

  public UsedVersions(
    java.lang.String versionForJava4,
    java.lang.String versionForJava5,
    java.lang.String versionForJava6,
    java.lang.String versionForJava7,
    java.lang.String versionForJava8)
  {
    this();
    this.versionForJava4 = versionForJava4;
    this.versionForJava5 = versionForJava5;
    this.versionForJava6 = versionForJava6;
    this.versionForJava7 = versionForJava7;
    this.versionForJava8 = versionForJava8;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UsedVersions(UsedVersions other) {
    if (other.isSetVersionForJava4()) {
      this.versionForJava4 = other.versionForJava4;
    }
    if (other.isSetVersionForJava5()) {
      this.versionForJava5 = other.versionForJava5;
    }
    if (other.isSetVersionForJava6()) {
      this.versionForJava6 = other.versionForJava6;
    }
    if (other.isSetVersionForJava7()) {
      this.versionForJava7 = other.versionForJava7;
    }
    if (other.isSetVersionForJava8()) {
      this.versionForJava8 = other.versionForJava8;
    }
  }

  public UsedVersions deepCopy() {
    return new UsedVersions(this);
  }

  @Override
  public void clear() {
    this.versionForJava4 = null;
    this.versionForJava5 = null;
    this.versionForJava6 = null;
    this.versionForJava7 = null;
    this.versionForJava8 = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getVersionForJava4() {
    return this.versionForJava4;
  }

  public UsedVersions setVersionForJava4(@org.apache.thrift.annotation.Nullable java.lang.String versionForJava4) {
    this.versionForJava4 = versionForJava4;
    return this;
  }

  public void unsetVersionForJava4() {
    this.versionForJava4 = null;
  }

  /** Returns true if field versionForJava4 is set (has been assigned a value) and false otherwise */
  public boolean isSetVersionForJava4() {
    return this.versionForJava4 != null;
  }

  public void setVersionForJava4IsSet(boolean value) {
    if (!value) {
      this.versionForJava4 = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getVersionForJava5() {
    return this.versionForJava5;
  }

  public UsedVersions setVersionForJava5(@org.apache.thrift.annotation.Nullable java.lang.String versionForJava5) {
    this.versionForJava5 = versionForJava5;
    return this;
  }

  public void unsetVersionForJava5() {
    this.versionForJava5 = null;
  }

  /** Returns true if field versionForJava5 is set (has been assigned a value) and false otherwise */
  public boolean isSetVersionForJava5() {
    return this.versionForJava5 != null;
  }

  public void setVersionForJava5IsSet(boolean value) {
    if (!value) {
      this.versionForJava5 = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getVersionForJava6() {
    return this.versionForJava6;
  }

  public UsedVersions setVersionForJava6(@org.apache.thrift.annotation.Nullable java.lang.String versionForJava6) {
    this.versionForJava6 = versionForJava6;
    return this;
  }

  public void unsetVersionForJava6() {
    this.versionForJava6 = null;
  }

  /** Returns true if field versionForJava6 is set (has been assigned a value) and false otherwise */
  public boolean isSetVersionForJava6() {
    return this.versionForJava6 != null;
  }

  public void setVersionForJava6IsSet(boolean value) {
    if (!value) {
      this.versionForJava6 = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getVersionForJava7() {
    return this.versionForJava7;
  }

  public UsedVersions setVersionForJava7(@org.apache.thrift.annotation.Nullable java.lang.String versionForJava7) {
    this.versionForJava7 = versionForJava7;
    return this;
  }

  public void unsetVersionForJava7() {
    this.versionForJava7 = null;
  }

  /** Returns true if field versionForJava7 is set (has been assigned a value) and false otherwise */
  public boolean isSetVersionForJava7() {
    return this.versionForJava7 != null;
  }

  public void setVersionForJava7IsSet(boolean value) {
    if (!value) {
      this.versionForJava7 = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getVersionForJava8() {
    return this.versionForJava8;
  }

  public UsedVersions setVersionForJava8(@org.apache.thrift.annotation.Nullable java.lang.String versionForJava8) {
    this.versionForJava8 = versionForJava8;
    return this;
  }

  public void unsetVersionForJava8() {
    this.versionForJava8 = null;
  }

  /** Returns true if field versionForJava8 is set (has been assigned a value) and false otherwise */
  public boolean isSetVersionForJava8() {
    return this.versionForJava8 != null;
  }

  public void setVersionForJava8IsSet(boolean value) {
    if (!value) {
      this.versionForJava8 = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VERSION_FOR_JAVA4:
      if (value == null) {
        unsetVersionForJava4();
      } else {
        setVersionForJava4((java.lang.String)value);
      }
      break;

    case VERSION_FOR_JAVA5:
      if (value == null) {
        unsetVersionForJava5();
      } else {
        setVersionForJava5((java.lang.String)value);
      }
      break;

    case VERSION_FOR_JAVA6:
      if (value == null) {
        unsetVersionForJava6();
      } else {
        setVersionForJava6((java.lang.String)value);
      }
      break;

    case VERSION_FOR_JAVA7:
      if (value == null) {
        unsetVersionForJava7();
      } else {
        setVersionForJava7((java.lang.String)value);
      }
      break;

    case VERSION_FOR_JAVA8:
      if (value == null) {
        unsetVersionForJava8();
      } else {
        setVersionForJava8((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION_FOR_JAVA4:
      return getVersionForJava4();

    case VERSION_FOR_JAVA5:
      return getVersionForJava5();

    case VERSION_FOR_JAVA6:
      return getVersionForJava6();

    case VERSION_FOR_JAVA7:
      return getVersionForJava7();

    case VERSION_FOR_JAVA8:
      return getVersionForJava8();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case VERSION_FOR_JAVA4:
      return isSetVersionForJava4();
    case VERSION_FOR_JAVA5:
      return isSetVersionForJava5();
    case VERSION_FOR_JAVA6:
      return isSetVersionForJava6();
    case VERSION_FOR_JAVA7:
      return isSetVersionForJava7();
    case VERSION_FOR_JAVA8:
      return isSetVersionForJava8();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UsedVersions)
      return this.equals((UsedVersions)that);
    return false;
  }

  public boolean equals(UsedVersions that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_versionForJava4 = true && this.isSetVersionForJava4();
    boolean that_present_versionForJava4 = true && that.isSetVersionForJava4();
    if (this_present_versionForJava4 || that_present_versionForJava4) {
      if (!(this_present_versionForJava4 && that_present_versionForJava4))
        return false;
      if (!this.versionForJava4.equals(that.versionForJava4))
        return false;
    }

    boolean this_present_versionForJava5 = true && this.isSetVersionForJava5();
    boolean that_present_versionForJava5 = true && that.isSetVersionForJava5();
    if (this_present_versionForJava5 || that_present_versionForJava5) {
      if (!(this_present_versionForJava5 && that_present_versionForJava5))
        return false;
      if (!this.versionForJava5.equals(that.versionForJava5))
        return false;
    }

    boolean this_present_versionForJava6 = true && this.isSetVersionForJava6();
    boolean that_present_versionForJava6 = true && that.isSetVersionForJava6();
    if (this_present_versionForJava6 || that_present_versionForJava6) {
      if (!(this_present_versionForJava6 && that_present_versionForJava6))
        return false;
      if (!this.versionForJava6.equals(that.versionForJava6))
        return false;
    }

    boolean this_present_versionForJava7 = true && this.isSetVersionForJava7();
    boolean that_present_versionForJava7 = true && that.isSetVersionForJava7();
    if (this_present_versionForJava7 || that_present_versionForJava7) {
      if (!(this_present_versionForJava7 && that_present_versionForJava7))
        return false;
      if (!this.versionForJava7.equals(that.versionForJava7))
        return false;
    }

    boolean this_present_versionForJava8 = true && this.isSetVersionForJava8();
    boolean that_present_versionForJava8 = true && that.isSetVersionForJava8();
    if (this_present_versionForJava8 || that_present_versionForJava8) {
      if (!(this_present_versionForJava8 && that_present_versionForJava8))
        return false;
      if (!this.versionForJava8.equals(that.versionForJava8))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetVersionForJava4()) ? 131071 : 524287);
    if (isSetVersionForJava4())
      hashCode = hashCode * 8191 + versionForJava4.hashCode();

    hashCode = hashCode * 8191 + ((isSetVersionForJava5()) ? 131071 : 524287);
    if (isSetVersionForJava5())
      hashCode = hashCode * 8191 + versionForJava5.hashCode();

    hashCode = hashCode * 8191 + ((isSetVersionForJava6()) ? 131071 : 524287);
    if (isSetVersionForJava6())
      hashCode = hashCode * 8191 + versionForJava6.hashCode();

    hashCode = hashCode * 8191 + ((isSetVersionForJava7()) ? 131071 : 524287);
    if (isSetVersionForJava7())
      hashCode = hashCode * 8191 + versionForJava7.hashCode();

    hashCode = hashCode * 8191 + ((isSetVersionForJava8()) ? 131071 : 524287);
    if (isSetVersionForJava8())
      hashCode = hashCode * 8191 + versionForJava8.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UsedVersions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetVersionForJava4()).compareTo(other.isSetVersionForJava4());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersionForJava4()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versionForJava4, other.versionForJava4);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVersionForJava5()).compareTo(other.isSetVersionForJava5());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersionForJava5()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versionForJava5, other.versionForJava5);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVersionForJava6()).compareTo(other.isSetVersionForJava6());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersionForJava6()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versionForJava6, other.versionForJava6);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVersionForJava7()).compareTo(other.isSetVersionForJava7());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersionForJava7()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versionForJava7, other.versionForJava7);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVersionForJava8()).compareTo(other.isSetVersionForJava8());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersionForJava8()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versionForJava8, other.versionForJava8);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UsedVersions(");
    boolean first = true;

    sb.append("versionForJava4:");
    if (this.versionForJava4 == null) {
      sb.append("null");
    } else {
      sb.append(this.versionForJava4);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("versionForJava5:");
    if (this.versionForJava5 == null) {
      sb.append("null");
    } else {
      sb.append(this.versionForJava5);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("versionForJava6:");
    if (this.versionForJava6 == null) {
      sb.append("null");
    } else {
      sb.append(this.versionForJava6);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("versionForJava7:");
    if (this.versionForJava7 == null) {
      sb.append("null");
    } else {
      sb.append(this.versionForJava7);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("versionForJava8:");
    if (this.versionForJava8 == null) {
      sb.append("null");
    } else {
      sb.append(this.versionForJava8);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UsedVersionsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UsedVersionsStandardScheme getScheme() {
      return new UsedVersionsStandardScheme();
    }
  }

  private static class UsedVersionsStandardScheme extends org.apache.thrift.scheme.StandardScheme<UsedVersions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UsedVersions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION_FOR_JAVA4
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.versionForJava4 = iprot.readString();
              struct.setVersionForJava4IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION_FOR_JAVA5
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.versionForJava5 = iprot.readString();
              struct.setVersionForJava5IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VERSION_FOR_JAVA6
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.versionForJava6 = iprot.readString();
              struct.setVersionForJava6IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VERSION_FOR_JAVA7
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.versionForJava7 = iprot.readString();
              struct.setVersionForJava7IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VERSION_FOR_JAVA8
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.versionForJava8 = iprot.readString();
              struct.setVersionForJava8IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UsedVersions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.versionForJava4 != null) {
        oprot.writeFieldBegin(VERSION_FOR_JAVA4_FIELD_DESC);
        oprot.writeString(struct.versionForJava4);
        oprot.writeFieldEnd();
      }
      if (struct.versionForJava5 != null) {
        oprot.writeFieldBegin(VERSION_FOR_JAVA5_FIELD_DESC);
        oprot.writeString(struct.versionForJava5);
        oprot.writeFieldEnd();
      }
      if (struct.versionForJava6 != null) {
        oprot.writeFieldBegin(VERSION_FOR_JAVA6_FIELD_DESC);
        oprot.writeString(struct.versionForJava6);
        oprot.writeFieldEnd();
      }
      if (struct.versionForJava7 != null) {
        oprot.writeFieldBegin(VERSION_FOR_JAVA7_FIELD_DESC);
        oprot.writeString(struct.versionForJava7);
        oprot.writeFieldEnd();
      }
      if (struct.versionForJava8 != null) {
        oprot.writeFieldBegin(VERSION_FOR_JAVA8_FIELD_DESC);
        oprot.writeString(struct.versionForJava8);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UsedVersionsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UsedVersionsTupleScheme getScheme() {
      return new UsedVersionsTupleScheme();
    }
  }

  private static class UsedVersionsTupleScheme extends org.apache.thrift.scheme.TupleScheme<UsedVersions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UsedVersions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetVersionForJava4()) {
        optionals.set(0);
      }
      if (struct.isSetVersionForJava5()) {
        optionals.set(1);
      }
      if (struct.isSetVersionForJava6()) {
        optionals.set(2);
      }
      if (struct.isSetVersionForJava7()) {
        optionals.set(3);
      }
      if (struct.isSetVersionForJava8()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetVersionForJava4()) {
        oprot.writeString(struct.versionForJava4);
      }
      if (struct.isSetVersionForJava5()) {
        oprot.writeString(struct.versionForJava5);
      }
      if (struct.isSetVersionForJava6()) {
        oprot.writeString(struct.versionForJava6);
      }
      if (struct.isSetVersionForJava7()) {
        oprot.writeString(struct.versionForJava7);
      }
      if (struct.isSetVersionForJava8()) {
        oprot.writeString(struct.versionForJava8);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UsedVersions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.versionForJava4 = iprot.readString();
        struct.setVersionForJava4IsSet(true);
      }
      if (incoming.get(1)) {
        struct.versionForJava5 = iprot.readString();
        struct.setVersionForJava5IsSet(true);
      }
      if (incoming.get(2)) {
        struct.versionForJava6 = iprot.readString();
        struct.setVersionForJava6IsSet(true);
      }
      if (incoming.get(3)) {
        struct.versionForJava7 = iprot.readString();
        struct.setVersionForJava7IsSet(true);
      }
      if (incoming.get(4)) {
        struct.versionForJava8 = iprot.readString();
        struct.setVersionForJava8IsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


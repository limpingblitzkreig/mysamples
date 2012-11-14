/**
 * ServiceTypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class ServiceTypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServiceTypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALES_AUDIT = "ALES_AUDIT";
    public static final java.lang.String _ALES_AUTHENTICATION = "ALES_AUTHENTICATION";
    public static final java.lang.String _ALES_AUTHORIZATION = "ALES_AUTHORIZATION";
    public static final java.lang.String _ALES_CREDENTIAL = "ALES_CREDENTIAL";
    public static final java.lang.String _ALES_ROLE = "ALES_ROLE";
    public static final java.lang.String _ALES_MANAGEMENT = "ALES_MANAGEMENT";
    public static final ServiceTypeEnum ALES_AUDIT = new ServiceTypeEnum(_ALES_AUDIT);
    public static final ServiceTypeEnum ALES_AUTHENTICATION = new ServiceTypeEnum(_ALES_AUTHENTICATION);
    public static final ServiceTypeEnum ALES_AUTHORIZATION = new ServiceTypeEnum(_ALES_AUTHORIZATION);
    public static final ServiceTypeEnum ALES_CREDENTIAL = new ServiceTypeEnum(_ALES_CREDENTIAL);
    public static final ServiceTypeEnum ALES_ROLE = new ServiceTypeEnum(_ALES_ROLE);
    public static final ServiceTypeEnum ALES_MANAGEMENT = new ServiceTypeEnum(_ALES_MANAGEMENT);
    public java.lang.String getValue() { return _value_;}
    public static ServiceTypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ServiceTypeEnum enumeration = (ServiceTypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ServiceTypeEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceTypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceTypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

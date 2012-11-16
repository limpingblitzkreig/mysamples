/**
 * AuditSeverityEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class AuditSeverityEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuditSeverityEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALES_AUDIT_FAILURE = "ALES_AUDIT_FAILURE";
    public static final java.lang.String _ALES_ERROR = "ALES_ERROR";
    public static final java.lang.String _ALES_FAILURE = "ALES_FAILURE";
    public static final java.lang.String _ALES_INFORMATIONAL = "ALES_INFORMATIONAL";
    public static final java.lang.String _ALES_SUCCESS = "ALES_SUCCESS";
    public static final java.lang.String _ALES_WARNING = "ALES_WARNING";
    public static final AuditSeverityEnum ALES_AUDIT_FAILURE = new AuditSeverityEnum(_ALES_AUDIT_FAILURE);
    public static final AuditSeverityEnum ALES_ERROR = new AuditSeverityEnum(_ALES_ERROR);
    public static final AuditSeverityEnum ALES_FAILURE = new AuditSeverityEnum(_ALES_FAILURE);
    public static final AuditSeverityEnum ALES_INFORMATIONAL = new AuditSeverityEnum(_ALES_INFORMATIONAL);
    public static final AuditSeverityEnum ALES_SUCCESS = new AuditSeverityEnum(_ALES_SUCCESS);
    public static final AuditSeverityEnum ALES_WARNING = new AuditSeverityEnum(_ALES_WARNING);
    public java.lang.String getValue() { return _value_;}
    public static AuditSeverityEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AuditSeverityEnum enumeration = (AuditSeverityEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuditSeverityEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AuditSeverityEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuditSeverityEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

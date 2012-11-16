/**
 * CredentialMethodEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class CredentialMethodEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CredentialMethodEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALES_CHOICE = "ALES_CHOICE";
    public static final java.lang.String _ALES_CONFIRMATION = "ALES_CONFIRMATION";
    public static final java.lang.String _ALES_LANGUAGE = "ALES_LANGUAGE";
    public static final java.lang.String _ALES_NAME = "ALES_NAME";
    public static final java.lang.String _ALES_PASSWORD = "ALES_PASSWORD";
    public static final java.lang.String _ALES_TEXTINPUT = "ALES_TEXTINPUT";
    public static final java.lang.String _ALES_TEXTOUTPUT = "ALES_TEXTOUTPUT";
    public static final CredentialMethodEnum ALES_CHOICE = new CredentialMethodEnum(_ALES_CHOICE);
    public static final CredentialMethodEnum ALES_CONFIRMATION = new CredentialMethodEnum(_ALES_CONFIRMATION);
    public static final CredentialMethodEnum ALES_LANGUAGE = new CredentialMethodEnum(_ALES_LANGUAGE);
    public static final CredentialMethodEnum ALES_NAME = new CredentialMethodEnum(_ALES_NAME);
    public static final CredentialMethodEnum ALES_PASSWORD = new CredentialMethodEnum(_ALES_PASSWORD);
    public static final CredentialMethodEnum ALES_TEXTINPUT = new CredentialMethodEnum(_ALES_TEXTINPUT);
    public static final CredentialMethodEnum ALES_TEXTOUTPUT = new CredentialMethodEnum(_ALES_TEXTOUTPUT);
    public java.lang.String getValue() { return _value_;}
    public static CredentialMethodEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CredentialMethodEnum enumeration = (CredentialMethodEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CredentialMethodEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CredentialMethodEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "CredentialMethodEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

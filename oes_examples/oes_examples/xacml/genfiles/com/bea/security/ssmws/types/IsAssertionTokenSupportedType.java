/**
 * IsAssertionTokenSupportedType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class IsAssertionTokenSupportedType  implements java.io.Serializable {
    private java.lang.String assertionCredentialType;

    public IsAssertionTokenSupportedType() {
    }

    public IsAssertionTokenSupportedType(
           java.lang.String assertionCredentialType) {
           this.assertionCredentialType = assertionCredentialType;
    }


    /**
     * Gets the assertionCredentialType value for this IsAssertionTokenSupportedType.
     * 
     * @return assertionCredentialType
     */
    public java.lang.String getAssertionCredentialType() {
        return assertionCredentialType;
    }


    /**
     * Sets the assertionCredentialType value for this IsAssertionTokenSupportedType.
     * 
     * @param assertionCredentialType
     */
    public void setAssertionCredentialType(java.lang.String assertionCredentialType) {
        this.assertionCredentialType = assertionCredentialType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsAssertionTokenSupportedType)) return false;
        IsAssertionTokenSupportedType other = (IsAssertionTokenSupportedType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assertionCredentialType==null && other.getAssertionCredentialType()==null) || 
             (this.assertionCredentialType!=null &&
              this.assertionCredentialType.equals(other.getAssertionCredentialType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAssertionCredentialType() != null) {
            _hashCode += getAssertionCredentialType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsAssertionTokenSupportedType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsAssertionTokenSupportedType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertionCredentialType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AssertionCredentialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

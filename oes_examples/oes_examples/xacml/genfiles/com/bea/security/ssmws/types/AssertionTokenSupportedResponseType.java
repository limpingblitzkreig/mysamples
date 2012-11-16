/**
 * AssertionTokenSupportedResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class AssertionTokenSupportedResponseType  implements java.io.Serializable {
    private boolean isAssertionTokenSupportedResponse;

    public AssertionTokenSupportedResponseType() {
    }

    public AssertionTokenSupportedResponseType(
           boolean isAssertionTokenSupportedResponse) {
           this.isAssertionTokenSupportedResponse = isAssertionTokenSupportedResponse;
    }


    /**
     * Gets the isAssertionTokenSupportedResponse value for this AssertionTokenSupportedResponseType.
     * 
     * @return isAssertionTokenSupportedResponse
     */
    public boolean isIsAssertionTokenSupportedResponse() {
        return isAssertionTokenSupportedResponse;
    }


    /**
     * Sets the isAssertionTokenSupportedResponse value for this AssertionTokenSupportedResponseType.
     * 
     * @param isAssertionTokenSupportedResponse
     */
    public void setIsAssertionTokenSupportedResponse(boolean isAssertionTokenSupportedResponse) {
        this.isAssertionTokenSupportedResponse = isAssertionTokenSupportedResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssertionTokenSupportedResponseType)) return false;
        AssertionTokenSupportedResponseType other = (AssertionTokenSupportedResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.isAssertionTokenSupportedResponse == other.isIsAssertionTokenSupportedResponse();
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
        _hashCode += (isIsAssertionTokenSupportedResponse() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssertionTokenSupportedResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AssertionTokenSupportedResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAssertionTokenSupportedResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "isAssertionTokenSupportedResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

/**
 * AuthenticationRequiredResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class AuthenticationRequiredResponseType  implements java.io.Serializable {
    private boolean isAuthenticationRequiredResponse;

    public AuthenticationRequiredResponseType() {
    }

    public AuthenticationRequiredResponseType(
           boolean isAuthenticationRequiredResponse) {
           this.isAuthenticationRequiredResponse = isAuthenticationRequiredResponse;
    }


    /**
     * Gets the isAuthenticationRequiredResponse value for this AuthenticationRequiredResponseType.
     * 
     * @return isAuthenticationRequiredResponse
     */
    public boolean isIsAuthenticationRequiredResponse() {
        return isAuthenticationRequiredResponse;
    }


    /**
     * Sets the isAuthenticationRequiredResponse value for this AuthenticationRequiredResponseType.
     * 
     * @param isAuthenticationRequiredResponse
     */
    public void setIsAuthenticationRequiredResponse(boolean isAuthenticationRequiredResponse) {
        this.isAuthenticationRequiredResponse = isAuthenticationRequiredResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationRequiredResponseType)) return false;
        AuthenticationRequiredResponseType other = (AuthenticationRequiredResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.isAuthenticationRequiredResponse == other.isIsAuthenticationRequiredResponse();
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
        _hashCode += (isIsAuthenticationRequiredResponse() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationRequiredResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthenticationRequiredResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAuthenticationRequiredResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "isAuthenticationRequiredResponse"));
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

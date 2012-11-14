/**
 * CredentialTypesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class CredentialTypesType  implements java.io.Serializable {
    private java.lang.String[] credentialType;

    public CredentialTypesType() {
    }

    public CredentialTypesType(
           java.lang.String[] credentialType) {
           this.credentialType = credentialType;
    }


    /**
     * Gets the credentialType value for this CredentialTypesType.
     * 
     * @return credentialType
     */
    public java.lang.String[] getCredentialType() {
        return credentialType;
    }


    /**
     * Sets the credentialType value for this CredentialTypesType.
     * 
     * @param credentialType
     */
    public void setCredentialType(java.lang.String[] credentialType) {
        this.credentialType = credentialType;
    }

    public java.lang.String getCredentialType(int i) {
        return this.credentialType[i];
    }

    public void setCredentialType(int i, java.lang.String _value) {
        this.credentialType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CredentialTypesType)) return false;
        CredentialTypesType other = (CredentialTypesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credentialType==null && other.getCredentialType()==null) || 
             (this.credentialType!=null &&
              java.util.Arrays.equals(this.credentialType, other.getCredentialType())));
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
        if (getCredentialType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredentialType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredentialType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CredentialTypesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "CredentialTypesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "CredentialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

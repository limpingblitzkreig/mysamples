/**
 * IdentityCredentialType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class IdentityCredentialType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.CredentialType[] credential;

    public IdentityCredentialType() {
    }

    public IdentityCredentialType(
           com.bea.security.ssmws.types.CredentialType[] credential) {
           this.credential = credential;
    }


    /**
     * Gets the credential value for this IdentityCredentialType.
     * 
     * @return credential
     */
    public com.bea.security.ssmws.types.CredentialType[] getCredential() {
        return credential;
    }


    /**
     * Sets the credential value for this IdentityCredentialType.
     * 
     * @param credential
     */
    public void setCredential(com.bea.security.ssmws.types.CredentialType[] credential) {
        this.credential = credential;
    }

    public com.bea.security.ssmws.types.CredentialType getCredential(int i) {
        return this.credential[i];
    }

    public void setCredential(int i, com.bea.security.ssmws.types.CredentialType _value) {
        this.credential[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentityCredentialType)) return false;
        IdentityCredentialType other = (IdentityCredentialType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credential==null && other.getCredential()==null) || 
             (this.credential!=null &&
              java.util.Arrays.equals(this.credential, other.getCredential())));
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
        if (getCredential() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredential());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredential(), i);
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
        new org.apache.axis.description.TypeDesc(IdentityCredentialType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityCredentialType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "CredentialType"));
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

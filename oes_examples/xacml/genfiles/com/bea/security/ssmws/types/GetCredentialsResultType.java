/**
 * GetCredentialsResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class GetCredentialsResultType  implements java.io.Serializable {
    private java.lang.String[] missingTypes;
    private com.bea.security.ssmws.types.IdentityCredentialType identityCredential;
    private com.bea.security.ssmws.types.IdentityAssertionType[] identityAssertion;

    public GetCredentialsResultType() {
    }

    public GetCredentialsResultType(
           java.lang.String[] missingTypes,
           com.bea.security.ssmws.types.IdentityCredentialType identityCredential,
           com.bea.security.ssmws.types.IdentityAssertionType[] identityAssertion) {
           this.missingTypes = missingTypes;
           this.identityCredential = identityCredential;
           this.identityAssertion = identityAssertion;
    }


    /**
     * Gets the missingTypes value for this GetCredentialsResultType.
     * 
     * @return missingTypes
     */
    public java.lang.String[] getMissingTypes() {
        return missingTypes;
    }


    /**
     * Sets the missingTypes value for this GetCredentialsResultType.
     * 
     * @param missingTypes
     */
    public void setMissingTypes(java.lang.String[] missingTypes) {
        this.missingTypes = missingTypes;
    }

    public java.lang.String getMissingTypes(int i) {
        return this.missingTypes[i];
    }

    public void setMissingTypes(int i, java.lang.String _value) {
        this.missingTypes[i] = _value;
    }


    /**
     * Gets the identityCredential value for this GetCredentialsResultType.
     * 
     * @return identityCredential
     */
    public com.bea.security.ssmws.types.IdentityCredentialType getIdentityCredential() {
        return identityCredential;
    }


    /**
     * Sets the identityCredential value for this GetCredentialsResultType.
     * 
     * @param identityCredential
     */
    public void setIdentityCredential(com.bea.security.ssmws.types.IdentityCredentialType identityCredential) {
        this.identityCredential = identityCredential;
    }


    /**
     * Gets the identityAssertion value for this GetCredentialsResultType.
     * 
     * @return identityAssertion
     */
    public com.bea.security.ssmws.types.IdentityAssertionType[] getIdentityAssertion() {
        return identityAssertion;
    }


    /**
     * Sets the identityAssertion value for this GetCredentialsResultType.
     * 
     * @param identityAssertion
     */
    public void setIdentityAssertion(com.bea.security.ssmws.types.IdentityAssertionType[] identityAssertion) {
        this.identityAssertion = identityAssertion;
    }

    public com.bea.security.ssmws.types.IdentityAssertionType getIdentityAssertion(int i) {
        return this.identityAssertion[i];
    }

    public void setIdentityAssertion(int i, com.bea.security.ssmws.types.IdentityAssertionType _value) {
        this.identityAssertion[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCredentialsResultType)) return false;
        GetCredentialsResultType other = (GetCredentialsResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.missingTypes==null && other.getMissingTypes()==null) || 
             (this.missingTypes!=null &&
              java.util.Arrays.equals(this.missingTypes, other.getMissingTypes()))) &&
            ((this.identityCredential==null && other.getIdentityCredential()==null) || 
             (this.identityCredential!=null &&
              this.identityCredential.equals(other.getIdentityCredential()))) &&
            ((this.identityAssertion==null && other.getIdentityAssertion()==null) || 
             (this.identityAssertion!=null &&
              java.util.Arrays.equals(this.identityAssertion, other.getIdentityAssertion())));
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
        if (getMissingTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMissingTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMissingTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdentityCredential() != null) {
            _hashCode += getIdentityCredential().hashCode();
        }
        if (getIdentityAssertion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentityAssertion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentityAssertion(), i);
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
        new org.apache.axis.description.TypeDesc(GetCredentialsResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GetCredentialsResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "MissingTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityCredential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityCredential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityCredentialType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityAssertion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"));
        elemField.setNillable(true);
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

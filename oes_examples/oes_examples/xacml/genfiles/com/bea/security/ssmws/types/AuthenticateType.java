/**
 * AuthenticateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class AuthenticateType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.IdentityCredentialType identityCredential;
    private java.lang.String requestedCredentialType;
    private com.bea.security.ssmws.types.ContextType appContext;

    public AuthenticateType() {
    }

    public AuthenticateType(
           com.bea.security.ssmws.types.IdentityCredentialType identityCredential,
           java.lang.String requestedCredentialType,
           com.bea.security.ssmws.types.ContextType appContext) {
           this.identityCredential = identityCredential;
           this.requestedCredentialType = requestedCredentialType;
           this.appContext = appContext;
    }


    /**
     * Gets the identityCredential value for this AuthenticateType.
     * 
     * @return identityCredential
     */
    public com.bea.security.ssmws.types.IdentityCredentialType getIdentityCredential() {
        return identityCredential;
    }


    /**
     * Sets the identityCredential value for this AuthenticateType.
     * 
     * @param identityCredential
     */
    public void setIdentityCredential(com.bea.security.ssmws.types.IdentityCredentialType identityCredential) {
        this.identityCredential = identityCredential;
    }


    /**
     * Gets the requestedCredentialType value for this AuthenticateType.
     * 
     * @return requestedCredentialType
     */
    public java.lang.String getRequestedCredentialType() {
        return requestedCredentialType;
    }


    /**
     * Sets the requestedCredentialType value for this AuthenticateType.
     * 
     * @param requestedCredentialType
     */
    public void setRequestedCredentialType(java.lang.String requestedCredentialType) {
        this.requestedCredentialType = requestedCredentialType;
    }


    /**
     * Gets the appContext value for this AuthenticateType.
     * 
     * @return appContext
     */
    public com.bea.security.ssmws.types.ContextType getAppContext() {
        return appContext;
    }


    /**
     * Sets the appContext value for this AuthenticateType.
     * 
     * @param appContext
     */
    public void setAppContext(com.bea.security.ssmws.types.ContextType appContext) {
        this.appContext = appContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticateType)) return false;
        AuthenticateType other = (AuthenticateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identityCredential==null && other.getIdentityCredential()==null) || 
             (this.identityCredential!=null &&
              this.identityCredential.equals(other.getIdentityCredential()))) &&
            ((this.requestedCredentialType==null && other.getRequestedCredentialType()==null) || 
             (this.requestedCredentialType!=null &&
              this.requestedCredentialType.equals(other.getRequestedCredentialType()))) &&
            ((this.appContext==null && other.getAppContext()==null) || 
             (this.appContext!=null &&
              this.appContext.equals(other.getAppContext())));
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
        if (getIdentityCredential() != null) {
            _hashCode += getIdentityCredential().hashCode();
        }
        if (getRequestedCredentialType() != null) {
            _hashCode += getRequestedCredentialType().hashCode();
        }
        if (getAppContext() != null) {
            _hashCode += getAppContext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthenticateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityCredential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityCredential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityCredentialType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedCredentialType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedCredentialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AppContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"));
        elemField.setNillable(true);
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

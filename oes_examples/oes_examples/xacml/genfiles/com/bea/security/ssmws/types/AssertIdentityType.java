/**
 * AssertIdentityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class AssertIdentityType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.IdentityAssertionType identityAssertion;
    private java.lang.String requestedCredentialType;
    private com.bea.security.ssmws.types.ContextType appContext;

    public AssertIdentityType() {
    }

    public AssertIdentityType(
           com.bea.security.ssmws.types.IdentityAssertionType identityAssertion,
           java.lang.String requestedCredentialType,
           com.bea.security.ssmws.types.ContextType appContext) {
           this.identityAssertion = identityAssertion;
           this.requestedCredentialType = requestedCredentialType;
           this.appContext = appContext;
    }


    /**
     * Gets the identityAssertion value for this AssertIdentityType.
     * 
     * @return identityAssertion
     */
    public com.bea.security.ssmws.types.IdentityAssertionType getIdentityAssertion() {
        return identityAssertion;
    }


    /**
     * Sets the identityAssertion value for this AssertIdentityType.
     * 
     * @param identityAssertion
     */
    public void setIdentityAssertion(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion) {
        this.identityAssertion = identityAssertion;
    }


    /**
     * Gets the requestedCredentialType value for this AssertIdentityType.
     * 
     * @return requestedCredentialType
     */
    public java.lang.String getRequestedCredentialType() {
        return requestedCredentialType;
    }


    /**
     * Sets the requestedCredentialType value for this AssertIdentityType.
     * 
     * @param requestedCredentialType
     */
    public void setRequestedCredentialType(java.lang.String requestedCredentialType) {
        this.requestedCredentialType = requestedCredentialType;
    }


    /**
     * Gets the appContext value for this AssertIdentityType.
     * 
     * @return appContext
     */
    public com.bea.security.ssmws.types.ContextType getAppContext() {
        return appContext;
    }


    /**
     * Sets the appContext value for this AssertIdentityType.
     * 
     * @param appContext
     */
    public void setAppContext(com.bea.security.ssmws.types.ContextType appContext) {
        this.appContext = appContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssertIdentityType)) return false;
        AssertIdentityType other = (AssertIdentityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identityAssertion==null && other.getIdentityAssertion()==null) || 
             (this.identityAssertion!=null &&
              this.identityAssertion.equals(other.getIdentityAssertion()))) &&
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
        if (getIdentityAssertion() != null) {
            _hashCode += getIdentityAssertion().hashCode();
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
        new org.apache.axis.description.TypeDesc(AssertIdentityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AssertIdentityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityAssertion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedCredentialType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedCredentialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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

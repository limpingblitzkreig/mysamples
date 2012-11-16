/**
 * IsAccessAllowedDebugType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class IsAccessAllowedDebugType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.IdentityAssertionType identityAssertion;
    private com.bea.security.ssmws.types.RuntimeResourceType runtimeResource;
    private com.bea.security.ssmws.types.RuntimeActionType runtimeAction;
    private java.lang.String requestedCredentialType;
    private com.bea.security.ssmws.types.ContextType appContext;

    public IsAccessAllowedDebugType() {
    }

    public IsAccessAllowedDebugType(
           com.bea.security.ssmws.types.IdentityAssertionType identityAssertion,
           com.bea.security.ssmws.types.RuntimeResourceType runtimeResource,
           com.bea.security.ssmws.types.RuntimeActionType runtimeAction,
           java.lang.String requestedCredentialType,
           com.bea.security.ssmws.types.ContextType appContext) {
           this.identityAssertion = identityAssertion;
           this.runtimeResource = runtimeResource;
           this.runtimeAction = runtimeAction;
           this.requestedCredentialType = requestedCredentialType;
           this.appContext = appContext;
    }


    /**
     * Gets the identityAssertion value for this IsAccessAllowedDebugType.
     * 
     * @return identityAssertion
     */
    public com.bea.security.ssmws.types.IdentityAssertionType getIdentityAssertion() {
        return identityAssertion;
    }


    /**
     * Sets the identityAssertion value for this IsAccessAllowedDebugType.
     * 
     * @param identityAssertion
     */
    public void setIdentityAssertion(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion) {
        this.identityAssertion = identityAssertion;
    }


    /**
     * Gets the runtimeResource value for this IsAccessAllowedDebugType.
     * 
     * @return runtimeResource
     */
    public com.bea.security.ssmws.types.RuntimeResourceType getRuntimeResource() {
        return runtimeResource;
    }


    /**
     * Sets the runtimeResource value for this IsAccessAllowedDebugType.
     * 
     * @param runtimeResource
     */
    public void setRuntimeResource(com.bea.security.ssmws.types.RuntimeResourceType runtimeResource) {
        this.runtimeResource = runtimeResource;
    }


    /**
     * Gets the runtimeAction value for this IsAccessAllowedDebugType.
     * 
     * @return runtimeAction
     */
    public com.bea.security.ssmws.types.RuntimeActionType getRuntimeAction() {
        return runtimeAction;
    }


    /**
     * Sets the runtimeAction value for this IsAccessAllowedDebugType.
     * 
     * @param runtimeAction
     */
    public void setRuntimeAction(com.bea.security.ssmws.types.RuntimeActionType runtimeAction) {
        this.runtimeAction = runtimeAction;
    }


    /**
     * Gets the requestedCredentialType value for this IsAccessAllowedDebugType.
     * 
     * @return requestedCredentialType
     */
    public java.lang.String getRequestedCredentialType() {
        return requestedCredentialType;
    }


    /**
     * Sets the requestedCredentialType value for this IsAccessAllowedDebugType.
     * 
     * @param requestedCredentialType
     */
    public void setRequestedCredentialType(java.lang.String requestedCredentialType) {
        this.requestedCredentialType = requestedCredentialType;
    }


    /**
     * Gets the appContext value for this IsAccessAllowedDebugType.
     * 
     * @return appContext
     */
    public com.bea.security.ssmws.types.ContextType getAppContext() {
        return appContext;
    }


    /**
     * Sets the appContext value for this IsAccessAllowedDebugType.
     * 
     * @param appContext
     */
    public void setAppContext(com.bea.security.ssmws.types.ContextType appContext) {
        this.appContext = appContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsAccessAllowedDebugType)) return false;
        IsAccessAllowedDebugType other = (IsAccessAllowedDebugType) obj;
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
            ((this.runtimeResource==null && other.getRuntimeResource()==null) || 
             (this.runtimeResource!=null &&
              this.runtimeResource.equals(other.getRuntimeResource()))) &&
            ((this.runtimeAction==null && other.getRuntimeAction()==null) || 
             (this.runtimeAction!=null &&
              this.runtimeAction.equals(other.getRuntimeAction()))) &&
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
        if (getRuntimeResource() != null) {
            _hashCode += getRuntimeResource().hashCode();
        }
        if (getRuntimeAction() != null) {
            _hashCode += getRuntimeAction().hashCode();
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
        new org.apache.axis.description.TypeDesc(IsAccessAllowedDebugType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsAccessAllowedDebugType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityAssertion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtimeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResourceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtimeAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeActionType"));
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

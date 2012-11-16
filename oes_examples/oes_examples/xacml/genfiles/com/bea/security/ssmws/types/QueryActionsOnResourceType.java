/**
 * QueryActionsOnResourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class QueryActionsOnResourceType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.IdentityAssertionType identityAssertion;
    private com.bea.security.ssmws.types.RuntimeResourceType runtimeResource;
    private com.bea.security.ssmws.types.RequestedActionsType requestedActions;
    private com.bea.security.ssmws.types.ContextType appContext;

    public QueryActionsOnResourceType() {
    }

    public QueryActionsOnResourceType(
           com.bea.security.ssmws.types.IdentityAssertionType identityAssertion,
           com.bea.security.ssmws.types.RuntimeResourceType runtimeResource,
           com.bea.security.ssmws.types.RequestedActionsType requestedActions,
           com.bea.security.ssmws.types.ContextType appContext) {
           this.identityAssertion = identityAssertion;
           this.runtimeResource = runtimeResource;
           this.requestedActions = requestedActions;
           this.appContext = appContext;
    }


    /**
     * Gets the identityAssertion value for this QueryActionsOnResourceType.
     * 
     * @return identityAssertion
     */
    public com.bea.security.ssmws.types.IdentityAssertionType getIdentityAssertion() {
        return identityAssertion;
    }


    /**
     * Sets the identityAssertion value for this QueryActionsOnResourceType.
     * 
     * @param identityAssertion
     */
    public void setIdentityAssertion(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion) {
        this.identityAssertion = identityAssertion;
    }


    /**
     * Gets the runtimeResource value for this QueryActionsOnResourceType.
     * 
     * @return runtimeResource
     */
    public com.bea.security.ssmws.types.RuntimeResourceType getRuntimeResource() {
        return runtimeResource;
    }


    /**
     * Sets the runtimeResource value for this QueryActionsOnResourceType.
     * 
     * @param runtimeResource
     */
    public void setRuntimeResource(com.bea.security.ssmws.types.RuntimeResourceType runtimeResource) {
        this.runtimeResource = runtimeResource;
    }


    /**
     * Gets the requestedActions value for this QueryActionsOnResourceType.
     * 
     * @return requestedActions
     */
    public com.bea.security.ssmws.types.RequestedActionsType getRequestedActions() {
        return requestedActions;
    }


    /**
     * Sets the requestedActions value for this QueryActionsOnResourceType.
     * 
     * @param requestedActions
     */
    public void setRequestedActions(com.bea.security.ssmws.types.RequestedActionsType requestedActions) {
        this.requestedActions = requestedActions;
    }


    /**
     * Gets the appContext value for this QueryActionsOnResourceType.
     * 
     * @return appContext
     */
    public com.bea.security.ssmws.types.ContextType getAppContext() {
        return appContext;
    }


    /**
     * Sets the appContext value for this QueryActionsOnResourceType.
     * 
     * @param appContext
     */
    public void setAppContext(com.bea.security.ssmws.types.ContextType appContext) {
        this.appContext = appContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryActionsOnResourceType)) return false;
        QueryActionsOnResourceType other = (QueryActionsOnResourceType) obj;
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
            ((this.requestedActions==null && other.getRequestedActions()==null) || 
             (this.requestedActions!=null &&
              this.requestedActions.equals(other.getRequestedActions()))) &&
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
        if (getRequestedActions() != null) {
            _hashCode += getRequestedActions().hashCode();
        }
        if (getAppContext() != null) {
            _hashCode += getAppContext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryActionsOnResourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "QueryActionsOnResourceType"));
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
        elemField.setFieldName("requestedActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedActionsType"));
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

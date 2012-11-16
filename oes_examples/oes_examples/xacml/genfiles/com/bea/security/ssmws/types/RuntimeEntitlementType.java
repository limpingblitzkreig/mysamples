/**
 * RuntimeEntitlementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class RuntimeEntitlementType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.RuntimeResourceType runtimeResource;
    private com.bea.security.ssmws.types.RuntimeActionType[] grantedActions;
    private com.bea.security.ssmws.types.RuntimeActionType[] deniedActions;

    public RuntimeEntitlementType() {
    }

    public RuntimeEntitlementType(
           com.bea.security.ssmws.types.RuntimeResourceType runtimeResource,
           com.bea.security.ssmws.types.RuntimeActionType[] grantedActions,
           com.bea.security.ssmws.types.RuntimeActionType[] deniedActions) {
           this.runtimeResource = runtimeResource;
           this.grantedActions = grantedActions;
           this.deniedActions = deniedActions;
    }


    /**
     * Gets the runtimeResource value for this RuntimeEntitlementType.
     * 
     * @return runtimeResource
     */
    public com.bea.security.ssmws.types.RuntimeResourceType getRuntimeResource() {
        return runtimeResource;
    }


    /**
     * Sets the runtimeResource value for this RuntimeEntitlementType.
     * 
     * @param runtimeResource
     */
    public void setRuntimeResource(com.bea.security.ssmws.types.RuntimeResourceType runtimeResource) {
        this.runtimeResource = runtimeResource;
    }


    /**
     * Gets the grantedActions value for this RuntimeEntitlementType.
     * 
     * @return grantedActions
     */
    public com.bea.security.ssmws.types.RuntimeActionType[] getGrantedActions() {
        return grantedActions;
    }


    /**
     * Sets the grantedActions value for this RuntimeEntitlementType.
     * 
     * @param grantedActions
     */
    public void setGrantedActions(com.bea.security.ssmws.types.RuntimeActionType[] grantedActions) {
        this.grantedActions = grantedActions;
    }

    public com.bea.security.ssmws.types.RuntimeActionType getGrantedActions(int i) {
        return this.grantedActions[i];
    }

    public void setGrantedActions(int i, com.bea.security.ssmws.types.RuntimeActionType _value) {
        this.grantedActions[i] = _value;
    }


    /**
     * Gets the deniedActions value for this RuntimeEntitlementType.
     * 
     * @return deniedActions
     */
    public com.bea.security.ssmws.types.RuntimeActionType[] getDeniedActions() {
        return deniedActions;
    }


    /**
     * Sets the deniedActions value for this RuntimeEntitlementType.
     * 
     * @param deniedActions
     */
    public void setDeniedActions(com.bea.security.ssmws.types.RuntimeActionType[] deniedActions) {
        this.deniedActions = deniedActions;
    }

    public com.bea.security.ssmws.types.RuntimeActionType getDeniedActions(int i) {
        return this.deniedActions[i];
    }

    public void setDeniedActions(int i, com.bea.security.ssmws.types.RuntimeActionType _value) {
        this.deniedActions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuntimeEntitlementType)) return false;
        RuntimeEntitlementType other = (RuntimeEntitlementType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.runtimeResource==null && other.getRuntimeResource()==null) || 
             (this.runtimeResource!=null &&
              this.runtimeResource.equals(other.getRuntimeResource()))) &&
            ((this.grantedActions==null && other.getGrantedActions()==null) || 
             (this.grantedActions!=null &&
              java.util.Arrays.equals(this.grantedActions, other.getGrantedActions()))) &&
            ((this.deniedActions==null && other.getDeniedActions()==null) || 
             (this.deniedActions!=null &&
              java.util.Arrays.equals(this.deniedActions, other.getDeniedActions())));
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
        if (getRuntimeResource() != null) {
            _hashCode += getRuntimeResource().hashCode();
        }
        if (getGrantedActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrantedActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrantedActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeniedActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeniedActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeniedActions(), i);
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
        new org.apache.axis.description.TypeDesc(RuntimeEntitlementType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeEntitlementType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtimeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResourceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantedActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GrantedActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeActionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deniedActions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DeniedActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeActionType"));
        elemField.setMinOccurs(0);
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

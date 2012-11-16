/**
 * IsAuthenticationRequiredType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class IsAuthenticationRequiredType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.RuntimeResourceType runtimeResource;
    private com.bea.security.ssmws.types.RuntimeActionType runtimeAction;

    public IsAuthenticationRequiredType() {
    }

    public IsAuthenticationRequiredType(
           com.bea.security.ssmws.types.RuntimeResourceType runtimeResource,
           com.bea.security.ssmws.types.RuntimeActionType runtimeAction) {
           this.runtimeResource = runtimeResource;
           this.runtimeAction = runtimeAction;
    }


    /**
     * Gets the runtimeResource value for this IsAuthenticationRequiredType.
     * 
     * @return runtimeResource
     */
    public com.bea.security.ssmws.types.RuntimeResourceType getRuntimeResource() {
        return runtimeResource;
    }


    /**
     * Sets the runtimeResource value for this IsAuthenticationRequiredType.
     * 
     * @param runtimeResource
     */
    public void setRuntimeResource(com.bea.security.ssmws.types.RuntimeResourceType runtimeResource) {
        this.runtimeResource = runtimeResource;
    }


    /**
     * Gets the runtimeAction value for this IsAuthenticationRequiredType.
     * 
     * @return runtimeAction
     */
    public com.bea.security.ssmws.types.RuntimeActionType getRuntimeAction() {
        return runtimeAction;
    }


    /**
     * Sets the runtimeAction value for this IsAuthenticationRequiredType.
     * 
     * @param runtimeAction
     */
    public void setRuntimeAction(com.bea.security.ssmws.types.RuntimeActionType runtimeAction) {
        this.runtimeAction = runtimeAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsAuthenticationRequiredType)) return false;
        IsAuthenticationRequiredType other = (IsAuthenticationRequiredType) obj;
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
            ((this.runtimeAction==null && other.getRuntimeAction()==null) || 
             (this.runtimeAction!=null &&
              this.runtimeAction.equals(other.getRuntimeAction())));
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
        if (getRuntimeAction() != null) {
            _hashCode += getRuntimeAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsAuthenticationRequiredType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsAuthenticationRequiredType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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

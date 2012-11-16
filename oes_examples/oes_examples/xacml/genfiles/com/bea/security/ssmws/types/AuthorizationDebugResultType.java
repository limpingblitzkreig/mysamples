/**
 * AuthorizationDebugResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class AuthorizationDebugResultType  implements java.io.Serializable {
    private boolean accessAllowed;
    private com.bea.security.ssmws.types.AtzDecisionDataType atzDecisionData;
    private com.bea.security.ssmws.types.ContextRequestsType contextRequests;
    private com.bea.security.ssmws.types.DebugInfoType debugInfo;

    public AuthorizationDebugResultType() {
    }

    public AuthorizationDebugResultType(
           boolean accessAllowed,
           com.bea.security.ssmws.types.AtzDecisionDataType atzDecisionData,
           com.bea.security.ssmws.types.ContextRequestsType contextRequests,
           com.bea.security.ssmws.types.DebugInfoType debugInfo) {
           this.accessAllowed = accessAllowed;
           this.atzDecisionData = atzDecisionData;
           this.contextRequests = contextRequests;
           this.debugInfo = debugInfo;
    }


    /**
     * Gets the accessAllowed value for this AuthorizationDebugResultType.
     * 
     * @return accessAllowed
     */
    public boolean isAccessAllowed() {
        return accessAllowed;
    }


    /**
     * Sets the accessAllowed value for this AuthorizationDebugResultType.
     * 
     * @param accessAllowed
     */
    public void setAccessAllowed(boolean accessAllowed) {
        this.accessAllowed = accessAllowed;
    }


    /**
     * Gets the atzDecisionData value for this AuthorizationDebugResultType.
     * 
     * @return atzDecisionData
     */
    public com.bea.security.ssmws.types.AtzDecisionDataType getAtzDecisionData() {
        return atzDecisionData;
    }


    /**
     * Sets the atzDecisionData value for this AuthorizationDebugResultType.
     * 
     * @param atzDecisionData
     */
    public void setAtzDecisionData(com.bea.security.ssmws.types.AtzDecisionDataType atzDecisionData) {
        this.atzDecisionData = atzDecisionData;
    }


    /**
     * Gets the contextRequests value for this AuthorizationDebugResultType.
     * 
     * @return contextRequests
     */
    public com.bea.security.ssmws.types.ContextRequestsType getContextRequests() {
        return contextRequests;
    }


    /**
     * Sets the contextRequests value for this AuthorizationDebugResultType.
     * 
     * @param contextRequests
     */
    public void setContextRequests(com.bea.security.ssmws.types.ContextRequestsType contextRequests) {
        this.contextRequests = contextRequests;
    }


    /**
     * Gets the debugInfo value for this AuthorizationDebugResultType.
     * 
     * @return debugInfo
     */
    public com.bea.security.ssmws.types.DebugInfoType getDebugInfo() {
        return debugInfo;
    }


    /**
     * Sets the debugInfo value for this AuthorizationDebugResultType.
     * 
     * @param debugInfo
     */
    public void setDebugInfo(com.bea.security.ssmws.types.DebugInfoType debugInfo) {
        this.debugInfo = debugInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorizationDebugResultType)) return false;
        AuthorizationDebugResultType other = (AuthorizationDebugResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accessAllowed == other.isAccessAllowed() &&
            ((this.atzDecisionData==null && other.getAtzDecisionData()==null) || 
             (this.atzDecisionData!=null &&
              this.atzDecisionData.equals(other.getAtzDecisionData()))) &&
            ((this.contextRequests==null && other.getContextRequests()==null) || 
             (this.contextRequests!=null &&
              this.contextRequests.equals(other.getContextRequests()))) &&
            ((this.debugInfo==null && other.getDebugInfo()==null) || 
             (this.debugInfo!=null &&
              this.debugInfo.equals(other.getDebugInfo())));
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
        _hashCode += (isAccessAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAtzDecisionData() != null) {
            _hashCode += getAtzDecisionData().hashCode();
        }
        if (getContextRequests() != null) {
            _hashCode += getContextRequests().hashCode();
        }
        if (getDebugInfo() != null) {
            _hashCode += getDebugInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthorizationDebugResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthorizationDebugResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AccessAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atzDecisionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequestsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debugInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DebugInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DebugInfoType"));
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

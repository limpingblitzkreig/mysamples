/**
 * RuntimeActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class RuntimeActionType  implements java.io.Serializable {
    private java.lang.String actionString;
    private java.lang.String authorityName;

    public RuntimeActionType() {
    }

    public RuntimeActionType(
           java.lang.String actionString,
           java.lang.String authorityName) {
           this.actionString = actionString;
           this.authorityName = authorityName;
    }


    /**
     * Gets the actionString value for this RuntimeActionType.
     * 
     * @return actionString
     */
    public java.lang.String getActionString() {
        return actionString;
    }


    /**
     * Sets the actionString value for this RuntimeActionType.
     * 
     * @param actionString
     */
    public void setActionString(java.lang.String actionString) {
        this.actionString = actionString;
    }


    /**
     * Gets the authorityName value for this RuntimeActionType.
     * 
     * @return authorityName
     */
    public java.lang.String getAuthorityName() {
        return authorityName;
    }


    /**
     * Sets the authorityName value for this RuntimeActionType.
     * 
     * @param authorityName
     */
    public void setAuthorityName(java.lang.String authorityName) {
        this.authorityName = authorityName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuntimeActionType)) return false;
        RuntimeActionType other = (RuntimeActionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionString==null && other.getActionString()==null) || 
             (this.actionString!=null &&
              this.actionString.equals(other.getActionString()))) &&
            ((this.authorityName==null && other.getAuthorityName()==null) || 
             (this.authorityName!=null &&
              this.authorityName.equals(other.getAuthorityName())));
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
        if (getActionString() != null) {
            _hashCode += getActionString().hashCode();
        }
        if (getAuthorityName() != null) {
            _hashCode += getAuthorityName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuntimeActionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeActionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ActionString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthorityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

/**
 * SsmIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class SsmIdType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.ServiceTypeEnum serviceType;
    private java.lang.String ssmId;

    public SsmIdType() {
    }

    public SsmIdType(
           com.bea.security.ssmws.types.ServiceTypeEnum serviceType,
           java.lang.String ssmId) {
           this.serviceType = serviceType;
           this.ssmId = ssmId;
    }


    /**
     * Gets the serviceType value for this SsmIdType.
     * 
     * @return serviceType
     */
    public com.bea.security.ssmws.types.ServiceTypeEnum getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this SsmIdType.
     * 
     * @param serviceType
     */
    public void setServiceType(com.bea.security.ssmws.types.ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the ssmId value for this SsmIdType.
     * 
     * @return ssmId
     */
    public java.lang.String getSsmId() {
        return ssmId;
    }


    /**
     * Sets the ssmId value for this SsmIdType.
     * 
     * @param ssmId
     */
    public void setSsmId(java.lang.String ssmId) {
        this.ssmId = ssmId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SsmIdType)) return false;
        SsmIdType other = (SsmIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.ssmId==null && other.getSsmId()==null) || 
             (this.ssmId!=null &&
              this.ssmId.equals(other.getSsmId())));
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
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getSsmId() != null) {
            _hashCode += getSsmId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SsmIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "SsmIdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssmId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "SsmId"));
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

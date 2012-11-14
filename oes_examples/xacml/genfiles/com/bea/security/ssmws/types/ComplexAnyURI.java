/**
 * ComplexAnyURI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class ComplexAnyURI  implements java.io.Serializable {
    private org.apache.axis.types.URI locateServiceResponse;

    public ComplexAnyURI() {
    }

    public ComplexAnyURI(
           org.apache.axis.types.URI locateServiceResponse) {
           this.locateServiceResponse = locateServiceResponse;
    }


    /**
     * Gets the locateServiceResponse value for this ComplexAnyURI.
     * 
     * @return locateServiceResponse
     */
    public org.apache.axis.types.URI getLocateServiceResponse() {
        return locateServiceResponse;
    }


    /**
     * Sets the locateServiceResponse value for this ComplexAnyURI.
     * 
     * @param locateServiceResponse
     */
    public void setLocateServiceResponse(org.apache.axis.types.URI locateServiceResponse) {
        this.locateServiceResponse = locateServiceResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplexAnyURI)) return false;
        ComplexAnyURI other = (ComplexAnyURI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locateServiceResponse==null && other.getLocateServiceResponse()==null) || 
             (this.locateServiceResponse!=null &&
              this.locateServiceResponse.equals(other.getLocateServiceResponse())));
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
        if (getLocateServiceResponse() != null) {
            _hashCode += getLocateServiceResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplexAnyURI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ComplexAnyURI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locateServiceResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "locateServiceResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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

/**
 * GetParameterValueResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class GetParameterValueResponseType  implements java.io.Serializable {
    private java.lang.String getParameterValueResponse;

    public GetParameterValueResponseType() {
    }

    public GetParameterValueResponseType(
           java.lang.String getParameterValueResponse) {
           this.getParameterValueResponse = getParameterValueResponse;
    }


    /**
     * Gets the getParameterValueResponse value for this GetParameterValueResponseType.
     * 
     * @return getParameterValueResponse
     */
    public java.lang.String getGetParameterValueResponse() {
        return getParameterValueResponse;
    }


    /**
     * Sets the getParameterValueResponse value for this GetParameterValueResponseType.
     * 
     * @param getParameterValueResponse
     */
    public void setGetParameterValueResponse(java.lang.String getParameterValueResponse) {
        this.getParameterValueResponse = getParameterValueResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetParameterValueResponseType)) return false;
        GetParameterValueResponseType other = (GetParameterValueResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getParameterValueResponse==null && other.getGetParameterValueResponse()==null) || 
             (this.getParameterValueResponse!=null &&
              this.getParameterValueResponse.equals(other.getGetParameterValueResponse())));
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
        if (getGetParameterValueResponse() != null) {
            _hashCode += getGetParameterValueResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetParameterValueResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "getParameterValueResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getParameterValueResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "getParameterValueResponse"));
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

/**
 * ContextRequestsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class ContextRequestsType  implements java.io.Serializable {
    private javax.xml.namespace.QName[] contextAttribute;

    public ContextRequestsType() {
    }

    public ContextRequestsType(
           javax.xml.namespace.QName[] contextAttribute) {
           this.contextAttribute = contextAttribute;
    }


    /**
     * Gets the contextAttribute value for this ContextRequestsType.
     * 
     * @return contextAttribute
     */
    public javax.xml.namespace.QName[] getContextAttribute() {
        return contextAttribute;
    }


    /**
     * Sets the contextAttribute value for this ContextRequestsType.
     * 
     * @param contextAttribute
     */
    public void setContextAttribute(javax.xml.namespace.QName[] contextAttribute) {
        this.contextAttribute = contextAttribute;
    }

    public javax.xml.namespace.QName getContextAttribute(int i) {
        return this.contextAttribute[i];
    }

    public void setContextAttribute(int i, javax.xml.namespace.QName _value) {
        this.contextAttribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContextRequestsType)) return false;
        ContextRequestsType other = (ContextRequestsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contextAttribute==null && other.getContextAttribute()==null) || 
             (this.contextAttribute!=null &&
              java.util.Arrays.equals(this.contextAttribute, other.getContextAttribute())));
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
        if (getContextAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContextAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContextAttribute(), i);
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
        new org.apache.axis.description.TypeDesc(ContextRequestsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequestsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"));
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

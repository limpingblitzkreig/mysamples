/**
 * MissingAttributeDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types.context;

public class MissingAttributeDetailType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.context.AttributeValueType[] attributeValue;
    private org.apache.axis.types.URI attributeId;  // attribute
    private org.apache.axis.types.URI dataType;  // attribute
    private java.lang.String issuer;  // attribute

    public MissingAttributeDetailType() {
    }

    public MissingAttributeDetailType(
           com.bea.security.ssmws.types.context.AttributeValueType[] attributeValue,
           org.apache.axis.types.URI attributeId,
           org.apache.axis.types.URI dataType,
           java.lang.String issuer) {
           this.attributeValue = attributeValue;
           this.attributeId = attributeId;
           this.dataType = dataType;
           this.issuer = issuer;
    }


    /**
     * Gets the attributeValue value for this MissingAttributeDetailType.
     * 
     * @return attributeValue
     */
    public com.bea.security.ssmws.types.context.AttributeValueType[] getAttributeValue() {
        return attributeValue;
    }


    /**
     * Sets the attributeValue value for this MissingAttributeDetailType.
     * 
     * @param attributeValue
     */
    public void setAttributeValue(com.bea.security.ssmws.types.context.AttributeValueType[] attributeValue) {
        this.attributeValue = attributeValue;
    }

    public com.bea.security.ssmws.types.context.AttributeValueType getAttributeValue(int i) {
        return this.attributeValue[i];
    }

    public void setAttributeValue(int i, com.bea.security.ssmws.types.context.AttributeValueType _value) {
        this.attributeValue[i] = _value;
    }


    /**
     * Gets the attributeId value for this MissingAttributeDetailType.
     * 
     * @return attributeId
     */
    public org.apache.axis.types.URI getAttributeId() {
        return attributeId;
    }


    /**
     * Sets the attributeId value for this MissingAttributeDetailType.
     * 
     * @param attributeId
     */
    public void setAttributeId(org.apache.axis.types.URI attributeId) {
        this.attributeId = attributeId;
    }


    /**
     * Gets the dataType value for this MissingAttributeDetailType.
     * 
     * @return dataType
     */
    public org.apache.axis.types.URI getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this MissingAttributeDetailType.
     * 
     * @param dataType
     */
    public void setDataType(org.apache.axis.types.URI dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the issuer value for this MissingAttributeDetailType.
     * 
     * @return issuer
     */
    public java.lang.String getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this MissingAttributeDetailType.
     * 
     * @param issuer
     */
    public void setIssuer(java.lang.String issuer) {
        this.issuer = issuer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MissingAttributeDetailType)) return false;
        MissingAttributeDetailType other = (MissingAttributeDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeValue==null && other.getAttributeValue()==null) || 
             (this.attributeValue!=null &&
              java.util.Arrays.equals(this.attributeValue, other.getAttributeValue()))) &&
            ((this.attributeId==null && other.getAttributeId()==null) || 
             (this.attributeId!=null &&
              this.attributeId.equals(other.getAttributeId()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer())));
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
        if (getAttributeValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttributeId() != null) {
            _hashCode += getAttributeId().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MissingAttributeDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "MissingAttributeDetailType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attributeId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AttributeId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dataType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DataType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("issuer");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Issuer"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "AttributeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "AttributeValueType"));
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

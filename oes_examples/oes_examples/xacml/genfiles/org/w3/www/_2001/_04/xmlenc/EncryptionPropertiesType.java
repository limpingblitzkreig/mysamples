/**
 * EncryptionPropertiesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.w3.www._2001._04.xmlenc;

public class EncryptionPropertiesType  implements java.io.Serializable {
    private org.w3.www._2001._04.xmlenc.EncryptionPropertyType[] encryptionProperty;
    private org.apache.axis.types.Id id;  // attribute

    public EncryptionPropertiesType() {
    }

    public EncryptionPropertiesType(
           org.w3.www._2001._04.xmlenc.EncryptionPropertyType[] encryptionProperty,
           org.apache.axis.types.Id id) {
           this.encryptionProperty = encryptionProperty;
           this.id = id;
    }


    /**
     * Gets the encryptionProperty value for this EncryptionPropertiesType.
     * 
     * @return encryptionProperty
     */
    public org.w3.www._2001._04.xmlenc.EncryptionPropertyType[] getEncryptionProperty() {
        return encryptionProperty;
    }


    /**
     * Sets the encryptionProperty value for this EncryptionPropertiesType.
     * 
     * @param encryptionProperty
     */
    public void setEncryptionProperty(org.w3.www._2001._04.xmlenc.EncryptionPropertyType[] encryptionProperty) {
        this.encryptionProperty = encryptionProperty;
    }

    public org.w3.www._2001._04.xmlenc.EncryptionPropertyType getEncryptionProperty(int i) {
        return this.encryptionProperty[i];
    }

    public void setEncryptionProperty(int i, org.w3.www._2001._04.xmlenc.EncryptionPropertyType _value) {
        this.encryptionProperty[i] = _value;
    }


    /**
     * Gets the id value for this EncryptionPropertiesType.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this EncryptionPropertiesType.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EncryptionPropertiesType)) return false;
        EncryptionPropertiesType other = (EncryptionPropertiesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.encryptionProperty==null && other.getEncryptionProperty()==null) || 
             (this.encryptionProperty!=null &&
              java.util.Arrays.equals(this.encryptionProperty, other.getEncryptionProperty()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getEncryptionProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEncryptionProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEncryptionProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EncryptionPropertiesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptionPropertiesType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptionProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptionPropertyType"));
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

/**
 * AttributeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class AttributeType  implements java.io.Serializable {
    private java.lang.Object[] attributeValue;
    private java.lang.String name;  // attribute
    private org.apache.axis.types.URI nameFormat;  // attribute
    private java.lang.String friendlyName;  // attribute

    public AttributeType() {
    }

    public AttributeType(
           java.lang.Object[] attributeValue,
           java.lang.String name,
           org.apache.axis.types.URI nameFormat,
           java.lang.String friendlyName) {
           this.attributeValue = attributeValue;
           this.name = name;
           this.nameFormat = nameFormat;
           this.friendlyName = friendlyName;
    }


    /**
     * Gets the attributeValue value for this AttributeType.
     * 
     * @return attributeValue
     */
    public java.lang.Object[] getAttributeValue() {
        return attributeValue;
    }


    /**
     * Sets the attributeValue value for this AttributeType.
     * 
     * @param attributeValue
     */
    public void setAttributeValue(java.lang.Object[] attributeValue) {
        this.attributeValue = attributeValue;
    }

    public java.lang.Object getAttributeValue(int i) {
        return this.attributeValue[i];
    }

    public void setAttributeValue(int i, java.lang.Object _value) {
        this.attributeValue[i] = _value;
    }


    /**
     * Gets the name value for this AttributeType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AttributeType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nameFormat value for this AttributeType.
     * 
     * @return nameFormat
     */
    public org.apache.axis.types.URI getNameFormat() {
        return nameFormat;
    }


    /**
     * Sets the nameFormat value for this AttributeType.
     * 
     * @param nameFormat
     */
    public void setNameFormat(org.apache.axis.types.URI nameFormat) {
        this.nameFormat = nameFormat;
    }


    /**
     * Gets the friendlyName value for this AttributeType.
     * 
     * @return friendlyName
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this AttributeType.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeType)) return false;
        AttributeType other = (AttributeType) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nameFormat==null && other.getNameFormat()==null) || 
             (this.nameFormat!=null &&
              this.nameFormat.equals(other.getNameFormat()))) &&
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNameFormat() != null) {
            _hashCode += getNameFormat().hashCode();
        }
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nameFormat");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NameFormat"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("friendlyName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FriendlyName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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

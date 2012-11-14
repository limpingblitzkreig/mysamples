/**
 * NameIDType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class NameIDType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    private org.apache.axis.types.URI format;  // attribute
    private java.lang.String SPProvidedID;  // attribute
    private java.lang.String nameQualifier;  // attribute
    private java.lang.String SPNameQualifier;  // attribute

    public NameIDType() {
    }

    // Simple Types must have a String constructor
    public NameIDType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this NameIDType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this NameIDType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the format value for this NameIDType.
     * 
     * @return format
     */
    public org.apache.axis.types.URI getFormat() {
        return format;
    }


    /**
     * Sets the format value for this NameIDType.
     * 
     * @param format
     */
    public void setFormat(org.apache.axis.types.URI format) {
        this.format = format;
    }


    /**
     * Gets the SPProvidedID value for this NameIDType.
     * 
     * @return SPProvidedID
     */
    public java.lang.String getSPProvidedID() {
        return SPProvidedID;
    }


    /**
     * Sets the SPProvidedID value for this NameIDType.
     * 
     * @param SPProvidedID
     */
    public void setSPProvidedID(java.lang.String SPProvidedID) {
        this.SPProvidedID = SPProvidedID;
    }


    /**
     * Gets the nameQualifier value for this NameIDType.
     * 
     * @return nameQualifier
     */
    public java.lang.String getNameQualifier() {
        return nameQualifier;
    }


    /**
     * Sets the nameQualifier value for this NameIDType.
     * 
     * @param nameQualifier
     */
    public void setNameQualifier(java.lang.String nameQualifier) {
        this.nameQualifier = nameQualifier;
    }


    /**
     * Gets the SPNameQualifier value for this NameIDType.
     * 
     * @return SPNameQualifier
     */
    public java.lang.String getSPNameQualifier() {
        return SPNameQualifier;
    }


    /**
     * Sets the SPNameQualifier value for this NameIDType.
     * 
     * @param SPNameQualifier
     */
    public void setSPNameQualifier(java.lang.String SPNameQualifier) {
        this.SPNameQualifier = SPNameQualifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameIDType)) return false;
        NameIDType other = (NameIDType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.SPProvidedID==null && other.getSPProvidedID()==null) || 
             (this.SPProvidedID!=null &&
              this.SPProvidedID.equals(other.getSPProvidedID()))) &&
            ((this.nameQualifier==null && other.getNameQualifier()==null) || 
             (this.nameQualifier!=null &&
              this.nameQualifier.equals(other.getNameQualifier()))) &&
            ((this.SPNameQualifier==null && other.getSPNameQualifier()==null) || 
             (this.SPNameQualifier!=null &&
              this.SPNameQualifier.equals(other.getSPNameQualifier())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getSPProvidedID() != null) {
            _hashCode += getSPProvidedID().hashCode();
        }
        if (getNameQualifier() != null) {
            _hashCode += getNameQualifier().hashCode();
        }
        if (getSPNameQualifier() != null) {
            _hashCode += getSPNameQualifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameIDType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "NameIDType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("format");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Format"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("SPProvidedID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SPProvidedID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nameQualifier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NameQualifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("SPNameQualifier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SPNameQualifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

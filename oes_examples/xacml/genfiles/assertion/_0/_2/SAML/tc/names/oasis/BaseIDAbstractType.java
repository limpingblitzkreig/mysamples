/**
 * BaseIDAbstractType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public abstract class BaseIDAbstractType  implements java.io.Serializable {
    private java.lang.String nameQualifier;  // attribute
    private java.lang.String SPNameQualifier;  // attribute

    public BaseIDAbstractType() {
    }

    public BaseIDAbstractType(
           java.lang.String nameQualifier,
           java.lang.String SPNameQualifier) {
           this.nameQualifier = nameQualifier;
           this.SPNameQualifier = SPNameQualifier;
    }


    /**
     * Gets the nameQualifier value for this BaseIDAbstractType.
     * 
     * @return nameQualifier
     */
    public java.lang.String getNameQualifier() {
        return nameQualifier;
    }


    /**
     * Sets the nameQualifier value for this BaseIDAbstractType.
     * 
     * @param nameQualifier
     */
    public void setNameQualifier(java.lang.String nameQualifier) {
        this.nameQualifier = nameQualifier;
    }


    /**
     * Gets the SPNameQualifier value for this BaseIDAbstractType.
     * 
     * @return SPNameQualifier
     */
    public java.lang.String getSPNameQualifier() {
        return SPNameQualifier;
    }


    /**
     * Sets the SPNameQualifier value for this BaseIDAbstractType.
     * 
     * @param SPNameQualifier
     */
    public void setSPNameQualifier(java.lang.String SPNameQualifier) {
        this.SPNameQualifier = SPNameQualifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseIDAbstractType)) return false;
        BaseIDAbstractType other = (BaseIDAbstractType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(BaseIDAbstractType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "BaseIDAbstractType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nameQualifier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NameQualifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("SPNameQualifier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SPNameQualifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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

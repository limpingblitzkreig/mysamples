/**
 * EncryptedElementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class EncryptedElementType  implements java.io.Serializable {
    private org.w3.www._2001._04.xmlenc.EncryptedDataType encryptedData;
    private org.w3.www._2001._04.xmlenc.EncryptedKeyType[] encryptedKey;

    public EncryptedElementType() {
    }

    public EncryptedElementType(
           org.w3.www._2001._04.xmlenc.EncryptedDataType encryptedData,
           org.w3.www._2001._04.xmlenc.EncryptedKeyType[] encryptedKey) {
           this.encryptedData = encryptedData;
           this.encryptedKey = encryptedKey;
    }


    /**
     * Gets the encryptedData value for this EncryptedElementType.
     * 
     * @return encryptedData
     */
    public org.w3.www._2001._04.xmlenc.EncryptedDataType getEncryptedData() {
        return encryptedData;
    }


    /**
     * Sets the encryptedData value for this EncryptedElementType.
     * 
     * @param encryptedData
     */
    public void setEncryptedData(org.w3.www._2001._04.xmlenc.EncryptedDataType encryptedData) {
        this.encryptedData = encryptedData;
    }


    /**
     * Gets the encryptedKey value for this EncryptedElementType.
     * 
     * @return encryptedKey
     */
    public org.w3.www._2001._04.xmlenc.EncryptedKeyType[] getEncryptedKey() {
        return encryptedKey;
    }


    /**
     * Sets the encryptedKey value for this EncryptedElementType.
     * 
     * @param encryptedKey
     */
    public void setEncryptedKey(org.w3.www._2001._04.xmlenc.EncryptedKeyType[] encryptedKey) {
        this.encryptedKey = encryptedKey;
    }

    public org.w3.www._2001._04.xmlenc.EncryptedKeyType getEncryptedKey(int i) {
        return this.encryptedKey[i];
    }

    public void setEncryptedKey(int i, org.w3.www._2001._04.xmlenc.EncryptedKeyType _value) {
        this.encryptedKey[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EncryptedElementType)) return false;
        EncryptedElementType other = (EncryptedElementType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.encryptedData==null && other.getEncryptedData()==null) || 
             (this.encryptedData!=null &&
              this.encryptedData.equals(other.getEncryptedData()))) &&
            ((this.encryptedKey==null && other.getEncryptedKey()==null) || 
             (this.encryptedKey!=null &&
              java.util.Arrays.equals(this.encryptedKey, other.getEncryptedKey())));
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
        if (getEncryptedData() != null) {
            _hashCode += getEncryptedData().hashCode();
        }
        if (getEncryptedKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEncryptedKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEncryptedKey(), i);
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
        new org.apache.axis.description.TypeDesc(EncryptedElementType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedElementType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedKey"));
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

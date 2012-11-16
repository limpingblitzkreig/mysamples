/**
 * SubjectConfirmationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class SubjectConfirmationType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType baseID;
    private assertion._0._2.SAML.tc.names.oasis.NameIDType nameID;
    private assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID;
    private assertion._0._2.SAML.tc.names.oasis.SubjectConfirmationDataType subjectConfirmationData;
    private org.apache.axis.types.URI method;  // attribute

    public SubjectConfirmationType() {
    }

    public SubjectConfirmationType(
           assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType baseID,
           assertion._0._2.SAML.tc.names.oasis.NameIDType nameID,
           assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID,
           assertion._0._2.SAML.tc.names.oasis.SubjectConfirmationDataType subjectConfirmationData,
           org.apache.axis.types.URI method) {
           this.baseID = baseID;
           this.nameID = nameID;
           this.encryptedID = encryptedID;
           this.subjectConfirmationData = subjectConfirmationData;
           this.method = method;
    }


    /**
     * Gets the baseID value for this SubjectConfirmationType.
     * 
     * @return baseID
     */
    public assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType getBaseID() {
        return baseID;
    }


    /**
     * Sets the baseID value for this SubjectConfirmationType.
     * 
     * @param baseID
     */
    public void setBaseID(assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType baseID) {
        this.baseID = baseID;
    }


    /**
     * Gets the nameID value for this SubjectConfirmationType.
     * 
     * @return nameID
     */
    public assertion._0._2.SAML.tc.names.oasis.NameIDType getNameID() {
        return nameID;
    }


    /**
     * Sets the nameID value for this SubjectConfirmationType.
     * 
     * @param nameID
     */
    public void setNameID(assertion._0._2.SAML.tc.names.oasis.NameIDType nameID) {
        this.nameID = nameID;
    }


    /**
     * Gets the encryptedID value for this SubjectConfirmationType.
     * 
     * @return encryptedID
     */
    public assertion._0._2.SAML.tc.names.oasis.EncryptedElementType getEncryptedID() {
        return encryptedID;
    }


    /**
     * Sets the encryptedID value for this SubjectConfirmationType.
     * 
     * @param encryptedID
     */
    public void setEncryptedID(assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID) {
        this.encryptedID = encryptedID;
    }


    /**
     * Gets the subjectConfirmationData value for this SubjectConfirmationType.
     * 
     * @return subjectConfirmationData
     */
    public assertion._0._2.SAML.tc.names.oasis.SubjectConfirmationDataType getSubjectConfirmationData() {
        return subjectConfirmationData;
    }


    /**
     * Sets the subjectConfirmationData value for this SubjectConfirmationType.
     * 
     * @param subjectConfirmationData
     */
    public void setSubjectConfirmationData(assertion._0._2.SAML.tc.names.oasis.SubjectConfirmationDataType subjectConfirmationData) {
        this.subjectConfirmationData = subjectConfirmationData;
    }


    /**
     * Gets the method value for this SubjectConfirmationType.
     * 
     * @return method
     */
    public org.apache.axis.types.URI getMethod() {
        return method;
    }


    /**
     * Sets the method value for this SubjectConfirmationType.
     * 
     * @param method
     */
    public void setMethod(org.apache.axis.types.URI method) {
        this.method = method;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubjectConfirmationType)) return false;
        SubjectConfirmationType other = (SubjectConfirmationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseID==null && other.getBaseID()==null) || 
             (this.baseID!=null &&
              this.baseID.equals(other.getBaseID()))) &&
            ((this.nameID==null && other.getNameID()==null) || 
             (this.nameID!=null &&
              this.nameID.equals(other.getNameID()))) &&
            ((this.encryptedID==null && other.getEncryptedID()==null) || 
             (this.encryptedID!=null &&
              this.encryptedID.equals(other.getEncryptedID()))) &&
            ((this.subjectConfirmationData==null && other.getSubjectConfirmationData()==null) || 
             (this.subjectConfirmationData!=null &&
              this.subjectConfirmationData.equals(other.getSubjectConfirmationData()))) &&
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod())));
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
        if (getBaseID() != null) {
            _hashCode += getBaseID().hashCode();
        }
        if (getNameID() != null) {
            _hashCode += getNameID().hashCode();
        }
        if (getEncryptedID() != null) {
            _hashCode += getEncryptedID().hashCode();
        }
        if (getSubjectConfirmationData() != null) {
            _hashCode += getSubjectConfirmationData().hashCode();
        }
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubjectConfirmationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectConfirmationType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("method");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Method"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "BaseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "BaseIDAbstractType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "NameID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "NameIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedElementType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectConfirmationData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectConfirmationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectConfirmationDataType"));
        elemField.setMinOccurs(0);
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

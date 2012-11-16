/**
 * SubjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class SubjectType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID;
    private assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType baseID;
    private assertion._0._2.SAML.tc.names.oasis.NameIDType nameID;
    private assertion._0._2.SAML.tc.names.oasis.SubjectConfirmationType subjectConfirmation;

    public SubjectType() {
    }

    public SubjectType(
           assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID,
           assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType baseID,
           assertion._0._2.SAML.tc.names.oasis.NameIDType nameID,
           assertion._0._2.SAML.tc.names.oasis.SubjectConfirmationType subjectConfirmation) {
           this.encryptedID = encryptedID;
           this.baseID = baseID;
           this.nameID = nameID;
           this.subjectConfirmation = subjectConfirmation;
    }


    /**
     * Gets the encryptedID value for this SubjectType.
     * 
     * @return encryptedID
     */
    public assertion._0._2.SAML.tc.names.oasis.EncryptedElementType getEncryptedID() {
        return encryptedID;
    }


    /**
     * Sets the encryptedID value for this SubjectType.
     * 
     * @param encryptedID
     */
    public void setEncryptedID(assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID) {
        this.encryptedID = encryptedID;
    }


    /**
     * Gets the baseID value for this SubjectType.
     * 
     * @return baseID
     */
    public assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType getBaseID() {
        return baseID;
    }


    /**
     * Sets the baseID value for this SubjectType.
     * 
     * @param baseID
     */
    public void setBaseID(assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType baseID) {
        this.baseID = baseID;
    }


    /**
     * Gets the nameID value for this SubjectType.
     * 
     * @return nameID
     */
    public assertion._0._2.SAML.tc.names.oasis.NameIDType getNameID() {
        return nameID;
    }


    /**
     * Sets the nameID value for this SubjectType.
     * 
     * @param nameID
     */
    public void setNameID(assertion._0._2.SAML.tc.names.oasis.NameIDType nameID) {
        this.nameID = nameID;
    }


    /**
     * Gets the subjectConfirmation value for this SubjectType.
     * 
     * @return subjectConfirmation
     */
    public assertion._0._2.SAML.tc.names.oasis.SubjectConfirmationType getSubjectConfirmation() {
        return subjectConfirmation;
    }


    /**
     * Sets the subjectConfirmation value for this SubjectType.
     * 
     * @param subjectConfirmation
     */
    public void setSubjectConfirmation(assertion._0._2.SAML.tc.names.oasis.SubjectConfirmationType subjectConfirmation) {
        this.subjectConfirmation = subjectConfirmation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubjectType)) return false;
        SubjectType other = (SubjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.encryptedID==null && other.getEncryptedID()==null) || 
             (this.encryptedID!=null &&
              this.encryptedID.equals(other.getEncryptedID()))) &&
            ((this.baseID==null && other.getBaseID()==null) || 
             (this.baseID!=null &&
              this.baseID.equals(other.getBaseID()))) &&
            ((this.nameID==null && other.getNameID()==null) || 
             (this.nameID!=null &&
              this.nameID.equals(other.getNameID()))) &&
            ((this.subjectConfirmation==null && other.getSubjectConfirmation()==null) || 
             (this.subjectConfirmation!=null &&
              this.subjectConfirmation.equals(other.getSubjectConfirmation())));
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
        if (getEncryptedID() != null) {
            _hashCode += getEncryptedID().hashCode();
        }
        if (getBaseID() != null) {
            _hashCode += getBaseID().hashCode();
        }
        if (getNameID() != null) {
            _hashCode += getNameID().hashCode();
        }
        if (getSubjectConfirmation() != null) {
            _hashCode += getSubjectConfirmation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "BaseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "BaseID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "NameID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "NameID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectConfirmation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectConfirmation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectConfirmation"));
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

/**
 * AuthnStatementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class AuthnStatementType  extends assertion._0._2.SAML.tc.names.oasis.StatementAbstractType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.SubjectLocalityType subjectLocality;
    private assertion._0._2.SAML.tc.names.oasis.AuthnContextType authnContext;
    private java.util.Calendar authnInstant;  // attribute
    private java.lang.String sessionIndex;  // attribute
    private java.util.Calendar sessionNotOnOrAfter;  // attribute

    public AuthnStatementType() {
    }

    public AuthnStatementType(
           assertion._0._2.SAML.tc.names.oasis.SubjectLocalityType subjectLocality,
           assertion._0._2.SAML.tc.names.oasis.AuthnContextType authnContext,
           java.util.Calendar authnInstant,
           java.lang.String sessionIndex,
           java.util.Calendar sessionNotOnOrAfter) {
           this.subjectLocality = subjectLocality;
           this.authnContext = authnContext;
           this.authnInstant = authnInstant;
           this.sessionIndex = sessionIndex;
           this.sessionNotOnOrAfter = sessionNotOnOrAfter;
    }


    /**
     * Gets the subjectLocality value for this AuthnStatementType.
     * 
     * @return subjectLocality
     */
    public assertion._0._2.SAML.tc.names.oasis.SubjectLocalityType getSubjectLocality() {
        return subjectLocality;
    }


    /**
     * Sets the subjectLocality value for this AuthnStatementType.
     * 
     * @param subjectLocality
     */
    public void setSubjectLocality(assertion._0._2.SAML.tc.names.oasis.SubjectLocalityType subjectLocality) {
        this.subjectLocality = subjectLocality;
    }


    /**
     * Gets the authnContext value for this AuthnStatementType.
     * 
     * @return authnContext
     */
    public assertion._0._2.SAML.tc.names.oasis.AuthnContextType getAuthnContext() {
        return authnContext;
    }


    /**
     * Sets the authnContext value for this AuthnStatementType.
     * 
     * @param authnContext
     */
    public void setAuthnContext(assertion._0._2.SAML.tc.names.oasis.AuthnContextType authnContext) {
        this.authnContext = authnContext;
    }


    /**
     * Gets the authnInstant value for this AuthnStatementType.
     * 
     * @return authnInstant
     */
    public java.util.Calendar getAuthnInstant() {
        return authnInstant;
    }


    /**
     * Sets the authnInstant value for this AuthnStatementType.
     * 
     * @param authnInstant
     */
    public void setAuthnInstant(java.util.Calendar authnInstant) {
        this.authnInstant = authnInstant;
    }


    /**
     * Gets the sessionIndex value for this AuthnStatementType.
     * 
     * @return sessionIndex
     */
    public java.lang.String getSessionIndex() {
        return sessionIndex;
    }


    /**
     * Sets the sessionIndex value for this AuthnStatementType.
     * 
     * @param sessionIndex
     */
    public void setSessionIndex(java.lang.String sessionIndex) {
        this.sessionIndex = sessionIndex;
    }


    /**
     * Gets the sessionNotOnOrAfter value for this AuthnStatementType.
     * 
     * @return sessionNotOnOrAfter
     */
    public java.util.Calendar getSessionNotOnOrAfter() {
        return sessionNotOnOrAfter;
    }


    /**
     * Sets the sessionNotOnOrAfter value for this AuthnStatementType.
     * 
     * @param sessionNotOnOrAfter
     */
    public void setSessionNotOnOrAfter(java.util.Calendar sessionNotOnOrAfter) {
        this.sessionNotOnOrAfter = sessionNotOnOrAfter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthnStatementType)) return false;
        AuthnStatementType other = (AuthnStatementType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subjectLocality==null && other.getSubjectLocality()==null) || 
             (this.subjectLocality!=null &&
              this.subjectLocality.equals(other.getSubjectLocality()))) &&
            ((this.authnContext==null && other.getAuthnContext()==null) || 
             (this.authnContext!=null &&
              this.authnContext.equals(other.getAuthnContext()))) &&
            ((this.authnInstant==null && other.getAuthnInstant()==null) || 
             (this.authnInstant!=null &&
              this.authnInstant.equals(other.getAuthnInstant()))) &&
            ((this.sessionIndex==null && other.getSessionIndex()==null) || 
             (this.sessionIndex!=null &&
              this.sessionIndex.equals(other.getSessionIndex()))) &&
            ((this.sessionNotOnOrAfter==null && other.getSessionNotOnOrAfter()==null) || 
             (this.sessionNotOnOrAfter!=null &&
              this.sessionNotOnOrAfter.equals(other.getSessionNotOnOrAfter())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSubjectLocality() != null) {
            _hashCode += getSubjectLocality().hashCode();
        }
        if (getAuthnContext() != null) {
            _hashCode += getAuthnContext().hashCode();
        }
        if (getAuthnInstant() != null) {
            _hashCode += getAuthnInstant().hashCode();
        }
        if (getSessionIndex() != null) {
            _hashCode += getSessionIndex().hashCode();
        }
        if (getSessionNotOnOrAfter() != null) {
            _hashCode += getSessionNotOnOrAfter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthnStatementType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnStatementType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("authnInstant");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AuthnInstant"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sessionIndex");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SessionIndex"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sessionNotOnOrAfter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SessionNotOnOrAfter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectLocality");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectLocality"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectLocalityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextType"));
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

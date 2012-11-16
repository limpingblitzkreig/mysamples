/**
 * AssertionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class AssertionType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.NameIDType issuer;
    private org.w3.www._2000._09.xmldsig.SignatureType signature;
    private assertion._0._2.SAML.tc.names.oasis.SubjectType subject;
    private assertion._0._2.SAML.tc.names.oasis.ConditionsType conditions;
    private assertion._0._2.SAML.tc.names.oasis.AdviceType advice;
    private assertion._0._2.SAML.tc.names.oasis.StatementAbstractType statement;
    private assertion._0._2.SAML.tc.names.oasis.AuthnStatementType authnStatement;
    private assertion._0._2.SAML.tc.names.oasis.AttributeStatementType attributeStatement;
    private assertion._0._2.SAML.tc.names.oasis.AuthzDecisionStatementType authzDecisionStatement;
    private java.lang.String version;  // attribute
    private org.apache.axis.types.Id ID;  // attribute
    private java.util.Calendar issueInstant;  // attribute

    public AssertionType() {
    }

    public AssertionType(
           assertion._0._2.SAML.tc.names.oasis.NameIDType issuer,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           assertion._0._2.SAML.tc.names.oasis.SubjectType subject,
           assertion._0._2.SAML.tc.names.oasis.ConditionsType conditions,
           assertion._0._2.SAML.tc.names.oasis.AdviceType advice,
           assertion._0._2.SAML.tc.names.oasis.StatementAbstractType statement,
           assertion._0._2.SAML.tc.names.oasis.AuthnStatementType authnStatement,
           assertion._0._2.SAML.tc.names.oasis.AttributeStatementType attributeStatement,
           assertion._0._2.SAML.tc.names.oasis.AuthzDecisionStatementType authzDecisionStatement,
           java.lang.String version,
           org.apache.axis.types.Id ID,
           java.util.Calendar issueInstant) {
           this.issuer = issuer;
           this.signature = signature;
           this.subject = subject;
           this.conditions = conditions;
           this.advice = advice;
           this.statement = statement;
           this.authnStatement = authnStatement;
           this.attributeStatement = attributeStatement;
           this.authzDecisionStatement = authzDecisionStatement;
           this.version = version;
           this.ID = ID;
           this.issueInstant = issueInstant;
    }


    /**
     * Gets the issuer value for this AssertionType.
     * 
     * @return issuer
     */
    public assertion._0._2.SAML.tc.names.oasis.NameIDType getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this AssertionType.
     * 
     * @param issuer
     */
    public void setIssuer(assertion._0._2.SAML.tc.names.oasis.NameIDType issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the signature value for this AssertionType.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this AssertionType.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }


    /**
     * Gets the subject value for this AssertionType.
     * 
     * @return subject
     */
    public assertion._0._2.SAML.tc.names.oasis.SubjectType getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this AssertionType.
     * 
     * @param subject
     */
    public void setSubject(assertion._0._2.SAML.tc.names.oasis.SubjectType subject) {
        this.subject = subject;
    }


    /**
     * Gets the conditions value for this AssertionType.
     * 
     * @return conditions
     */
    public assertion._0._2.SAML.tc.names.oasis.ConditionsType getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this AssertionType.
     * 
     * @param conditions
     */
    public void setConditions(assertion._0._2.SAML.tc.names.oasis.ConditionsType conditions) {
        this.conditions = conditions;
    }


    /**
     * Gets the advice value for this AssertionType.
     * 
     * @return advice
     */
    public assertion._0._2.SAML.tc.names.oasis.AdviceType getAdvice() {
        return advice;
    }


    /**
     * Sets the advice value for this AssertionType.
     * 
     * @param advice
     */
    public void setAdvice(assertion._0._2.SAML.tc.names.oasis.AdviceType advice) {
        this.advice = advice;
    }


    /**
     * Gets the statement value for this AssertionType.
     * 
     * @return statement
     */
    public assertion._0._2.SAML.tc.names.oasis.StatementAbstractType getStatement() {
        return statement;
    }


    /**
     * Sets the statement value for this AssertionType.
     * 
     * @param statement
     */
    public void setStatement(assertion._0._2.SAML.tc.names.oasis.StatementAbstractType statement) {
        this.statement = statement;
    }


    /**
     * Gets the authnStatement value for this AssertionType.
     * 
     * @return authnStatement
     */
    public assertion._0._2.SAML.tc.names.oasis.AuthnStatementType getAuthnStatement() {
        return authnStatement;
    }


    /**
     * Sets the authnStatement value for this AssertionType.
     * 
     * @param authnStatement
     */
    public void setAuthnStatement(assertion._0._2.SAML.tc.names.oasis.AuthnStatementType authnStatement) {
        this.authnStatement = authnStatement;
    }


    /**
     * Gets the attributeStatement value for this AssertionType.
     * 
     * @return attributeStatement
     */
    public assertion._0._2.SAML.tc.names.oasis.AttributeStatementType getAttributeStatement() {
        return attributeStatement;
    }


    /**
     * Sets the attributeStatement value for this AssertionType.
     * 
     * @param attributeStatement
     */
    public void setAttributeStatement(assertion._0._2.SAML.tc.names.oasis.AttributeStatementType attributeStatement) {
        this.attributeStatement = attributeStatement;
    }


    /**
     * Gets the authzDecisionStatement value for this AssertionType.
     * 
     * @return authzDecisionStatement
     */
    public assertion._0._2.SAML.tc.names.oasis.AuthzDecisionStatementType getAuthzDecisionStatement() {
        return authzDecisionStatement;
    }


    /**
     * Sets the authzDecisionStatement value for this AssertionType.
     * 
     * @param authzDecisionStatement
     */
    public void setAuthzDecisionStatement(assertion._0._2.SAML.tc.names.oasis.AuthzDecisionStatementType authzDecisionStatement) {
        this.authzDecisionStatement = authzDecisionStatement;
    }


    /**
     * Gets the version value for this AssertionType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AssertionType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the ID value for this AssertionType.
     * 
     * @return ID
     */
    public org.apache.axis.types.Id getID() {
        return ID;
    }


    /**
     * Sets the ID value for this AssertionType.
     * 
     * @param ID
     */
    public void setID(org.apache.axis.types.Id ID) {
        this.ID = ID;
    }


    /**
     * Gets the issueInstant value for this AssertionType.
     * 
     * @return issueInstant
     */
    public java.util.Calendar getIssueInstant() {
        return issueInstant;
    }


    /**
     * Sets the issueInstant value for this AssertionType.
     * 
     * @param issueInstant
     */
    public void setIssueInstant(java.util.Calendar issueInstant) {
        this.issueInstant = issueInstant;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssertionType)) return false;
        AssertionType other = (AssertionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.conditions==null && other.getConditions()==null) || 
             (this.conditions!=null &&
              this.conditions.equals(other.getConditions()))) &&
            ((this.advice==null && other.getAdvice()==null) || 
             (this.advice!=null &&
              this.advice.equals(other.getAdvice()))) &&
            ((this.statement==null && other.getStatement()==null) || 
             (this.statement!=null &&
              this.statement.equals(other.getStatement()))) &&
            ((this.authnStatement==null && other.getAuthnStatement()==null) || 
             (this.authnStatement!=null &&
              this.authnStatement.equals(other.getAuthnStatement()))) &&
            ((this.attributeStatement==null && other.getAttributeStatement()==null) || 
             (this.attributeStatement!=null &&
              this.attributeStatement.equals(other.getAttributeStatement()))) &&
            ((this.authzDecisionStatement==null && other.getAuthzDecisionStatement()==null) || 
             (this.authzDecisionStatement!=null &&
              this.authzDecisionStatement.equals(other.getAuthzDecisionStatement()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.issueInstant==null && other.getIssueInstant()==null) || 
             (this.issueInstant!=null &&
              this.issueInstant.equals(other.getIssueInstant())));
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
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getConditions() != null) {
            _hashCode += getConditions().hashCode();
        }
        if (getAdvice() != null) {
            _hashCode += getAdvice().hashCode();
        }
        if (getStatement() != null) {
            _hashCode += getStatement().hashCode();
        }
        if (getAuthnStatement() != null) {
            _hashCode += getAuthnStatement().hashCode();
        }
        if (getAttributeStatement() != null) {
            _hashCode += getAttributeStatement().hashCode();
        }
        if (getAuthzDecisionStatement() != null) {
            _hashCode += getAuthzDecisionStatement().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getIssueInstant() != null) {
            _hashCode += getIssueInstant().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssertionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AssertionType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("issueInstant");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IssueInstant"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "NameIDType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ConditionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Advice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AdviceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "StatementAbstractType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnStatementType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeStatementType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authzDecisionStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthzDecisionStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthzDecisionStatementType"));
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

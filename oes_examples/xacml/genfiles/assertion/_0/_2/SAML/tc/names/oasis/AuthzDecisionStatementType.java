/**
 * AuthzDecisionStatementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class AuthzDecisionStatementType  extends assertion._0._2.SAML.tc.names.oasis.StatementAbstractType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.ActionType[] action;
    private assertion._0._2.SAML.tc.names.oasis.EvidenceType evidence;
    private org.apache.axis.types.URI resource;  // attribute
    private assertion._0._2.SAML.tc.names.oasis.DecisionType decision;  // attribute

    public AuthzDecisionStatementType() {
    }

    public AuthzDecisionStatementType(
           assertion._0._2.SAML.tc.names.oasis.ActionType[] action,
           assertion._0._2.SAML.tc.names.oasis.EvidenceType evidence,
           org.apache.axis.types.URI resource,
           assertion._0._2.SAML.tc.names.oasis.DecisionType decision) {
           this.action = action;
           this.evidence = evidence;
           this.resource = resource;
           this.decision = decision;
    }


    /**
     * Gets the action value for this AuthzDecisionStatementType.
     * 
     * @return action
     */
    public assertion._0._2.SAML.tc.names.oasis.ActionType[] getAction() {
        return action;
    }


    /**
     * Sets the action value for this AuthzDecisionStatementType.
     * 
     * @param action
     */
    public void setAction(assertion._0._2.SAML.tc.names.oasis.ActionType[] action) {
        this.action = action;
    }

    public assertion._0._2.SAML.tc.names.oasis.ActionType getAction(int i) {
        return this.action[i];
    }

    public void setAction(int i, assertion._0._2.SAML.tc.names.oasis.ActionType _value) {
        this.action[i] = _value;
    }


    /**
     * Gets the evidence value for this AuthzDecisionStatementType.
     * 
     * @return evidence
     */
    public assertion._0._2.SAML.tc.names.oasis.EvidenceType getEvidence() {
        return evidence;
    }


    /**
     * Sets the evidence value for this AuthzDecisionStatementType.
     * 
     * @param evidence
     */
    public void setEvidence(assertion._0._2.SAML.tc.names.oasis.EvidenceType evidence) {
        this.evidence = evidence;
    }


    /**
     * Gets the resource value for this AuthzDecisionStatementType.
     * 
     * @return resource
     */
    public org.apache.axis.types.URI getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this AuthzDecisionStatementType.
     * 
     * @param resource
     */
    public void setResource(org.apache.axis.types.URI resource) {
        this.resource = resource;
    }


    /**
     * Gets the decision value for this AuthzDecisionStatementType.
     * 
     * @return decision
     */
    public assertion._0._2.SAML.tc.names.oasis.DecisionType getDecision() {
        return decision;
    }


    /**
     * Sets the decision value for this AuthzDecisionStatementType.
     * 
     * @param decision
     */
    public void setDecision(assertion._0._2.SAML.tc.names.oasis.DecisionType decision) {
        this.decision = decision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthzDecisionStatementType)) return false;
        AuthzDecisionStatementType other = (AuthzDecisionStatementType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              java.util.Arrays.equals(this.action, other.getAction()))) &&
            ((this.evidence==null && other.getEvidence()==null) || 
             (this.evidence!=null &&
              this.evidence.equals(other.getEvidence()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              this.resource.equals(other.getResource()))) &&
            ((this.decision==null && other.getDecision()==null) || 
             (this.decision!=null &&
              this.decision.equals(other.getDecision())));
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
        if (getAction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvidence() != null) {
            _hashCode += getEvidence().hashCode();
        }
        if (getResource() != null) {
            _hashCode += getResource().hashCode();
        }
        if (getDecision() != null) {
            _hashCode += getDecision().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthzDecisionStatementType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthzDecisionStatementType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resource");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Resource"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("decision");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Decision"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "DecisionType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ActionType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evidence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Evidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EvidenceType"));
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

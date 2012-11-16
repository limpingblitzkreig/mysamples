/**
 * ConditionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class ConditionsType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.ProxyRestrictionType proxyRestriction;
    private assertion._0._2.SAML.tc.names.oasis.ConditionAbstractType condition;
    private assertion._0._2.SAML.tc.names.oasis.AudienceRestrictionType audienceRestriction;
    private assertion._0._2.SAML.tc.names.oasis.OneTimeUseType oneTimeUse;
    private java.util.Calendar notBefore;  // attribute
    private java.util.Calendar notOnOrAfter;  // attribute

    public ConditionsType() {
    }

    public ConditionsType(
           assertion._0._2.SAML.tc.names.oasis.ProxyRestrictionType proxyRestriction,
           assertion._0._2.SAML.tc.names.oasis.ConditionAbstractType condition,
           assertion._0._2.SAML.tc.names.oasis.AudienceRestrictionType audienceRestriction,
           assertion._0._2.SAML.tc.names.oasis.OneTimeUseType oneTimeUse,
           java.util.Calendar notBefore,
           java.util.Calendar notOnOrAfter) {
           this.proxyRestriction = proxyRestriction;
           this.condition = condition;
           this.audienceRestriction = audienceRestriction;
           this.oneTimeUse = oneTimeUse;
           this.notBefore = notBefore;
           this.notOnOrAfter = notOnOrAfter;
    }


    /**
     * Gets the proxyRestriction value for this ConditionsType.
     * 
     * @return proxyRestriction
     */
    public assertion._0._2.SAML.tc.names.oasis.ProxyRestrictionType getProxyRestriction() {
        return proxyRestriction;
    }


    /**
     * Sets the proxyRestriction value for this ConditionsType.
     * 
     * @param proxyRestriction
     */
    public void setProxyRestriction(assertion._0._2.SAML.tc.names.oasis.ProxyRestrictionType proxyRestriction) {
        this.proxyRestriction = proxyRestriction;
    }


    /**
     * Gets the condition value for this ConditionsType.
     * 
     * @return condition
     */
    public assertion._0._2.SAML.tc.names.oasis.ConditionAbstractType getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this ConditionsType.
     * 
     * @param condition
     */
    public void setCondition(assertion._0._2.SAML.tc.names.oasis.ConditionAbstractType condition) {
        this.condition = condition;
    }


    /**
     * Gets the audienceRestriction value for this ConditionsType.
     * 
     * @return audienceRestriction
     */
    public assertion._0._2.SAML.tc.names.oasis.AudienceRestrictionType getAudienceRestriction() {
        return audienceRestriction;
    }


    /**
     * Sets the audienceRestriction value for this ConditionsType.
     * 
     * @param audienceRestriction
     */
    public void setAudienceRestriction(assertion._0._2.SAML.tc.names.oasis.AudienceRestrictionType audienceRestriction) {
        this.audienceRestriction = audienceRestriction;
    }


    /**
     * Gets the oneTimeUse value for this ConditionsType.
     * 
     * @return oneTimeUse
     */
    public assertion._0._2.SAML.tc.names.oasis.OneTimeUseType getOneTimeUse() {
        return oneTimeUse;
    }


    /**
     * Sets the oneTimeUse value for this ConditionsType.
     * 
     * @param oneTimeUse
     */
    public void setOneTimeUse(assertion._0._2.SAML.tc.names.oasis.OneTimeUseType oneTimeUse) {
        this.oneTimeUse = oneTimeUse;
    }


    /**
     * Gets the notBefore value for this ConditionsType.
     * 
     * @return notBefore
     */
    public java.util.Calendar getNotBefore() {
        return notBefore;
    }


    /**
     * Sets the notBefore value for this ConditionsType.
     * 
     * @param notBefore
     */
    public void setNotBefore(java.util.Calendar notBefore) {
        this.notBefore = notBefore;
    }


    /**
     * Gets the notOnOrAfter value for this ConditionsType.
     * 
     * @return notOnOrAfter
     */
    public java.util.Calendar getNotOnOrAfter() {
        return notOnOrAfter;
    }


    /**
     * Sets the notOnOrAfter value for this ConditionsType.
     * 
     * @param notOnOrAfter
     */
    public void setNotOnOrAfter(java.util.Calendar notOnOrAfter) {
        this.notOnOrAfter = notOnOrAfter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConditionsType)) return false;
        ConditionsType other = (ConditionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.proxyRestriction==null && other.getProxyRestriction()==null) || 
             (this.proxyRestriction!=null &&
              this.proxyRestriction.equals(other.getProxyRestriction()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.audienceRestriction==null && other.getAudienceRestriction()==null) || 
             (this.audienceRestriction!=null &&
              this.audienceRestriction.equals(other.getAudienceRestriction()))) &&
            ((this.oneTimeUse==null && other.getOneTimeUse()==null) || 
             (this.oneTimeUse!=null &&
              this.oneTimeUse.equals(other.getOneTimeUse()))) &&
            ((this.notBefore==null && other.getNotBefore()==null) || 
             (this.notBefore!=null &&
              this.notBefore.equals(other.getNotBefore()))) &&
            ((this.notOnOrAfter==null && other.getNotOnOrAfter()==null) || 
             (this.notOnOrAfter!=null &&
              this.notOnOrAfter.equals(other.getNotOnOrAfter())));
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
        if (getProxyRestriction() != null) {
            _hashCode += getProxyRestriction().hashCode();
        }
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getAudienceRestriction() != null) {
            _hashCode += getAudienceRestriction().hashCode();
        }
        if (getOneTimeUse() != null) {
            _hashCode += getOneTimeUse().hashCode();
        }
        if (getNotBefore() != null) {
            _hashCode += getNotBefore().hashCode();
        }
        if (getNotOnOrAfter() != null) {
            _hashCode += getNotOnOrAfter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConditionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ConditionsType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notBefore");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotBefore"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notOnOrAfter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotOnOrAfter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ProxyRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ProxyRestrictionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ConditionAbstractType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AudienceRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AudienceRestrictionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeUse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "OneTimeUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "OneTimeUseType"));
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

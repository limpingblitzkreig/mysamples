/**
 * StatusResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class StatusResponseType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.NameIDType issuer;
    private org.w3.www._2000._09.xmldsig.SignatureType signature;
    private protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions;
    private protocol._0._2.SAML.tc.names.oasis.StatusType status;
    private org.apache.axis.types.Id ID;  // attribute
    private org.apache.axis.types.NCName inResponseTo;  // attribute
    private java.lang.String version;  // attribute
    private java.util.Calendar issueInstant;  // attribute
    private org.apache.axis.types.URI destination;  // attribute
    private org.apache.axis.types.URI consent;  // attribute

    public StatusResponseType() {
    }

    public StatusResponseType(
           assertion._0._2.SAML.tc.names.oasis.NameIDType issuer,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions,
           protocol._0._2.SAML.tc.names.oasis.StatusType status,
           org.apache.axis.types.Id ID,
           org.apache.axis.types.NCName inResponseTo,
           java.lang.String version,
           java.util.Calendar issueInstant,
           org.apache.axis.types.URI destination,
           org.apache.axis.types.URI consent) {
           this.issuer = issuer;
           this.signature = signature;
           this.extensions = extensions;
           this.status = status;
           this.ID = ID;
           this.inResponseTo = inResponseTo;
           this.version = version;
           this.issueInstant = issueInstant;
           this.destination = destination;
           this.consent = consent;
    }


    /**
     * Gets the issuer value for this StatusResponseType.
     * 
     * @return issuer
     */
    public assertion._0._2.SAML.tc.names.oasis.NameIDType getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this StatusResponseType.
     * 
     * @param issuer
     */
    public void setIssuer(assertion._0._2.SAML.tc.names.oasis.NameIDType issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the signature value for this StatusResponseType.
     * 
     * @return signature
     */
    public org.w3.www._2000._09.xmldsig.SignatureType getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this StatusResponseType.
     * 
     * @param signature
     */
    public void setSignature(org.w3.www._2000._09.xmldsig.SignatureType signature) {
        this.signature = signature;
    }


    /**
     * Gets the extensions value for this StatusResponseType.
     * 
     * @return extensions
     */
    public protocol._0._2.SAML.tc.names.oasis.ExtensionsType getExtensions() {
        return extensions;
    }


    /**
     * Sets the extensions value for this StatusResponseType.
     * 
     * @param extensions
     */
    public void setExtensions(protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions) {
        this.extensions = extensions;
    }


    /**
     * Gets the status value for this StatusResponseType.
     * 
     * @return status
     */
    public protocol._0._2.SAML.tc.names.oasis.StatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this StatusResponseType.
     * 
     * @param status
     */
    public void setStatus(protocol._0._2.SAML.tc.names.oasis.StatusType status) {
        this.status = status;
    }


    /**
     * Gets the ID value for this StatusResponseType.
     * 
     * @return ID
     */
    public org.apache.axis.types.Id getID() {
        return ID;
    }


    /**
     * Sets the ID value for this StatusResponseType.
     * 
     * @param ID
     */
    public void setID(org.apache.axis.types.Id ID) {
        this.ID = ID;
    }


    /**
     * Gets the inResponseTo value for this StatusResponseType.
     * 
     * @return inResponseTo
     */
    public org.apache.axis.types.NCName getInResponseTo() {
        return inResponseTo;
    }


    /**
     * Sets the inResponseTo value for this StatusResponseType.
     * 
     * @param inResponseTo
     */
    public void setInResponseTo(org.apache.axis.types.NCName inResponseTo) {
        this.inResponseTo = inResponseTo;
    }


    /**
     * Gets the version value for this StatusResponseType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this StatusResponseType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the issueInstant value for this StatusResponseType.
     * 
     * @return issueInstant
     */
    public java.util.Calendar getIssueInstant() {
        return issueInstant;
    }


    /**
     * Sets the issueInstant value for this StatusResponseType.
     * 
     * @param issueInstant
     */
    public void setIssueInstant(java.util.Calendar issueInstant) {
        this.issueInstant = issueInstant;
    }


    /**
     * Gets the destination value for this StatusResponseType.
     * 
     * @return destination
     */
    public org.apache.axis.types.URI getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this StatusResponseType.
     * 
     * @param destination
     */
    public void setDestination(org.apache.axis.types.URI destination) {
        this.destination = destination;
    }


    /**
     * Gets the consent value for this StatusResponseType.
     * 
     * @return consent
     */
    public org.apache.axis.types.URI getConsent() {
        return consent;
    }


    /**
     * Sets the consent value for this StatusResponseType.
     * 
     * @param consent
     */
    public void setConsent(org.apache.axis.types.URI consent) {
        this.consent = consent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusResponseType)) return false;
        StatusResponseType other = (StatusResponseType) obj;
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
            ((this.extensions==null && other.getExtensions()==null) || 
             (this.extensions!=null &&
              this.extensions.equals(other.getExtensions()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.inResponseTo==null && other.getInResponseTo()==null) || 
             (this.inResponseTo!=null &&
              this.inResponseTo.equals(other.getInResponseTo()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.issueInstant==null && other.getIssueInstant()==null) || 
             (this.issueInstant!=null &&
              this.issueInstant.equals(other.getIssueInstant()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.consent==null && other.getConsent()==null) || 
             (this.consent!=null &&
              this.consent.equals(other.getConsent())));
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
        if (getExtensions() != null) {
            _hashCode += getExtensions().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getInResponseTo() != null) {
            _hashCode += getInResponseTo().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getIssueInstant() != null) {
            _hashCode += getIssueInstant().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getConsent() != null) {
            _hashCode += getConsent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "StatusResponseType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("inResponseTo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InResponseTo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NCName"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("issueInstant");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IssueInstant"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("destination");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Destination"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("consent");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Consent"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Issuer"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "ExtensionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "StatusType"));
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

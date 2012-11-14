/**
 * PrincipalInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class PrincipalInfoType  implements java.io.Serializable {
    private java.lang.String principalName;
    private java.lang.String principalJavaClass;
    private java.lang.String GUID;
    private java.lang.String distinguishedName;
    private java.lang.String displayName;
    private java.lang.String description;
    private java.lang.String applicationID;

    public PrincipalInfoType() {
    }

    public PrincipalInfoType(
           java.lang.String principalName,
           java.lang.String principalJavaClass,
           java.lang.String GUID,
           java.lang.String distinguishedName,
           java.lang.String displayName,
           java.lang.String description,
           java.lang.String applicationID) {
           this.principalName = principalName;
           this.principalJavaClass = principalJavaClass;
           this.GUID = GUID;
           this.distinguishedName = distinguishedName;
           this.displayName = displayName;
           this.description = description;
           this.applicationID = applicationID;
    }


    /**
     * Gets the principalName value for this PrincipalInfoType.
     * 
     * @return principalName
     */
    public java.lang.String getPrincipalName() {
        return principalName;
    }


    /**
     * Sets the principalName value for this PrincipalInfoType.
     * 
     * @param principalName
     */
    public void setPrincipalName(java.lang.String principalName) {
        this.principalName = principalName;
    }


    /**
     * Gets the principalJavaClass value for this PrincipalInfoType.
     * 
     * @return principalJavaClass
     */
    public java.lang.String getPrincipalJavaClass() {
        return principalJavaClass;
    }


    /**
     * Sets the principalJavaClass value for this PrincipalInfoType.
     * 
     * @param principalJavaClass
     */
    public void setPrincipalJavaClass(java.lang.String principalJavaClass) {
        this.principalJavaClass = principalJavaClass;
    }


    /**
     * Gets the GUID value for this PrincipalInfoType.
     * 
     * @return GUID
     */
    public java.lang.String getGUID() {
        return GUID;
    }


    /**
     * Sets the GUID value for this PrincipalInfoType.
     * 
     * @param GUID
     */
    public void setGUID(java.lang.String GUID) {
        this.GUID = GUID;
    }


    /**
     * Gets the distinguishedName value for this PrincipalInfoType.
     * 
     * @return distinguishedName
     */
    public java.lang.String getDistinguishedName() {
        return distinguishedName;
    }


    /**
     * Sets the distinguishedName value for this PrincipalInfoType.
     * 
     * @param distinguishedName
     */
    public void setDistinguishedName(java.lang.String distinguishedName) {
        this.distinguishedName = distinguishedName;
    }


    /**
     * Gets the displayName value for this PrincipalInfoType.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this PrincipalInfoType.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the description value for this PrincipalInfoType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PrincipalInfoType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the applicationID value for this PrincipalInfoType.
     * 
     * @return applicationID
     */
    public java.lang.String getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this PrincipalInfoType.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.String applicationID) {
        this.applicationID = applicationID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrincipalInfoType)) return false;
        PrincipalInfoType other = (PrincipalInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.principalName==null && other.getPrincipalName()==null) || 
             (this.principalName!=null &&
              this.principalName.equals(other.getPrincipalName()))) &&
            ((this.principalJavaClass==null && other.getPrincipalJavaClass()==null) || 
             (this.principalJavaClass!=null &&
              this.principalJavaClass.equals(other.getPrincipalJavaClass()))) &&
            ((this.GUID==null && other.getGUID()==null) || 
             (this.GUID!=null &&
              this.GUID.equals(other.getGUID()))) &&
            ((this.distinguishedName==null && other.getDistinguishedName()==null) || 
             (this.distinguishedName!=null &&
              this.distinguishedName.equals(other.getDistinguishedName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID())));
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
        if (getPrincipalName() != null) {
            _hashCode += getPrincipalName().hashCode();
        }
        if (getPrincipalJavaClass() != null) {
            _hashCode += getPrincipalJavaClass().hashCode();
        }
        if (getGUID() != null) {
            _hashCode += getGUID().hashCode();
        }
        if (getDistinguishedName() != null) {
            _hashCode += getDistinguishedName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrincipalInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "PrincipalInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principalName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "PrincipalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principalJavaClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "PrincipalJavaClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distinguishedName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DistinguishedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ApplicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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

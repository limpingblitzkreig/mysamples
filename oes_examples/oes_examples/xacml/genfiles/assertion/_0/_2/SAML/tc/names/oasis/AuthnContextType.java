/**
 * AuthnContextType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class AuthnContextType  implements java.io.Serializable {
    private java.lang.Object authnContextDecl;
    private java.lang.String authnContextClassRef;
    private java.lang.String authenticatingAuthority;
    private java.lang.String authnContextDeclRef;

    public AuthnContextType() {
    }

    public AuthnContextType(
           java.lang.Object authnContextDecl,
           java.lang.String authnContextClassRef,
           java.lang.String authenticatingAuthority,
           java.lang.String authnContextDeclRef) {
           this.authnContextDecl = authnContextDecl;
           this.authnContextClassRef = authnContextClassRef;
           this.authenticatingAuthority = authenticatingAuthority;
           this.authnContextDeclRef = authnContextDeclRef;
    }


    /**
     * Gets the authnContextDecl value for this AuthnContextType.
     * 
     * @return authnContextDecl
     */
    public java.lang.Object getAuthnContextDecl() {
        return authnContextDecl;
    }


    /**
     * Sets the authnContextDecl value for this AuthnContextType.
     * 
     * @param authnContextDecl
     */
    public void setAuthnContextDecl(java.lang.Object authnContextDecl) {
        this.authnContextDecl = authnContextDecl;
    }


    /**
     * Gets the authnContextClassRef value for this AuthnContextType.
     * 
     * @return authnContextClassRef
     */
    public java.lang.String getAuthnContextClassRef() {
        return authnContextClassRef;
    }


    /**
     * Sets the authnContextClassRef value for this AuthnContextType.
     * 
     * @param authnContextClassRef
     */
    public void setAuthnContextClassRef(java.lang.String authnContextClassRef) {
        this.authnContextClassRef = authnContextClassRef;
    }


    /**
     * Gets the authenticatingAuthority value for this AuthnContextType.
     * 
     * @return authenticatingAuthority
     */
    public java.lang.String getAuthenticatingAuthority() {
        return authenticatingAuthority;
    }


    /**
     * Sets the authenticatingAuthority value for this AuthnContextType.
     * 
     * @param authenticatingAuthority
     */
    public void setAuthenticatingAuthority(java.lang.String authenticatingAuthority) {
        this.authenticatingAuthority = authenticatingAuthority;
    }


    /**
     * Gets the authnContextDeclRef value for this AuthnContextType.
     * 
     * @return authnContextDeclRef
     */
    public java.lang.String getAuthnContextDeclRef() {
        return authnContextDeclRef;
    }


    /**
     * Sets the authnContextDeclRef value for this AuthnContextType.
     * 
     * @param authnContextDeclRef
     */
    public void setAuthnContextDeclRef(java.lang.String authnContextDeclRef) {
        this.authnContextDeclRef = authnContextDeclRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthnContextType)) return false;
        AuthnContextType other = (AuthnContextType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authnContextDecl==null && other.getAuthnContextDecl()==null) || 
             (this.authnContextDecl!=null &&
              this.authnContextDecl.equals(other.getAuthnContextDecl()))) &&
            ((this.authnContextClassRef==null && other.getAuthnContextClassRef()==null) || 
             (this.authnContextClassRef!=null &&
              this.authnContextClassRef.equals(other.getAuthnContextClassRef()))) &&
            ((this.authenticatingAuthority==null && other.getAuthenticatingAuthority()==null) || 
             (this.authenticatingAuthority!=null &&
              this.authenticatingAuthority.equals(other.getAuthenticatingAuthority()))) &&
            ((this.authnContextDeclRef==null && other.getAuthnContextDeclRef()==null) || 
             (this.authnContextDeclRef!=null &&
              this.authnContextDeclRef.equals(other.getAuthnContextDeclRef())));
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
        if (getAuthnContextDecl() != null) {
            _hashCode += getAuthnContextDecl().hashCode();
        }
        if (getAuthnContextClassRef() != null) {
            _hashCode += getAuthnContextClassRef().hashCode();
        }
        if (getAuthenticatingAuthority() != null) {
            _hashCode += getAuthenticatingAuthority().hashCode();
        }
        if (getAuthnContextDeclRef() != null) {
            _hashCode += getAuthnContextDeclRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthnContextType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnContextDecl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextDecl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextDecl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnContextClassRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextClassRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextClassRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticatingAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthenticatingAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthenticatingAuthority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnContextDeclRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextDeclRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextDeclRef"));
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

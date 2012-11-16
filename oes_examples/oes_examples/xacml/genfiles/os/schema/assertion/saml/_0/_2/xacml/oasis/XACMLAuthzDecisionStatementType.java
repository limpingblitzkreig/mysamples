/**
 * XACMLAuthzDecisionStatementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package os.schema.assertion.saml._0._2.xacml.oasis;

public class XACMLAuthzDecisionStatementType  extends assertion._0._2.SAML.tc.names.oasis.StatementAbstractType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.context.ResponseType response;
    private com.bea.security.ssmws.types.context.RequestType request;

    public XACMLAuthzDecisionStatementType() {
    }

    public XACMLAuthzDecisionStatementType(
           com.bea.security.ssmws.types.context.ResponseType response,
           com.bea.security.ssmws.types.context.RequestType request) {
           this.response = response;
           this.request = request;
    }


    /**
     * Gets the response value for this XACMLAuthzDecisionStatementType.
     * 
     * @return response
     */
    public com.bea.security.ssmws.types.context.ResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this XACMLAuthzDecisionStatementType.
     * 
     * @param response
     */
    public void setResponse(com.bea.security.ssmws.types.context.ResponseType response) {
        this.response = response;
    }


    /**
     * Gets the request value for this XACMLAuthzDecisionStatementType.
     * 
     * @return request
     */
    public com.bea.security.ssmws.types.context.RequestType getRequest() {
        return request;
    }


    /**
     * Sets the request value for this XACMLAuthzDecisionStatementType.
     * 
     * @param request
     */
    public void setRequest(com.bea.security.ssmws.types.context.RequestType request) {
        this.request = request;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XACMLAuthzDecisionStatementType)) return false;
        XACMLAuthzDecisionStatementType other = (XACMLAuthzDecisionStatementType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest())));
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
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XACMLAuthzDecisionStatementType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:xacml:2.0:saml:assertion:schema:os", "XACMLAuthzDecisionStatementType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Response"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Request"));
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

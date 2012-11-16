/**
 * XACMLAuthzDecisionQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package os.schema.protocol.saml._0._2.xacml.oasis;

public class XACMLAuthzDecisionQueryType  extends protocol._0._2.SAML.tc.names.oasis.RequestAbstractType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.context.RequestType request;
    private boolean inputContextOnly;  // attribute
    private boolean returnContext;  // attribute

    public XACMLAuthzDecisionQueryType() {
    }

    public XACMLAuthzDecisionQueryType(
           com.bea.security.ssmws.types.context.RequestType request,
           boolean inputContextOnly,
           boolean returnContext) {
           this.request = request;
           this.inputContextOnly = inputContextOnly;
           this.returnContext = returnContext;
    }


    /**
     * Gets the request value for this XACMLAuthzDecisionQueryType.
     * 
     * @return request
     */
    public com.bea.security.ssmws.types.context.RequestType getRequest() {
        return request;
    }


    /**
     * Sets the request value for this XACMLAuthzDecisionQueryType.
     * 
     * @param request
     */
    public void setRequest(com.bea.security.ssmws.types.context.RequestType request) {
        this.request = request;
    }


    /**
     * Gets the inputContextOnly value for this XACMLAuthzDecisionQueryType.
     * 
     * @return inputContextOnly
     */
    public boolean isInputContextOnly() {
        return inputContextOnly;
    }


    /**
     * Sets the inputContextOnly value for this XACMLAuthzDecisionQueryType.
     * 
     * @param inputContextOnly
     */
    public void setInputContextOnly(boolean inputContextOnly) {
        this.inputContextOnly = inputContextOnly;
    }


    /**
     * Gets the returnContext value for this XACMLAuthzDecisionQueryType.
     * 
     * @return returnContext
     */
    public boolean isReturnContext() {
        return returnContext;
    }


    /**
     * Sets the returnContext value for this XACMLAuthzDecisionQueryType.
     * 
     * @param returnContext
     */
    public void setReturnContext(boolean returnContext) {
        this.returnContext = returnContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XACMLAuthzDecisionQueryType)) return false;
        XACMLAuthzDecisionQueryType other = (XACMLAuthzDecisionQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            this.inputContextOnly == other.isInputContextOnly() &&
            this.returnContext == other.isReturnContext();
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
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        _hashCode += (isInputContextOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReturnContext() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XACMLAuthzDecisionQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:xacml:2.0:saml:protocol:schema:os", "XACMLAuthzDecisionQueryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("inputContextOnly");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InputContextOnly"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnContext");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReturnContext"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Request"));
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

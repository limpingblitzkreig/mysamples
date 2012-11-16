/**
 * ResourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types.context;

public class ResourceType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.context.ResourceContentType resourceContent;
    private com.bea.security.ssmws.types.context.AttributeType[] attribute;

    public ResourceType() {
    }

    public ResourceType(
           com.bea.security.ssmws.types.context.ResourceContentType resourceContent,
           com.bea.security.ssmws.types.context.AttributeType[] attribute) {
           this.resourceContent = resourceContent;
           this.attribute = attribute;
    }


    /**
     * Gets the resourceContent value for this ResourceType.
     * 
     * @return resourceContent
     */
    public com.bea.security.ssmws.types.context.ResourceContentType getResourceContent() {
        return resourceContent;
    }


    /**
     * Sets the resourceContent value for this ResourceType.
     * 
     * @param resourceContent
     */
    public void setResourceContent(com.bea.security.ssmws.types.context.ResourceContentType resourceContent) {
        this.resourceContent = resourceContent;
    }


    /**
     * Gets the attribute value for this ResourceType.
     * 
     * @return attribute
     */
    public com.bea.security.ssmws.types.context.AttributeType[] getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this ResourceType.
     * 
     * @param attribute
     */
    public void setAttribute(com.bea.security.ssmws.types.context.AttributeType[] attribute) {
        this.attribute = attribute;
    }

    public com.bea.security.ssmws.types.context.AttributeType getAttribute(int i) {
        return this.attribute[i];
    }

    public void setAttribute(int i, com.bea.security.ssmws.types.context.AttributeType _value) {
        this.attribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceType)) return false;
        ResourceType other = (ResourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceContent==null && other.getResourceContent()==null) || 
             (this.resourceContent!=null &&
              this.resourceContent.equals(other.getResourceContent()))) &&
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              java.util.Arrays.equals(this.attribute, other.getAttribute())));
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
        if (getResourceContent() != null) {
            _hashCode += getResourceContent().hashCode();
        }
        if (getAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ResourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceContent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ResourceContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ResourceContentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "AttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

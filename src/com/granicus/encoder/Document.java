/**
 * Document.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.encoder;

public class Document  implements java.io.Serializable {
    private java.lang.String documentID;

    private java.lang.String documentName;

    public Document() {
    }

    public Document(
           java.lang.String documentID,
           java.lang.String documentName) {
           this.documentID = documentID;
           this.documentName = documentName;
    }


    /**
     * Gets the documentID value for this Document.
     * 
     * @return documentID
     */
    public java.lang.String getDocumentID() {
        return documentID;
    }


    /**
     * Sets the documentID value for this Document.
     * 
     * @param documentID
     */
    public void setDocumentID(java.lang.String documentID) {
        this.documentID = documentID;
    }


    /**
     * Gets the documentName value for this Document.
     * 
     * @return documentName
     */
    public java.lang.String getDocumentName() {
        return documentName;
    }


    /**
     * Sets the documentName value for this Document.
     * 
     * @param documentName
     */
    public void setDocumentName(java.lang.String documentName) {
        this.documentName = documentName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Document)) return false;
        Document other = (Document) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentID==null && other.getDocumentID()==null) || 
             (this.documentID!=null &&
              this.documentID.equals(other.getDocumentID()))) &&
            ((this.documentName==null && other.getDocumentName()==null) || 
             (this.documentName!=null &&
              this.documentName.equals(other.getDocumentName())));
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
        if (getDocumentID() != null) {
            _hashCode += getDocumentID().hashCode();
        }
        if (getDocumentName() != null) {
            _hashCode += getDocumentName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Document.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/lacity/", "Document"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "DocumentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "DocumentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

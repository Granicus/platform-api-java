/**
 * PublishClipResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class PublishClipResult  implements java.io.Serializable {
    private int clipID;

    private java.lang.String URL;

    private java.lang.String publishPoint;

    public PublishClipResult() {
    }

    public PublishClipResult(
           int clipID,
           java.lang.String URL,
           java.lang.String publishPoint) {
           this.clipID = clipID;
           this.URL = URL;
           this.publishPoint = publishPoint;
    }


    /**
     * Gets the clipID value for this PublishClipResult.
     * 
     * @return clipID
     */
    public int getClipID() {
        return clipID;
    }


    /**
     * Sets the clipID value for this PublishClipResult.
     * 
     * @param clipID
     */
    public void setClipID(int clipID) {
        this.clipID = clipID;
    }


    /**
     * Gets the URL value for this PublishClipResult.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this PublishClipResult.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the publishPoint value for this PublishClipResult.
     * 
     * @return publishPoint
     */
    public java.lang.String getPublishPoint() {
        return publishPoint;
    }


    /**
     * Sets the publishPoint value for this PublishClipResult.
     * 
     * @param publishPoint
     */
    public void setPublishPoint(java.lang.String publishPoint) {
        this.publishPoint = publishPoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishClipResult)) return false;
        PublishClipResult other = (PublishClipResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.clipID == other.getClipID() &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.publishPoint==null && other.getPublishPoint()==null) || 
             (this.publishPoint!=null &&
              this.publishPoint.equals(other.getPublishPoint())));
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
        _hashCode += getClipID();
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getPublishPoint() != null) {
            _hashCode += getPublishPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublishClipResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "PublishClipResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClipID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PublishPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

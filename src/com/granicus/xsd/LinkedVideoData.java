/**
 * LinkedVideoData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class LinkedVideoData  implements java.io.Serializable {
    private int ID;

    private int eventID;

    private int folderID;

    private java.lang.String url;

    private java.lang.String minutesUrl;

    private java.lang.String agendaUrl;

    private java.lang.String agendaPacketUrl;

    private java.util.Calendar videoDate;

    public LinkedVideoData() {
    }

    public LinkedVideoData(
           int ID,
           int eventID,
           int folderID,
           java.lang.String url,
           java.lang.String minutesUrl,
           java.lang.String agendaUrl,
           java.lang.String agendaPacketUrl,
           java.util.Calendar videoDate) {
           this.ID = ID;
           this.eventID = eventID;
           this.folderID = folderID;
           this.url = url;
           this.minutesUrl = minutesUrl;
           this.agendaUrl = agendaUrl;
           this.agendaPacketUrl = agendaPacketUrl;
           this.videoDate = videoDate;
    }


    /**
     * Gets the ID value for this LinkedVideoData.
     * 
     * @return ID
     */
    public int getID() {
        return ID;
    }


    /**
     * Sets the ID value for this LinkedVideoData.
     * 
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }


    /**
     * Gets the eventID value for this LinkedVideoData.
     * 
     * @return eventID
     */
    public int getEventID() {
        return eventID;
    }


    /**
     * Sets the eventID value for this LinkedVideoData.
     * 
     * @param eventID
     */
    public void setEventID(int eventID) {
        this.eventID = eventID;
    }


    /**
     * Gets the folderID value for this LinkedVideoData.
     * 
     * @return folderID
     */
    public int getFolderID() {
        return folderID;
    }


    /**
     * Sets the folderID value for this LinkedVideoData.
     * 
     * @param folderID
     */
    public void setFolderID(int folderID) {
        this.folderID = folderID;
    }


    /**
     * Gets the url value for this LinkedVideoData.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this LinkedVideoData.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the minutesUrl value for this LinkedVideoData.
     * 
     * @return minutesUrl
     */
    public java.lang.String getMinutesUrl() {
        return minutesUrl;
    }


    /**
     * Sets the minutesUrl value for this LinkedVideoData.
     * 
     * @param minutesUrl
     */
    public void setMinutesUrl(java.lang.String minutesUrl) {
        this.minutesUrl = minutesUrl;
    }


    /**
     * Gets the agendaUrl value for this LinkedVideoData.
     * 
     * @return agendaUrl
     */
    public java.lang.String getAgendaUrl() {
        return agendaUrl;
    }


    /**
     * Sets the agendaUrl value for this LinkedVideoData.
     * 
     * @param agendaUrl
     */
    public void setAgendaUrl(java.lang.String agendaUrl) {
        this.agendaUrl = agendaUrl;
    }


    /**
     * Gets the agendaPacketUrl value for this LinkedVideoData.
     * 
     * @return agendaPacketUrl
     */
    public java.lang.String getAgendaPacketUrl() {
        return agendaPacketUrl;
    }


    /**
     * Sets the agendaPacketUrl value for this LinkedVideoData.
     * 
     * @param agendaPacketUrl
     */
    public void setAgendaPacketUrl(java.lang.String agendaPacketUrl) {
        this.agendaPacketUrl = agendaPacketUrl;
    }

    /**
     * Gets the videoDate value for this LinkedVideoData.
     * 
     * @return videoDate
     */
    public java.util.Calendar getVideoDate() {
        return videoDate;
    }


    /**
     * Sets the videoDate value for this LinkedVideoData.
     * 
     * @param videoDate
     */
    public void setVideoDate(java.util.Calendar videoDate) {
        this.videoDate = videoDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkedVideoData)) return false;
        LinkedVideoData other = (LinkedVideoData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ID == other.getID() &&
            this.eventID == other.getEventID() &&
            this.folderID == other.getFolderID() &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.minutesUrl==null && other.getMinutesUrl()==null) || 
             (this.minutesUrl!=null &&
              this.minutesUrl.equals(other.getMinutesUrl()))) &&
            ((this.agendaUrl==null && other.getAgendaUrl()==null) || 
             (this.agendaUrl!=null &&
              this.agendaUrl.equals(other.getAgendaUrl()))) &&
            ((this.agendaPacketUrl==null && other.getAgendaPacketUrl()==null) || 
             (this.agendaPacketUrl!=null &&
              this.agendaPacketUrl.equals(other.getAgendaPacketUrl()))) &&
            ((this.videoDate==null && other.getVideoDate()==null) || 
             (this.videoDate!=null &&
              this.videoDate.equals(other.getVideoDate())));
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
        _hashCode += getID();
        _hashCode += getEventID();
        _hashCode += getFolderID();
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getMinutesUrl() != null) {
            _hashCode += getMinutesUrl().hashCode();
        }
        if (getAgendaUrl() != null) {
            _hashCode += getAgendaUrl().hashCode();
        }
        if (getAgendaPacketUrl() != null) {
            _hashCode += getAgendaPacketUrl().hashCode();
        }
        if (getVideoDate() != null) {
            _hashCode += getVideoDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinkedVideoData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "LinkedVideoData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FolderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MinutesUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaPacketUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaPacketUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VideoDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

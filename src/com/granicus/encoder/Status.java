/**
 * Status.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.encoder;

public class Status  implements java.io.Serializable {
    private boolean connectedToMeetingServer;

    private java.lang.String encoderState;

    private java.lang.String archiveState;

    private java.lang.String meetingTimerState;

    private org.apache.axis.types.UnsignedLong meetingTimeElapsed;

    private java.lang.String meetingName;

    private java.lang.String archiveFileName;

    private java.lang.String agendaDocumentID;

    private java.lang.String minutesDocumentID;

    private java.lang.String masterDocumentID;

    private int archiveFolderID;

    private org.apache.axis.types.UnsignedLong archiveDuration;

    private boolean suspendRecordItem;

    public Status() {
    }

    public Status(
           boolean connectedToMeetingServer,
           java.lang.String encoderState,
           java.lang.String archiveState,
           java.lang.String meetingTimerState,
           org.apache.axis.types.UnsignedLong meetingTimeElapsed,
           java.lang.String meetingName,
           java.lang.String archiveFileName,
           java.lang.String agendaDocumentID,
           java.lang.String minutesDocumentID,
           java.lang.String masterDocumentID,
           int archiveFolderID,
           org.apache.axis.types.UnsignedLong archiveDuration,
           boolean suspendRecordItem) {
           this.connectedToMeetingServer = connectedToMeetingServer;
           this.encoderState = encoderState;
           this.archiveState = archiveState;
           this.meetingTimerState = meetingTimerState;
           this.meetingTimeElapsed = meetingTimeElapsed;
           this.meetingName = meetingName;
           this.archiveFileName = archiveFileName;
           this.agendaDocumentID = agendaDocumentID;
           this.minutesDocumentID = minutesDocumentID;
           this.masterDocumentID = masterDocumentID;
           this.archiveFolderID = archiveFolderID;
           this.archiveDuration = archiveDuration;
           this.suspendRecordItem = suspendRecordItem;
    }


    /**
     * Gets the connectedToMeetingServer value for this Status.
     * 
     * @return connectedToMeetingServer
     */
    public boolean isConnectedToMeetingServer() {
        return connectedToMeetingServer;
    }


    /**
     * Sets the connectedToMeetingServer value for this Status.
     * 
     * @param connectedToMeetingServer
     */
    public void setConnectedToMeetingServer(boolean connectedToMeetingServer) {
        this.connectedToMeetingServer = connectedToMeetingServer;
    }


    /**
     * Gets the encoderState value for this Status.
     * 
     * @return encoderState
     */
    public java.lang.String getEncoderState() {
        return encoderState;
    }


    /**
     * Sets the encoderState value for this Status.
     * 
     * @param encoderState
     */
    public void setEncoderState(java.lang.String encoderState) {
        this.encoderState = encoderState;
    }


    /**
     * Gets the archiveState value for this Status.
     * 
     * @return archiveState
     */
    public java.lang.String getArchiveState() {
        return archiveState;
    }


    /**
     * Sets the archiveState value for this Status.
     * 
     * @param archiveState
     */
    public void setArchiveState(java.lang.String archiveState) {
        this.archiveState = archiveState;
    }


    /**
     * Gets the meetingTimerState value for this Status.
     * 
     * @return meetingTimerState
     */
    public java.lang.String getMeetingTimerState() {
        return meetingTimerState;
    }


    /**
     * Sets the meetingTimerState value for this Status.
     * 
     * @param meetingTimerState
     */
    public void setMeetingTimerState(java.lang.String meetingTimerState) {
        this.meetingTimerState = meetingTimerState;
    }


    /**
     * Gets the meetingTimeElapsed value for this Status.
     * 
     * @return meetingTimeElapsed
     */
    public org.apache.axis.types.UnsignedLong getMeetingTimeElapsed() {
        return meetingTimeElapsed;
    }


    /**
     * Sets the meetingTimeElapsed value for this Status.
     * 
     * @param meetingTimeElapsed
     */
    public void setMeetingTimeElapsed(org.apache.axis.types.UnsignedLong meetingTimeElapsed) {
        this.meetingTimeElapsed = meetingTimeElapsed;
    }


    /**
     * Gets the meetingName value for this Status.
     * 
     * @return meetingName
     */
    public java.lang.String getMeetingName() {
        return meetingName;
    }


    /**
     * Sets the meetingName value for this Status.
     * 
     * @param meetingName
     */
    public void setMeetingName(java.lang.String meetingName) {
        this.meetingName = meetingName;
    }


    /**
     * Gets the archiveFileName value for this Status.
     * 
     * @return archiveFileName
     */
    public java.lang.String getArchiveFileName() {
        return archiveFileName;
    }


    /**
     * Sets the archiveFileName value for this Status.
     * 
     * @param archiveFileName
     */
    public void setArchiveFileName(java.lang.String archiveFileName) {
        this.archiveFileName = archiveFileName;
    }


    /**
     * Gets the agendaDocumentID value for this Status.
     * 
     * @return agendaDocumentID
     */
    public java.lang.String getAgendaDocumentID() {
        return agendaDocumentID;
    }


    /**
     * Sets the agendaDocumentID value for this Status.
     * 
     * @param agendaDocumentID
     */
    public void setAgendaDocumentID(java.lang.String agendaDocumentID) {
        this.agendaDocumentID = agendaDocumentID;
    }


    /**
     * Gets the minutesDocumentID value for this Status.
     * 
     * @return minutesDocumentID
     */
    public java.lang.String getMinutesDocumentID() {
        return minutesDocumentID;
    }


    /**
     * Sets the minutesDocumentID value for this Status.
     * 
     * @param minutesDocumentID
     */
    public void setMinutesDocumentID(java.lang.String minutesDocumentID) {
        this.minutesDocumentID = minutesDocumentID;
    }


    /**
     * Gets the masterDocumentID value for this Status.
     * 
     * @return masterDocumentID
     */
    public java.lang.String getMasterDocumentID() {
        return masterDocumentID;
    }


    /**
     * Sets the masterDocumentID value for this Status.
     * 
     * @param masterDocumentID
     */
    public void setMasterDocumentID(java.lang.String masterDocumentID) {
        this.masterDocumentID = masterDocumentID;
    }


    /**
     * Gets the archiveFolderID value for this Status.
     * 
     * @return archiveFolderID
     */
    public int getArchiveFolderID() {
        return archiveFolderID;
    }


    /**
     * Sets the archiveFolderID value for this Status.
     * 
     * @param archiveFolderID
     */
    public void setArchiveFolderID(int archiveFolderID) {
        this.archiveFolderID = archiveFolderID;
    }


    /**
     * Gets the archiveDuration value for this Status.
     * 
     * @return archiveDuration
     */
    public org.apache.axis.types.UnsignedLong getArchiveDuration() {
        return archiveDuration;
    }


    /**
     * Sets the archiveDuration value for this Status.
     * 
     * @param archiveDuration
     */
    public void setArchiveDuration(org.apache.axis.types.UnsignedLong archiveDuration) {
        this.archiveDuration = archiveDuration;
    }


    /**
     * Gets the suspendRecordItem value for this Status.
     * 
     * @return suspendRecordItem
     */
    public boolean isSuspendRecordItem() {
        return suspendRecordItem;
    }


    /**
     * Sets the suspendRecordItem value for this Status.
     * 
     * @param suspendRecordItem
     */
    public void setSuspendRecordItem(boolean suspendRecordItem) {
        this.suspendRecordItem = suspendRecordItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Status)) return false;
        Status other = (Status) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.connectedToMeetingServer == other.isConnectedToMeetingServer() &&
            ((this.encoderState==null && other.getEncoderState()==null) || 
             (this.encoderState!=null &&
              this.encoderState.equals(other.getEncoderState()))) &&
            ((this.archiveState==null && other.getArchiveState()==null) || 
             (this.archiveState!=null &&
              this.archiveState.equals(other.getArchiveState()))) &&
            ((this.meetingTimerState==null && other.getMeetingTimerState()==null) || 
             (this.meetingTimerState!=null &&
              this.meetingTimerState.equals(other.getMeetingTimerState()))) &&
            ((this.meetingTimeElapsed==null && other.getMeetingTimeElapsed()==null) || 
             (this.meetingTimeElapsed!=null &&
              this.meetingTimeElapsed.equals(other.getMeetingTimeElapsed()))) &&
            ((this.meetingName==null && other.getMeetingName()==null) || 
             (this.meetingName!=null &&
              this.meetingName.equals(other.getMeetingName()))) &&
            ((this.archiveFileName==null && other.getArchiveFileName()==null) || 
             (this.archiveFileName!=null &&
              this.archiveFileName.equals(other.getArchiveFileName()))) &&
            ((this.agendaDocumentID==null && other.getAgendaDocumentID()==null) || 
             (this.agendaDocumentID!=null &&
              this.agendaDocumentID.equals(other.getAgendaDocumentID()))) &&
            ((this.minutesDocumentID==null && other.getMinutesDocumentID()==null) || 
             (this.minutesDocumentID!=null &&
              this.minutesDocumentID.equals(other.getMinutesDocumentID()))) &&
            ((this.masterDocumentID==null && other.getMasterDocumentID()==null) || 
             (this.masterDocumentID!=null &&
              this.masterDocumentID.equals(other.getMasterDocumentID()))) &&
            this.archiveFolderID == other.getArchiveFolderID() &&
            ((this.archiveDuration==null && other.getArchiveDuration()==null) || 
             (this.archiveDuration!=null &&
              this.archiveDuration.equals(other.getArchiveDuration()))) &&
            this.suspendRecordItem == other.isSuspendRecordItem();
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
        _hashCode += (isConnectedToMeetingServer() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEncoderState() != null) {
            _hashCode += getEncoderState().hashCode();
        }
        if (getArchiveState() != null) {
            _hashCode += getArchiveState().hashCode();
        }
        if (getMeetingTimerState() != null) {
            _hashCode += getMeetingTimerState().hashCode();
        }
        if (getMeetingTimeElapsed() != null) {
            _hashCode += getMeetingTimeElapsed().hashCode();
        }
        if (getMeetingName() != null) {
            _hashCode += getMeetingName().hashCode();
        }
        if (getArchiveFileName() != null) {
            _hashCode += getArchiveFileName().hashCode();
        }
        if (getAgendaDocumentID() != null) {
            _hashCode += getAgendaDocumentID().hashCode();
        }
        if (getMinutesDocumentID() != null) {
            _hashCode += getMinutesDocumentID().hashCode();
        }
        if (getMasterDocumentID() != null) {
            _hashCode += getMasterDocumentID().hashCode();
        }
        _hashCode += getArchiveFolderID();
        if (getArchiveDuration() != null) {
            _hashCode += getArchiveDuration().hashCode();
        }
        _hashCode += (isSuspendRecordItem() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Status.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/lacity/", "Status"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedToMeetingServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "ConnectedToMeetingServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encoderState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "EncoderState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "ArchiveState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingTimerState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "MeetingTimerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingTimeElapsed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "MeetingTimeElapsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "MeetingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "ArchiveFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaDocumentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "AgendaDocumentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesDocumentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "MinutesDocumentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterDocumentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "MasterDocumentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveFolderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "ArchiveFolderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "ArchiveDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendRecordItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://granicus.com/lacity/", "SuspendRecordItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

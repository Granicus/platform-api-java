/**
 * EventData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class EventData  implements java.io.Serializable {
    private int ID;

    private java.lang.String UID;

    private int foreignID;

    private java.lang.String name;

    private int cameraID;

    private int folderID;

    private java.lang.String status;

    private java.lang.String agendaType;

    private java.lang.String agendaFile;

    private int playerTemplateID;

    private java.lang.String archiveStatus;

    private int duration;

    private boolean broadcast;

    private boolean record;

    private boolean autoStart;

    private java.util.Calendar startTime;

    private java.util.Calendar lastModified;

    private com.granicus.xsd.Attendee[] attendees;

    private java.lang.String[] motionTypes;

    private java.lang.String street1;

    private java.lang.String street2;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private java.lang.String agendaTitle;

    private java.util.Calendar meetingTime;

    private java.util.Calendar agendaPostedDate;

    private java.util.Calendar nextStartDate;

    private int agendaRolloverID;

    public EventData() {
    }

    public EventData(
           int ID,
           java.lang.String UID,
           int foreignID,
           java.lang.String name,
           int cameraID,
           int folderID,
           java.lang.String status,
           java.lang.String agendaType,
           java.lang.String agendaFile,
           int playerTemplateID,
           java.lang.String archiveStatus,
           int duration,
           boolean broadcast,
           boolean record,
           boolean autoStart,
           java.util.Calendar startTime,
           java.util.Calendar lastModified,
           com.granicus.xsd.Attendee[] attendees,
           java.lang.String[] motionTypes,
           java.lang.String street1,
           java.lang.String street2,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           java.lang.String agendaTitle,
           java.util.Calendar meetingTime,
           java.util.Calendar agendaPostedDate,
           java.util.Calendar nextStartDate,
           int agendaRolloverID) {
           this.ID = ID;
           this.UID = UID;
           this.foreignID = foreignID;
           this.name = name;
           this.cameraID = cameraID;
           this.folderID = folderID;
           this.status = status;
           this.agendaType = agendaType;
           this.agendaFile = agendaFile;
           this.playerTemplateID = playerTemplateID;
           this.archiveStatus = archiveStatus;
           this.duration = duration;
           this.broadcast = broadcast;
           this.record = record;
           this.autoStart = autoStart;
           this.startTime = startTime;
           this.lastModified = lastModified;
           this.attendees = attendees;
           this.motionTypes = motionTypes;
           this.street1 = street1;
           this.street2 = street2;
           this.city = city;
           this.state = state;
           this.zip = zip;
           this.agendaTitle = agendaTitle;
           this.meetingTime = meetingTime;
           this.agendaPostedDate = agendaPostedDate;
           this.nextStartDate = nextStartDate;
           this.agendaRolloverID = agendaRolloverID;
    }


    /**
     * Gets the ID value for this EventData.
     * 
     * @return ID
     */
    public int getID() {
        return ID;
    }


    /**
     * Sets the ID value for this EventData.
     * 
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }


    /**
     * Gets the UID value for this EventData.
     * 
     * @return UID
     */
    public java.lang.String getUID() {
        return UID;
    }


    /**
     * Sets the UID value for this EventData.
     * 
     * @param UID
     */
    public void setUID(java.lang.String UID) {
        this.UID = UID;
    }


    /**
     * Gets the foreignID value for this EventData.
     * 
     * @return foreignID
     */
    public int getForeignID() {
        return foreignID;
    }


    /**
     * Sets the foreignID value for this EventData.
     * 
     * @param foreignID
     */
    public void setForeignID(int foreignID) {
        this.foreignID = foreignID;
    }


    /**
     * Gets the name value for this EventData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EventData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the cameraID value for this EventData.
     * 
     * @return cameraID
     */
    public int getCameraID() {
        return cameraID;
    }


    /**
     * Sets the cameraID value for this EventData.
     * 
     * @param cameraID
     */
    public void setCameraID(int cameraID) {
        this.cameraID = cameraID;
    }


    /**
     * Gets the folderID value for this EventData.
     * 
     * @return folderID
     */
    public int getFolderID() {
        return folderID;
    }


    /**
     * Sets the folderID value for this EventData.
     * 
     * @param folderID
     */
    public void setFolderID(int folderID) {
        this.folderID = folderID;
    }


    /**
     * Gets the status value for this EventData.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this EventData.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the agendaType value for this EventData.
     * 
     * @return agendaType
     */
    public java.lang.String getAgendaType() {
        return agendaType;
    }


    /**
     * Sets the agendaType value for this EventData.
     * 
     * @param agendaType
     */
    public void setAgendaType(java.lang.String agendaType) {
        this.agendaType = agendaType;
    }


    /**
     * Gets the agendaFile value for this EventData.
     * 
     * @return agendaFile
     */
    public java.lang.String getAgendaFile() {
        return agendaFile;
    }


    /**
     * Sets the agendaFile value for this EventData.
     * 
     * @param agendaFile
     */
    public void setAgendaFile(java.lang.String agendaFile) {
        this.agendaFile = agendaFile;
    }


    /**
     * Gets the playerTemplateID value for this EventData.
     * 
     * @return playerTemplateID
     */
    public int getPlayerTemplateID() {
        return playerTemplateID;
    }


    /**
     * Sets the playerTemplateID value for this EventData.
     * 
     * @param playerTemplateID
     */
    public void setPlayerTemplateID(int playerTemplateID) {
        this.playerTemplateID = playerTemplateID;
    }


    /**
     * Gets the archiveStatus value for this EventData.
     * 
     * @return archiveStatus
     */
    public java.lang.String getArchiveStatus() {
        return archiveStatus;
    }


    /**
     * Sets the archiveStatus value for this EventData.
     * 
     * @param archiveStatus
     */
    public void setArchiveStatus(java.lang.String archiveStatus) {
        this.archiveStatus = archiveStatus;
    }


    /**
     * Gets the duration value for this EventData.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this EventData.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the broadcast value for this EventData.
     * 
     * @return broadcast
     */
    public boolean isBroadcast() {
        return broadcast;
    }


    /**
     * Sets the broadcast value for this EventData.
     * 
     * @param broadcast
     */
    public void setBroadcast(boolean broadcast) {
        this.broadcast = broadcast;
    }


    /**
     * Gets the record value for this EventData.
     * 
     * @return record
     */
    public boolean isRecord() {
        return record;
    }


    /**
     * Sets the record value for this EventData.
     * 
     * @param record
     */
    public void setRecord(boolean record) {
        this.record = record;
    }


    /**
     * Gets the autoStart value for this EventData.
     * 
     * @return autoStart
     */
    public boolean isAutoStart() {
        return autoStart;
    }


    /**
     * Sets the autoStart value for this EventData.
     * 
     * @param autoStart
     */
    public void setAutoStart(boolean autoStart) {
        this.autoStart = autoStart;
    }


    /**
     * Gets the startTime value for this EventData.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this EventData.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the lastModified value for this EventData.
     * 
     * @return lastModified
     */
    public java.util.Calendar getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this EventData.
     * 
     * @param lastModified
     */
    public void setLastModified(java.util.Calendar lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the attendees value for this EventData.
     * 
     * @return attendees
     */
    public com.granicus.xsd.Attendee[] getAttendees() {
        return attendees;
    }


    /**
     * Sets the attendees value for this EventData.
     * 
     * @param attendees
     */
    public void setAttendees(com.granicus.xsd.Attendee[] attendees) {
        this.attendees = attendees;
    }


    /**
     * Gets the motionTypes value for this EventData.
     * 
     * @return motionTypes
     */
    public java.lang.String[] getMotionTypes() {
        return motionTypes;
    }


    /**
     * Sets the motionTypes value for this EventData.
     * 
     * @param motionTypes
     */
    public void setMotionTypes(java.lang.String[] motionTypes) {
        this.motionTypes = motionTypes;
    }


    /**
     * Gets the street1 value for this EventData.
     * 
     * @return street1
     */
    public java.lang.String getStreet1() {
        return street1;
    }


    /**
     * Sets the street1 value for this EventData.
     * 
     * @param street1
     */
    public void setStreet1(java.lang.String street1) {
        this.street1 = street1;
    }


    /**
     * Gets the street2 value for this EventData.
     * 
     * @return street2
     */
    public java.lang.String getStreet2() {
        return street2;
    }


    /**
     * Sets the street2 value for this EventData.
     * 
     * @param street2
     */
    public void setStreet2(java.lang.String street2) {
        this.street2 = street2;
    }


    /**
     * Gets the city value for this EventData.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this EventData.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this EventData.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this EventData.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this EventData.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this EventData.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the agendaTitle value for this EventData.
     * 
     * @return agendaTitle
     */
    public java.lang.String getAgendaTitle() {
        return agendaTitle;
    }


    /**
     * Sets the agendaTitle value for this EventData.
     * 
     * @param agendaTitle
     */
    public void setAgendaTitle(java.lang.String agendaTitle) {
        this.agendaTitle = agendaTitle;
    }


    /**
     * Gets the meetingTime value for this EventData.
     * 
     * @return meetingTime
     */
    public java.util.Calendar getMeetingTime() {
        return meetingTime;
    }


    /**
     * Sets the meetingTime value for this EventData.
     * 
     * @param meetingTime
     */
    public void setMeetingTime(java.util.Calendar meetingTime) {
        this.meetingTime = meetingTime;
    }


    /**
     * Gets the agendaPostedDate value for this EventData.
     * 
     * @return agendaPostedDate
     */
    public java.util.Calendar getAgendaPostedDate() {
        return agendaPostedDate;
    }


    /**
     * Sets the agendaPostedDate value for this EventData.
     * 
     * @param agendaPostedDate
     */
    public void setAgendaPostedDate(java.util.Calendar agendaPostedDate) {
        this.agendaPostedDate = agendaPostedDate;
    }


    /**
     * Gets the nextStartDate value for this EventData.
     * 
     * @return nextStartDate
     */
    public java.util.Calendar getNextStartDate() {
        return nextStartDate;
    }


    /**
     * Sets the nextStartDate value for this EventData.
     * 
     * @param nextStartDate
     */
    public void setNextStartDate(java.util.Calendar nextStartDate) {
        this.nextStartDate = nextStartDate;
    }


    /**
     * Gets the agendaRolloverID value for this EventData.
     * 
     * @return agendaRolloverID
     */
    public int getAgendaRolloverID() {
        return agendaRolloverID;
    }


    /**
     * Sets the agendaRolloverID value for this EventData.
     * 
     * @param agendaRolloverID
     */
    public void setAgendaRolloverID(int agendaRolloverID) {
        this.agendaRolloverID = agendaRolloverID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventData)) return false;
        EventData other = (EventData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ID == other.getID() &&
            ((this.UID==null && other.getUID()==null) || 
             (this.UID!=null &&
              this.UID.equals(other.getUID()))) &&
            this.foreignID == other.getForeignID() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.cameraID == other.getCameraID() &&
            this.folderID == other.getFolderID() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.agendaType==null && other.getAgendaType()==null) || 
             (this.agendaType!=null &&
              this.agendaType.equals(other.getAgendaType()))) &&
            ((this.agendaFile==null && other.getAgendaFile()==null) || 
             (this.agendaFile!=null &&
              this.agendaFile.equals(other.getAgendaFile()))) &&
            this.playerTemplateID == other.getPlayerTemplateID() &&
            ((this.archiveStatus==null && other.getArchiveStatus()==null) || 
             (this.archiveStatus!=null &&
              this.archiveStatus.equals(other.getArchiveStatus()))) &&
            this.duration == other.getDuration() &&
            this.broadcast == other.isBroadcast() &&
            this.record == other.isRecord() &&
            this.autoStart == other.isAutoStart() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              this.lastModified.equals(other.getLastModified()))) &&
            ((this.attendees==null && other.getAttendees()==null) || 
             (this.attendees!=null &&
              java.util.Arrays.equals(this.attendees, other.getAttendees()))) &&
            ((this.motionTypes==null && other.getMotionTypes()==null) || 
             (this.motionTypes!=null &&
              java.util.Arrays.equals(this.motionTypes, other.getMotionTypes()))) &&
            ((this.street1==null && other.getStreet1()==null) || 
             (this.street1!=null &&
              this.street1.equals(other.getStreet1()))) &&
            ((this.street2==null && other.getStreet2()==null) || 
             (this.street2!=null &&
              this.street2.equals(other.getStreet2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.agendaTitle==null && other.getAgendaTitle()==null) || 
             (this.agendaTitle!=null &&
              this.agendaTitle.equals(other.getAgendaTitle()))) &&
            ((this.meetingTime==null && other.getMeetingTime()==null) || 
             (this.meetingTime!=null &&
              this.meetingTime.equals(other.getMeetingTime()))) &&
            ((this.agendaPostedDate==null && other.getAgendaPostedDate()==null) || 
             (this.agendaPostedDate!=null &&
              this.agendaPostedDate.equals(other.getAgendaPostedDate()))) &&
            ((this.nextStartDate==null && other.getNextStartDate()==null) || 
             (this.nextStartDate!=null &&
              this.nextStartDate.equals(other.getNextStartDate()))) &&
            this.agendaRolloverID == other.getAgendaRolloverID();
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
        if (getUID() != null) {
            _hashCode += getUID().hashCode();
        }
        _hashCode += getForeignID();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getCameraID();
        _hashCode += getFolderID();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAgendaType() != null) {
            _hashCode += getAgendaType().hashCode();
        }
        if (getAgendaFile() != null) {
            _hashCode += getAgendaFile().hashCode();
        }
        _hashCode += getPlayerTemplateID();
        if (getArchiveStatus() != null) {
            _hashCode += getArchiveStatus().hashCode();
        }
        _hashCode += getDuration();
        _hashCode += (isBroadcast() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRecord() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAutoStart() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getLastModified() != null) {
            _hashCode += getLastModified().hashCode();
        }
        if (getAttendees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttendees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttendees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMotionTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMotionTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMotionTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStreet1() != null) {
            _hashCode += getStreet1().hashCode();
        }
        if (getStreet2() != null) {
            _hashCode += getStreet2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getAgendaTitle() != null) {
            _hashCode += getAgendaTitle().hashCode();
        }
        if (getMeetingTime() != null) {
            _hashCode += getMeetingTime().hashCode();
        }
        if (getAgendaPostedDate() != null) {
            _hashCode += getAgendaPostedDate().hashCode();
        }
        if (getNextStartDate() != null) {
            _hashCode += getNextStartDate().hashCode();
        }
        _hashCode += getAgendaRolloverID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "EventData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ForeignID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CameraID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FolderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playerTemplateID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlayerTemplateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArchiveStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadcast");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Broadcast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("record");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Record"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendees");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attendees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "Attendee"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motionTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MotionTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Street1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Street2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MeetingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaPostedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaPostedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NextStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaRolloverID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaRolloverID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

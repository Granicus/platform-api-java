/**
 * ClipData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class ClipData  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.String UID;

    private java.lang.String eventUID;

    private java.lang.Integer foreignID;

    private java.lang.String type;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String keywords;

    private java.util.Calendar date;

    private java.lang.Integer cameraID;

    private java.lang.Integer folderID;

    private java.lang.String fileName;

    private java.lang.String minutesType;

    private java.lang.String minutesFile;

    private java.lang.String agendaType;

    private java.lang.String agendaFile;

    private java.lang.Integer duration;

    private java.lang.String status;

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

    private java.util.Calendar agendaPostedDate;

    public ClipData() {
    }

    public ClipData(
           java.lang.Integer ID,
           java.lang.String UID,
           java.lang.String eventUID,
           java.lang.Integer foreignID,
           java.lang.String type,
           java.lang.String name,
           java.lang.String description,
           java.lang.String keywords,
           java.util.Calendar date,
           java.lang.Integer cameraID,
           java.lang.Integer folderID,
           java.lang.String fileName,
           java.lang.String minutesType,
           java.lang.String minutesFile,
           java.lang.String agendaType,
           java.lang.String agendaFile,
           java.lang.Integer duration,
           java.lang.String status,
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
           java.util.Calendar agendaPostedDate) {
           this.ID = ID;
           this.UID = UID;
           this.eventUID = eventUID;
           this.foreignID = foreignID;
           this.type = type;
           this.name = name;
           this.description = description;
           this.keywords = keywords;
           this.date = date;
           this.cameraID = cameraID;
           this.folderID = folderID;
           this.fileName = fileName;
           this.minutesType = minutesType;
           this.minutesFile = minutesFile;
           this.agendaType = agendaType;
           this.agendaFile = agendaFile;
           this.duration = duration;
           this.status = status;
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
           this.agendaPostedDate = agendaPostedDate;
    }


    /**
     * Gets the ID value for this ClipData.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this ClipData.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the UID value for this ClipData.
     * 
     * @return UID
     */
    public java.lang.String getUID() {
        return UID;
    }


    /**
     * Sets the UID value for this ClipData.
     * 
     * @param UID
     */
    public void setUID(java.lang.String UID) {
        this.UID = UID;
    }


    /**
     * Gets the eventUID value for this ClipData.
     * 
     * @return eventUID
     */
    public java.lang.String getEventUID() {
        return eventUID;
    }


    /**
     * Sets the eventUID value for this ClipData.
     * 
     * @param eventUID
     */
    public void setEventUID(java.lang.String eventUID) {
        this.eventUID = eventUID;
    }


    /**
     * Gets the foreignID value for this ClipData.
     * 
     * @return foreignID
     */
    public java.lang.Integer getForeignID() {
        return foreignID;
    }


    /**
     * Sets the foreignID value for this ClipData.
     * 
     * @param foreignID
     */
    public void setForeignID(java.lang.Integer foreignID) {
        this.foreignID = foreignID;
    }


    /**
     * Gets the type value for this ClipData.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ClipData.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the name value for this ClipData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ClipData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ClipData.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ClipData.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the keywords value for this ClipData.
     * 
     * @return keywords
     */
    public java.lang.String getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this ClipData.
     * 
     * @param keywords
     */
    public void setKeywords(java.lang.String keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the date value for this ClipData.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this ClipData.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the cameraID value for this ClipData.
     * 
     * @return cameraID
     */
    public java.lang.Integer getCameraID() {
        return cameraID;
    }


    /**
     * Sets the cameraID value for this ClipData.
     * 
     * @param cameraID
     */
    public void setCameraID(java.lang.Integer cameraID) {
        this.cameraID = cameraID;
    }


    /**
     * Gets the folderID value for this ClipData.
     * 
     * @return folderID
     */
    public java.lang.Integer getFolderID() {
        return folderID;
    }


    /**
     * Sets the folderID value for this ClipData.
     * 
     * @param folderID
     */
    public void setFolderID(java.lang.Integer folderID) {
        this.folderID = folderID;
    }


    /**
     * Gets the fileName value for this ClipData.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this ClipData.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the minutesType value for this ClipData.
     * 
     * @return minutesType
     */
    public java.lang.String getMinutesType() {
        return minutesType;
    }


    /**
     * Sets the minutesType value for this ClipData.
     * 
     * @param minutesType
     */
    public void setMinutesType(java.lang.String minutesType) {
        this.minutesType = minutesType;
    }


    /**
     * Gets the minutesFile value for this ClipData.
     * 
     * @return minutesFile
     */
    public java.lang.String getMinutesFile() {
        return minutesFile;
    }


    /**
     * Sets the minutesFile value for this ClipData.
     * 
     * @param minutesFile
     */
    public void setMinutesFile(java.lang.String minutesFile) {
        this.minutesFile = minutesFile;
    }


    /**
     * Gets the agendaType value for this ClipData.
     * 
     * @return agendaType
     */
    public java.lang.String getAgendaType() {
        return agendaType;
    }


    /**
     * Sets the agendaType value for this ClipData.
     * 
     * @param agendaType
     */
    public void setAgendaType(java.lang.String agendaType) {
        this.agendaType = agendaType;
    }


    /**
     * Gets the agendaFile value for this ClipData.
     * 
     * @return agendaFile
     */
    public java.lang.String getAgendaFile() {
        return agendaFile;
    }


    /**
     * Sets the agendaFile value for this ClipData.
     * 
     * @param agendaFile
     */
    public void setAgendaFile(java.lang.String agendaFile) {
        this.agendaFile = agendaFile;
    }


    /**
     * Gets the duration value for this ClipData.
     * 
     * @return duration
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this ClipData.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the status value for this ClipData.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ClipData.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the startTime value for this ClipData.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ClipData.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the lastModified value for this ClipData.
     * 
     * @return lastModified
     */
    public java.util.Calendar getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this ClipData.
     * 
     * @param lastModified
     */
    public void setLastModified(java.util.Calendar lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the attendees value for this ClipData.
     * 
     * @return attendees
     */
    public com.granicus.xsd.Attendee[] getAttendees() {
        return attendees;
    }


    /**
     * Sets the attendees value for this ClipData.
     * 
     * @param attendees
     */
    public void setAttendees(com.granicus.xsd.Attendee[] attendees) {
        this.attendees = attendees;
    }


    /**
     * Gets the motionTypes value for this ClipData.
     * 
     * @return motionTypes
     */
    public java.lang.String[] getMotionTypes() {
        return motionTypes;
    }


    /**
     * Sets the motionTypes value for this ClipData.
     * 
     * @param motionTypes
     */
    public void setMotionTypes(java.lang.String[] motionTypes) {
        this.motionTypes = motionTypes;
    }


    /**
     * Gets the street1 value for this ClipData.
     * 
     * @return street1
     */
    public java.lang.String getStreet1() {
        return street1;
    }


    /**
     * Sets the street1 value for this ClipData.
     * 
     * @param street1
     */
    public void setStreet1(java.lang.String street1) {
        this.street1 = street1;
    }


    /**
     * Gets the street2 value for this ClipData.
     * 
     * @return street2
     */
    public java.lang.String getStreet2() {
        return street2;
    }


    /**
     * Sets the street2 value for this ClipData.
     * 
     * @param street2
     */
    public void setStreet2(java.lang.String street2) {
        this.street2 = street2;
    }


    /**
     * Gets the city value for this ClipData.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ClipData.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this ClipData.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ClipData.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this ClipData.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this ClipData.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the agendaTitle value for this ClipData.
     * 
     * @return agendaTitle
     */
    public java.lang.String getAgendaTitle() {
        return agendaTitle;
    }


    /**
     * Sets the agendaTitle value for this ClipData.
     * 
     * @param agendaTitle
     */
    public void setAgendaTitle(java.lang.String agendaTitle) {
        this.agendaTitle = agendaTitle;
    }


    /**
     * Gets the agendaPostedDate value for this ClipData.
     * 
     * @return agendaPostedDate
     */
    public java.util.Calendar getAgendaPostedDate() {
        return agendaPostedDate;
    }


    /**
     * Sets the agendaPostedDate value for this ClipData.
     * 
     * @param agendaPostedDate
     */
    public void setAgendaPostedDate(java.util.Calendar agendaPostedDate) {
        this.agendaPostedDate = agendaPostedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClipData)) return false;
        ClipData other = (ClipData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.UID==null && other.getUID()==null) || 
             (this.UID!=null &&
              this.UID.equals(other.getUID()))) &&
            ((this.eventUID==null && other.getEventUID()==null) || 
             (this.eventUID!=null &&
              this.eventUID.equals(other.getEventUID()))) &&
            ((this.foreignID==null && other.getForeignID()==null) || 
             (this.foreignID!=null &&
              this.foreignID.equals(other.getForeignID()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.cameraID==null && other.getCameraID()==null) || 
             (this.cameraID!=null &&
              this.cameraID.equals(other.getCameraID()))) &&
            ((this.folderID==null && other.getFolderID()==null) || 
             (this.folderID!=null &&
              this.folderID.equals(other.getFolderID()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.minutesType==null && other.getMinutesType()==null) || 
             (this.minutesType!=null &&
              this.minutesType.equals(other.getMinutesType()))) &&
            ((this.minutesFile==null && other.getMinutesFile()==null) || 
             (this.minutesFile!=null &&
              this.minutesFile.equals(other.getMinutesFile()))) &&
            ((this.agendaType==null && other.getAgendaType()==null) || 
             (this.agendaType!=null &&
              this.agendaType.equals(other.getAgendaType()))) &&
            ((this.agendaFile==null && other.getAgendaFile()==null) || 
             (this.agendaFile!=null &&
              this.agendaFile.equals(other.getAgendaFile()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
            ((this.agendaPostedDate==null && other.getAgendaPostedDate()==null) || 
             (this.agendaPostedDate!=null &&
              this.agendaPostedDate.equals(other.getAgendaPostedDate())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getUID() != null) {
            _hashCode += getUID().hashCode();
        }
        if (getEventUID() != null) {
            _hashCode += getEventUID().hashCode();
        }
        if (getForeignID() != null) {
            _hashCode += getForeignID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getCameraID() != null) {
            _hashCode += getCameraID().hashCode();
        }
        if (getFolderID() != null) {
            _hashCode += getFolderID().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getMinutesType() != null) {
            _hashCode += getMinutesType().hashCode();
        }
        if (getMinutesFile() != null) {
            _hashCode += getMinutesFile().hashCode();
        }
        if (getAgendaType() != null) {
            _hashCode += getAgendaType().hashCode();
        }
        if (getAgendaFile() != null) {
            _hashCode += getAgendaFile().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
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
        if (getAgendaPostedDate() != null) {
            _hashCode += getAgendaPostedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClipData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "ClipData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ForeignID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CameraID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FolderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MinutesType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MinutesFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendees");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attendees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "Attendee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motionTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MotionTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Street1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Street2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendaPostedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AgendaPostedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

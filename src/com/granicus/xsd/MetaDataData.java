/**
 * MetaDataData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class MetaDataData  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.String UID;

    private java.lang.Integer parentID;

    private java.lang.String parentUID;

    private java.lang.Integer foreignID;

    private java.lang.Integer sourceID;

    private java.lang.String name;

    private java.lang.Integer timeStamp;

    private java.lang.Integer orderID;

    private java.lang.Object payload;

    private java.lang.Integer consent;

    private java.lang.String consentVoteUID;

    private com.granicus.xsd.MetaDataData[] children;

    public MetaDataData() {
    }

    public MetaDataData(
           java.lang.Integer ID,
           java.lang.String UID,
           java.lang.Integer parentID,
           java.lang.String parentUID,
           java.lang.Integer foreignID,
           java.lang.Integer sourceID,
           java.lang.String name,
           java.lang.Integer timeStamp,
           java.lang.Integer orderID,
           java.lang.Object payload,
           java.lang.Integer consent,
           java.lang.String consentVoteUID,
           com.granicus.xsd.MetaDataData[] children) {
           this.ID = ID;
           this.UID = UID;
           this.parentID = parentID;
           this.parentUID = parentUID;
           this.foreignID = foreignID;
           this.sourceID = sourceID;
           this.name = name;
           this.timeStamp = timeStamp;
           this.orderID = orderID;
           this.payload = payload;
           this.consent = consent;
           this.consentVoteUID = consentVoteUID;
           this.children = children;
    }


    /**
     * Gets the ID value for this MetaDataData.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this MetaDataData.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the UID value for this MetaDataData.
     * 
     * @return UID
     */
    public java.lang.String getUID() {
        return UID;
    }


    /**
     * Sets the UID value for this MetaDataData.
     * 
     * @param UID
     */
    public void setUID(java.lang.String UID) {
        this.UID = UID;
    }


    /**
     * Gets the parentID value for this MetaDataData.
     * 
     * @return parentID
     */
    public java.lang.Integer getParentID() {
        return parentID;
    }


    /**
     * Sets the parentID value for this MetaDataData.
     * 
     * @param parentID
     */
    public void setParentID(java.lang.Integer parentID) {
        this.parentID = parentID;
    }


    /**
     * Gets the parentUID value for this MetaDataData.
     * 
     * @return parentUID
     */
    public java.lang.String getParentUID() {
        return parentUID;
    }


    /**
     * Sets the parentUID value for this MetaDataData.
     * 
     * @param parentUID
     */
    public void setParentUID(java.lang.String parentUID) {
        this.parentUID = parentUID;
    }


    /**
     * Gets the foreignID value for this MetaDataData.
     * 
     * @return foreignID
     */
    public java.lang.Integer getForeignID() {
        return foreignID;
    }


    /**
     * Sets the foreignID value for this MetaDataData.
     * 
     * @param foreignID
     */
    public void setForeignID(java.lang.Integer foreignID) {
        this.foreignID = foreignID;
    }


    /**
     * Gets the sourceID value for this MetaDataData.
     * 
     * @return sourceID
     */
    public java.lang.Integer getSourceID() {
        return sourceID;
    }


    /**
     * Sets the sourceID value for this MetaDataData.
     * 
     * @param sourceID
     */
    public void setSourceID(java.lang.Integer sourceID) {
        this.sourceID = sourceID;
    }


    /**
     * Gets the name value for this MetaDataData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MetaDataData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the timeStamp value for this MetaDataData.
     * 
     * @return timeStamp
     */
    public java.lang.Integer getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this MetaDataData.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.lang.Integer timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the orderID value for this MetaDataData.
     * 
     * @return orderID
     */
    public java.lang.Integer getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this MetaDataData.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.Integer orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the payload value for this MetaDataData.
     * 
     * @return payload
     */
    public java.lang.Object getPayload() {
        return payload;
    }


    /**
     * Sets the payload value for this MetaDataData.
     * 
     * @param payload
     */
    public void setPayload(java.lang.Object payload) {
        this.payload = payload;
    }


    /**
     * Gets the consent value for this MetaDataData.
     * 
     * @return consent
     */
    public java.lang.Integer getConsent() {
        return consent;
    }


    /**
     * Sets the consent value for this MetaDataData.
     * 
     * @param consent
     */
    public void setConsent(java.lang.Integer consent) {
        this.consent = consent;
    }


    /**
     * Gets the consentVoteUID value for this MetaDataData.
     * 
     * @return consentVoteUID
     */
    public java.lang.String getConsentVoteUID() {
        return consentVoteUID;
    }


    /**
     * Sets the consentVoteUID value for this MetaDataData.
     * 
     * @param consentVoteUID
     */
    public void setConsentVoteUID(java.lang.String consentVoteUID) {
        this.consentVoteUID = consentVoteUID;
    }


    /**
     * Gets the children value for this MetaDataData.
     * 
     * @return children
     */
    public com.granicus.xsd.MetaDataData[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this MetaDataData.
     * 
     * @param children
     */
    public void setChildren(com.granicus.xsd.MetaDataData[] children) {
        this.children = children;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaDataData)) return false;
        MetaDataData other = (MetaDataData) obj;
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
            ((this.parentID==null && other.getParentID()==null) || 
             (this.parentID!=null &&
              this.parentID.equals(other.getParentID()))) &&
            ((this.parentUID==null && other.getParentUID()==null) || 
             (this.parentUID!=null &&
              this.parentUID.equals(other.getParentUID()))) &&
            ((this.foreignID==null && other.getForeignID()==null) || 
             (this.foreignID!=null &&
              this.foreignID.equals(other.getForeignID()))) &&
            ((this.sourceID==null && other.getSourceID()==null) || 
             (this.sourceID!=null &&
              this.sourceID.equals(other.getSourceID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.payload==null && other.getPayload()==null) || 
             (this.payload!=null &&
              this.payload.equals(other.getPayload()))) &&
            ((this.consent==null && other.getConsent()==null) || 
             (this.consent!=null &&
              this.consent.equals(other.getConsent()))) &&
            ((this.consentVoteUID==null && other.getConsentVoteUID()==null) || 
             (this.consentVoteUID!=null &&
              this.consentVoteUID.equals(other.getConsentVoteUID()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren())));
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
        if (getParentID() != null) {
            _hashCode += getParentID().hashCode();
        }
        if (getParentUID() != null) {
            _hashCode += getParentUID().hashCode();
        }
        if (getForeignID() != null) {
            _hashCode += getForeignID().hashCode();
        }
        if (getSourceID() != null) {
            _hashCode += getSourceID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getPayload() != null) {
            _hashCode += getPayload().hashCode();
        }
        if (getConsent() != null) {
            _hashCode += getConsent().hashCode();
        }
        if (getConsentVoteUID() != null) {
            _hashCode += getConsentVoteUID().hashCode();
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
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
        new org.apache.axis.description.TypeDesc(MetaDataData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "MetaDataData"));
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
        elemField.setFieldName("parentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParentUID"));
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
        elemField.setFieldName("sourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payload");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Payload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Consent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consentVoteUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConsentVoteUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "MetaDataData"));
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

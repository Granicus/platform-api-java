/**
 * CameraData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class CameraData  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.String type;

    private java.lang.String name;

    private java.lang.String internalIP;

    private java.lang.String externalIP;

    private java.lang.Integer broadcastPort;

    private java.lang.Integer controlPort;

    private java.lang.String identifier;

    public CameraData() {
    }

    public CameraData(
           java.lang.Integer ID,
           java.lang.String type,
           java.lang.String name,
           java.lang.String internalIP,
           java.lang.String externalIP,
           java.lang.Integer broadcastPort,
           java.lang.Integer controlPort,
           java.lang.String identifier) {
           this.ID = ID;
           this.type = type;
           this.name = name;
           this.internalIP = internalIP;
           this.externalIP = externalIP;
           this.broadcastPort = broadcastPort;
           this.controlPort = controlPort;
           this.identifier = identifier;
    }


    /**
     * Gets the ID value for this CameraData.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this CameraData.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the type value for this CameraData.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CameraData.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the name value for this CameraData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CameraData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the internalIP value for this CameraData.
     * 
     * @return internalIP
     */
    public java.lang.String getInternalIP() {
        return internalIP;
    }


    /**
     * Sets the internalIP value for this CameraData.
     * 
     * @param internalIP
     */
    public void setInternalIP(java.lang.String internalIP) {
        this.internalIP = internalIP;
    }


    /**
     * Gets the externalIP value for this CameraData.
     * 
     * @return externalIP
     */
    public java.lang.String getExternalIP() {
        return externalIP;
    }


    /**
     * Sets the externalIP value for this CameraData.
     * 
     * @param externalIP
     */
    public void setExternalIP(java.lang.String externalIP) {
        this.externalIP = externalIP;
    }


    /**
     * Gets the broadcastPort value for this CameraData.
     * 
     * @return broadcastPort
     */
    public java.lang.Integer getBroadcastPort() {
        return broadcastPort;
    }


    /**
     * Sets the broadcastPort value for this CameraData.
     * 
     * @param broadcastPort
     */
    public void setBroadcastPort(java.lang.Integer broadcastPort) {
        this.broadcastPort = broadcastPort;
    }


    /**
     * Gets the controlPort value for this CameraData.
     * 
     * @return controlPort
     */
    public java.lang.Integer getControlPort() {
        return controlPort;
    }


    /**
     * Sets the controlPort value for this CameraData.
     * 
     * @param controlPort
     */
    public void setControlPort(java.lang.Integer controlPort) {
        this.controlPort = controlPort;
    }


    /**
     * Gets the identifier value for this CameraData.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this CameraData.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CameraData)) return false;
        CameraData other = (CameraData) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.internalIP==null && other.getInternalIP()==null) || 
             (this.internalIP!=null &&
              this.internalIP.equals(other.getInternalIP()))) &&
            ((this.externalIP==null && other.getExternalIP()==null) || 
             (this.externalIP!=null &&
              this.externalIP.equals(other.getExternalIP()))) &&
            ((this.broadcastPort==null && other.getBroadcastPort()==null) || 
             (this.broadcastPort!=null &&
              this.broadcastPort.equals(other.getBroadcastPort()))) &&
            ((this.controlPort==null && other.getControlPort()==null) || 
             (this.controlPort!=null &&
              this.controlPort.equals(other.getControlPort()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getInternalIP() != null) {
            _hashCode += getInternalIP().hashCode();
        }
        if (getExternalIP() != null) {
            _hashCode += getExternalIP().hashCode();
        }
        if (getBroadcastPort() != null) {
            _hashCode += getBroadcastPort().hashCode();
        }
        if (getControlPort() != null) {
            _hashCode += getControlPort().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "CameraData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
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
        elemField.setFieldName("internalIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InternalIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExternalIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadcastPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BroadcastPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ControlPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

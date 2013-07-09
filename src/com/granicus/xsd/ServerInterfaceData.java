/**
 * ServerInterfaceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class ServerInterfaceData  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.Integer serverID;

    private java.lang.String name;

    private java.lang.String host;

    private java.lang.String controlPort;

    private java.lang.String directory;

    private java.lang.String replicationUN;

    private java.lang.String replicationPW;

    public ServerInterfaceData() {
    }

    public ServerInterfaceData(
           java.lang.Integer ID,
           java.lang.Integer serverID,
           java.lang.String name,
           java.lang.String host,
           java.lang.String controlPort,
           java.lang.String directory,
           java.lang.String replicationUN,
           java.lang.String replicationPW) {
           this.ID = ID;
           this.serverID = serverID;
           this.name = name;
           this.host = host;
           this.controlPort = controlPort;
           this.directory = directory;
           this.replicationUN = replicationUN;
           this.replicationPW = replicationPW;
    }


    /**
     * Gets the ID value for this ServerInterfaceData.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this ServerInterfaceData.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the serverID value for this ServerInterfaceData.
     * 
     * @return serverID
     */
    public java.lang.Integer getServerID() {
        return serverID;
    }


    /**
     * Sets the serverID value for this ServerInterfaceData.
     * 
     * @param serverID
     */
    public void setServerID(java.lang.Integer serverID) {
        this.serverID = serverID;
    }


    /**
     * Gets the name value for this ServerInterfaceData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ServerInterfaceData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the host value for this ServerInterfaceData.
     * 
     * @return host
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this ServerInterfaceData.
     * 
     * @param host
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }


    /**
     * Gets the controlPort value for this ServerInterfaceData.
     * 
     * @return controlPort
     */
    public java.lang.String getControlPort() {
        return controlPort;
    }


    /**
     * Sets the controlPort value for this ServerInterfaceData.
     * 
     * @param controlPort
     */
    public void setControlPort(java.lang.String controlPort) {
        this.controlPort = controlPort;
    }


    /**
     * Gets the directory value for this ServerInterfaceData.
     * 
     * @return directory
     */
    public java.lang.String getDirectory() {
        return directory;
    }


    /**
     * Sets the directory value for this ServerInterfaceData.
     * 
     * @param directory
     */
    public void setDirectory(java.lang.String directory) {
        this.directory = directory;
    }


    /**
     * Gets the replicationUN value for this ServerInterfaceData.
     * 
     * @return replicationUN
     */
    public java.lang.String getReplicationUN() {
        return replicationUN;
    }


    /**
     * Sets the replicationUN value for this ServerInterfaceData.
     * 
     * @param replicationUN
     */
    public void setReplicationUN(java.lang.String replicationUN) {
        this.replicationUN = replicationUN;
    }


    /**
     * Gets the replicationPW value for this ServerInterfaceData.
     * 
     * @return replicationPW
     */
    public java.lang.String getReplicationPW() {
        return replicationPW;
    }


    /**
     * Sets the replicationPW value for this ServerInterfaceData.
     * 
     * @param replicationPW
     */
    public void setReplicationPW(java.lang.String replicationPW) {
        this.replicationPW = replicationPW;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServerInterfaceData)) return false;
        ServerInterfaceData other = (ServerInterfaceData) obj;
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
            ((this.serverID==null && other.getServerID()==null) || 
             (this.serverID!=null &&
              this.serverID.equals(other.getServerID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.controlPort==null && other.getControlPort()==null) || 
             (this.controlPort!=null &&
              this.controlPort.equals(other.getControlPort()))) &&
            ((this.directory==null && other.getDirectory()==null) || 
             (this.directory!=null &&
              this.directory.equals(other.getDirectory()))) &&
            ((this.replicationUN==null && other.getReplicationUN()==null) || 
             (this.replicationUN!=null &&
              this.replicationUN.equals(other.getReplicationUN()))) &&
            ((this.replicationPW==null && other.getReplicationPW()==null) || 
             (this.replicationPW!=null &&
              this.replicationPW.equals(other.getReplicationPW())));
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
        if (getServerID() != null) {
            _hashCode += getServerID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getControlPort() != null) {
            _hashCode += getControlPort().hashCode();
        }
        if (getDirectory() != null) {
            _hashCode += getDirectory().hashCode();
        }
        if (getReplicationUN() != null) {
            _hashCode += getReplicationUN().hashCode();
        }
        if (getReplicationPW() != null) {
            _hashCode += getReplicationPW().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServerInterfaceData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "ServerInterfaceData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServerID"));
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
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ControlPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Directory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicationUN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReplicationUN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicationPW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReplicationPW"));
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

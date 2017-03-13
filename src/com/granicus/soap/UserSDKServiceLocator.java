/**
 * UserSDKServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.soap;

public class UserSDKServiceLocator extends org.apache.axis.client.Service implements com.granicus.soap.UserSDKService {

    public UserSDKServiceLocator() {
    }


    public UserSDKServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserSDKServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserSDKPort
    private java.lang.String UserSDKPort_address = "http://green.qa.granicus.com/SDK/user/index.php";

    public java.lang.String getUserSDKPortAddress() {
        return UserSDKPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserSDKPortWSDDServiceName = "UserSDKPort";

    public java.lang.String getUserSDKPortWSDDServiceName() {
        return UserSDKPortWSDDServiceName;
    }

    public void setUserSDKPortWSDDServiceName(java.lang.String name) {
        UserSDKPortWSDDServiceName = name;
    }

    public com.granicus.soap.UserSDKPort getUserSDKPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserSDKPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserSDKPort(endpoint);
    }

    public com.granicus.soap.UserSDKPort getUserSDKPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.granicus.soap.UserSDKBindingStub _stub = new com.granicus.soap.UserSDKBindingStub(portAddress, this);
            _stub.setPortName(getUserSDKPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserSDKPortEndpointAddress(java.lang.String address) {
        UserSDKPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.granicus.soap.UserSDKPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.granicus.soap.UserSDKBindingStub _stub = new com.granicus.soap.UserSDKBindingStub(new java.net.URL(UserSDKPort_address), this);
                _stub.setPortName(getUserSDKPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserSDKPort".equals(inputPortName)) {
            return getUserSDKPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:UserSDK", "UserSDKService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:UserSDK", "UserSDKPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

if ("UserSDKPort".equals(portName)) {
            setUserSDKPortEndpointAddress(address);
        }
        else
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

/**
 * MediaVaultSDKServiceProxyLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.accelerator;

public class MediaVaultSDKServiceProxyLocator extends org.apache.axis.client.Service implements com.granicus.accelerator.MediaVaultSDKServiceProxy {

    public MediaVaultSDKServiceProxyLocator() {
    }


    public MediaVaultSDKServiceProxyLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MediaVaultSDKServiceProxyLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MediaVaultSDKServiceProxySoap12
    private java.lang.String MediaVaultSDKServiceProxySoap12_address = "http://10.20.0.20:443/MediaVault/SDK.asmx";

    public java.lang.String getMediaVaultSDKServiceProxySoap12Address() {
        return MediaVaultSDKServiceProxySoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MediaVaultSDKServiceProxySoap12WSDDServiceName = "MediaVaultSDKServiceProxySoap12";

    public java.lang.String getMediaVaultSDKServiceProxySoap12WSDDServiceName() {
        return MediaVaultSDKServiceProxySoap12WSDDServiceName;
    }

    public void setMediaVaultSDKServiceProxySoap12WSDDServiceName(java.lang.String name) {
        MediaVaultSDKServiceProxySoap12WSDDServiceName = name;
    }

    public com.granicus.accelerator.MediaVaultSDKServiceProxySoap_PortType getMediaVaultSDKServiceProxySoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MediaVaultSDKServiceProxySoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMediaVaultSDKServiceProxySoap12(endpoint);
    }

    public com.granicus.accelerator.MediaVaultSDKServiceProxySoap_PortType getMediaVaultSDKServiceProxySoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.granicus.accelerator.MediaVaultSDKServiceProxySoap12Stub _stub = new com.granicus.accelerator.MediaVaultSDKServiceProxySoap12Stub(portAddress, this);
            _stub.setPortName(getMediaVaultSDKServiceProxySoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMediaVaultSDKServiceProxySoap12EndpointAddress(java.lang.String address) {
        MediaVaultSDKServiceProxySoap12_address = address;
    }


    // Use to get a proxy class for MediaVaultSDKServiceProxySoap
    private java.lang.String MediaVaultSDKServiceProxySoap_address = "http://10.20.0.20:443/MediaVault/SDK.asmx";

    public java.lang.String getMediaVaultSDKServiceProxySoapAddress() {
        return MediaVaultSDKServiceProxySoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MediaVaultSDKServiceProxySoapWSDDServiceName = "MediaVaultSDKServiceProxySoap";

    public java.lang.String getMediaVaultSDKServiceProxySoapWSDDServiceName() {
        return MediaVaultSDKServiceProxySoapWSDDServiceName;
    }

    public void setMediaVaultSDKServiceProxySoapWSDDServiceName(java.lang.String name) {
        MediaVaultSDKServiceProxySoapWSDDServiceName = name;
    }

    public com.granicus.accelerator.MediaVaultSDKServiceProxySoap_PortType getMediaVaultSDKServiceProxySoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MediaVaultSDKServiceProxySoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMediaVaultSDKServiceProxySoap(endpoint);
    }

    public com.granicus.accelerator.MediaVaultSDKServiceProxySoap_PortType getMediaVaultSDKServiceProxySoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.granicus.accelerator.MediaVaultSDKServiceProxySoap_BindingStub _stub = new com.granicus.accelerator.MediaVaultSDKServiceProxySoap_BindingStub(portAddress, this);
            _stub.setPortName(getMediaVaultSDKServiceProxySoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMediaVaultSDKServiceProxySoapEndpointAddress(java.lang.String address) {
        MediaVaultSDKServiceProxySoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.granicus.accelerator.MediaVaultSDKServiceProxySoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.granicus.accelerator.MediaVaultSDKServiceProxySoap12Stub _stub = new com.granicus.accelerator.MediaVaultSDKServiceProxySoap12Stub(new java.net.URL(MediaVaultSDKServiceProxySoap12_address), this);
                _stub.setPortName(getMediaVaultSDKServiceProxySoap12WSDDServiceName());
                return _stub;
            }
            if (com.granicus.accelerator.MediaVaultSDKServiceProxySoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.granicus.accelerator.MediaVaultSDKServiceProxySoap_BindingStub _stub = new com.granicus.accelerator.MediaVaultSDKServiceProxySoap_BindingStub(new java.net.URL(MediaVaultSDKServiceProxySoap_address), this);
                _stub.setPortName(getMediaVaultSDKServiceProxySoapWSDDServiceName());
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
        if ("MediaVaultSDKServiceProxySoap12".equals(inputPortName)) {
            return getMediaVaultSDKServiceProxySoap12();
        }
        else if ("MediaVaultSDKServiceProxySoap".equals(inputPortName)) {
            return getMediaVaultSDKServiceProxySoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://granicus.com/MediaVault/SDK", "MediaVaultSDKServiceProxy");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://granicus.com/MediaVault/SDK", "MediaVaultSDKServiceProxySoap12"));
            ports.add(new javax.xml.namespace.QName("http://granicus.com/MediaVault/SDK", "MediaVaultSDKServiceProxySoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MediaVaultSDKServiceProxySoap12".equals(portName)) {
            setMediaVaultSDKServiceProxySoap12EndpointAddress(address);
        }
        else 
if ("MediaVaultSDKServiceProxySoap".equals(portName)) {
            setMediaVaultSDKServiceProxySoapEndpointAddress(address);
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

/**
 * UserSDKService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package UserSDK;

public interface UserSDKService extends javax.xml.rpc.Service {
    public java.lang.String getUserSDKPortAddress();

    public UserSDK.UserSDKPort getUserSDKPort() throws javax.xml.rpc.ServiceException;

    public UserSDK.UserSDKPort getUserSDKPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

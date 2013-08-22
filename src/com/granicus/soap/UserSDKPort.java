/**
 * UserSDKPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.soap;

public interface UserSDKPort extends java.rmi.Remote {
    public int logMessage(java.lang.String message, java.lang.String application, java.lang.String _class, int priority) throws java.rmi.RemoteException;
    public void login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String getChallenge(java.lang.String challengeCode) throws java.rmi.RemoteException;
    public void sendChallengeResponse(java.lang.String challenge, java.lang.String response) throws java.rmi.RemoteException;
    public void logout() throws java.rmi.RemoteException;
    public int createCamera(com.granicus.xsd.CameraData cameraData) throws java.rmi.RemoteException;
    public com.granicus.xsd.CameraData[] getCameras() throws java.rmi.RemoteException;
    public com.granicus.xsd.CameraData getCamera(int cameraID) throws java.rmi.RemoteException;
    public java.lang.String getCameraVideoLocation(int cameraID) throws java.rmi.RemoteException;
    public void updateCamera(com.granicus.xsd.CameraData camera) throws java.rmi.RemoteException;
    public void deleteCamera(int cameraID) throws java.rmi.RemoteException;
    public int createEvent(com.granicus.xsd.EventData eventData) throws java.rmi.RemoteException;
    public com.granicus.xsd.EventData[] getEvents() throws java.rmi.RemoteException;
    public com.granicus.xsd.EventData[] getEventsByDateRange(java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public com.granicus.xsd.EventData[] getEventsByForeignID(int foreignID) throws java.rmi.RemoteException;
    public com.granicus.xsd.EventData getEvent(int eventID) throws java.rmi.RemoteException;
    public com.granicus.xsd.EventData getEventByUID(java.lang.String eventUID) throws java.rmi.RemoteException;
    public java.lang.String getEventVideoLocation(int eventID) throws java.rmi.RemoteException;
    public java.lang.String getEventVideoLocationByUID(java.lang.String eventUID) throws java.rmi.RemoteException;
    public com.granicus.xsd.MetaDataData[] getEventMetaData(int eventID) throws java.rmi.RemoteException;
    public com.granicus.xsd.MetaDataData[] getEventMetaDataByUID(java.lang.String eventUID) throws java.rmi.RemoteException;
    public void uploadEventAgendaDocument(int eventID, com.granicus.xsd.Document document) throws java.rmi.RemoteException;
    public void setEventAgendaURL(int eventID, java.lang.String URL) throws java.rmi.RemoteException;
    public void setEventAgendaURLByUID(java.lang.String eventUID, java.lang.String URL) throws java.rmi.RemoteException;
    public void updateEvent(com.granicus.xsd.EventData event) throws java.rmi.RemoteException;
    public void deleteEvent(int eventID) throws java.rmi.RemoteException;
    public com.granicus.xsd.KeyMapping[] addEventMetaData(int eventID, com.granicus.xsd.MetaDataData metaDataData) throws java.rmi.RemoteException;
    public com.granicus.xsd.KeyMapping[] importEventMetaData(int eventID, com.granicus.xsd.MetaDataData[] metaData, boolean clearExisting, boolean asTree) throws java.rmi.RemoteException;
    public int createFolder(com.granicus.xsd.FolderData folderData) throws java.rmi.RemoteException;
    public com.granicus.xsd.FolderData[] getFolders() throws java.rmi.RemoteException;
    public void deleteFolder(int folderID) throws java.rmi.RemoteException;
    public com.granicus.xsd.FolderData[] getFoldersByType(java.lang.String type) throws java.rmi.RemoteException;
    public com.granicus.xsd.FolderData getFolder(int folderID) throws java.rmi.RemoteException;
    public com.granicus.xsd.ServerInterfaceData getFolderUploadInterface(int folderID) throws java.rmi.RemoteException;
    public void updateFolder(com.granicus.xsd.FolderData folder) throws java.rmi.RemoteException;
    public int registerClipUpload(com.granicus.xsd.ClipData clipData, int serverID) throws java.rmi.RemoteException;
    public com.granicus.xsd.ClipData[] getClips(int folderID) throws java.rmi.RemoteException;
    public com.granicus.xsd.ClipData[] getClipsByForeignID(int foreignID) throws java.rmi.RemoteException;
    public com.granicus.xsd.ClipData getClip(int clipID) throws java.rmi.RemoteException;
    public com.granicus.xsd.ClipData getClipByUID(java.lang.String clipUID) throws java.rmi.RemoteException;
    public java.lang.String getClipVideoLocation(int clipID) throws java.rmi.RemoteException;
    public com.granicus.xsd.MetaDataData[] getClipMetaData(int clipID) throws java.rmi.RemoteException;
    public com.granicus.xsd.MetaDataData[] getClipMetaDataByUID(java.lang.String clipUID) throws java.rmi.RemoteException;
    public com.granicus.xsd.MetaDataData[] getClipIndices(int clipID) throws java.rmi.RemoteException;
    public com.granicus.xsd.MetaDataData[] getClipIndicesByUID(java.lang.String clipUID) throws java.rmi.RemoteException;
    public java.lang.String getClipCaptions(int clipID) throws java.rmi.RemoteException;
    public java.lang.String getClipCaptionsByUID(java.lang.String clipUID) throws java.rmi.RemoteException;
    public void setClipAgendaURL(int clipID, java.lang.String URL) throws java.rmi.RemoteException;
    public void setClipMinutesURL(int clipID, java.lang.String URL) throws java.rmi.RemoteException;
    public void setClipMinutesURLWithName(int clipID, java.lang.String URL, java.lang.String name) throws java.rmi.RemoteException;
    public void uploadClipMinutesDocument(int clipID, com.granicus.xsd.Document document, java.lang.String name) throws java.rmi.RemoteException;
    public com.granicus.xsd.MinutesDocumentData[] getClipMinutesDocuments(int clipID) throws java.rmi.RemoteException;
    public void deleteMinutesDocument(java.lang.String UID) throws java.rmi.RemoteException;
    public void updateClip(com.granicus.xsd.ClipData clip) throws java.rmi.RemoteException;
    public void deleteClip(int clipID) throws java.rmi.RemoteException;
    public com.granicus.xsd.KeyMapping[] addClipMetaData(int clipID, com.granicus.xsd.MetaDataData metaDataData) throws java.rmi.RemoteException;
    public com.granicus.xsd.KeyMapping[] importClipMetaData(int clipID, com.granicus.xsd.MetaDataData[] metaData, boolean clearExisting, boolean asTree) throws java.rmi.RemoteException;
    public com.granicus.xsd.MetaDataData getMetaData(int metaDataID) throws java.rmi.RemoteException;
    public com.granicus.xsd.MetaDataData getMetaDataByUID(java.lang.String metaDataUID) throws java.rmi.RemoteException;
    public java.lang.String getMetaDataVideoLocation(int metaDataID) throws java.rmi.RemoteException;
    public void updateMetaData(com.granicus.xsd.MetaDataData metaData) throws java.rmi.RemoteException;
    public void deleteMetaData(int metaDataID) throws java.rmi.RemoteException;
    public com.granicus.xsd.Document fetchAttachment(int metaDataID) throws java.rmi.RemoteException;
    public int createView(com.granicus.xsd.ViewData viewData) throws java.rmi.RemoteException;
    public com.granicus.xsd.ViewData[] getViews() throws java.rmi.RemoteException;
    public com.granicus.xsd.ViewData getView(int viewID) throws java.rmi.RemoteException;
    public void updateView(com.granicus.xsd.ViewData view) throws java.rmi.RemoteException;
    public int createUser(com.granicus.xsd.UserData userData) throws java.rmi.RemoteException;
    public int getCurrentUserID() throws java.rmi.RemoteException;
    public java.lang.String getCurrentUserLogon() throws java.rmi.RemoteException;
    public com.granicus.xsd.UserData[] getUsers() throws java.rmi.RemoteException;
    public com.granicus.xsd.UserData getUser(int userID) throws java.rmi.RemoteException;
    public void updateUser(com.granicus.xsd.UserData user) throws java.rmi.RemoteException;
    public int createGroup(com.granicus.xsd.GroupData groupData) throws java.rmi.RemoteException;
    public com.granicus.xsd.GroupData[] getGroups() throws java.rmi.RemoteException;
    public com.granicus.xsd.GroupData getGroup(int groupID) throws java.rmi.RemoteException;
    public void updateGroup(com.granicus.xsd.GroupData group) throws java.rmi.RemoteException;
    public void deleteGroup(int groupID) throws java.rmi.RemoteException;
    public int createTemplate(com.granicus.xsd.TemplateData templateData) throws java.rmi.RemoteException;
    public com.granicus.xsd.TemplateData[] getTemplates() throws java.rmi.RemoteException;
    public com.granicus.xsd.TemplateData getTemplate(int templateID) throws java.rmi.RemoteException;
    public void updateTemplate(com.granicus.xsd.TemplateData template) throws java.rmi.RemoteException;
    public int createServer(com.granicus.xsd.ServerData serverData) throws java.rmi.RemoteException;
    public com.granicus.xsd.ServerData[] getServers() throws java.rmi.RemoteException;
    public com.granicus.xsd.ServerData getServer(int serverID) throws java.rmi.RemoteException;
    public void updateServer(com.granicus.xsd.ServerData server) throws java.rmi.RemoteException;
    public void deleteServer(int serverID) throws java.rmi.RemoteException;
    public int getPermissionLevel(java.lang.String assetType, int assetID) throws java.rmi.RemoteException;
    public void createClipGeneratedMinutesDocument(java.lang.String clipUid, java.lang.String name, java.lang.String templateUid, boolean isPublished, boolean isDefault) throws java.rmi.RemoteException;
    public com.granicus.xsd.Setting[] getSettings() throws java.rmi.RemoteException;
    public void createMotionActions(java.lang.String[] motionActions) throws java.rmi.RemoteException;
    public void createAttendees(com.granicus.xsd.Attendee[] attendeesData) throws java.rmi.RemoteException;
    public java.lang.String[] getMotionActions() throws java.rmi.RemoteException;

    class UserSDKServiceLocator extends org.apache.axis.client.Service implements UserSDKService {

        public UserSDKServiceLocator() {
        }


        public UserSDKServiceLocator(org.apache.axis.EngineConfiguration config) {
            super(config);
        }

        public UserSDKServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
            super(wsdlLoc, sName);
        }

        // Use to get a proxy class for UserSDKPort
        private String UserSDKPort_address = "http://gainesville.qa.granicus.com/SDK/user/index.php";

        public String getUserSDKPortAddress() {
            return UserSDKPort_address;
        }

        // The WSDD service name defaults to the port name.
        private String UserSDKPortWSDDServiceName = "UserSDKPort";

        public String getUserSDKPortWSDDServiceName() {
            return UserSDKPortWSDDServiceName;
        }

        public void setUserSDKPortWSDDServiceName(String name) {
            UserSDKPortWSDDServiceName = name;
        }

        public UserSDKPort getUserSDKPort() throws javax.xml.rpc.ServiceException {
           java.net.URL endpoint;
            try {
                endpoint = new java.net.URL(UserSDKPort_address);
            }
            catch (java.net.MalformedURLException e) {
                throw new javax.xml.rpc.ServiceException(e);
            }
            return getUserSDKPort(endpoint);
        }

        public UserSDKPort getUserSDKPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
            try {
                UserSDKBindingStub _stub = new UserSDKBindingStub(portAddress, this);
                _stub.setPortName(getUserSDKPortWSDDServiceName());
                return _stub;
            }
            catch (org.apache.axis.AxisFault e) {
                return null;
            }
        }

        public void setUserSDKPortEndpointAddress(String address) {
            UserSDKPort_address = address;
        }

        /**
         * For the given interface, get the stub implementation.
         * If this service has no port for the given interface,
         * then ServiceException is thrown.
         */
        public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
            try {
                if (UserSDKPort.class.isAssignableFrom(serviceEndpointInterface)) {
                    UserSDKBindingStub _stub = new UserSDKBindingStub(new java.net.URL(UserSDKPort_address), this);
                    _stub.setPortName(getUserSDKPortWSDDServiceName());
                    return _stub;
                }
            }
            catch (Throwable t) {
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
            String inputPortName = portName.getLocalPart();
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
        public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

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
        public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
            setEndpointAddress(portName.getLocalPart(), address);
        }

    }
}

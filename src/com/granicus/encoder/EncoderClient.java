package com.granicus.encoder;

import org.apache.axis.AxisFault;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import javax.xml.soap.*;
import org.apache.axis.*;
import org.apache.axis.client.*;
import org.apache.axis.transport.http.*;
import com.granicus.xsd.*;

/**
 * Created with IntelliJ IDEA.
 * User: javier
 * Date: 5/4/13
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class EncoderClient extends MeetingServerWebServiceSoap_BindingStub {

    public EncoderClient(String encoderHost) throws AxisFault, MalformedURLException
    {
        this(encoderHost, 85);
    }

    public EncoderClient(CameraData cameraData) throws AxisFault, MalformedURLException
    {
        this(cameraData.getInternalIP(), cameraData.getControlPort());
    }

    public EncoderClient(String encoderHost, Integer controlPort) throws AxisFault, MalformedURLException
    {
        // construct ourselves using a new locator and a url endpoint getUserSDKPortWSDDServiceName
        super(new MeetingServerWebServiceLocator());
        super.setPortName(((MeetingServerWebServiceLocator) super.service).getMeetingServerWebServiceSoapWSDDServiceName());
        super.cachedEndpoint = new java.net.URL("http://" + encoderHost + ":" + controlPort.toString() + "/Outcast/meetingserverwebservice.asmx");
    }

}
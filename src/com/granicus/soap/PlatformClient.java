package com.granicus.soap;

import org.apache.axis.AxisFault;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import javax.xml.soap.*;
import org.apache.axis.*;
import org.apache.axis.client.*;
import org.apache.axis.transport.http.*;

/**
 * Created with IntelliJ IDEA.
 * User: Javier
 * Date: 11/7/12
 * Time: 1:44 PM
 * Copyright (c) Granicus, Inc. 2012
 */
public class PlatformClient extends UserSDKBindingStub {

    // The WSDD service name defaults to the port name.
    private String SessionCookieKey = "PHPSESSID";

    public PlatformClient(String site) throws AxisFault, MalformedURLException
    {
        // construct ourselves using a new locator and a url endpoint
        super(new UserSDKServiceLocator());
        super.setPortName(((UserSDKServiceLocator) super.service).getUserSDKPortWSDDServiceName());
        super.cachedEndpoint = new java.net.URL("http://" + site + "/SDK/user/index.php");
    }

    public PlatformClient(String site, String token) throws AxisFault, MalformedURLException
    {
        this(site);

        setToken(token);
    }

    public PlatformClient(String site, String username, String password) throws AxisFault, MalformedURLException, RemoteException {
        this(site);

        // login to the given granicus site
        this.login(username, password);
    }

    public void login(String username, String password) throws AxisFault, RemoteException {
         super.login(username, password);

         String cookie = getCookiesFromResponse();

         setCookie(cookie);
    }

    public void setToken(String token)
    {
        setCookie(SessionCookieKey + "=" + token + ";");
    }

    public String getToken()
    {
        String cookie = (String) ((Stub) this)._getProperty(HTTPConstants.HEADER_COOKIE);
        String[] cookies = cookie.split(";");

        for(int i = 0; i < cookies.length; i++)
        {
            String[] parts = cookies[i].split("=");
            if(parts[0].equals(SessionCookieKey))
            {
                return parts[1];
            }
        }
        return null;
    }

    public void setCookie(String cookie)
    {
        ((Stub) this)._setProperty(Call.SESSION_MAINTAIN_PROPERTY, new Boolean(true));
        ((Stub) this)._setProperty(HTTPConstants.HEADER_COOKIE, cookie);
    }

    public String getCookiesFromResponse()
    {
        // get the cookie from the response and return it
        MessageContext context = ((Stub) this)._getCall().getMessageContext();
        SOAPMessage message = context.getMessage();
        MimeHeaders headers = message.getMimeHeaders();
        String[] cookies = headers.getHeader("set-cookie");
        String cookie = "";
        for(int i = 0; i < cookies.length; i++)
        {
            cookies[i] = cookies[i].split(";")[0];
            cookie = cookie.concat(cookies[i]);
            if(i < (cookies.length - 1))
            {
                cookie = cookie.concat(";");
            }
        }
        return cookie;
    }
}

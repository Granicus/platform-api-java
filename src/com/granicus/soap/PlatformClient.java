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
public class PlatformClient extends PlatformClientStub {

    public PlatformClient(String site) throws AxisFault, MalformedURLException {
        super(site);
    }

    public PlatformClient(String site, String token) throws AxisFault, MalformedURLException {
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
}

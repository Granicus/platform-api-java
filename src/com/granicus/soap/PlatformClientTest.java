package com.granicus.soap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Javier
 * Date: 11/7/12
 * Time: 4:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlatformClientTest {

    PlatformClient client;
    String username;
    String password;
    String host;

    @Before
    public void setUp() throws Exception {
        username = System.getenv("GRANICUS_USERNAME");
        password = System.getenv("GRANICUS_PASSWORD");
        host = System.getenv("GRANICUS_HOST");
        client = new PlatformClient(host);
    }

    @After
    public void tearDown() throws Exception {
        client.logout();
    }

    @Test
    public void testLogin() throws Exception {
        client.login(username, password);
        Assert.assertEquals(username.toLowerCase(), client.getCurrentUserLogon().toLowerCase());
    }

    @Test
    public void testImpersonation() throws Exception {
        client.login(username,password);
        PlatformClient client2 = new PlatformClient(host);
        client2.setToken(client.getToken());
        Assert.assertEquals(username.toLowerCase(), client.getCurrentUserLogon().toLowerCase());
    }

}

Overview
===========

About Granicus Platform API
-------------

Granicus is a platform for government transparency and citizen engagement in use by over 900 government organizations,
from small towns to the US Congress. This Java wrapper allows for integration with the SOAP web service that can be
used to automate backend tasks in the system or write new user interfaces to interact with the Granicus platform.

### Getting Started
  
In order to start using this SDK, simply add the platform-api-java.jar to your classpath. The API is organized into two
namespaces: com.granicus.soap and com.granicus.xsd. To make things simple, we recommend importing both of these
namespaces:

    import com.granicus.soap.*;
    import com.granicus.xsd.*;


com.granicus.soap is where you will find the PlatformClient class that you'll need for executing SOAP calls against the
service. The easiest way to construct a new PlatformClient class is using the constructor that takes a site, username
and password as arguments:

    PlatformClient client = new PlatformClient("mysite.granicus.com","myuser","mysecretpassword");

This will construct a new PlatformClient and automatically call the login method for you. From there, you can begin
making calls. Let's get a list of folders and output them:

    FolderData[] folders = client.getFolders();
    for(FolderData folder : folders) {
        System.out.println(folder.getName());
    }

As you can see, using the PlatformClient wrapper will save you time in constructing all of the necessary classes and
configuring them to properly track sessions.

### Reporting Issues

To report an issue please open an issue in GitHub.

### Contributing

To contribute to this API, please submit a pull request. Pull requests should take the form of a single commit, with a
meaningful commit message. If possible, please write a unit test (we use JUnit4 for testing) for your change.

This repository uses the [Apache wsdl2java tool](https://cxf.apache.org/docs/wsdl-to-java.html) to generate the Java code in the files that begin with "UserSDK". These files should not be edited directly. To change these files, edit granicus.wsdl, and then run the gen-wsdl.sh script from the src directory:
    
    ./gen-wsdl.sh

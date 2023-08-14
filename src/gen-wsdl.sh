#! /bin/bash

# copy the wsdl file and update so we can also update the UserSDK package
cp granicus.wsdl usersdk-granicus.wsdl
OLDNAME="soap.granicus.com"
NEWNAME="UserSDK"
sed -i '' "s/$OLDNAME/$NEWNAME/g" usersdk-granicus.wsdl

CP="."
for JAR in `ls ../lib/*.jar`; do
        CP="$CP:$JAR"
done

# generate new java in com.granicus.soap package from original wsdl
java -cp $CP org.apache.axis.wsdl.WSDL2Java granicus.wsdl
#generate new java in UserSDK package from copied and modified wsdl
java -cp $CP org.apache.axis.wsdl.WSDL2Java usersdk-granicus.wsdl

# delete the extra wsdl
rm usersdk-granicus.wsdl

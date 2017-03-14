#! /bin/bash

CP="/Users/tyler.smith/repos/platform-api-java"
for JAR in `ls ./../lib/*.jar`; do
        CP="$CP:$JAR"
done
#echo "classpath = $CP"
java -cp $CP org.apache.axis.wsdl.WSDL2Java granicus.wsdl
#java -cp $CP org.apache.axis.wsdl.WSDL2Java encoder.wsdl --package com.granicus.encoder
#java -cp $CP org.apache.axis.wsdl.WSDL2Java accelerator.wsdl --package com.granicus.accelerator

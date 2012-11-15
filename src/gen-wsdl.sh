#! /bin/bash

CP="."
for JAR in `ls ../lib/*.jar`; do
        CP="$CP:$JAR"
done
#echo "classpath = $CP"
java -cp $CP org.apache.axis.wsdl.WSDL2Java $@

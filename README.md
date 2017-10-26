Camel File-JAXB: Camel with File consumer and JAXB Marshal/Unmarshl

Author: Elkin Munoz

Technologies: Fuse, OSGi, Camel, File, Spring, JAXB, XSLT

Product: Fuse 6.3

Breakdown

This code example demonstrates how to create a File consumer in Spring and correct namespaces of an incoming XML message using XSLT endpoint.

For more information see:

https://access.redhat.com/site/documentation/JBoss_Fuse/ for more information about using JBoss Fuse
https://access.redhat.com/solutions/2184271 How to switch to Woodstox implementation in Fuse on EAP in Camel's StaxConverter?
System Requirements

Before building and running this project you need:

Maven 3.2 or higher
JDK 1.7 or 1.8
JBoss Fuse 6.3
JBoss EAP 6.4
Build and Deploy

clone this project

git clone https://github.com/emunozd/xxx.git

change to project directory

cd camel-jaxb-example

build

mvn clean install

Switch to Woodstox implementation: https://access.redhat.com/solutions/2184271

Start JBoss Fuse 6.3 on EAP

./bin/standalone.sh

Usage

Copy the msj/request.xml file to the tmp/jaxb-example folder.

Check logs to check JAXB processing in the camel route.

Done.

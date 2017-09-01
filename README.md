JSF - Spring Boot Template For Your organization
=================================================================

* This sample code contain template for Spring boot - JSF
* You can download code and change following configuration and adept to your business


### Steps and Configuration 

* Download Source code
* Change folder name your project name
* Go to project folder and open pom.xml
* Change <groupId>org.orgname.modulename</groupId> and  <artifactId>jsf_springBoot</artifactId> according to your project name
* Rename base package to <groupId>.<artifactId>
* Go to resource->application.properties
	* change server.contextPath=/<artifactId> 
	* and spring.jmx.default-domain=<artifactId>
* execute mvn clean install package

### Deployment and Run

* Deploy on Tomcat
	* Execute mvn package
	* Copy deployment to tomcat webapps folder
	* Start Tomcat
* Deploy on Eclipse Tomcat Server	
* Execute `RunApplication` as Java application
* Execute `mvn spring-boot:run`

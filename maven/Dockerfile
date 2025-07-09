FROM tomcat:9.0.102-jdk11

COPY rest-showcase/target/struts2-rest-showcase.war /usr/local/tomcat/webapps/rest-showcase.war
COPY showcase/target/struts2-showcase.war /usr/local/tomcat/webapps/showcase.war

COPY index.jsp /usr/local/tomcat/webapps/ROOT/index.jsp

EXPOSE 8080/tcp
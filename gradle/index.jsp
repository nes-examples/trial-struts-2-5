<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Struts 2.5.33 Apps Landing Page</title>
</head>
<body>
<h1>Welcome</h1>

<div>
    <strong>Tomcat Server Info:</strong> <%= application.getServerInfo() %><br>
    <strong>Servlet API Version:</strong> <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %><br>
    <strong>Java Version:</strong> <%= System.getProperty("java.version") %>
</div>

<ul>
    <li><a href="/rest-showcase/">Struts2 REST Showcase</a></li>
    <li><a href="/showcase/">Struts2 Showcase</a></li>
</ul>
</body>
</html>
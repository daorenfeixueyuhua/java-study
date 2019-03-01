<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/2/26
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
加载Applet程序
<jsp:plugin type="applet" code="MyApplet.class" codebase="com.dada.applet">
    height = "400" weight = "400"
    <jsp:fallback>download error!</jsp:fallback>
</jsp:plugin>
</body>
</html>

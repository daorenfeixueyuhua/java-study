<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/3/12
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="application/vnd.ms-powerpoint;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

%>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <%@include file="hello.txt" %>
    </body>
</html>

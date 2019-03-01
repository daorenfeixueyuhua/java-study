<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/2/26
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         isErrorPage="true"
%>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
亲，你是错的！
</body>
</html>

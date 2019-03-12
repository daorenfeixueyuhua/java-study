<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/3/12
  Time: 18:06
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
<%
    int a = 5, b = 8, c = 6;
    out.println("<h1>hello word!</h1>");
%>

</body>
</html>

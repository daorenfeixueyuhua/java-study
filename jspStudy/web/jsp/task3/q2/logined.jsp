<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/3/12
  Time: 18:14
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
This is logined.jsp page!
<br>
<% String str1 = request.getParameter("username");
    String str2 = request.getParameter("password");
%>
<% out.println(str1 + "<br>");
    out.println(str2 + "<br>");
%>

</body>
</html>

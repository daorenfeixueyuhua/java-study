<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/3/24
  Time: 16:54
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
<div>
    <form action="deal.jsp" method="post">
        <b>username:</b>&nbsp;<input type="text" name="username"><br>
        <b>password:</b>&nbsp;<input type="password" name="password"><br>
        <input type="submit" value="登陆">
    </form>
</div>
</body>
</html>

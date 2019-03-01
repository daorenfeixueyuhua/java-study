<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/2/26
  Time: 16:26
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
<form action="" method="post" name="Form">
    username:<input type="text" name="userName"><br>
    password:<input type="password" name="passWord"><br>
    <input type="submit" value="login">
</form>
<%
    String userName = null, password = null;
    userName = request.getParameter("userName");
    password = request.getParameter("passWord");
    if (userName != null && password != null) {
%>
<jsp:forward page="target.jsp">
    <jsp:param name="userName" value="<%=userName%>"/>
    <jsp:param name="passWord" value="<%=password%>"/>
</jsp:forward>
<%
    }
%>
</body>
</html>

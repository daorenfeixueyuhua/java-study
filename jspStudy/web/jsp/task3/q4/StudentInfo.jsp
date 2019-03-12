<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/3/12
  Time: 18:22
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
<form action="StudentInfoHandle.jsp">
    学号：<input type="text" name="id"/><br>
    姓名：<input type="text" name="name"/><br>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
<%--

    点击提交后，页面跳转至 StudentInfoHandle.jsp 页面，并显示StudentInfo.jsp中表单填写的姓名和学号

--%>
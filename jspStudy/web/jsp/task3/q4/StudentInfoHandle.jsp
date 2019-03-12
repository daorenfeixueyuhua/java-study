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
<jsp:useBean id="stu" class="com.phoenix.test.Student" scope="session">
</jsp:useBean>
<jsp:setProperty name="stu" property="*"/>
<h1>学生信息</h1>
学号：
<jsp:getProperty name="stu" property="id"/>
<br>
姓名:
<jsp:getProperty name="stu" property="name"/>
<br>

</body>
</html>

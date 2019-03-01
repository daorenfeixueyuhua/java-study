<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/2/26
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gbk" language="java" %>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="staFile.txt"/>
</body>
</html>

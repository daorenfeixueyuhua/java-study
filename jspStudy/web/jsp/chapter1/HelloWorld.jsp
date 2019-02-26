<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/2/26
  Time: 13:04
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
    String msg = "JSP example";
    out.println(msg);
%>
<%=msg%>
</body>
</html>

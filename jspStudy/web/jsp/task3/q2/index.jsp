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
<jsp:include page="logined.jsp">
    <jsp:param value="wxt" name="username"/>
    <jsp:param value="123456" name="password"/>
</jsp:include>

</body>
</html>


<%--

访问index.jsp页面。却显示logined.jsp内的内容，并且index.jsp存在想logined.jsp页面传递参数

--%>
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
<%@ include file="included.jsp" %>
<%=a + b + c %>
</body>
</html>
<%--
    访问included.jsp，可正常访问。
    访问including.jsp，页面报500错误。

    include指令是直接将要包含的页面嵌入页面中；而include动作标签则是将要包含的页面运行后，再返回给页面

    使用include动作标签代替include指令

--%>
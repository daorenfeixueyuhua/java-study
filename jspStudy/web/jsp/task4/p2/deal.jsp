<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/3/24
  Time: 16:56
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
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    try {
        if (username.equals("admin") && password.equals("1234")) {
            session.setAttribute("username", username);
            response.sendRedirect("ok.jsp");
        } else {
            response.sendRedirect("err.jsp");
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
        response.sendRedirect("err.jsp");
    }
%>
</body>
</html>

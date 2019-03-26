<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/3/24
  Time: 17:13
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
    String rpassword = request.getParameter("rpassword");
    String tellPhone = request.getParameter("tellPhone");
    String email = request.getParameter("email");

    String message = null;

    if (username == null || username.equals("") ||
            password == null || password.equals("") ||
            rpassword == null || rpassword.equals("") ||
            tellPhone == null || tellPhone.equals("") ||
            email == null || email.equals("")) {
        message = "Please complete the user information!";
        request.setAttribute("message", message)
    } else if (!password.equals(rpassword)) {
        ;
        message = "Two password inconsistencies!";
        request.setAttribute("message", message);
    } else {
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("tellPhone", tellPhone);
        request.setAttribute("email", email);
    }
    request.getRequestDispatcher("./register.jsp").forward(request, response);
//    response.sendRedirect("./register.jsp");
%>
</body>
</html>

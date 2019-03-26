<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/3/24
  Time: 17:12
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
<style type="text/css">
    * {
        margin: 0;
        padding: 0;
    }

    .login {
        position: relative;
        padding-left: 200px;
        padding-top: 20px;
    }

    .show {
        position: relative;
        padding-left: 200px;
    }

    .login .left {
        float: left;
    }

    .login .right {
        float: right;
        margin-right: 830px;
    }

    .show .left {
        float: left;
    }

    .show .right {
        float: right;
        margin-right: 830px;
    }
</style>
<body>
<div class="login">
    <form action="deal.jsp" method="post">
        <b class="left">username:</b>&nbsp;<input class="right" type="text" name="username" value="${username}"><br>
        <b class="left">password:</b>&nbsp;<input class="right" type="password" name="password"><br>
        <b class="left">rpassword:</b>&nbsp;<input class="right" type="password" name="rpassword"><br>
        <b class="left">tellPhone:</b>&nbsp;<input class="right" type="text" name="tellPhone" value="${tellPhone}"><br>
        <b class="left">email:</b>&nbsp;<input class="right" type="email" name="email" value="${email}"><br>
        <br>
        <br>
        <b><input type="submit" value="register"></b>
    </form>
</div>
<div class="show">
    <h2>SHOW REGISTER INFORMATION</h2>
    <%
        String message = (String) request.getAttribute("message");
        if (message != null) {
            out.print("<b>" + message + "</b>");
        } else {%>
    <b class="left">username:</b>&nbsp;<input class="right" type="text" name="username" value="${username}"><br>
    <b class="left">password:</b>&nbsp;<input class="right" type="text" name="password"
                                              value="<%=request.getAttribute("password")%>"><br>
    <b class="left">tellPhone:</b>&nbsp;<input class="right" type="text" name="tellPhone" value="${tellPhone}"><br>
    <b class="left">email:</b>&nbsp;<input class="right" type="email" name="email" value="${email}"><br>
    <%}%>
</div>
</body>
</html>

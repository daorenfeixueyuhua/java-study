<%--
  Created by IntelliJ IDEA.
  User: dage
  Date: 2019/2/26
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         import="java.util.Date"
         info="作者：彭达"
         session="true"
         errorPage="../../error.jsp"
         isErrorPage="false"
         isThreadSafe="true"
         buffer="8kb"
         autoFlush="true"
         isELIgnored="true"
         pageEncoding="utf-8"
%>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    你好！welcome！当前时间为：<%=new Date()%>
</div>
<hr>
<div>
    <%

    %>
</div>
<div>
    <%
        int a = 1;
        int b = 0;
        int c = 0;
        //c = a/b;
        out.println(c);
    %>
</div>

</body>
</html>


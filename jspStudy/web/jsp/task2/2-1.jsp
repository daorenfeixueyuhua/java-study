<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<%
    int n = 0;
    if (request.getAttribute("num") == null) {
        n = 1;
    } else {
        n = Integer.parseInt(request.getAttribute("num").toString()) + 1;
    }
    request.setAttribute("num", n);
%>

你是第<%=request.getAttribute("num") %>个使用本网站的客户！
</body>
</html>
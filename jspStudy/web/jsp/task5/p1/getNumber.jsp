<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body bgcolor="cycan">
<br>
<h2>随机分配你一个1到100之间的整数，你猜是什么！</h2>
<br>
<%
    int number = (int) (Math.random() * 100) + 1;
    System.out.println(number);
    session.setAttribute("count", 0);
    session.setAttribute("save", number);
%>
<br>
<form action="result.jsp" method="post" name="form">
    <input type="text" name="boy">
    <input type="submit" value="送出" name="submit"/>
</form>
</body>
</html>
<%--
    不能使用request内置对象。因为request对象为一次http请求有效。而此功能将产生多次HTTP请求。
--%>
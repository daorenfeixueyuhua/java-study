<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<div>
    请输入半径！<br>
    <form action="deal.jsp" method="post">
        <input type="text" name="radius" value="${r }">
        <input type="submit" value="计算">
    </form>
    <hr>
    面积：<input value="${area }"><br>
    周长：<input value="${length }"><br>
</div>
</body>
</html>
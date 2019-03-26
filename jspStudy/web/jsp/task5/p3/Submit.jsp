<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
<form action="messagePane.jsp" method="post" name="form">
    输入你的名字：<br> <input type="text" name="peopleName"><br>
    输入你的留言标题：<br> <input type="text" name="Title"><br>
    输入你的留言：<br>
    <textarea name="messages" rows="10" cols="36" wrap="physical"></textarea>
    <br> <input type="submit" value="提交信息" name="submit">
</form>
<form action="showMessage.jsp" method="post" name="fomr1">
    <input type="submit" value="查看留言板" name="look">
</form>
</body>
</html>
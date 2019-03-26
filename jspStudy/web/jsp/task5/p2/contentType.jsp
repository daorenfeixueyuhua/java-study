<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
<form action="contentShow.jsp" method="post">
    <font size="5" face="隶书" color="bule">请选择文件类型</font><br> <input
        type="radio" name="showType" value="0"> HTML类型显示<br> <input
        type="radio" name="showType" value="1"> WORD类型显示<br> <input
        type="radio" name="showType" value="2"> EXCEL类型显示<br> <input
        type="submit" name="submit" value="提交">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
<%
    int count = (Integer) session.getAttribute("count");
    int num = (Integer) session.getAttribute("save");
    long startTime = session.getCreationTime();
    long endTime = session.getLastAccessedTime();
%>
<h2>恭喜你，猜对了！</h2>
<br>
<h2>
    你知道你一共猜了几次吗？猜了<%=count%>
</h2>
<br>
<h2>
    你一共耗时<%=(endTime - startTime) / 1000%>秒
</h2>
<br>
<h2>
    这个数字就是<%=num%>
</h2>
<br>
<h2>你必须关掉浏览器才能获得新的数据哦！</h2>
<br>
</body>
</html>
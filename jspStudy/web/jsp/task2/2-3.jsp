<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<form action="">
    please input a number: <input type="text" name="n"> <input type="submit" value="search">
</form>

<%
    String str = request.getParameter("n");
    if (str == null) {

    } else {
        int n = Integer.parseInt(str);
        int cnt = 0;
        for (int i = 1; i <= n; ++i) {
            cnt += i;
        }
        out.print("1 + 2 + ... + " + n + " = " + cnt);
    }
%>

</body>
</html>
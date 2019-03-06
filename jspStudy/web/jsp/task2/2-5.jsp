<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<table border="1">
    <%
        for (int i = 1; i < 9; ++i) {
            out.print("<tr>");
            for (int j = 1; j < 9; ++j) {
                if ((i + j) % 2 == 0) {
                    out.print("<td width=\"20\" height=\"20\" bgcolor=\"black\"></td>");
                } else {
                    out.print("<td width=\"20\" height=\"20\" bgcolor=\"white\"></td>");
                }
            }
            out.print("</tr>");
        }
    %>
</table>
</body>
</html>
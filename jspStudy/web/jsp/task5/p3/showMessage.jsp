<%@page import="java.util.StringTokenizer" %>
<%@page import="java.util.Vector" %>
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
    Vector v = (Vector) application.getAttribute("Mess");
    for (int i = 0; i < v.size(); i++) {
        String message = (String) v.elementAt(i);
        StringTokenizer fenxi = new StringTokenizer(message, "#");
        while (fenxi.hasMoreTokens()) {
            String str = fenxi.nextToken();
            //byte a[] = str.getBytes("utf-8");
            //str = new String(a);
            out.print("<BR>" + str);
        }
    }
%>

</body>
</html>
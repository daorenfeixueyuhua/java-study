<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    String rString = request.getParameter("radius");
    try {
        double r = Double.parseDouble(rString);
        double area = Math.PI * r * r;
        double length = Math.PI * r;
        session.setAttribute("r", r);
        session.setAttribute("area", area);
        session.setAttribute("length", length);
    } catch (Exception e) {
        String message = "请输入正确的数字";
        session.setAttribute("r", message);
    } finally {
        response.sendRedirect("./index.jsp");
    }
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<%

    String str = request.getParameter("boy");
    if (str == null) {
        str = "0";
    }
    int guessNumber = Integer.parseInt(str);
    int realNumber = (Integer) session.getAttribute("save");

    if (guessNumber == realNumber) {
        int n = (Integer) session.getAttribute("count");
        n++;
        session.setAttribute("count", n);
        response.sendRedirect("success.jsp");
    } else if (guessNumber > realNumber) {
        int n = (Integer) session.getAttribute("count");
        n++;
        session.setAttribute("count", n);
        response.sendRedirect("large.jsp");
    } else if (guessNumber < realNumber) {
        int n = (Integer) session.getAttribute("count");
        n++;
        session.setAttribute("count", n);
        response.sendRedirect("small.jsp");
    }
%>
</body>
</html>
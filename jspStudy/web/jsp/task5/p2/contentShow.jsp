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
    String str = request.getParameter("showType");
    if (str == null) {
        str = "0";
    } else {
        if (str.equals("0")) {
            response.setContentType("text/html;charset=utf-8");
        } else if (str.equals("1")) {
            response.setContentType("application/msword;charset=utf-8");
        } else {
            response.setContentType("application/x-msexcel;charset=utf-8");
        }
    }
%>
<jsp:include page="contentTypeData.txt" flush="true"></jsp:include>
</body>
</html>
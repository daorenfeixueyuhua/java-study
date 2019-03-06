<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<%
    class Crile {
        double r;
        double a;
        double l;

        void setR(double R) {
            this.r = R;
        }

        double getA() {
            return Math.PI * r * r;
        }

        double getL() {
            return Math.PI * 2 * r;
        }
    }
%>

请输入圆的半径：<br>
<form action="">
    <input name="r" type="text" value="${r}"> <input type="submit" value="送出">
</form>
<%

    String R = request.getParameter("r");
    if (R == null) {

    } else {
        Crile crile = new Crile();
        crile.setR(Float.parseFloat(R));

        out.print("圆的面积是： " + crile.getA() + "<br>");
        out.print("圆的周长是： " + crile.getL() + "<br>");
    }
%>

</body>
</html>
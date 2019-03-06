<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<h2>use jsp code</h2>
<%
    for (int i = 1; i <= 9; ++i) {
        for (int j = 1; j <= i; ++j) {
            out.print(j + "*" + i + "=" + i * j + " ");
        }
        out.print("<br>");
    }
%>
<hr>

<h2>use method</h2>
<%!
    String method() {
        String result = "";
        for (int i = 1; i <= 9; ++i) {
            for (int j = 1; j <= i; ++j) {
                result += j + "*" + i + "=" + i * j + " ";
            }
            result += "<br>";
        }
        return result;
    }
%>

<%
    String str = method();
    out.print(str);
%>
<hr>


<h2>use class</h2>

<%!
    class MyClass {
        public String method() {
            String result = "";
            for (int i = 1; i <= 9; ++i) {
                for (int j = 1; j <= i; ++j) {
                    result += j + "*" + i + "=" + i * j + " ";
                }
                result += "<br>";
            }
            return result;
        }
    }
%>

<%
    MyClass class1 = new MyClass();
    String str1 = class1.method();
    out.print(str1);
%>


</body>
</html>
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
<%!
    Vector v = new Vector();
    int i = 0;
    ServletContext application;

    synchronized void sendMessage(String s) {
        application = getServletContext();
        i++;
        v.add("NO." + i + ",<br>" + s);
        application.setAttribute("Mess", v);

    }
%>
<%
    String name = request.getParameter("peopleName");
    String title = request.getParameter("Title");
    String messages = request.getParameter("messages");
    if (name == null) {
        name = "guest" + (int) (Math.random() * 10000);
    }
    if (title == null) {
        title = "无标题";
    }
    if (messages == null) {
        messages = "无信息";
    }
    String s = "姓名:" + name + "#" + "标题:" + title + "#" + "内容:" + "<BR>" + messages;
    sendMessage(s);
    String info = "您的信息已经提交！";
    //info = new String(info.getBytes("utf-8"));
    out.println(info);
%>
<A HREF="Submit.jsp">back
</body>
</html>
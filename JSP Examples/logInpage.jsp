<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%
    String name = request.getParameter("uname");
    out.println("Username-"+name);
    %>
<br><br>
    <%
    String password = request.getParameter("upass");
    out.println("Password-"+password);
%>
<br><br>
<%
    String city = request.getParameter("City");
    out.println("City-"+city);
%>
<br><br>
<%
    String dob = request.getParameter("DOB");
    out.println("DOB:"+dob);
%>
<br><br>
<%
    String contact = request.getParameter("Contact");
    out.println("Contact No.-"+contact);
%>
</body>
</html>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Form 2</title>
</head>
<body>
<h1>Register Successfully</h1>
<%
    String newName = request.getParameter("NewName");
    String newPassword = request.getParameter("NewPassword");
    String newEmail = request.getParameter("NewEmail");
    String newCity = request.getParameter("NewCity");
    String newDOB = request.getParameter("NewDOB");
    String newContact = request.getParameter("NewContact");

    %>
<%
try {

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dem1","root","root");
Statement stmt=con.createStatement();
String qr=("insert into registrationform values ('"+newName+"','"+newPassword+"','"+newEmail+"','"+newCity+"','"+newDOB+"','"+newContact+"')");
stmt.executeUpdate(qr);
out.println("Data insert Successfully");

}catch (Exception e){
System.out.println(e);
}
%>
<h4>You have successfully Register.</h4>
<a href="LoginForm.jsp">Now click here to Login</a>

</body>
</html>
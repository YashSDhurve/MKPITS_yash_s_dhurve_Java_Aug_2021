<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="logInpage.jsp">
    Name &emsp;<input type="text" name="uname"><br><br>
    Password<input type="password" name="upass"><br><br>
 City <select name="City">
    <option>Nagpur</option>
    <option>Mumbai</option>
    <option>Pune</option>
    <option>Hydrabad</option>
     </select> <br><br>
    DOB<input type="date"name="DOB"><br><br>
    Contact No.<input type="text" name="Contact"><br><br>
    <input type="submit">
</form>
</body>
</html>
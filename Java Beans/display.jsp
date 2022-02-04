<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Display page</title>
</head>
<body>

<jsp:useBean id="user" class="com.example.javabeans.UserBean"></jsp:useBean>

<jsp:setProperty name="user" property="*"></jsp:setProperty>

<h3>Name :<jsp:getProperty name="user" property="name"/></h3>
<h3>Password :<jsp:getProperty name="user" property="password"/></h3>
<h3>City :<jsp:getProperty name="user" property="city"/></h3>
<h3>Mobile No. :<jsp:getProperty name="user" property="mobno"/></h3>

</body>
</html>
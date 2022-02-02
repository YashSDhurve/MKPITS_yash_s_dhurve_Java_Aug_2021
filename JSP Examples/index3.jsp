<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%
    int a=5,b=3;
    if(a>b){
%>
<font >a is greater</font>
<%
    }
    else{
 %>
<font >b is greater</font>
<%
    }
%>
</body>
</html>
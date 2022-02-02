<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%
    int a=5,b=3,c=9,d=a+b+c;
    out.println(d);
    if(d%2==0){
        out.println("result is an even number");
    }
    else{
        out.println("result is an odd number");
    }

%>
<%="Addition of abc="+d%>


</body>
</html>
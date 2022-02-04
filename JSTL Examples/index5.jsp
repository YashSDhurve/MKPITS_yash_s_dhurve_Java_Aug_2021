<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="y" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSTL</title>
</head>
<body>

<%--<%--%>
<%--    String n1 = request.getParameter("num1");--%>
<%--    String n2 = request.getParameter("num2");--%>
<%--%>--%>


<y:set var="n1" value="${param.num1}"   ></y:set>
<y:set var="n2" value="3" ></y:set>
<y:set var="n3" value="${n1+n2}" ></y:set>
<y:out value="${n3}"></y:out>



</body>
</html>
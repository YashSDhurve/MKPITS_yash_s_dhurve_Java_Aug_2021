<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="y" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSTL</title>
</head>
<body>

<y:set var="n1" value="34"></y:set>
<y:out value="${num1}"></y:out>

<y:if test="${n1%2==0}">
    <h4>n1 is an even number</h4>
</y:if>



</body>
</html>
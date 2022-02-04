<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="y" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSTL</title>
</head>
<body>

<y:set var="num1" value="34"></y:set>
<y:out value="${num1}"></y:out>

<y:if test="${num1>30}">
    <h4>Num1 is greater than 30</h4>
</y:if>

</body>
</html>
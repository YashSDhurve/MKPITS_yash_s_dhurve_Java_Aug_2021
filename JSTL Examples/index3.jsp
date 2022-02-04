<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="y" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSTL</title>
</head>
<body>

<y:forEach var="i" begin="1" end="10">
    <h3 align="center"><y:out value="${i}" ></y:out></h3>
</y:forEach>


</body>
</html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%
    String col[]={"red","blue","green","yellow","purple","black","pink","grey","lightgreen","orange"};
    for(int i=0;i<10;i++){
%>

<font color="<%=""+col[i]%>" size="10"> <%=+i%> </font><br>

<%
    }
%>
</body>
</html>
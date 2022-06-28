<%@ page import="java.util.Date"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Test server</title>
</head>
<body>

<%
Date date = new Date();
%>
<div>Current date is <%=date%> </div>



<form action="/login.do" method="post">
<p><font color="red">${errorMessage}</font></p>
Name: <input type="text" name="name"/> Password: <input type="password" name="password" value="enviar"/><input type="submit" name="submit" value="enviar"/>

</form>


</body>
</html>
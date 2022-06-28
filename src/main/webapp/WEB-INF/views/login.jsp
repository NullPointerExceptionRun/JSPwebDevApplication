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

<h1>Seja Bem vindo ${name} & password is ${password}</h1>

<form action="/login.do" method="POST">
Enter your name<input type="text" name="name"/> <input type="submit" value="enviar"/>

</form>


</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Page test To do</title>
</head>
<body>
<p>Welcome ${name}</p>
<p>page Todo JSP</p>
<div>
<ol>
<c:forEach items="${todos}" var="todo">
   <li>${todo.name}</li>
</c:forEach>
</ol>
</div>
</body>
</html>
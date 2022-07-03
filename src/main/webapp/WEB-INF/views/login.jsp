<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Todos</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
</head>

<body>

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Project JSP(legad)</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/todo.do">Todos</a></li>
			<li><a href="http://test-server.com">telegram</a></li>
		</ul>

		<ul class="nav navbar-nav ">
			<li><a href="/login.do">Login</a></li>
		</ul>

	</nav>
	<div class="container">
		<form action="/login.do" method="POST">
			<p>
				<font color="red">${errorMessage}</font>
			</p>
			Name : <input name="name" type="text" /> Password : <input
				name="password" type="password" /> <input type="submit" />
		</form>
	</div>
	<footer class="footer">
		<p>Project with goals about to learn JSP (Hercules - Developer
			backend Java)</p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>





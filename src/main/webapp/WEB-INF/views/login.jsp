<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>My First JSP</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/normalize.css">
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light wrapper">
		<a class="navbar-brand"
			href="https://in28minutes1.teachable.com/courses/enrolled/259228"
			target="_blank">in28Minutes</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="#">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="list-todo.do">Todos</a></li>
				<li class="nav-item active"><a class="nav-link" href="login.do">Login</a></li>
			</ul>
		</div>
	</nav>


	<h1>My First JSP</h1>
	<p class="wrapper errorMessage">${errorMessage}</p>
	<form class="wrapper" action="login.do" method="post">
		<label for="username">Enter your username:</label> <input type="text"
			name="username" id="username" required
			title="Please fill in your username." /> <label for="password">Enter
			your password:</label> <input type="password" name="password" id="password"
			required title="Please fill in your password" /> <input type="submit"
			value="Login" />
	</form>

	<footer class="footer">
		<div>footer content</div>
	</footer>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="webjars/jquery/3.3.1-2/jquery.slim.min.js"></script>
	<script src="webjars/popper.js/1.14.7/dist/umd/popper.min.js"></script>
	<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
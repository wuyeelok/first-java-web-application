<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.min.css">
<title>Login</title>

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

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a href="/kenneth/" class="navbar-brand">Brand</a>

		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="#">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="/kenneth/todo.do">Todos</a></li>
			<li class="nav-item"><a class="nav-link" href="http://www.in28minutes.com">In28Minutes</a></li>
		</ul>

		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/kenneth/login.do">Login</a></li>
		</ul>
	</nav>
	
	<div class="container">
		<h1>Yahoo!!!! From JSP The login name is ${loginName} and password is ${password}</h1>
	
		<form action="/kenneth/login.do" method="post">
			<label for="name">Enter your name: </label>
			<input id="name" type="text" name="name" placeholder="Enter your name" 
			required 
			oninvalid="this.setCustomValidity('Please your username')"
 			oninput="setCustomValidity('')"/>
			<br>
			<label for="password">Enter your password: </label>
			<input id="password" type="password" name="password" placeholder="Enter your password" 
			required
			oninvalid="this.setCustomValidity('Please your password')"
 			oninput="setCustomValidity('')"/>
			<br>
			<button type="submit">Submit Form</button>
		</form>
		
		<%
			if(request.getAttribute("errorMessage") != null) {
		%>
			<div>
				<p>${errorMessage}</p>
			</div>
		<%
			}
		%>
	</div>
	
	<footer class="footer">
		<p>footer content</p>
	</footer>
	
	<script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
    <script src="webjars/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>



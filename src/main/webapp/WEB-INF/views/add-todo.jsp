<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.min.css">
<title>Todo</title>

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
			<li class="nav-item"><a class="nav-link" href="/kenneth/list-todos.do">Todos</a></li>
			<li class="nav-item"><a class="nav-link" href="http://www.in28minutes.com">In28Minutes</a></li>
		</ul>

		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/kenneth/logut.do">Logout</a></li>
		</ul>
	</nav>
	
	<div class="container">
		<h1>Your New Action Item:</h1>		
		<form action="/kenneth/add-todo.do" method="post">
			<input type="text" name="todo" 
			required
			oninvalid="this.setCustomValidity('Please enter a todo')"
 			oninput="setCustomValidity('')"/>
			<button type="submit">Add</button>
		</form>
	</div>
	
	
	<footer class="footer">
		<p>footer content</p>
	</footer>
	
	<script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
    <script src="webjars/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.min.css">
<title>Todo</title>
</head>
<body>
	<h1>Welcome ${name}</h1>
	<p>Yours Todos are:</p>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.name}&nbsp;&nbsp;<a href="./delete-todo.do?todo=${todo.name}">Delete</a></li>
		</c:forEach>		
	</ol>
	
	<form action="/kenneth/todo.do" method="post">
		<input type="text" name="todo" required/>
		<button type="submit">Add</button>
	</form>
	
	<script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
    <script src="webjars/popper.js/1.14.3/popper.min.js"></script>
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo</title>
</head>
<body>
	<h1>Welcome ${name}</h1>
	<p>Yours Todos are:</p>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.name}</li>
		</c:forEach>		
	</ol>
	
	<form action="/kenneth/todo.do" method="post">
		<input type="text" name="todo" required/>
		<button type="submit">Add</button>
	</form>
</body>
</html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Welcome ${username}</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/normalize.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<h1>Welcome ${username}</h1>
	
	<div class="wrapper">
		<p>Your Todo's are:</p>
		<ol>
			<c:forEach items="${todos}" var="todo">
				<li>${todo.name} &nbsp;&nbsp;<a href="delete-todo.do?todo=${todo.name}">Delete</a></li>
			</c:forEach>
		</ol>	
	</div>
	<form class="wrapper" action ="todo.do" method="post">
		<label for="todo">Name of Todo:&nbsp;</label>
		<input id="todo" type="text" name="todo" required>
		<input type="submit" value="Add">
	</form>
</body>
</html>
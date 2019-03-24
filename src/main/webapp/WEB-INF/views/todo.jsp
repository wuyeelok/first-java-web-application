<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Welcome</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/normalize.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<p>Your Todo's are:</p>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.name}</li>
		</c:forEach>
	</ol>
</body>
</html>
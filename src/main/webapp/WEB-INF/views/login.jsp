<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>My First JSP</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/normalize.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<h1>My First JSP</h1>
	<form action="login.do" method="post">
		<label for="username">Enter your username:</label>
		<input type="text" name="username" id="username"  required title="Please fill in your username."/>
		<input type="submit" value="Login"/>
	</form>
	
</body>
</html>
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
	<p class="wrapper errorMessage">${errorMessage}</p>
	<form class="wrapper" action="login.do" method="post">
		<label for="username">Enter your username:</label>
		<input type="text" name="username" id="username" required title="Please fill in your username."/>
		<label for="password">Enter your password:</label>
		<input type="password" name="password" id="password" required title="Please fill in your password"/>
		<input type="submit" value="Login"/>
	</form>
	
</body>
</html>
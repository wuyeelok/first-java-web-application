<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoo!!!! From JSP</title>
</head>
<body>
	<h1>Yahoo!!!! From JSP The login name is ${loginName} and password is ${password}</h1>
	
	<form action="/kenneth/login.do">
		<label for="name">Enter your name: </label>
		<input id="name" type="text" name="name" placeholder="Enter your name"/>
		<br>
		<label for="password">Enter your password: </label>
		<input id="password" type="password" name="password" placeholder="Enter your password"/>
		<br>
		<button type="submit">Submit Form</button>
	</form>
</body>
</html>
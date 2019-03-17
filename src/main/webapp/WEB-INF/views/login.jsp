<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Yahoo from JSP</title>
</head>
<body>
	<h1>My First JSP</h1>
	<p>${name}&nbsp;<%=request.getAttribute("name") %></p>
</body>
</html>
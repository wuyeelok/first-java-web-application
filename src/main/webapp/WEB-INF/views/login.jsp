<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Yahoo from JSP</title>
</head>
<body>
	<%
		Date date = new Date();		
	%>
	<h1>My First JSP</h1>
	<p>${name}&nbsp;<%=request.getAttribute("name") %></p>
	<p>The date is <%=date%></p>
</body>
</html>
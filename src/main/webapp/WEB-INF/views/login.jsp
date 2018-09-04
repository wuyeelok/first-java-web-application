<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	
	<div class="container">
		<h1>Yahoo!!!! From JSP The login name is ${loginName} and password is ${password}</h1>
	
		<form action="/kenneth/login.do" method="post">
			<label for="name">Enter your name: </label>
			<input id="name" type="text" name="name" placeholder="Enter your name" 
			required 
			oninvalid="this.setCustomValidity('Please your username')"
 			oninput="setCustomValidity('')"/>
			<br>
			<label for="password">Enter your password: </label>
			<input id="password" type="password" name="password" placeholder="Enter your password" 
			required
			oninvalid="this.setCustomValidity('Please your password')"
 			oninput="setCustomValidity('')"/>
			<br>
			<button type="submit">Submit Form</button>
		</form>
		
		<%
			if(request.getAttribute("errorMessage") != null) {
		%>
			<div>
				<p>${errorMessage}</p>
			</div>
		<%
			}
		%>
	</div>
	
<%@ include file="../common/footer.jspf"%>



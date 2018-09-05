<%@include file="../common/header.jspf" %>

<h1>Login Page</h1>

<form action="/login.do" method="post">
	<fieldset>
		<label for="username">Username: &nbsp;</label>
		<input type="text" id="username" name="username" required/>
	</fieldset>
	<fieldset>
		<label for="password">Password: &nbsp;</label>
		<input type="password" id="password" name="password" required/>
	</fieldset>
	<button type="submit">Login</button>
</form>
<div>
<p>${errorMessage}</p>
</div>
   
<%@include file="../common/footer.jspf" %>  
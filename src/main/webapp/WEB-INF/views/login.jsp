<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>



<h1>My First JSP</h1>
<p class="wrapper errorMessage">${errorMessage}</p>
<form class="wrapper" action="login.do" method="post">
	<label for="username">Enter your username:</label> <input type="text"
		name="username" id="username" required
		title="Please fill in your username." /> <label for="password">Enter
		your password:</label> <input type="password" name="password" id="password"
		required title="Please fill in your password" /> <input type="submit"
		value="Login" />
</form>

<%@ include file="../common/footer.jspf"%>
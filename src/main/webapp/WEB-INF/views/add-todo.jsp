<%@include file="../common/header.jspf" %>
<%@include file="../common/nav.jspf" %>

<form action="/add-todo.do" method="post">
	<fieldset>
		<label for="title">Title: &nbsp;</label>
		<input type="text" id="title" name="title" required/>
	</fieldset>
	<fieldset>
		<label for="category">Category: &nbsp;</label>
		<input type="text" id="category" name="category" required/>
	</fieldset>
	<button type="submit">Add</button>
</form>

<%@include file="../common/footer.jspf" %>
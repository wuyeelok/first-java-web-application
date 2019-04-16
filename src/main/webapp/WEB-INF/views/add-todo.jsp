<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<h1>Add New Todo</h1>


<form class="wrapper" action="add-todo.do" method="post">
	<label for="todoName">Name of Todo:&nbsp;</label> <input id="todoName"
		type="text" name="todoName" required> <br /> <label
		for="todoName">Category of Todo:&nbsp;</label> <input
		id="todoCategory" type="text" name="todoCategory" required> <input
		type="submit" value="Add">
</form>

<%@ include file="../common/footer.jspf"%>

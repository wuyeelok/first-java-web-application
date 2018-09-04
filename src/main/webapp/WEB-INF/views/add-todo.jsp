<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	
	<div class="container">
		<h1>Your New Action Item:</h1>		
		<form action="/kenneth/add-todo.do" method="post">
			<fieldset class="form-group">
				<label for="todo">Todo:&nbsp;</label>
				<input class="form-control" id="todo" type="text" name="todo" 
				required
				oninvalid="this.setCustomValidity('Please enter a todo')"
	 			oninput="setCustomValidity('')"/>
 			</fieldset>
 			<fieldset class="form-group">
	 			<label for="category">Category:&nbsp;</label>
	 			<input class="form-control" id="category" type="text" name="category" 
				required
				oninvalid="this.setCustomValidity('Please enter a category')"
	 			oninput="setCustomValidity('')"/>
 			</fieldset>
			<button class="btn btn-success" type="submit">Add</button>
		</form>
	</div>
	
	
<%@ include file="../common/footer.jspf"%>
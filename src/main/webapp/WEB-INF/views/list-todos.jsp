<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	
	<div class="container">
		<h1>Welcome ${name}</h1>
		<p>Yours Todos are:</p>
		
		<table class="table table-striped">
			<thead>
				<tr>
					<td>Description</td>
					<td>Category</td>
					<td>Action</td>
				</tr>				
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.description}</td>
						<td>${todo.category.categoryName}</td>
						<td>Under Construction</td>
					</tr>
				</c:forEach>
			</tbody>		
		</table>
		
		
		
		<!-- <a class="btn btn-success" href="./add-todo.do">Add New Todo</a> -->
	</div>
	
<%@ include file="../common/footer.jspf"%>
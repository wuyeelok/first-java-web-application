<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	
	<div class="container">
		<h1>Welcome ${name}</h1>
		<p>Yours Todos are:</p>
		
		<table class="table table-striped">
			<thead>
				<th>Description</th>
				<th>Category</th>
				<th>Action</th>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.name}</td>
						<td>${todo.category}</td>
						<td><a class="btn btn-danger" href="./delete-todo.do?todo=${todo.name}&category=${todo.category}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>		
		</table>
		
		
		
		<a class="btn btn-success" href="./add-todo.do">Add New Todo</a>
	</div>
	
<%@ include file="../common/footer.jspf"%>
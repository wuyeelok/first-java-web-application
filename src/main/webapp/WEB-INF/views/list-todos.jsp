<%@include file="../common/header.jspf" %>
<%@include file="../common/nav.jspf" %>

<h1>List Todos Page</h1>

<table>
	<thead>
		<tr>
			<th>Title</th>
			<th>Category</th>
			<th>Action</th>
		</tr>		
	</thead>
	<tbody>
		<c:forEach items="${todos}" var="todo">
			<tr>
				<td>${todo.title}</td>
				<td>${todo.category}</td>
				<td><a href="/delete-todo.do?title=${todo.title}&category=${todo.category}">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<a href="/add-todo.do">Add Todo</a>

<%@include file="../common/footer.jspf" %>
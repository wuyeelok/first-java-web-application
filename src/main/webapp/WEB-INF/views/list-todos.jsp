<%@include file="../common/header.jspf" %>
<%@include file="../common/nav.jspf" %>

<h1>List Todos Page</h1>

<table>
	<thead>
		<tr>
			<th>Title</th>
			<th>Category</th>
		</tr>		
	</thead>
	<tbody>
		<c:forEach items="${todos}" var="todo">
			<tr>
				<td>${todo.title}</td>
				<td>${todo.category}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<a href="/add-todo.do">Add Todo</a>

<%@include file="../common/footer.jspf" %>
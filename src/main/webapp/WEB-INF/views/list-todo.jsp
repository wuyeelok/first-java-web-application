<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<h1>Welcome ${username}</h1>

<div class="wrapper">
	<p>Your Todo's are:</p>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.category}&nbsp;&nbsp;${todo.name}&nbsp;&nbsp;<a
				href="delete-todo.do?todoName=${todo.name}&todoCategory=${todo.category}">Delete</a></li>
		</c:forEach>
	</ol>
</div>
<div class="wrapper">
	<a href="add-todo.do">Add New Todo</a>
</div>

<%@ include file="../common/footer.jspf"%>

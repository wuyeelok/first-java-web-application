package com.kenneth.todo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns="/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/*
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {		
		
		String todo = request.getParameter("todo");
		String category = request.getParameter("category");
		Todo deleteTodo = new Todo(todo, category);
		
		todosService.deleteTodo(deleteTodo);
		
		response.sendRedirect("/kenneth/list-todos.do");
	}	
	*/
	
}

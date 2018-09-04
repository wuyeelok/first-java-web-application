package com.kenneth.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private TodoService todosService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {		
		
		String todo = request.getParameter("todo");
		String category = request.getParameter("category");
		Todo deleteTodo = new Todo(todo, category);
		
		todosService.deleteTodo(deleteTodo);
		
		response.sendRedirect("/kenneth/list-todos.do");
	}	
	
}

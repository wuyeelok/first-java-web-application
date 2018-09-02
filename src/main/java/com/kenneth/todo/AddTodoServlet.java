package com.kenneth.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/add-todo.do")
public class AddTodoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private TodoService todosService = new TodoService();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {		
		
		String todo = request.getParameter("todo");
		todosService.addTodo(new Todo(todo));
		
		response.sendRedirect("/kenneth/list-todo.do");
	}
	
	
}

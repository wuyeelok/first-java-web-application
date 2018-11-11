package com.kenneth.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/list-todos.do")
public class ListTodoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private TodoService todosService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// JDBC set up for creating DAO
		String databaseDriverClassName = getServletContext().getInitParameter("databaseDriverClassName");
		String url= getServletContext().getInitParameter("databaseURL");
		String uname = getServletContext().getInitParameter("databaseUsername");
		String pass = getServletContext().getInitParameter("databasePassword");
		
		
		
		request.setAttribute("todos", todosService.getTodos());
		request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
	}
	
}

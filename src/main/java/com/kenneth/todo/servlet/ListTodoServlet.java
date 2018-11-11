package com.kenneth.todo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kenneth.todo.dao.TodoDAO;

@WebServlet(urlPatterns="/list-todos.do")
public class ListTodoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// JDBC set up for creating DAO
		String databaseDriverClassName = getServletContext().getInitParameter("databaseDriverClassName");
		String databaseURL= getServletContext().getInitParameter("databaseURL");
		String databaseUsername = getServletContext().getInitParameter("databaseUsername");
		String databasePassword = getServletContext().getInitParameter("databasePassword");
		
		
		TodoDAO todoDao = new TodoDAO(databaseDriverClassName, databaseURL, databaseUsername, databasePassword);
		
		//	request.setAttribute("todos", todosService.getTodos());
		request.setAttribute("todos", todoDao.getTodos());
		request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
	}
	
}

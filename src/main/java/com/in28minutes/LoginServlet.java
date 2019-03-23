package com.in28minutes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserValidationService userValidationService = new UserValidationService();
	private TodoService todoService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(userValidationService.isUserValid(username, password)) {
			request.setAttribute("username", username);
			request.setAttribute("todos", todoService.retrieveTodos());
			request.setAttribute("password", password);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("errorMessage", "Invalid credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
		
	}
	
	

}

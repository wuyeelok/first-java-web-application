package com.kenneth.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp")
		.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(LoginService.validUser(username, password)) {
			request.getSession().setAttribute("username", username);
			response.sendRedirect("/list-todos.do");		
		} else {			
			String errorMessage = "Hi " + username + ", please use a valid password!";
			request.setAttribute("errorMessage", errorMessage);
			
			request.getRequestDispatcher("/WEB-INF/views/login.jsp")
			.forward(request, response);
		}		
		
	}

	
	
}

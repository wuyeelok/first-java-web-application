package com.kenneth.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kenneth.util.Util;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {		
		
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password;
		boolean pwValidation;
		try {
			password = Util.getPassword(request);
			pwValidation = true;
		} catch(Exception e) {
			password = "";
			pwValidation = false;
		}
		
		String name = Util.getName(request);
		
		
		if(pwValidation && LoginService.isUserValid(name, password)) {
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/kenneth/list-todos.do");
		} else {
			String errorMessage = "Please enter a valid password! " + name + ", password must be longer than or equal to 6 characters!";
			request.setAttribute("errorMessage", errorMessage);
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}	

	
	
}

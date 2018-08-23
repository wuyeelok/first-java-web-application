package com.kenneth;

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
		boolean validation;
		try {
			password = Util.getPassword(request);
			validation = true;
		} catch(Exception e) {
			password = "";
			validation = false;
		}
		
		request.setAttribute("name", Util.getName(request));
		request.setAttribute("password", password);
		
		if(validation) {
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("validation", "false");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}	

	
	
}

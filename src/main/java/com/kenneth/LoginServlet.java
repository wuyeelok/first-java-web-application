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
				
		String utilName = Util.getName(request); // get param name value
		request.setAttribute("utilNameForJSP", utilName);
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}	
		
	
}

package com.in28minutes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		
		out.println("<head>");
		out.println("<title>Yahoo!!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>My First Servlet</h1>");
		out.println("</body>");		
		out.println("</html>");
		
	}
	
	

}

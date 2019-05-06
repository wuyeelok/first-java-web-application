package com.in28minutes.login;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LoginService userValidationService = new LoginService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Map<String, String[]> params = request.getParameterMap();
		System.out.println("params Map:" + (params.toString()));
		for (Map.Entry<String, String[]> param : params.entrySet()) {
			String[] values = param.getValue();
			request.setAttribute("values1", values[0]);
			System.out.println("Before String.join(;) the value is: " + (values.toString()));
			String value = String.join(";", values);
			System.out.println("AFTER String.join(;) the value is: " + (value.toString()));
		}

		response.addCookie(new Cookie("name", "kenneht"));
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (userValidationService.isUserValid(username, password)) {
			request.getSession().setAttribute("username", username);
			response.sendRedirect("list-todo.do");
		} else {
			request.setAttribute("errorMessage", "Invalid credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}

package com.kenneth.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp")
		.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		String title = req.getParameter("title");
		String category = req.getParameter("category");
		
		Todo newTodo = new Todo(title, category);
		TodoService.addTodo(newTodo);
		
		res.sendRedirect("/list-todos.do");
	}
	
	

}

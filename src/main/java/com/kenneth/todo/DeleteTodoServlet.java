package com.kenneth.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		String title = req.getParameter("title");
		String category = req.getParameter("category");
		
		Todo deleteTodo = new Todo(title, category);
		
		TodoService.deleteTodo(deleteTodo);
		
		res.sendRedirect("/list-todos.do");
	}
	
	

}

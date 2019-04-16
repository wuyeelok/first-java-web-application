package com.in28minutes.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add-todo.do")
public class AddTodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TodoService todoService = new TodoService();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String newTodoName = request.getParameter("todoName");
		String newTodoCategory = request.getParameter("todoCategory");
		todoService.addTodo(new Todo(newTodoName, newTodoCategory));

		response.sendRedirect("list-todo.do");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
	}

}

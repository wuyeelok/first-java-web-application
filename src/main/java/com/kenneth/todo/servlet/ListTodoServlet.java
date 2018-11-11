package com.kenneth.todo.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/list-todos.do")
public class ListTodoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private TodoService todosService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// JDBC set up for creating DAO
		String databaseDriverClassName = getServletContext().getInitParameter("databaseDriverClassName");
		String databaseURL= getServletContext().getInitParameter("databaseURL");
		String databaseUsername = getServletContext().getInitParameter("databaseUsername");
		String databasePassword = getServletContext().getInitParameter("databasePassword");
		
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName(databaseDriverClassName);
			
			con = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
			
			st = con.prepareStatement("SELECT * FROM todo");
			
			rs = st.executeQuery();
			
			while(rs.next()) {
				
				// System.out.println(rs.getInt(1) + " : " + rs.getString(2));			
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {					
					e.printStackTrace();
				}				
			}
			
			if(st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		request.setAttribute("todos", todosService.getTodos());
		request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
	}
	
}

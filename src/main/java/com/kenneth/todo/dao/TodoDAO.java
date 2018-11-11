package com.kenneth.todo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kenneth.todo.model.Category;
import com.kenneth.todo.model.Todo;

public class TodoDAO {

	private String databaseDriverClassName;
	private String databaseURL;
	private String databaseUsername;
	private String databasePassword;
	
	public TodoDAO(String databaseDriverClassName, String databaseURL, String databaseUsername,
			String databasePassword) {
		this.databaseDriverClassName = databaseDriverClassName;
		this.databaseURL = databaseURL;
		this.databaseUsername = databaseUsername;
		this.databasePassword = databasePassword;
	}

	public List<Todo> getTodos() {
		
		List<Todo> todos = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		String query = "SELECT t.todoId, "
				+ "t.description, "
				+ "c.categoryId, "
				+ "c.categoryName, "
				+ "c.categoryDescription "
				+ "FROM todo AS t INNER JOIN category AS c "
				+ "ON t.categoryId = c.categoryId"; 
				
		
		try {
			Class.forName(databaseDriverClassName);
			
			con = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
			
			st = con.prepareStatement(query);
			
			rs = st.executeQuery();
			
			while(rs.next()) {
				
				Category category = new Category(
						rs.getInt("categoryId"), 
						rs.getString("categoryName"), 
						rs.getString("categoryDescription")
						);
				
				Todo todo = new Todo(
						rs.getInt("todoId"), 
						rs.getString("description"), 
						category
						);
				
				todos.add(todo);
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
		
		return todos;
	}
	
}

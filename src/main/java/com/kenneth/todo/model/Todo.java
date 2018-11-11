package com.kenneth.todo.model;

public class Todo {	// Table todo in school database 

	private int todoId;	// Primary Key
	private String description;
	private Category category;	// Foreign Table
	
	public Todo(int todoId, String description, Category category) {
		this.todoId = todoId;
		this.description = description;
		this.category = category;
	}

	public int getTodoId() {
		return todoId;
	}

	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}

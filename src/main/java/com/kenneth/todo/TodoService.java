package com.kenneth.todo;

import java.util.ArrayList;
import java.util.List;

import com.kenneth.todo.model.Category;
import com.kenneth.todo.model.Todo;

public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		Category study = new Category(1, "Study", null);
		todos.add(new Todo(1, "Learn JAVA", study));
	}

	public List<Todo> getTodos() {
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
	
}

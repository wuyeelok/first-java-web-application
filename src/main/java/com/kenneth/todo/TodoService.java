package com.kenneth.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo("Learn Web Application Developement", "Study"));
		todos.add(new Todo("Learn Spring MVC", "Study"));
		todos.add(new Todo("Learn Spring Rest Services", "Study"));
	}

	public static List<Todo> retrieveTodos() {
		return todos;
	}
	
	public static void addTodo(Todo todo) {
		todos.add(todo);
	}
}

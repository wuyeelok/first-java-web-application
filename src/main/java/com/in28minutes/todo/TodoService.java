package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();

	static {
		todos.add(new Todo("Learn Java Web Application", "Backend"));
		todos.add(new Todo("Learn Spring MVC", "Backend"));
		todos.add(new Todo("Learn Sass", "Frontend"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodo(Todo todo) {
		todos.add(todo);
	}

	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

}

package com.kenneth.todo;

import java.util.Arrays;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = Arrays.asList(
			new Todo("Learn Web Application Developement", "Study"),
			new Todo("Learn Spring MVC", "Study"),
			new Todo("Learn Spring Rest Services", "Study")
		);

	public static List<Todo> retrieveTodos() {
		return todos;
	}
	
}

package com.kenneth.todo;

public class Todo {

	private String name;

	public Todo(String name) {		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Todo [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && this.name.equals(((Todo) obj).getName())) {
			return true;
		} else {
			return false;
		}
	}
	
		
}

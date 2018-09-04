package com.kenneth.todo;

public class Todo {

	private String name;
	private String category;

	public Todo(String name, String category) {		
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Todo [name=" + name + ", category=" + category + "]";
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

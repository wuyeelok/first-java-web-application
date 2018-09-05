package com.kenneth.todo;

public class Todo {
	private String title;
	private String category;
	
	
	public Todo(String title, String category) {
		this.title = title;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null 
				&& this.title.equals(((Todo) obj).getTitle()) 
				&& this.category.equals(((Todo) obj).getCategory())) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Todo [title=" + title + ", category=" + category + "]";
	}	
	
}

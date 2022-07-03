package com.in28min.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Welcome to page"));
		todos.add(new Todo("Add new Items"));
		todos.add(new Todo("Release new features"));
	}
	
	public List<Todo> retrieveTodos(){
		return todos;
	}
	
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}

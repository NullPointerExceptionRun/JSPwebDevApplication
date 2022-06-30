package com.in28min.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("ela gosta de fisica e matematica"));
		todos.add(new Todo("As vezes fico apenas ouvindo sua voz, me acalma bastante"));
		todos.add(new Todo("Ela sempre ta certa tambem em tudo"));
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

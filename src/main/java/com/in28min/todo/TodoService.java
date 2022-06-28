package com.in28min.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn SpringBoot"));
		todos.add(new Todo("Best Courses to learn Java 2022"));
		todos.add(new Todo("Learn MVC"));
	}
	
	public List<Todo> retrieveTodos(){
		return todos;
	}
}

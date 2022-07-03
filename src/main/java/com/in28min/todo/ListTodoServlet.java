package com.in28min.todo;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28min.todo.TodoService;

import java.io.IOException;

//anotação para extender as classes do Javax.servlet.http
//urlPatterns é um atributo da anotação para padronizar as URLS
@WebServlet(urlPatterns = "/todo.do")
public class ListTodoServlet extends HttpServlet{
//As classes anotadas com @WebServlet precisam extends as classes javax.servlet.HTTP 	(HttpServlet)
	
	
	
//O contêiner da web inicializa um servlet após carregar e instanciar a classe de servlet e antes de entregar solicitações de clientes.
//Para customizar esse processo para permitir que o servlet leia dados de configuração persistentes, inicialize recursos e execute qualquer outra atividade única

		// Objeto login service
	  private TodoService todoService = new TodoService();

	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			  throws 
			   	ServletException, IOException{
		  request.setAttribute("todos", todoService.retrieveTodos());
		  request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	  }
	  
	  
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		  throws
		  	ServletException, IOException{
		  
		  	  String newTodo = request.getParameter("todo");
		  	  todoService.addTodo(new Todo(newTodo));
		  
		  	  response.sendRedirect("/todo.do");
		  	  
		  }
	  }
	


package com.in28min;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28min.todo.TodoService;

import java.io.IOException;
import java.io.PrintWriter;



//anotação para extender as classes do Javax.servlet.http
//urlPatterns é um atributo da anotação para padronizar as URLS
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
//As classes anotadas com @WebServlet precisam extends as classes javax.servlet.HTTP 	(HttpServlet)
	
	
	
//O contêiner da web inicializa um servlet após carregar e instanciar a classe de servlet e antes de entregar solicitações de clientes.
//Para customizar esse processo para permitir que o servlet leia dados de configuração persistentes, inicialize recursos e execute qualquer outra atividade única

	
	  private UserValidationService userValidationService = new UserValidationService();
	  private TodoService todoService = new TodoService();

	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			  throws 
			   	ServletException, IOException{
		  
		  request.setAttribute("name", request.getParameter("name"));
		  request.setAttribute("password", request.getParameter("password"));

		  request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	  }
	  
	  

	  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		  throws
		  	ServletException, IOException{

		  String name = request.getParameter("name");
		  String password = request.getParameter("password");

		  boolean isUserValid = userValidationService.isUserValid(name, password);
		  

		  if(isUserValid) {
		  request.setAttribute("name", name);
		  request.setAttribute("todos", todoService.retrieveTodos());
		  request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		  
		  } else {			 
			  request.setAttribute("errorMessage", "Invalid Crendetials");
			  request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	
		  }
		}
	}


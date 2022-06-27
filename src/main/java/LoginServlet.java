import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



//anotação para extender as classes do Javax.servlet.http
//urlPatterns é um atributo da anotação para padronizar as URLS
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
//As classes anotadas com @WebServlet precisam extends as classes javax.servlet.HTTP 	(HttpServlet)
	
	
	
//O contêiner da web inicializa um servlet após carregar e instanciar a classe de servlet e antes de entregar solicitações de clientes.
//Para customizar esse processo para permitir que o servlet leia dados de configuração persistentes, inicialize recursos e execute qualquer outra atividade única


	
	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			  throws 
			   	ServletException, IOException{
		  request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	  }
}

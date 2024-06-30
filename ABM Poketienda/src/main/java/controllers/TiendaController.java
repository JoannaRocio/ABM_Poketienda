package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import decorators.SessionDecorator;
import models.Articulo;
import repositories.EmpleadosRepoSingleton;
import repositories.interfaces.ArticuloRepo;
import repositories.interfaces.EmpleadoRepo;

@WebServlet("/tienda")  
public class TiendaController extends HttpServlet {
	
	private ArticuloRepo articulosRepo;
    

    public TiendaController() throws IOException {
    	this.articulosRepo = EmpleadosRepoSingleton.getInstance(); 
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Articulo> listArticulos = articulosRepo.getAllArticulo();
		
		request.setAttribute("listita", listArticulos);
		
		SessionDecorator sDec = new SessionDecorator(request.getSession());
		
		request.getRequestDispatcher("/views/clientes/tienda/index.jsp").forward(request, response);
	}

}

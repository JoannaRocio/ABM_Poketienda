package controllers;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import decorators.SessionDecorator;
import exceptions.EmpleadoDeslogueadoException;
import models.Empleado;
import repositories.EmpleadosRepoSingleton;
import repositories.interfaces.EmpleadoRepo;
import utils.CarritoBuilder;

@WebServlet("/crear")
public class CreacionProyectoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EmpleadoRepo empleadosRepo;
	
    public CreacionProyectoController() throws IOException {
    	this.empleadosRepo = EmpleadosRepoSingleton.getInstance(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		SessionDecorator sessionDec = new SessionDecorator(session);
		
		try {
			Empleado empleadoActualizado = sessionDec.getEmpleadoLogueadoActu(empleadosRepo);
			
			CarritoBuilder carrito = sessionDec.getCarrito();
			
			carrito.setLider(empleadoActualizado);
			
			request.setAttribute("carrito", carrito);
			
			request.getRequestDispatcher("/views/creacion-proyecto/index.jsp").forward(request, response);
		
		} catch (EmpleadoDeslogueadoException e) {
			response.sendRedirect("auth"); 
			return;
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accion = request.getParameter("accion");
		
		try {
			switch (accion) {
			case "modifpre" -> doModificarPresupuesto(request, response);
			default -> response.sendError(404);
			}
		}
		catch(EmpleadoDeslogueadoException e) {
			response.sendRedirect("auth");
		}
	}

	private void doModificarPresupuesto(HttpServletRequest request, HttpServletResponse response) throws IOException, EmpleadoDeslogueadoException {
		
		HttpSession session = request.getSession();
		
		SessionDecorator sessionDec = new SessionDecorator(session);
		
		CarritoBuilder carrito = sessionDec.getCarrito();
		
		String sImporte = request.getParameter("importe");
		
		double importe = Double.parseDouble(sImporte);
		
		carrito.setPresupuesto(importe);
		
		response.sendRedirect("crear");
	}
	
	

}

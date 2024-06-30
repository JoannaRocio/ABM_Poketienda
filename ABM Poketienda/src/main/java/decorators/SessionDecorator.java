package decorators;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import exceptions.EmpleadoDeslogueadoException;
import models.Cliente;
import models.Empleado;
import repositories.interfaces.EmpleadoRepo;
import utils.CarritoBuilder;

public class SessionDecorator {
	
	private HttpSession session;
	
	public static final String EMPLEADO = "empleado";
	public static final String CLIENTE = "cliente";
	public static final String CARRITO = "carrito";

	public SessionDecorator(HttpSession session) {
		this.session = session;
	}

	public HttpSession getSession() {
		return session;
	}
	
	public CarritoBuilder getCarrito() throws EmpleadoDeslogueadoException {
		
		Empleado empleLog = this.getEmpleadoLogueado();
		
		CarritoBuilder carrito = (CarritoBuilder) session.getAttribute(CARRITO);
		
		try {
			carrito = Optional.ofNullable(carrito).orElseThrow();
		}
		catch (NoSuchElementException e) {
			carrito = new CarritoBuilder(empleLog);
			session.setAttribute(CARRITO, carrito);
		}
		
		return carrito;
	}
	
	public Empleado getEmpleadoLogueadoActu(EmpleadoRepo repo) throws EmpleadoDeslogueadoException, IOException {
		Empleado empleadoLog = this.getEmpleadoLogueado();
		
		empleadoLog = repo.findById(empleadoLog.getId());
		
		session.setAttribute(EMPLEADO, empleadoLog);
		
		return empleadoLog;
	}
	
	public Empleado getEmpleadoLogueado() throws EmpleadoDeslogueadoException {
		Empleado empleadoLogNullable = (Empleado) session.getAttribute(EMPLEADO);

		Empleado empleadoLog = Optional.ofNullable(empleadoLogNullable)
				.orElseThrow(() -> new EmpleadoDeslogueadoException());
		
		return empleadoLog;
	}
	
	public void setEmpleadoLogueado(Empleado empleado) {
		session.setAttribute(EMPLEADO, empleado);
	}
	
	public void setClienteLogueado(Cliente cliente) {
		session.setAttribute(CLIENTE, cliente);
	}
}

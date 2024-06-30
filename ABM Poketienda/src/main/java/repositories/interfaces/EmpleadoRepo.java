package repositories.interfaces;

import java.io.IOException;
import java.util.List;

import models.Empleado;

public interface EmpleadoRepo {

	public List<Empleado> getAll() throws IOException;
	
	public Empleado findById(int id) throws IOException;
	
	public Empleado findByUsername(String username, String pass) throws IOException;
	
	public void insert(Empleado empleado) throws IOException;
	
	public void update(Empleado empleado) throws IOException;
	
	public void delete(int id) throws IOException;
}
 
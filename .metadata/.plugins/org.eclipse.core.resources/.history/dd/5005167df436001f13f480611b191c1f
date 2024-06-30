package repositories;

import java.util.ArrayList;
import java.util.List;

import models.Empleado;
import repositories.interfaces.EmpleadoRepo;

public class EmpleadosRepoSingleton implements EmpleadoRepo {
	
	private static EmpleadosRepoSingleton singleton;
	
	public static EmpleadosRepoSingleton getInstance() {
		if(singleton == null) {
			singleton = new EmpleadosRepoSingleton();
		}
		return singleton;
	}
	
	private List<Empleado> listaEmpleados;
	
	private EmpleadosRepoSingleton() {
		this.listaEmpleados = new ArrayList<Empleado>();
		Empleado empleado1 = new Empleado("Gabriel", "123" , 29, 925000);
		Empleado empleado2 = new Empleado("Sofia", "1234", 24, 965000);
		Empleado empleado3 = new Empleado("Carlos", "12345", 20, 985000);
		this.insert(empleado1);
		this.insert(empleado2);
		this.insert(empleado3);
	}

	@Override
	public List<Empleado> getAll() {
		
		return new ArrayList<Empleado>(this.listaEmpleados);
	}

	@Override
	public Empleado findById(int id) {

		return this.listaEmpleados.stream()
			.filter( (e) -> e.getId() == id )
			.findAny()
			.orElse(null);

	}
	
	@Override
	public Empleado findByUsername(String username, String contrasenia) {
		return this.listaEmpleados.stream()
			.filter( (e) -> e.getNombre().equals(username) && e.getContrasenia().equals(contrasenia))
			.findAny()
			.orElse(null);

	}
	
	@Override
	public void insert(Empleado empleado) {
		
		int ultimaId = this.listaEmpleados.stream()
				.map(Empleado::getId)
				.max(Integer::compare)
				.orElse(0);
		
		empleado.setId(ultimaId+1);
		
		this.listaEmpleados.add(empleado);
		
	}

	@Override
	public void update(Empleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		this.listaEmpleados.removeIf( (e) -> e.getId() == id);
		
	}

	
}

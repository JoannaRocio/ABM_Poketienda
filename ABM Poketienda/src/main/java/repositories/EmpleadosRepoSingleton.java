package repositories;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.Articulo;
import models.Cliente;
import models.Empleado;
import repositories.interfaces.ArticuloRepo;
import repositories.interfaces.ClienteRepo;
import repositories.interfaces.EmpleadoRepo;

public class EmpleadosRepoSingleton implements EmpleadoRepo, ClienteRepo, ArticuloRepo {
	
	private static EmpleadosRepoSingleton singleton;
	
	public static EmpleadosRepoSingleton getInstance() throws IOException {
		if(singleton == null) {
			singleton = new EmpleadosRepoSingleton();
		}
		return singleton;
	}
	
	private List<Empleado> listaEmpleados;
	
	private List<Cliente> listaClientes;
	
	private List<Articulo> listaArticulos;
	
	private EmpleadosRepoSingleton() throws IOException {
		this.listaEmpleados = new ArrayList<Empleado>();
		Empleado empleado1 = new Empleado("Gabriel", "123" , 29, 925000);
		Empleado empleado2 = new Empleado("Sofia", "1234", 24, 965000);
		Empleado empleado3 = new Empleado("Carlos", "12345", 20, 985000);
		this.insert(empleado1);
		this.insert(empleado2);
		this.insert(empleado3);
		
		this.listaClientes = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("Rodrigo", "123", 20000);
		Cliente cliente2 = new Cliente("Ezequiel", "1234", 30000);
		Cliente cliente3 = new Cliente("Joanna", "12345", 40000);
		Cliente cliente4 = new Cliente("Nahuel", "123456", 50000);
		this.insertCliente(cliente1);
		this.insertCliente(cliente2);
		this.insertCliente(cliente3);
		this.insertCliente(cliente4);
		
		this.listaArticulos = new ArrayList<Articulo>();
		Articulo articulo1 = new Articulo("Pokeball", 50, 100);
		Articulo articulo2 = new Articulo("Superball", 60, 90);
		Articulo articulo3 = new Articulo("Poción", 40, 80);
		Articulo articulo4 = new Articulo("Frutas", 30, 70);
		this.insertArticulo(articulo1);
		this.insertArticulo(articulo2);
		this.insertArticulo(articulo3);
		this.insertArticulo(articulo4);
	}
	
	
	// METODOS EMPLEADOS

	
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
	
	
	// METODOS CLIENTES 

	
	@Override
	public void insertCliente(Cliente cliente) throws IOException {
		int ultimaId = this.listaClientes.stream()
				.map(Cliente::getId)
				.max(Integer::compare)
				.orElse(0);
		
		cliente.setId(ultimaId+1);
		
		this.listaClientes.add(cliente);
		
	}

	@Override
	public void updateCliente(Cliente cliente) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> getAllCliente() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findByIdCliente(int id) throws IOException {
		return this.listaClientes.stream()
				.filter( (c) -> c.getId() == id )
				.findAny()
				.orElse(null);
	}

	@Override
	public Cliente findByUsernameCliente(String username, String contrasenia) {
		return this.listaClientes.stream()
				.filter( (e) -> e.getNombre().equals(username) && e.getContrasenia().equals(contrasenia))
				.findAny()
				.orElse(null);
	}

	@Override
	public void deleteCliente(int id) throws IOException {
		this.listaClientes.removeIf( (e) -> e.getId() == id);
		
	}


	@Override
	public List<Articulo> getAllArticulo() throws IOException {
		return new ArrayList<Articulo>(this.listaArticulos);
	}


	@Override
	public Articulo findByIdArticulo(int id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void insertArticulo(Articulo articulo) throws IOException {
		int ultimaId = this.listaArticulos.stream()
				.map(Articulo::getId)
				.max(Integer::compare)
				.orElse(0);
		
		articulo.setId(ultimaId+1);
		
		this.listaArticulos.add(articulo);
		
	}


	@Override
	public void updateArticulo(Articulo cliente) throws IOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteArticulo(int id) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	

	
}

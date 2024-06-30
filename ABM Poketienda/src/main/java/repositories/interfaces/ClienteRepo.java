package repositories.interfaces;

import java.io.IOException;
import java.util.List;

import models.Cliente;

public interface ClienteRepo {

	public List<Cliente> getAllCliente() throws IOException;
	
	public Cliente findByIdCliente(int id) throws IOException;
	
	public Cliente findByUsernameCliente(String username, String pass) throws IOException;
	
	public void insertCliente(Cliente cliente) throws IOException;
	
	public void updateCliente(Cliente cliente) throws IOException;
	
	public void deleteCliente(int id) throws IOException;

}

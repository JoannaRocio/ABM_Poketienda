package repositories.interfaces;

import java.io.IOException;
import java.util.List;

import models.Articulo;

public interface ArticuloRepo {

	public List<Articulo> getAllArticulo() throws IOException;
	
	public Articulo findByIdArticulo(int id) throws IOException;
	
	//public Cliente findByUsernameCliente(String username, String pass) throws IOException;
	
	public void insertArticulo(Articulo cliente) throws IOException;
	
	public void updateArticulo(Articulo cliente) throws IOException;
	
	public void deleteArticulo(int id) throws IOException;
}

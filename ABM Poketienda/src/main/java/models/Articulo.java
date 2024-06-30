package models;

public class Articulo {
	private int id;
	private String nombreArticulo;
	private double precio;
	private int cantidad;
	
	public Articulo() {
		super();
	} 
	
	
	public Articulo(String nombreArticulo, double precio, int cantidad) {
		super();
		this.nombreArticulo = nombreArticulo;
		this.precio = precio;
		this.cantidad = cantidad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombreArticulo() {
		return nombreArticulo;
	}


	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	} 
	
	
	
	
	
	
}

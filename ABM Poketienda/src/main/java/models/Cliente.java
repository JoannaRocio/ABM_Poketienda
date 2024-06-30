package models;

import java.time.LocalDate;

public class Cliente {
	private int id;
	private String nombre;
	private String contrasenia;
	private double saldo;
	
	public Cliente() {
		super();
	} 
	
	public Cliente(String nombre, String contrasenia, double saldo) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.saldo = saldo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}

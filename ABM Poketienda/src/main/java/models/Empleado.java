package models;

import java.time.LocalDate;

public class Empleado {
	private int id;
	private String nombre;
	private String contrasenia;
	private int edad;
	private double sueldo;
	private LocalDate fechaVueltaVacaciones;
	

	public Empleado() {
		super();
	} 


	public Empleado(String nombre, String contrasenia, int edad, double sueldo) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.edad = edad;
		this.sueldo = sueldo;
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public LocalDate getFechaVueltaVacaciones() {
		return fechaVueltaVacaciones;
	}


	public void setFechaVueltaVacaciones(LocalDate fechaVueltaVacaciones) {
		this.fechaVueltaVacaciones = fechaVueltaVacaciones;
	}

	

}

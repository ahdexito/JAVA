package ejer_evaluable_3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public abstract class Persona {
    
    protected String dni;
	protected String nombre;
	protected LocalDate fechaNacimiento;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public /*abstract*/ void MostrarInformacion() {
		
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Fecha nacimiento: " + this.fechaNacimiento.
				format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Persona() {
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
		
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
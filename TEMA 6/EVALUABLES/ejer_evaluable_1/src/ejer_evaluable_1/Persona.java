package ejer_evaluable_1;
import java.time.*;

public class Persona {
    
    protected String dni;
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected LocalDate fechaNacimiento;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void MostrarInformacion() {
		
		System.out.println("Apellido 1: " + this.apellido1);
		System.out.println("Apellido 2: " + this.apellido2);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Persona() {
	}

	public Persona(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
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

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
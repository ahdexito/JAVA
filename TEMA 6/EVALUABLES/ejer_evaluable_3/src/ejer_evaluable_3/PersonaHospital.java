package ejer_evaluable_3;

import java.time.*;

public abstract class PersonaHospital extends Persona {
    
    protected double sueldo;
	protected LocalDate fechaIncorporacion;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void EnviarTratamiento(String tipo) {
		
		switch (tipo) {
			case "Email":
				if (EnviarDatos.EnviarEmail()) System.out.println("");
				else System.out.println("");
				break;
				
			case "Wasap":
				if (EnviarDatos.EnviarWasap()) System.out.println("");
				else System.out.println("");
				break;
				
			case "Llamadas":
				if (EnviarDatos.EnviarLlamadas()) System.out.println("");
				else System.out.println("");
				break;
			default:
				System.out.println("");
				break;
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public PersonaHospital() {
	}

	public PersonaHospital(double sueldo, LocalDate fechaIncorporacion, String dni, String nombre, LocalDate fechaNacimiento) {
		super(dni, nombre, fechaNacimiento);
		this.sueldo = sueldo;
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public LocalDate getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
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
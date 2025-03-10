package ejer_evaluable_3;

import java.time.*;

public abstract class PersonalHospital extends Persona {
    
    protected double sueldo;
	protected LocalDate fechaIncorporacion;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void EnviarTratamiento(String tipo) {
		
		// LOS MÉTODOS DEVUELVEN SIEMPRE 'TRUE' PERO NO SE HACE NADA CON ESE VALOR //
		switch (tipo) {
			case "Email":
				EnviarDatos.EnviarEmail();
				break;
				
			case "WhatsApp":
				EnviarDatos.EnviarWhatsApp();
				break;
				
			case "Llamada":
				EnviarDatos.EnviarLlamada();
				break;
				
			default:
				System.out.println(ROJO + "EL TRATAMIENTO NO PUEDE SER ENVIADO VÍA (" + tipo + ")" + RESET);
				break;
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public PersonalHospital() {
	}

	public PersonalHospital(double sueldo, LocalDate fechaIncorporacion, String dni, String nombre, LocalDate fechaNacimiento) {
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
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
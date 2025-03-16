package ejer_evaluable_3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Paciente extends Persona {
    
    private boolean ingresado;
	private LocalDate fechaAlta;
	private String habitacion;
	private Consulta[] consultas;
	
	public Paciente() {
	}

	public Paciente(boolean ingresado, LocalDate fechaAlta, String habitacion, Consulta[] consultas, String dni, String nombre, LocalDate fechaNacimiento) {
		super(dni, nombre, fechaNacimiento);
		this.ingresado = ingresado;
		this.fechaAlta = fechaAlta;
		this.habitacion = habitacion;
		this.consultas = new Consulta[10];
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void MostrarInformacion() {
		
		System.out.println(CIAN + "DNI: " + RESET + this.dni);
		System.out.println(CIAN + "Nombre: " + RESET + this.nombre);
		System.out.println(CIAN + "Fecha nacimiento: " + RESET + this.fechaNacimiento.
				format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		if (this.ingresado) System.out.println(CIAN + "Ingresado:" + RESET + " Sí");
			else System.out.println(CIAN + "Ingresado:" + RESET + " No");
		System.out.println(CIAN + "Fecha de alta: " + RESET + this.fechaAlta.
				format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(CIAN + "Habitación: " + RESET + this.habitacion);
		
		int numeroConsulta = 1;
		for (int i = 0; i < consultas.length; i++) {
			
			if (this.consultas[i] != null) {
				System.out.println(CIAN + "\nConsulta " + numeroConsulta + ":" + RESET);
				System.out.println(CIAN + " - Tipo de consulta: " + RESET + this.consultas[i].getTipoConsulta());
				System.out.println(CIAN + " - Motivo: " + RESET + this.consultas[i].getMotivo());
				System.out.println(CIAN + " - Personal que atendió: " + RESET + this.consultas[i].getPersonalHospital().getNombre());
				numeroConsulta++;
			}
		}
		
		System.out.println("\n" + AMARILLO + "/ / / / / / / / / / / / / / / / / / / / / / / /" + RESET);
	}
	 
	public boolean NuevaConsulta(String motivo, PersonalHospital personalHospital, TipoConsulta tipoConsulta) {
		
		Consulta consulta = new Consulta(motivo, personalHospital, tipoConsulta);
		EnviarDatos.EnviarEmail();
		
		for (int i = 0; i < this.consultas.length; i++) {
			
			if (this.consultas[i] == null) {
				
				this.consultas[i] = consulta;
				return true;
			}
		}
		return false;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public boolean isIngresado() {
		return ingresado;
	}

	public void setIngresado(boolean ingresado) {
		this.ingresado = ingresado;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}

	public Consulta[] getConsultas() {
		return consultas;
	}

	public void setConsultas(Consulta[] consultas) {
		this.consultas = consultas;
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
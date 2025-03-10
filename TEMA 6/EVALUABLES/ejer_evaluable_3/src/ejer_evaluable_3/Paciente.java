package ejer_evaluable_3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Paciente extends Persona {
    
    private boolean ingresado;
	private LocalDate fechaAlta;
	private String habitacion;
	private Consulta[] consultas;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void MostrarInformacion() {
		
		System.out.println("DNI: " + this.dni);
		
		System.out.println("Nombre: " + this.nombre);
		
		System.out.println("Fecha nacimiento: " + this.fechaNacimiento.
				format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		if (this.ingresado) System.out.println("Ingresado: sí");
			else System.out.println("Ingresado: no");
		
		System.out.println("Fecha de alta: " + this.fechaAlta.
				format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Habitación: " + this.habitacion);
		
		for (int i = 0; i < consultas.length; i++) {
			int numeroConsulta = 1;
			
			if (this.consultas[i] != null) {
				System.out.println("\nCONSULTA " + numeroConsulta);
				System.out.println(" - Tipo de consulta: " + this.consultas[i].getTipoConsulta());
				System.out.println(" - Motivo: " + this.consultas[i].getMotivo());
			}
		}
	}
	 
	public boolean NuevaConsulta(String motivo, PersonalHospital personalHospital, int tipoConsulta) {
		
		Consulta consulta = new Consulta(motivo, personalHospital, TipoConsulta.values()[tipoConsulta]);
		return false;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public Paciente() {
	}

	public Paciente(boolean ingresado, LocalDate fechaAlta, String habitacion, Consulta[] consultas, String dni, String nombre, LocalDate fechaNacimiento) {
		super(dni, nombre, fechaNacimiento);
		this.ingresado = ingresado;
		this.fechaAlta = fechaAlta;
		this.habitacion = habitacion;
		this.consultas = consultas;
	}

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
}
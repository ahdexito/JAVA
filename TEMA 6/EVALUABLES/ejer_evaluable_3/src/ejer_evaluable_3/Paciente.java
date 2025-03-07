package ejer_evaluable_3;

import java.time.*;

public class Paciente extends Persona {
    
    private boolean ingresado;
	private LocalDate fechaAlta;
	private String habitacion;
	private Consulta[] consultas;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean NuevaConsulta() {
		
		for (int i = 0; i < consultas.length; i++) {
			
			
		}
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
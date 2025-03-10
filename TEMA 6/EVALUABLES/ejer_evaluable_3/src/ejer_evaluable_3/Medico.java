package ejer_evaluable_3;

import java.time.LocalDate;

enum Especialidad {
	Endocrino, Anestesista, Traumatólogo, MedicinaGeneral
}

public class Medico extends PersonalHospital {
    
    private Especialidad especialidad;
	private int diasPermiso = 0;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean HacerCirugia(Paciente paciente) {
		
		return false;
	}
	
	public void HacerGuardia(int guardias) {
		
		this.diasPermiso += guardias;
		this.sueldo += (guardias * 100);
	}
	
	public void HacerVisita(Paciente paciente) {
		
		
	}
	
	public void PuedeJubilarse() {
		
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Medico() {
	}

	public Medico(Especialidad especialidad, int diasPermiso, double sueldo, LocalDate fechaIncorporacion, String dni, String nombre, LocalDate fechaNacimiento) {
		super(sueldo, fechaIncorporacion, dni, nombre, fechaNacimiento);
		this.especialidad = especialidad;
		this.diasPermiso = diasPermiso;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public int getDiasPermiso() {
		return diasPermiso;
	}

	public void setDiasPermiso(int diasPermiso) {
		this.diasPermiso = diasPermiso;
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
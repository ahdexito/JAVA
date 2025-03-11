package ejer_evaluable_3;

import java.time.LocalDate;

enum Especialidad {
	Endocrino, Anestesista, Traumatólogo, MedicinaGeneral
}

public class Medico extends PersonalHospital {
    
    private Especialidad especialidad;
	private int diasPermiso = 0;

	public Medico() {
	}
	
	public Medico(Especialidad especialidad, int diasPermiso, double sueldo, LocalDate fechaIncorporacion, int numGuardias, String dni, String nombre, LocalDate fechaNacimiento) {
		super(sueldo, fechaIncorporacion, numGuardias, dni, nombre, fechaNacimiento);
		this.especialidad = especialidad;
		this.diasPermiso = diasPermiso;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public boolean HacerCirugia(Paciente paciente) {
		
		return false;
	}
	
	@Override
	public void MostrarInformacion() {
		
		
	}
	
	@Override
	public void HacerGuardia(int numGuardias) {
		
		
	}
	
	@Override
	public void HacerVisita(Paciente paciente) {
		
		
	}
	
	@Override
	public boolean PuedeJubilarse() {
		
		return false;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
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

	public int getNumGuardias() {
		return numGuardias;
	}

	public void setNumGuardias(int numGuardias) {
		this.numGuardias = numGuardias;
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
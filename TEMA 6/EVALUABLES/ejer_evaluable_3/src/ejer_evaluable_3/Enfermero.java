package ejer_evaluable_3;

import java.time.LocalDate;

public class Enfermero extends PersonalHospital {
    
    private int diasDescanso;
	private int numeroPlanta;

	public Enfermero() {
	}

	public Enfermero(int diasDescanso, int numeroPlanta, double sueldo, LocalDate fechaIncorporacion, int numGuardias, String dni, String nombre, LocalDate fechaNacimiento) {
		super(sueldo, fechaIncorporacion, numGuardias, dni, nombre, fechaNacimiento);
		this.diasDescanso = diasDescanso;
		this.numeroPlanta = numeroPlanta;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
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

	public int getDiasDescanso() {
		return diasDescanso;
	}

	public void setDiasDescanso(int diasDescanso) {
		this.diasDescanso = diasDescanso;
	}

	public int getNumeroPlanta() {
		return numeroPlanta;
	}

	public void setNumeroPlanta(int numeroPlanta) {
		this.numeroPlanta = numeroPlanta;
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
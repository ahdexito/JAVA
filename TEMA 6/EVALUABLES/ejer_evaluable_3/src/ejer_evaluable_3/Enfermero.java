package ejer_evaluable_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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
		
		System.out.println(CIAN + "DNI: " + RESET + this.dni);
		System.out.println(CIAN + "Nombre: " + RESET + this.nombre);
		System.out.println(CIAN + "Fecha nacimiento: " + RESET + this.fechaNacimiento.
				format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(CIAN + "Sueldo: " + RESET + this.sueldo);
		System.out.println(CIAN + "Fecha incorporación: " + RESET + this.fechaIncorporacion.
				format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(CIAN + "Número de guardias: " + RESET + this.numGuardias);
		System.out.println(CIAN + "Días de descanso: " + RESET + this.diasDescanso);
		System.out.println(CIAN + "Número de planta: " + RESET + this.numeroPlanta);
		System.out.println("\n" + AMARILLO + "/ / / / / / / / / / / / / / / / / / / / / / / /" + RESET);
	}
	
	@Override
	public void HacerGuardia(int numGuardias) {
		
		this.diasDescanso += numGuardias * 2;
	}
	
	@Override
	public void HacerVisita(Paciente paciente) {
		
		int numConsultas = paciente.getConsultas().length;
		
		for (int i = 0; i < numConsultas; i++) {
			
			if (paciente.getConsultas()[i].getPersonalHospital().getDni().equals(this.dni)) {
			
				System.out.println("La próxima visita será dentro de 2 días");
				break;
			}
			
			else {
				System.out.println("El paciente pertence a otro enfermero");
				break;
			}
		}
	}
	
	@Override
	public boolean PuedeJubilarse() {
		
		LocalDate hoy = LocalDate.now();
		
		int anyosDiferencia = (Period.between(this.fechaIncorporacion, hoy)).getYears();
		
		if (anyosDiferencia > 67) return true;
		
		else return false;
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
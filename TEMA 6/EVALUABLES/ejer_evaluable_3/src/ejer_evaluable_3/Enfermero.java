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
		this.numGuardias += numGuardias;
	}
	
	@Override
	public void HacerVisita(Paciente paciente) {
		
		int numConsultas = paciente.getConsultas().length;
		boolean tieneConsulta = false;
		
		for (int i = 0; i < numConsultas; i++) {
			
			if (paciente.getConsultas()[i] != null) {
				
				if (paciente.getConsultas()[i].getPersonalHospital().getDni().equals(this.dni)) {

					System.out.println(VERDE + "LA PRÓXIMA VISITA SERÁ DENTRO DE 2 DÍAS" + RESET);
					tieneConsulta = true;
					break;
				}
			}
		}
		if (!tieneConsulta) System.out.println(ROJO + "EL PACIENTE PERTENECE A OTRO ENFERMERO" + RESET);
	}
	
	@Override
	public boolean PuedeJubilarse() {
		
		LocalDate hoy = LocalDate.now();
		
		int anyosDiferencia = (Period.between(this.fechaIncorporacion, hoy)).getYears();
		
		System.out.println(CIAN + " - Años trabajados: " + RESET + anyosDiferencia);
		
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
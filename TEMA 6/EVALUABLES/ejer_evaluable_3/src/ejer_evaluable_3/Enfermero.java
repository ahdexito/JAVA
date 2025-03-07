package ejer_evaluable_3;

import java.time.LocalDate;

public class Enfermero extends PersonalHospital {
    
    private int diasDescanso;
	private int numeroPlanta;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void HacerGuardia() {
		
		
	}
	
	public void HacerVisita(Paciente paciente) {
		
		
	}
	
	public void PuedeJubilarse() {
		
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Enfermero() {
	}

	public Enfermero(int diasDescanso, int numeroPlanta, double sueldo, LocalDate fechaIncorporacion, String dni, String nombre, LocalDate fechaNacimiento) {
		super(sueldo, fechaIncorporacion, dni, nombre, fechaNacimiento);
		this.diasDescanso = diasDescanso;
		this.numeroPlanta = numeroPlanta;
	}
}
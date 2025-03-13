package ejer_evaluable_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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
		
		int numConsultas = paciente.getConsultas().length;
		
		for (int i = 0; i < numConsultas; i++) {
			
			if (paciente.getConsultas()[i].getTipoConsulta() == TipoConsulta.Cirugia) {
				
				return true;
			}
		}
		return false;
	}
	
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
		System.out.println(CIAN + "Especialidad: " + RESET + this.especialidad);
		System.out.println(CIAN + "Días de permiso: " + RESET + this.diasPermiso);
	}
	
	@Override
	public void HacerGuardia(int numGuardias) {
		
		this.sueldo += numGuardias * 100;
		this.diasPermiso += numGuardias;
	}
	
	@Override
	public void HacerVisita(Paciente paciente) {
		
		int numConsultas = paciente.getConsultas().length;
		
		for (int i = 0; i < numConsultas; i++) {
			
			if (paciente.getConsultas()[i].getPersonalHospital().getDni().equals(this.dni)) {
			
				System.out.println("La próxima visita será dentro de 5 días");
				break;
			}
			
			else {
				System.out.println("El paciente pertence a otro médico");
				break;
			}
		}
	}
	
	@Override
	public boolean PuedeJubilarse() {
		
		LocalDate hoy = LocalDate.now();
		
		int anyosDiferencia = (Period.between(this.fechaIncorporacion, hoy)).getYears();
		
		if (anyosDiferencia > 65 && this.especialidad == Especialidad.Anestesista) return true;
		
		else return false;
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
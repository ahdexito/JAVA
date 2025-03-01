package ejer_evaluable_1;

import java.time.LocalDate;

public class Profesor extends Persona {
    
    protected float sueldoBruto;
	protected Materia materia;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public float SueldoNeto(double retencion) {
		return this.sueldoBruto - (this.sueldoBruto * (float)retencion);
	}
	
	public void MostrarInformacion(double retencion) {
		MostrarInformacion();
		System.out.println("Materia: " + this.materia);
		System.out.println("Sueldo neto: " + SueldoNeto(retencion));
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Profesor() {
	}

	public Profesor(float sueldoBruto, Materia materia, String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
		super(dni, nombre, apellido1, apellido2, fechaNacimiento);
		this.sueldoBruto = sueldoBruto;
		this.materia = materia;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public float getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
}
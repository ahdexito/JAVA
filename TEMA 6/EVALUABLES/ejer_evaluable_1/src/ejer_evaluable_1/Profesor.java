package ejer_evaluable_1;

import java.time.LocalDate;

public class Profesor extends Persona {
    
    protected float sueldoBruto;
	protected Materia materia;
	protected double retencion;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public float SueldoNeto() {
		return this.sueldoBruto - (this.sueldoBruto * (float)this.retencion);
	}
	
	@Override
	public void MostrarInformacion() {
		
		super.MostrarInformacion();
		
		System.out.println("Materia: " + this.materia);
		System.out.println("Sueldo neto: " + SueldoNeto());
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Profesor() {
	}

	public Profesor(float sueldoBruto, Materia materia, double retencion, String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
		super(dni, nombre, apellido1, apellido2, fechaNacimiento);
		this.sueldoBruto = sueldoBruto;
		this.materia = materia;
		this.retencion = retencion;
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

	public double getRetencion() {
		return retencion;
	}

	public void setRetencion(double retencion) {
		this.retencion = retencion;
	}
}
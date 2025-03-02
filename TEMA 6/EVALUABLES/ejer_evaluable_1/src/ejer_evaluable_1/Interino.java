package ejer_evaluable_1;

import java.time.LocalDate;

public class Interino extends Profesor {
    
    private int tiempoContrato;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public void MostrarInformacion() {
		
		System.out.println(CIAN + "### INTERINO ###" + RESET);
		
		super.MostrarInformacion();
		
		System.out.println("Tiempo de contrato: " + CIAN + this.tiempoContrato + RESET + " meses\n");
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Interino() {
	}

	public Interino(int tiempoContrato, float sueldoBruto, Materia materia, double retencion, String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
		super(sueldoBruto, materia, retencion, dni, nombre, apellido1, apellido2, fechaNacimiento);
		this.tiempoContrato = tiempoContrato;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int getTiempoContrato() {
		return tiempoContrato;
	}

	public void setTiempoContrato(int tiempoContrato) {
		this.tiempoContrato = tiempoContrato;
	}

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

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
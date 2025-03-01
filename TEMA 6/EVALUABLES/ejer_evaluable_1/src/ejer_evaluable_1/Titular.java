package ejer_evaluable_1;
import java.time.*;

public class Titular extends Profesor {
    
    private LocalDate fechaIncorporacion;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public float SueldoNeto(double retencion) {

		// OBTENER DIFERENCIA DE AÑOS DESDE INCORPORACIÓN HASTA HOY
		LocalDate hoy = LocalDate.now();
		Period difencia = Period.between(this.fechaIncorporacion, hoy);
		int anyosDiferencia = difencia.getYears();

		// SUMAR A SUELDO BRUTO EL PLUS POR TRIENIO TRABAJADO
		float sueldoBrutoPlus = this.sueldoBruto + (100 * (int) (anyosDiferencia / 3));

		// A SUELDO BRUTO CON PLUS RESTARLE PORCENTAJE DE RETENCIÓN
		return sueldoBrutoPlus - (sueldoBrutoPlus * (float) retencion);
	}
	
	public void MostrarInformacion(double retencion) {
		MostrarInformacion();
		System.out.println("Materia: " + this.materia);
		System.out.println("Sueldo neto: " + this.SueldoNeto(retencion));
		
		var hoy = LocalDate.now();
		Period tiempoContrato = Period.between(this.fechaIncorporacion, hoy);
		System.out.println("Tiempo de contrato: " +
			tiempoContrato.getYears() + " años, " +
			tiempoContrato.getMonths() + " meses y " +
			tiempoContrato.getDays() + " días");
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Titular() {
	}

	public Titular(LocalDate fechaIncorporacion, float sueldoBruto, Materia materia, String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
		super(sueldoBruto, materia, dni, nombre, apellido1, apellido2, fechaNacimiento);
		this.fechaIncorporacion = fechaIncorporacion;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public LocalDate getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
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
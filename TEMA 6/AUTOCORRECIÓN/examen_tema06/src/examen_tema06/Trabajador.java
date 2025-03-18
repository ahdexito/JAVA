package examen_tema06;

public abstract class Trabajador implements IPersona {
    
    protected String dni;
	protected String nombre;
	protected double sueldo;
	protected boolean esBaja = false;
	
	// CONSTRUCTOR POR DEFECTO //
	public Trabajador() {
		super();
	}
	
	// CONSTRUCTOR SOBRECARGADO //
	public Trabajador(String dni, String nombre, double sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// FUNCIONES //
	
	public void SancionSueldo(double cantidad) {
		
		this.sueldo -= cantidad;
	}
	
	public abstract double ObtenerSueldoConComplemento();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// SETTERS Y GETTERS //
	 
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

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isEsBaja() {
		return esBaja;
	}

	public void setEsBaja(boolean esBaja) {
		this.esBaja = esBaja;
	}
}
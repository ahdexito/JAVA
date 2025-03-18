package examen_tema06;

public class Administrativo extends Trabajador {
    
    private double complemento;
	private Departamento departamento;
	
	// CONSTRUCTOR POR DEFECTO //
	private Administrativo() {
	}
	
	// CONSTRUCTOR SOBRECARGADO //
	public Administrativo(double complemento, Departamento departamento, String dni, String nombre, double sueldo) {
		super(dni, nombre, sueldo);
		this.complemento = complemento;
		this.departamento = departamento;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// FUNCIONES //
	
	@Override
	public double ObtenerSueldoConComplemento() {
		
		double resultado = this.sueldo + this.complemento;
		
		return resultado + (resultado * 0.2);
	}

	@Override
	public void MostrarInformacion() {
		
		System.out.println("\n" + CIAN
				+ " - Tipo de trabajador: " + RESET + "Administrativo" + "\n" + CIAN
				+ " - Nombre: " + RESET + this.nombre + "\n" + CIAN
				+ " - Sueldo: " + RESET + this.sueldo + "€" + "\n" + CIAN
				+ " - Complemento: " + RESET + this.complemento + "€" + "\n" + CIAN
				+ " - Lugar de trabajo: " + RESET + this.departamento);
	}

	@Override
	public boolean PedirBaja() {
		
		if (this.esBaja) {
			
			System.out.println("\n" + ROJO
					+ "El trabajador ya estaba dado de baja" + RESET);
			
			return false;
		}
		
		else if (this.departamento.equals(departamento.RRHH)) return true;
		
		else {
			
			System.out.println("\n" + ROJO
					+ "El trabajado no puede pedir baja si no trabaja en RRHH" + RESET);
			
			System.out.println("\n" + ROJO
					+ "Se ha aplicado una sanción de 75€" + RESET);
			
			SancionSueldo(75);
			return false;
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// SETTERS Y GETTERS //
	
	public double getComplemento() {
		return complemento;
	}

	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
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
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
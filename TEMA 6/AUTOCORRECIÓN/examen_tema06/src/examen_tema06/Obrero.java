package examen_tema06;

public class Obrero extends Trabajador {
    
    private static double complemento;
	private LugarTrabajo lugarTrabajo;

	// CONSTRUCTOR POR DEFECTO //
	private Obrero() {
	}

	// CONSTRUCTOR SOBRECARGADO //
	public Obrero(double complemento, LugarTrabajo lugarTrabajo, String dni, String nombre, double sueldo) {
		super(dni, nombre, sueldo);
		this.lugarTrabajo = lugarTrabajo;
		this.complemento = complemento;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// FUNCIONES //
	
	@Override
	public double ObtenerSueldoConComplemento() {
		
		double resultado = this.sueldo + this.complemento;
		
		return resultado + (resultado * 0.15);
	}

	@Override
	public void MostrarInformacion() {
		
		System.out.println("\n" + CIAN
				+ " - Tipo de trabajador: " + RESET + "Obrero" + "\n" + CIAN
				+ " - Nombre: " + RESET + this.nombre + "\n" + CIAN
				+ " - Sueldo: " + RESET + this.sueldo + "€" + "\n" + CIAN
				+ " - Complemento: " + RESET + this.complemento + "€" + "\n" + CIAN
				+ " - Lugar de trabajo: " + RESET + this.lugarTrabajo);
	}

	@Override
	public boolean PedirBaja() {
		
		if (this.esBaja) {
			
			System.out.println("\n" + ROJO
					+ "El trabajador ya estaba dado de baja" + RESET);
			
			return false;
		}
		
		else if (this.lugarTrabajo.equals(lugarTrabajo.Almacen)) return true;
		
		else {
			
			System.out.println("\n" + ROJO
					+ "El trabajado no puede pedir baja si no trabaja en almacén" + RESET);
			
			System.out.println("\n" + ROJO
					+ "Se ha aplicado una sanción de 25€" + RESET);
			
			SancionSueldo(25);
			return false;
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// SETTERS Y GETTERS //
	
	public static double getComplemento() {
		return complemento;
	}

	public static void setComplemento(double complemento) {
		Obrero.complemento = complemento;
	}

	public LugarTrabajo getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(LugarTrabajo lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
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
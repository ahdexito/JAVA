package ejer_auto_interfaces_05;

public class Vehiculo {
    
    protected String matricula;
	protected int puertas;
	protected int ruedad;
	protected int velocidad;
	protected int velocidadMaxima;
	
	public Vehiculo() {
	}
	
	public Vehiculo(String matricula, int puertas, int ruedad, int velocidad, int velocidadMaxima) {
		this.matricula = matricula;
		this.puertas = puertas;
		this.ruedad = ruedad;
		this.velocidad = velocidad;
		this.velocidadMaxima = velocidadMaxima;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getRuedad() {
		return ruedad;
	}

	public void setRuedad(int ruedad) {
		this.ruedad = ruedad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
}
package ejer_clase_coche;

public class Motor {
	
	private String tipo;

	public Motor(String tipo) {
		
		this.tipo = tipo;
	}
	
	public void MostrarInfo() {
		
		System.out.println("Motor: " + this.tipo);
	}
}

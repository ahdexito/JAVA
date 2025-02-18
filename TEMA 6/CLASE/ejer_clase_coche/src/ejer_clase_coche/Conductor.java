package ejer_clase_coche;

public class Conductor {
    
    private String nombre;
	private Coche coche;

	public Conductor(String nombre, Coche coche) {
		
		this.nombre = nombre;
		this.coche = coche;
	}
	
	public void MostrarInfo() {
		
		System.out.println("Nombre: " + nombre);
		coche.MostrarInfo();
	}
}
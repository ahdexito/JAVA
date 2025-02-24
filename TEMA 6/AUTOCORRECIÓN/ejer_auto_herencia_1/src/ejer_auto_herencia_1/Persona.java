package ejer_auto_herencia_1;

public class Persona {
    
    protected String nombre;
	protected int edad;
	protected float peso;

	public Persona() {
	}

	public Persona(String nombre, int edad, float peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
}
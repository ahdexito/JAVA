package ejer_auto_herencia_1;

public class Trabajador extends Persona {
    
    public int anyosTrabajados;
	private float salario;
	private String area;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void Mostrar() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Peso: " + this.peso);
		System.out.println("Años trabajados: " + this.anyosTrabajados);
		System.out.println("Salario: " + this.salario);
		System.out.println("Área: " + this.area);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Trabajador() {
	}

	public Trabajador(int anyosTrabajados, float salario, String area, String nombre, int edad, float peso) {
		super(nombre, edad, peso);
		this.anyosTrabajados = anyosTrabajados;
		this.salario = salario;
		this.area = area;
	}
}
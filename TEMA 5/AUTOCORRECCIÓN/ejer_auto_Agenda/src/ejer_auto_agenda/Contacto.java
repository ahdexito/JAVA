package ejer_auto_agenda;
import java.util.Scanner;

public class Contacto {
	
	Scanner sc = new Scanner(System.in);
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private String movil;
	private String direccion;
	private char sexo;
	
	//////////////////////////////////////////////////////
	
	// FUNCIÓN MOSTRAR INFORMACIÓN
	public void MostrarInformacion() {
		
		System.out.println("\nNombre y apellidos: " + this.nombre + " " + this.apellido1 + " " + this.apellido2);
		System.out.println("DNI: " + this.dni);
		System.out.println("Número de teléfono: " + this.movil);
		System.out.println("Dirección: " + this.direccion);
		System.out.println("Sexo: " + this.sexo);
	}
	
	// FUNCIÓN MODIFICAR MÓVIL Y DIRECCIÓN
	public void ModificarContacto(String movil, String direccion) {
		
		System.out.print("\nIntroduce el nuevo número de teléfono: ");
		this.movil = sc.nextLine();
		
		System.out.print("Introduce nueva dirección: ");
		this.direccion = sc.nextLine();
		
		System.out.println("\nCONTACTO MODIFICADO");
	}
	
	//////////////////////////////////////////////////////
	
	// CONSTRUCTOR POR DEFECTO Y SOBRECARGADO
	public Contacto() {
	}

	public Contacto(String nombre, String apellido1, String apellido2, String dni, String movil, String direccion, char sexo) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.movil = movil;
		this.direccion = direccion;
		this.sexo = sexo;
	}
	
	//////////////////////////////////////////////////////
	
	// GETTERS Y SETTERS
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}

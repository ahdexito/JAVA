package ejercicio_a2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Persona {
	
	String dni;
	String nombre;
	String apellidos;
	LocalDate fechaNacimiento;
	char sexo;
	double peso;
	double altura;
	
	
	int edad;
	
	String EsMayorEdad () {

		var fechaMayorEdad = LocalDate.now().minusYears(18);

		if (fechaNacimiento.isBefore(fechaMayorEdad)) return " es mayor de edad";

		else return " no es mayor de edad";
	}
	
	boolean EsJubilado () {
		
		var fechaJubilado = LocalDate.now().minusYears(65);
		
		return fechaNacimiento.isBefore(fechaJubilado);
	}
	
	int DiferenciaEdad(int edad) {
		
		int a;
		
		if (edad > this.edad) {a = edad; edad = this.edad; this.edad = a;}
		
		return this.edad - edad;
	}
	
	void Saludar() {
		
		System.out.println("Hola, soy " + nombre);
	}
	
	void Mostrar() {
		
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
	}
}

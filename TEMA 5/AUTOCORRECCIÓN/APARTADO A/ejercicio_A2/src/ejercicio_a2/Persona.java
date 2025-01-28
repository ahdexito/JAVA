package ejercicio_a2;

import java.time.*;

public class Persona {
	
	String dni;
	
	String nombre;
	
	String apellidos;
	
	LocalDate fechaNacimiento;
	
	int edad;
	
	int DiferenciaEdad(int edad) {
		
		int a;
		
		if (edad > this.edad) {a = edad; edad = this.edad; this.edad = a;}
		
		return this.edad - edad;
	}
}

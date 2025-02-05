package ejer_auto_persona;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Persona {

	String dni;
	String nombre;
	String apellidos;
	LocalDate fechaNacimiento;
	char sexo;
	double peso;
	double altura;
	
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
	
	boolean EsMayorEdad() {
		
		LocalDate hoy = LocalDate.now();
		
		return fechaNacimiento.isBefore(hoy.minusYears(18));
	}
	
	boolean EsJubilado() {
		
		LocalDate hoy = LocalDate.now();
		
		return fechaNacimiento.isBefore(hoy.minusYears(65));
	}
	
	int DiferenciaEdad(Persona p) {
		
		int diferencia = (int) ChronoUnit.YEARS.between(this.fechaNacimiento, p.fechaNacimiento);
		
		return diferencia * -1;
	}
}

package ejercicio_a2;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio_A2 {
    
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		Persona pers1 = new Persona();
		Persona pers2 = new Persona();
		
		var fechaMayorEdad = LocalDate.now().minusYears(18);
		var hoy = LocalDate.now();
		
		System.out.println(AMARILLO + "INTRODUCIR DATOS PERSONA 1" + RESET);

//		System.out.print("Introduce DNI: ");
//		pers1.dni = sc.nextLine();
//
//		System.out.print("Introduce nombre: ");
//		pers1.nombre = sc.nextLine();
//
//		System.out.print("Introduce apellidos: ");
//		pers1.apellidos = sc.nextLine();

		System.out.print("Introduce fecha de nacimiento: ");
		pers1.fechaNacimiento = LocalDate.parse(sc.nextLine(), 
				   DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		pers1.edad = (int) ChronoUnit.YEARS.between(pers1.fechaNacimiento, hoy);
		
		

		System.out.println("");
		System.out.println(AMARILLO + "INTRODUCIR DATOS PERSONA 2" + RESET);

//		System.out.print("Introduce DNI: ");
//		pers2.dni = sc.nextLine();
//
//		System.out.print("Introduce nombre: ");
//		pers2.nombre = sc.nextLine();
//
//		System.out.print("Introduce apellidos: ");
//		pers2.apellidos = sc.nextLine();

		System.out.print("Introduce fecha de nacimiento: ");
		pers2.fechaNacimiento = LocalDate.parse(sc.nextLine(), 
				   DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		pers2.edad = (int) ChronoUnit.YEARS.between(pers2.fechaNacimiento, hoy);
		
		System.out.println("");

		System.out.println(AMARILLO + "MOSTRAR DATOS PERSONA 1" + RESET);
		System.out.println(pers1.nombre + " " + pers1.apellidos + " con DNI " + pers1.dni + pers1.EsMayorEdad());

		System.out.println("");

		System.out.println(AMARILLO + "MOSTRAR DATOS PERSONA 2" + RESET);
		System.out.println(pers2.nombre + " " + pers2.apellidos + " con DNI " + pers2.dni + pers2.EsMayorEdad());
		
		
		System.out.println("Diferencia de edad: " + pers1.DiferenciaEdad(pers2.edad));
	}
}
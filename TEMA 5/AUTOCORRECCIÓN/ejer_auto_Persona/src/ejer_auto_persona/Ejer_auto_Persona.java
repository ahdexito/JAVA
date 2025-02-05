package ejer_auto_persona;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejer_auto_Persona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.dni = "12345678A";
		p1.nombre = "Pepe";
		p1.apellidos = "Rodriguez Vazquez";
		p1.fechaNacimiento = LocalDate.of(2015, 3, 14);
		
		p2.dni = "98765432E";
		p2.nombre = "Juan";
		p2.apellidos = "Gonzalez García";
		p2.fechaNacimiento = LocalDate.of(1940, 7, 26);
		
		
//		System.out.println("Persona 1");
//		
//		System.out.print("DNI: ");
//		p1.dni = sc.nextLine();
//		
//		System.out.print("Nombre: ");
//		p1.nombre = sc.nextLine();
//		
//		System.out.print("Apellidos: ");
//		p1.apellidos = sc.nextLine();
//		
//		System.out.print("Fecha nacimiento: ");
//		p1.fechaNacimiento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		
//		
//		System.out.println("Persona 2");
//		
//		System.out.print("DNI: ");
//		p2.dni = sc.nextLine();
//		
//		System.out.print("Nombre: ");
//		p2.nombre = sc.nextLine();
//		
//		System.out.print("Apellidos: ");
//		p2.apellidos = sc.nextLine();
//		
//		System.out.print("Fecha nacimiento: ");
//		p2.fechaNacimiento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		
		System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " nació el " + p1.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + " nació el " + p2.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Persona 1 es mayor de edad: " + p1.EsMayorEdad());
		System.out.println("Persona 1 es jubilado: " + p1.EsJubilado());
		
		System.out.println("Persona 2 es mayor de edad: " + p2.EsMayorEdad());
		System.out.println("Persona 2 es jubilado: " + p2.EsJubilado());
		
		System.out.println("Diferencia de edad entre p1 y p2: " + p1.DiferenciaEdad(p2) + " años.");
	}
}

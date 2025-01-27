package ejercicio_a2;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Ejercicio_A2 {
    
    public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
		Persona pers1 = new Persona();
		Persona pers2 = new Persona();
		
		   System.out.println(AMARILLO + "INTRODUCIR DATOS PERSONA 1" + RESET);
		
		   System.out.print("Introduce DNI: ");
		pers1.dni = sc.nextLine();
		
		   System.out.print("Introduce nombre: ");
		pers1.nombre = sc.nextLine();
		
		   System.out.print("Introduce apellidos: ");
		pers1.apellidos = sc.nextLine();
		
		   System.out.print("Introduce fecha de nacimiento: ");
		pers1.fechaNacimiento = LocalDate.parse(sc.nextLine(), 
			   DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		   System.out.println("");
		   System.out.println(AMARILLO + "INTRODUCIR DATOS PERSONA 2" + RESET);
		
		   System.out.print("Introduce DNI: ");
		pers2.dni = sc.nextLine();
		
		   System.out.print("Introduce nombre: ");
		pers2.nombre = sc.nextLine();
		
		   System.out.print("Introduce apellidos: ");
		pers2.apellidos = sc.nextLine();
		
		   System.out.print("Introduce fecha de nacimiento: ");
		pers2.fechaNacimiento = LocalDate.parse(sc.nextLine(), 
			   DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		   System.out.println("");
		   
		   System.out.println(AMARILLO + "MOSTRAR DATOS PERSONA 1" + RESET);
		   System.out.println(""
				 + "DNI: " + pers1.dni + 
				 ", nombre y apellidos: " + pers1.nombre + " " + pers1.apellidos + 
				 ", fecha de nacimiento: " +pers1.fechaNacimiento);
		   
		   System.out.println("");
		   
		   System.out.println(AMARILLO + "MOSTRAR DATOS PERSONA 2" + RESET);
		   System.out.println(""
				 + "DNI: " + pers2.dni + 
				 ", nombre y apellidos: " + pers2.nombre + " " + pers2.apellidos + 
				 ", fecha de nacimiento: " +pers2.fechaNacimiento);
    }
}
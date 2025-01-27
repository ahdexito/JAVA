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
		
		System.out.print("Introduce DNI: ");
		pers1.dni = sc.nextLine();
		
		System.out.print("Introduce nombre: ");
		pers1.nombre = sc.nextLine();
		
		System.out.println("Introduce apellidos: ");
		pers1.apellidos = sc.nextLine();
		
		System.out.println("Introduce fecha de nacimiento: ");
		String fecha = sc.nextLine();
		
		pers1.fechaNacimiento = fecha.parse
		
		
		
    }
}

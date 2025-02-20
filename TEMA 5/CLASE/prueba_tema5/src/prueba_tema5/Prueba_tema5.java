package prueba_tema5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Prueba_tema5 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int opcion = -1;
		Biblioteca biblioteca = new Biblioteca();
		
		do {
			System.out.print("\n" + AMARILLO
					+ "==================================\n" + MORADO
					+ "           ### " + RESET + "MENÚ" + MORADO + " ###\n" + AMARILLO
					+ "==================================\n\n" + RESET
					+ MORADO + "  1." + RESET + " Añadir libro\n"
					+ MORADO + "  2." + RESET + " Borrar libro\n"
					+ MORADO + "  3." + RESET + " Consultar número de libros\n"
					+ MORADO + "  4." + RESET + " Mostrar información de libro\n"
					+ MORADO + "  5." + RESET + " Modificar libro\n"
					+ MORADO + "  6." + RESET + " Salir\n\n" + AMARILLO
					+ "Selecciona una opción: " + RESET);
			
			try {
				opcion = sc.nextInt();
			}
			catch (Exception e) {
			}
			
			sc.nextLine();
			
			System.out.println("");
			
			switch (opcion) {
				case 1:
					Opcion1(biblioteca);
					break;
				case 2:
					Opcion2(biblioteca);
					break;
				case 3:
					System.out.println(AMARILLO + "~ NÚMERO DE LIBROS ~" + RESET);
					
					System.out.println(" - " + biblioteca.NumeroLibros());
					break;
				case 4:
					System.out.println(AMARILLO + "~ INFORMACIÓN DE LIBRO ~" + RESET);
					
					System.out.print(" - Nombre: ");
					String nombre = sc.nextLine();
					
					biblioteca.MostrarInformacion(nombre);
					break;
				case 5:
					System.out.println(AMARILLO + "~ MODIFICAR LIBRO ~" + RESET);
					
					System.out.print(" - Código: ");
					String codigo = sc.nextLine();
					
					biblioteca.ModificarLibro(codigo);
					break;
				case 6:
					System.out.println(AMARILLO + "~ SALIR ~\n" + RESET);
					break;
				default:
					System.out.println(ROJO + "ENTRADA NO VÁLIDA" + RESET);
					break;
			}
			
		} while (opcion != 6);
	}
	
	public static void Opcion1(Biblioteca biblioteca) {
		
		// SOLICITAR DATOS //
		System.out.println(AMARILLO + "~ AÑADIR LIBRO ~" + RESET);
					
		System.out.print(" - Nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print(" - Autor: ");
		String autor = sc.nextLine();
		
		System.out.print(" - Código: ");
		String codigo = sc.nextLine();
		
		System.out.print(" - Fecha publicación (dd/mm/aaaa): ");
		try {
			LocalDate fechaPublicacion = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			Libro libro = new Libro(nombre, autor, codigo, fechaPublicacion);
		
			if (biblioteca.AnyadirLibro(libro))
				System.out.println(CIAN + "\nEL LIBRO (" + nombre + ") HA SIDO AÑADIDO CORRECTAMENTE" + RESET);

			else
				System.out.println(ROJO + "\nERROR AL AÑADIR EL LIBRO" + RESET);
			}
		
		catch (Exception e) {
			System.out.println(ROJO + "\nERROR AL INTRODUCIR LA FECHA" + RESET);
		}
	}
	
	public static void Opcion2(Biblioteca biblioteca) {
		
		System.out.println(AMARILLO + "~ BORRAR LIBRO ~" + RESET);
		
		System.out.print(" - Código: ");
		String codigo = sc.nextLine();
		
		if (biblioteca.BorrarLibro(codigo)) 
			System.out.println(CIAN + "\nEL LIBRO HA SIDO ELIMINADO CORRECTAMENTE" + RESET);
		
		else 
			System.out.println(ROJO + "\nERROR AL BORRAR EL LIBRO" + RESET);
	}
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}


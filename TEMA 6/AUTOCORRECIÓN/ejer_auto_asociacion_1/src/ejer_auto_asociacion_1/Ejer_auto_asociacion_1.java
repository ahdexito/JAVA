package ejer_auto_asociacion_1;

import java.util.Scanner;

public class Ejer_auto_asociacion_1 {
	
	static Scanner sc = new Scanner(System.in);
	
	static Biblioteca[] bibliotecas = new Biblioteca[10];
	static int contBiblio = 0;
		
	static Libro[] libros = new Libro[100];
	static int contLibros = 0;
	
	public static void main(String[] args) {
		
		
		
		int opcion;
		
		do {
			System.out.print(""
				   + "GESTIÓN DE BIBLIOTECAS DE ALICANTE\n"
				   + "   1. Gestionar biblioteca\n"
				   + "   2. Gestionar libros\n"
				   + "   0. Salir\n\n"
				   + "Selecciona una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			System.out.println("\n");
			
			switch (opcion) {
				case 1:
					MenuBiblioteca();
					break;
				case 2:
					MenuLibro();
					break;
				case 3:
					System.out.println("SALIENDO...\n");
					break;
			}	
		} while (opcion != 0);	
	}
	
	public static void MenuBiblioteca() {
		
		int opcion;
		
		do {			
			System.out.print(""
			   + ""
			   + "GESTIONAR BIBLIOTECA\n"
			   + "   1. Crear biblioteca\n"
			   + "   2. Borrar biblioteca\n"
			   + "   3. Mostrar bibliotecas\n"
			   + "   4. Añadir libro a biblioteca\n"
			   + "   5. Mostrar libros de biblioteca\n"
			   + "   0. Salir\n\n"
			   + "Selecciona una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			System.out.println("\n");
			
			switch (opcion) {
				case 1:
					System.out.println("CREAR BIBLIOTECA");
					CrearBiblioteca();
					break;
			}
		} while (opcion != 0);
	}
	
	public static void CrearBiblioteca() {
		
		Biblioteca biblioteca = new Biblioteca();
		
		System.out.print(" - Nombre: ");
		biblioteca.setNombre(sc.nextLine());
		
		System.out.print(" - CIP: ");
		biblioteca.setCip(ValidarCip());
		
		System.out.print(" - Ciudad: ");
		biblioteca.setCiudad(sc.nextLine());
		
		bibliotecas[contBiblio] = biblioteca;
		contBiblio++;
	}
	
	public static String ValidarCip() {
		
		String cip = sc.nextLine();
		boolean repetido;
		
		do {
			repetido = false;
			
			for (int i = 0; i < contBiblio; i++) {

				if (cip.equals(bibliotecas[i].getCip())) {

					System.out.println(ROJO + "ERROR, EL CIP (" + cip + ") YA EXISTE" + RESET);
					System.out.print("Introduce otro diferente: ");
					cip = sc.nextLine();
					repetido = true;
				}
			}
		} while (!repetido);
			
		return cip;
	}
	
	public static void BorrarBiblioteca() {
		
		
	}
	
	public static void MenuLibro() {
		
		int opcion;
		
		do {			
			System.out.print(""
			   + "GESTIONAR LIBROS\n"
			   + "   1. Añadir libro\n"
			   + "   2. Mostrar libros\n"
			   + "   0. Salir\n\n"
			   + "Selecciona una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
				
				
			}
		} while (opcion != 0);
	}
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}

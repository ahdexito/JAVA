package ejer_auto_asociacion_1;

import java.util.Scanner;

public class Ejer_auto_asociacion_1 {
	
	// ATRIBUTOS //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	static Scanner sc = new Scanner(System.in);
	
	static Biblioteca[] bibliotecas = new Biblioteca[10];
	static int contBiblio = 0;
		
	static Libro[] libros = new Libro[100];
	static int contLibros = 0;
	
	// MAIN (MENÚ PRINCIPAL) //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) throws Exception {
		
		int opcion;
		
		do {
			System.out.print(""
				   + AMARILLO + "GESTIÓN DE BIBLIOTECAS DE ALICANTE\n" + RESET
				   + "   1. Gestionar biblioteca\n"
				   + "   2. Gestionar libros\n"
				   + "   0. Salir\n\n"
				   + "Selecciona una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			System.out.println("\n--------------------------------\n");
			
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
			System.out.println("\n--------------------------------\n");
		} while (opcion != 0);
	}
	
	// MENÚ BIBLIOTECA //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void MenuBiblioteca() throws Exception {
	
		int opcion;
		
		do {			
			System.out.print(""
			   + ""
			   + AMARILLO + "GESTIONAR BIBLIOTECA\n" + RESET
			   + "   1. Crear biblioteca\n"
			   + "   2. Borrar biblioteca\n"
			   + "   3. Mostrar bibliotecas\n"
			   + "   4. Añadir libro a biblioteca\n"
			   + "   5. Mostrar libros de biblioteca\n"
			   + "   0. Salir\n\n"
			   + "Selecciona una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			System.out.println("\n--------------------------------\n");
			
			switch (opcion) {
				case 1:
					System.out.println("CREAR BIBLIOTECA");
					CrearBiblioteca();
					break;
				case 2:
					System.out.println("BORRAR BIBLIOTECA");
					BorrarBiblioteca();
					break;
				case 3:
					System.out.println("MOSTRAR BIBLIOTECAS");
					MostrarBibliotecas();
					break;
				case 4:
					System.out.println("AÑADIR LIBRO A BIBLIOTECA");
					AnyadirLibroABiblioteca();
					break;
				case 5:
					System.out.println("MOSTRAR LIBROS DE UNA BIBLIOTECA");
					MostrarLibrosBiblioteca();
					break;
				case 0:
					System.out.println("VOLVIENDO...");
					break;
			}
			System.out.println("\n--------------------------------\n");
		} while (opcion != 0);
	}
	
	// FUNCIONES MENÚ BIBLIOTECA //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void CrearBiblioteca() {
		
		System.out.print(" - Nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print(" - Ciudad: ");
		String ciudad = sc.nextLine();
		
		System.out.print(" - CIP: ");
		String cip = sc.nextLine();
		
		if (CipEncontrado(cip)) System.out.println(ROJO + "ERROR, EL CIP (" + cip + ") YA EXISTE" + RESET);
		
		else { 
			if (contBiblio < bibliotecas.length) {
				
				bibliotecas[contBiblio] = new Biblioteca(nombre, cip, ciudad);
				contBiblio++;
			}
			else System.out.println(ROJO + "ERROR, NO QUEDA MÁS ESPACIO PARA OTRA BIBLIOTECA" + RESET);
		}
	}
	
	public static boolean CipEncontrado(String cip) {
			
		for (int i = 0; i < contBiblio; i++) {

			if (bibliotecas[i].getCip().equals(cip)) return true;
		}
			
		return false;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void BorrarBiblioteca() throws Exception {
		
		System.out.print(" - CIP (biblioteca a borrar): ");
		String cipBorrar = sc.nextLine();
		
		System.out.print(" - CIP (biblioteca nueva): ");
		String cipNueva = sc.nextLine();
		
		// SI SE ENCUENTRA EL CIP DE LA BIBLIO A BORRAR //
		if (CipEncontrado(cipBorrar)) {
			
			// SI SE ENCUENTRA EL CIP DE LA BIBLIO NUEVA //
			if (CipEncontrado(cipNueva)) {
				
				// EJECUTAR FUNCIÓN DE RECOGIDA TEMPORAL DE LIBROS DE UNA BIBLIO A OTRA //
				BibliotecaPorCip(cipNueva).RecogidaTemporal(BibliotecaPorCip(cipBorrar).getLibros());
				
				// BORRAR LA BIBLIOTECA A BORRAR, Y CON ELLA LOS LIBROS QUE HAN SOBRADO //
				for (int i = 0; i < bibliotecas.length; i++) {
					
					if (bibliotecas[i].getCip().equals(cipBorrar)) {
						
						bibliotecas[contBiblio] = bibliotecas[i];
						bibliotecas[contBiblio] = null;
						contBiblio--;
					}
				}
			}
			else System.out.println(ROJO + "ERROR, NO EXISTE NINGUNA BIBLIOTECA CON EL CIP (" + cipBorrar + ")" + RESET);
		}
		else System.out.println(ROJO + "ERROR, NO EXISTE NINGUNA BIBLIOTECA CON EL CIP (" + cipBorrar + ")" + RESET);
	}
	
	public static Biblioteca BibliotecaPorCip(String cip) throws Exception {
		
		for (int i = 0; i < bibliotecas.length; i++) {
			
			if (bibliotecas[i].getCip().equals(cip)) 
				return bibliotecas[i];
		}
		throw new Exception("ERROR, CIP (" + cip + ") NO ENCONTRADO");
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void MostrarBibliotecas() {
		
		for (int i = 0; i < bibliotecas.length; i++) {
			
			System.out.println("================================");
			System.out.println(" # Biblioteca " + (i + 1));
			System.out.println("   - Nombre: " + bibliotecas[i].getNombre());
			System.out.println("   - CIP: " + bibliotecas[i].getCip());
			System.out.println("   - Ciudad: " + bibliotecas[i].getCiudad());
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void AnyadirLibroABiblioteca() throws Exception {
		
		System.out.print(" - CIP de la biblioteca: ");
		String cip = sc.nextLine();
		
		if (CipEncontrado(cip)) {
			
			Biblioteca biblioteca = BibliotecaPorCip(cip);
			
			System.out.print(" - Código del libro: ");
			String codigo = sc.nextLine();
			
			if (!LibroEncontrado(codigo)) {
				
				if (LibroExiste(codigo)) {
					
					biblioteca.AnyadirLibro(LibroPorCodigo(codigo));
				}
				else System.out.println(ROJO + "ERROR, EL LIBRO CON CÓDIGO (" + codigo + ") NO EXISTE" + RESET);
			}
			else System.out.println(ROJO + "ERROR, EL LIBRO CON CÓDIGO (" + codigo + ") YA SE ENCUENTRA EN OTRA BIBLIOTECA" + RESET);
		}
		else System.out.println(ROJO + "ERROR, CIP (" + cip + ") NO ENCONTRADO" + RESET);
	}
	
	public static Libro LibroPorCodigo(String codigo) {
		
		for (int i = 0; i < libros.length; i++) {
			
			if (libros[i].getCodigo().equals(codigo)) return libros[i];
		}
		return null;
	}
	
	public static boolean LibroExiste(String codigo) {
		
		for (int i = 0; i < contLibros; i++) {
			
			if (libros[i].getCodigo().equals(codigo)) return true;
		}
		return false;
	}
	
	public static boolean LibroEncontrado(String codigo) {
		
		for (int i = 0; i < bibliotecas.length; i++) {
			
			for (int j = 0; j < bibliotecas[i].getLibros().length; i++) {
				
				if (bibliotecas[i].getLibros()[j].getCodigo().equals(codigo)) 
					return true;
			}
		}
		return false;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void MostrarLibrosBiblioteca() throws Exception {
		
		System.out.print(" - CIP de la biblioteca: ");
		String cip = sc.nextLine();
		
		Biblioteca biblioteca = BibliotecaPorCip(cip);
		
		for (int i = 0; i < biblioteca.getContador(); i++) {
			
			System.out.println("================================");
			System.out.println(" # LIBRO " + (i + 1));
			System.out.println("   - Nombre: " + biblioteca.getLibros()[i].getNombre());
			System.out.println("   - Autor: " + biblioteca.getLibros()[i].getAutor());
			System.out.println("   - Código: " + biblioteca.getLibros()[i].getCodigo());
		}
	}
	
	// MENÚ LIBRO //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void MenuLibro() {
		
		int opcion;
		
		do {			
			System.out.print(""
			   + AMARILLO + "GESTIONAR LIBROS\n" + RESET
			   + "   1. Añadir libro\n"
			   + "   2. Mostrar libros\n"
			   + "   0. Salir\n\n"
			   + "Selecciona una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			System.out.println("\n--------------------------------\n");
			
			switch (opcion) {
				case 1:
					System.out.println("AÑADIR UN LIBRO");
					
					System.out.print(" - Nombre: ");
					String nombre = sc.nextLine();
					
					System.out.print(" - Autor: ");
					String autor = sc.nextLine();
					
					System.out.print(" - Código: ");
					String codigo = sc.nextLine();
					
					if (!LibroExiste(codigo)) {
						
						Libro libro = new Libro(nombre, autor, codigo);
						libros[contLibros] = libro;
						contLibros++;
					}
					else System.out.println(ROJO + "ERROR, EL CÓDIGO (" + codigo + ") YA ESTÁ ASOCIADO A OTRO LIBRO" + RESET);
					break;
				case 2:
					System.out.println("MOSTRAR LIBROS");
					MostrarLibros();
					break;
				case 0:
					System.out.println("VOLVIENDO...");
					break;
			}
			System.out.println("\n--------------------------------\n");
		} while (opcion != 0);
	}
	
	// FUNCIONES MENÚ LIBRO //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void MostrarLibros() {
		
		for (int i = 0; i < contLibros; i++) {
			
			System.out.println("================================");
			System.out.println(" # LIBRO " + (i + 1));
			System.out.println("   - Nombre: " + libros[i].getNombre());
			System.out.println("   - Autor: " + libros[i].getAutor());
			System.out.println("   - Código: " + libros[i].getCodigo());
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}

package prueba_tema5;

import java.util.Scanner;

public class Biblioteca {
    
    private Libro[] libros;
	private int contador;
	Scanner sc = new Scanner(System.in);

	
	public Biblioteca() {
		
		this.libros = new Libro[2];
		this.contador = 0;
	}
	
	public boolean AnyadirLibro(Libro libro) {
		
		boolean existe = false;
		
		// SI QUEDA ESPACIO //
		if (this.contador < this.libros.length) {
			
			// BUSCAR CÓDIGOS DE LIBROS AÑADIDOS //
			for (int i = 0; i < this.contador; i++) {
				
				// SI COINCIDE ALGUNO, ACTIVAR BOOLEAN //
				if (this.libros[i].getCodigo().equals(libro.getCodigo())) existe = true;
			}
			
			// SI ADEMÁS, NO COINCIDE NINGUNO, AÑADIR LIBRO //
			if (!existe) {
				this.libros[contador] = libro;
				contador++;
				return true;
			}
		}
		// SI NO QUEDA ESPACIO //
		else return false;
		
		// CUALQUIER OTRO ERROR //
		return false;
	}
	
	public boolean BorrarLibro(String codigo) {
		
		if (this.contador == 0) return false;
		
		else {
			
			for (int i = 0; i < this.contador; i++) {
				
				if (this.libros[i].getCodigo().equals(codigo)) {
					
					this.libros[i] = this.libros[this.contador];
					this.libros[this.contador] = null;
					this.contador--;
					return true;
				}
			}
		}
		return false;
	}
	
	public int NumeroLibros() {
		return this.contador;
	}
	
	public void MostrarInformacion(String nombre) {
		
		boolean encontrado = false;
		
		for (int i = 0; i < this.contador; i++) {
			
			if (this.libros[i].getNombre().equalsIgnoreCase(nombre)) {
				
				encontrado = true;
				
				System.out.println("");
				System.out.println(" - Autor: " + this.libros[i].getAutor());
				System.out.println(" - Código: " + this.libros[i].getCodigo());
				System.out.println(" - Fecha publicación: " + this.libros[i].getFechaPublicacion() + "\n");
			}
		}
		if (!encontrado) System.out.println(ROJO + "\nNO SE HA ENCONTRADO EL LIBRO" + RESET);
	}
	
	public boolean ModificarLibro(String codigo) {
		
		if (this.contador == 0) {
			System.out.println(ROJO + "\nNO EXISTE NINGÚN LIBRO TODAVÍA" + RESET);
			return false;
		}
		
		else {
			
			for (int i = 0; i < this.contador; i++) {
				
				if (this.libros[i].getCodigo().equals(codigo)) {
					
					System.out.print(" - Modificar nombre: ");
					this.libros[i].setNombre(sc.nextLine());
					
					System.out.print(" - Modificar autor: ");
					this.libros[i].setAutor(sc.nextLine());
					
					System.out.println(CIAN + "\nEL LIBRO SE HA MODIFICADO CORRECTAMENTE" + RESET);
					return true;
				}
				
				else {
					System.out.println(ROJO + "\nEL LIBRO NO HA PODIDO SER MODIFICADO" + RESET);
					return false;
				}
			}
		}
		System.out.println(ROJO + "\nERROR INESPERADO" + ROJO);
		return false;
	}
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
package prog03_clase15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Prog03_clase15 {
	
	public static void mostrarCategorias() {
		
		System.out.println("--------------------------------------------------");
		System.out.print("" +
		"   1. Lácteos\n" +
		"   2. Bebidas\n" +
		"   3. Dulces\n");
		System.out.println("--------------------------------------------------");
		System.out.print("Elige categoría: ");
	}
	
	public static void mostrarProductos(String[] productosCategoria) {
		
		System.out.println("--------------------------------------------------");
		for (int i=0; i<productosCategoria.length; i++) {

			if (productosCategoria[i] != null)
				System.out.print((i + 1) + ". " + productosCategoria[i] + "  ");

			else
				System.out.print((i + 1) + ". VACÍO  ");
		}
		System.out.print("\n");
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        15. Imaginar que se tiene que realizar una aplicación para una tienda de forma que esta
		necesita almacenar sus productos en 3 categorías:
		
		La primera cadena de caracteres representa el nombre de la categoría y las demás casillas los
		nombres exactos de productos. Como se observa, no se tiene la misma cantidad de productos en
		cada categoría. La aplicación debe permitir realizar las siguientes operaciones:
		
		a) Ordenar cada categoría.
		b) Contar los productos de una categoría.
		c) Añadir un producto dada la categoría.
		d) Modificar un producto.
		e) Elimina un producto.
		f) Salir.
		
		Las categorías tendrán el siguiente número de productos:
		a) Lácteos: 4 productos.
		b) Bebidas: 2 productos.
		c) Dulces: 5 productos.
        */
		String separador1 = "--------------------------------------------------";
        String separador2 = "==================================================";
        String[][] productos = new String[3][];
		
		productos[0] = new String[4];
		productos[1] = new String[2];
		productos[2] = new String[5];
		
		boolean salir = false;
		
		do {
			System.out.println(separador2);
			System.out.print("" +
			"MENÚ:\n" +
			"   a) Mostrar productos.\n" +
			"   b) Ordenar cada categoría.\n" +
			"   c) Contar los productos de una categoría.\n" +
			"   d) Añadir un producto dada la categoría.\n" +
			"   e) Modificar un producto.\n" +
			"   f) Elimina un producto.\n" +
			"   g) Salir.\n");
			System.out.println(separador1);
			
			System.out.print("Selecciona opción: ");
			char opcion = sc.next().charAt(0);
			
			int entrada;
			
			/////////////////////////////////////////////////////////////////////////////////////////////////
			
			switch (opcion) {
				
				// MOSTRAR PRODUCTOS
				
				case 'a':
					
					System.out.println("OPCIÓN: MOSTRAR PRODUCTOS");
					mostrarCategorias();
					entrada = sc.nextInt() - 1;
					
					// Mostrar productos.
					mostrarProductos(productos[entrada]);
				break;
						
				/////////////////////////////////////////////////////////////////////////////////////////////////
				
				// ORDENAR CATEGORÍA
				
				case 'b':
					
					System.out.println("OPCIÓN: ORDENAR CATEGORÍA");
					mostrarCategorias();
					entrada = sc.nextInt() - 1;
					
					Arrays.sort(productos[entrada], Comparator.nullsLast(String::compareTo));
					
					System.out.println("\n                            Artículos ordenados.");
					
				break;
				
				/////////////////////////////////////////////////////////////////////////////////////////////////
				
				// CONTAR PRODUCTOS
				
				case 'c':
					
					System.out.println("OPCIÓN: CONTAR PRODUCTOS");
					mostrarCategorias();
					entrada = sc.nextInt() - 1;
					
					// Contar cuantos productos faltan por añadir.
					int contador = 0;
					for (String producto : productos[entrada]) {
						
						if (producto == null)
							contador++;
					}
					System.out.println("\n           Cantidad de elementos introducidos: " + (productos[entrada].length - contador));
					
				break;
				
				/////////////////////////////////////////////////////////////////////////////////////////////////
				
				// AÑADIR PRODUCTO
				
				case 'd':
					
					System.out.println("OPCIÓN: AÑADIR PRODUCTO");
					mostrarCategorias();
					entrada = sc.nextInt() - 1;
					sc.nextLine();
					
					int contadorOcupados = 0;
					
					// Mostrar productos.
					mostrarProductos(productos[entrada]);
					
					// Contar productos añadidos.
					System.out.println(separador1);
					
					for (String producto : productos[entrada]) {
						if (producto != null) {
							contadorOcupados++;
						}
				}
										
					// Añadir producto si queda espacio.
					if (contadorOcupados < productos[entrada].length) {
						
						System.out.print("\n\nProducto a añadir: ");
						String nuevoProducto = sc.nextLine();
						
						// Modificar primera letra a mayúscula
						String nuevoMayus = nuevoProducto.substring(0, 1).toUpperCase() + nuevoProducto.substring(1);
						
						// Añadir al primer espacio vacío.
						for (int i=0; i<productos[entrada].length; i++) {
							
							if (productos[entrada][i] == null) {
								
								productos[entrada][i] = nuevoMayus;
								break;
							}	
						}
						System.out.println("\n                               Producto añadido.");
					}
					else 
						System.out.println("\n\nNo quedan espacios. Prueba a borrar uno primero.");
					
				break;

				
				/////////////////////////////////////////////////////////////////////////////////////////////////
				
				// MODIFICAR PRODUCTO
				
				case 'e':
					
					System.out.println("OPCIÓN: MODIFICAR PRODUCTO");
					mostrarCategorias();
					entrada = sc.nextInt() - 1;
					
					// Mostrar productos.
					mostrarProductos(productos[entrada]);
					
					// Modificar producto.
					System.out.println(separador1);
					System.out.print("Elige producto a modificar: ");
					int modificarProducto = sc.nextInt() - 1;
					sc.nextLine();
					
					if (productos[entrada][modificarProducto] != null) {
						
						System.out.println(separador1);
						System.out.print("Introduce modificación: ");
						String entradaModificacion = sc.nextLine();
						
						// Modificar primera letra a mayúscula.
						String modificacionMayus = entradaModificacion.substring(0, 1).toUpperCase() + entradaModificacion.substring(1);
						
						// Modificar producto.
						productos[entrada][modificarProducto] = modificacionMayus;
						
						System.out.println("\n                             Producto modificado.");
					}
					
					else
						System.out.println("\n                 No hay producto para modificar.");
					
				break;
				
				/////////////////////////////////////////////////////////////////////////////////////////////////
				
				// BORRAR PRODUCTO
				
				case 'f':
					
					System.out.println("OPCIÓN: BORRAR PRODUCTO");
					mostrarCategorias();
					entrada = sc.nextInt() - 1;
					
					// Mostrar productos.
					mostrarProductos(productos[entrada]);
					
					// Borrar producto.

					System.out.println(separador1);
					System.out.print("Elige producto a borrar: ");
					int borrarProducto = sc.nextInt() - 1;
					
					if (productos[entrada][borrarProducto] != null) {
						
						productos[entrada][borrarProducto] = null;
						System.out.println("\n                              Producto borrado.");
					}
					
					else
						System.out.println("\n                   No hay producto para borrar.");
					
				break;
				
				/////////////////////////////////////////////////////////////////////////////////////////////////
				
				// SALIR
				
				case 'g':
					
					System.out.println("OPCIÓN: SALIR");
					System.out.println(separador1);
					System.out.println("                 ¡Hasta pronto!");
					System.out.println(separador2);
					salir = true;
					
				break;
				
				/////////////////////////////////////////////////////////////////////////////////////////////////
				
				default:
					
					System.out.println("\n                                OPCIÓN NO VÁLIDA");
					
				break;
			}
		} while (!salir);
    }
}
package prog03_clase15;

import java.util.Arrays;
import java.util.Scanner;

public class Prog03_clase15 {

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
        
        String[][] productos = new String[3][];
		
		productos[0] = new String[4];
		productos[1] = new String[2];
		productos[2] = new String[5];
		
		boolean salir = false;
		
		do {
			System.out.println("============================================");
			System.out.print("" +
			"MENÚ:\n" +
			"   a) Ordenar cada categoría.\n" +
			"   b) Contar los productos de una categoría.\n" +
			"   c) Añadir un producto dada la categoría.\n" +
			"   d) Modificar un producto.\n" +
			"   e) Elimina un producto.\n" +
			"   f) Salir.\n");
			System.out.println("--------------------------------------------");
			
			System.out.print("Selecciona opción: ");
			char opcion = sc.next().charAt(0);
			
			int entrada;
			
			switch (opcion) {
				
				case 'a':
					System.out.println("OPCIÓN: ORDENAR CATEGORÍA");
					
					System.out.print("" +
					"   1. Lácteos\n" +
					"   2. Bebidas\n" +
					"   3. Dulces\n" +
					"Elige categoría: ");
					entrada = sc.nextInt() - 1;
					
					Arrays.sort(productos[entrada]);
					
					System.out.println("--------------------------------------------");
					System.out.println("                        Artículos ordenados.");
				break;
				/////////////////////////////////////////////////////////////////////////////////////////////////
				case 'b':
					System.out.println("OPCIÓN: CONTAR PRODUCTOS");
					
					System.out.print("" +
					"   1. Lácteos\n" +
					"   2. Bebidas\n" +
					"   3. Dulces\n" +
					"Elige categoría: ");
					entrada = sc.nextInt() - 1;
					
					// Contar cuantos productos faltan por añadir.
					int contador = 0;
					for (String producto : productos[entrada]) {
						
						if (producto == null)
							contador++;
					}
					
					System.out.println("--------------------------------------------");
					System.out.println("       Cantidad de elementos introducidos: " + (productos[entrada].length - contador));
				break;
				/////////////////////////////////////////////////////////////////////////////////////////////////
				case 'c':
					System.out.println("OPCIÓN: AÑADIR PRODUCTO");
					
					System.out.print("" +
					"   1. Lácteos\n" +
					"   2. Bebidas\n" +
					"   3. Dulces\n" +
					"Elige categoría: ");
					entrada = sc.nextInt() - 1;
					
					int contadorOcupados = 0;
					
					// Mostrar los productos de la categoría.
					System.out.println("--------------------------------------------");
					for (int i=0; i<productos[entrada].length; i++) {
						
						System.out.print((i+1) + ". " + productos[entrada][i] + "  ");
						
						// Contar productos añadidos.
						if (productos[entrada][i] != null)
							contadorOcupados++;
					}
					
					System.out.println("Contador ocupados: " + contadorOcupados);
					
					// Añadir producto si queda espacio.
					if (contadorOcupados < productos[entrada].length) {
						
						System.out.println("--------------------------------------------");
						System.out.print("Producto a añadir: ");
						String nuevoProducto = sc.next();
						
						// Añadir al primer espacio vacío.
						for (int i=0; i<productos[entrada].length; i++) {
							
							if (productos[entrada][i] == null) {
								
								productos[entrada][i] = nuevoProducto;
								break;
							}
								
						}
						
						System.out.println("\n                           Producto añadido.");
					}
					
					else {
						System.out.println("\n--------------------------------------------");
						System.out.println("No quedan espacios. Prueba a borrar uno primero.");
					}
						
			}
			
			
		} while (!salir);
    }
}

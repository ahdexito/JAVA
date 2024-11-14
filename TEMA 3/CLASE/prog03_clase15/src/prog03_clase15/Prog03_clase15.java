package prog03_clase15;

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
        
        int[][] catego = new int[3][];
		
		catego[0] = new int[4];
		catego[1] = new int[2];
		catego[2] = new int[5];
		
		char opcion;

		do {
			
			System.out.print("" +
			"a) Ordenar cada categoría.\n" +
			"b) Contar los productos de una categoría.\n" +
			"c) Añadir un producto dada la categoría.\n" +
			"d) Modificar un producto.\n" +
			"e) Elimina un producto.\n" +
			"f) Salir.\n");
			System.out.println("=======================================");
			
			System.out.print("Selecciona opción: ");
			opcion = sc.next().charAt(0);
			
			switch (opcion) {
				
				case 'a':
					System.out.println("OPCIÓN: ORDENAR CATEGORÍA");
					System.out.print("Elige categoría: ");
					String entrada = sc.nextLine().toLowerCase();
					
					int numCatego;
					boolean correcto = true;
					
					do {
						
						if (entrada.equals("lácteos"))
							numCatego = 0;

						else if (entrada.equals("bebidas"))
							numCatego = 1;

						else if (entrada.equals("dulces"))
							numCatego = 2;

						else
							System.out.println("Categoría inexistente.");
							correcto = false;
							
					} while (!correcto);
			}
			
			
		} while (opcion!='f');
    }
}

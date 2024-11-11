package prog03_auto21;

import java.util.Scanner;

public class Prog03_auto21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
        21. Crea un programa que prepare espacio para un máximo de 10 caracteres. Deberá mostrar
		al usuario un menú que le permita realizar las siguientes operaciones:
		
		a) Añadir un dato al final de los ya existentes.
		
		b) Insertar un dato en una cierta posición (como ya se ha comentado, los que queden
		detrás deberán desplazarse "hacia el final" para dejarle hueco); por ejemplo, si el array
		contiene "h", "a" y se pide insertar "b" en la segunda posición, el array pasará a contener
		"h", "b", "a".
		
		c) Borrar el dato que hay en una cierta posición (como se ha visto, lo que estaban
		detrás deberán desplazarse "hacia el principio" para que no haya huecos); por ejemplo,
		si el array contiene "h", "b", " a" y se pide borrar el dato de la segunda posición,
		el array pasará a contener "h", "a".
		
		d) Mostrar los datos que contiene el array.
		
		e) Salir del programa.
		*/
		
		char[] letras = new char[10];
		int contador = 0;
		char opcion;
		
		System.out.println("""
												MENÚ
						   ====================================================
						   a) Añadir un dato al final de los ya existentes.
						   b) Insertar un dato en una cierta posición
						   c) Borrar el dato que hay en una cierta posición
						   d) Mostrar los datos que contiene el array.
						   e) Salir del programa.
						   """);
		
		do {
			System.out.print("====================================================\n");
			System.out.print("Elige una opción: ");
			opcion = sc.next().charAt(0);
			
			switch (opcion) {

				// Añadir letra al primer hueco disponible.
				case 'a': case 'A':

					System.out.println("OPCIÓN: AÑADIR LETRA AL FINAL");
					
					if (contador == 10)
						System.out.println("No quedan huecos, para continuar elimina uno antes.");
					
					else {
						System.out.print("Introduce letra: ");
						char entrada_A = sc.next().charAt(0);

						for (int i=0; i<letras.length; i++) {
							
								
								letras[contador] = entrada_A;
								contador++;
								break;
						}
					} 
					break;

				// Añadir letra en una posición determinada.
				case 'b': case 'B':	
					
					System.out.println("OPCIÓN: AÑADIR LETRA EN DETERMINADA POSICIÓN");
					
					if (contador == 10)
						System.out.println("No quedan huecos, para continuar elimina uno antes.");
						
					else {
						System.out.print("Introduce letra: ");
						char entrada_B = sc.next().charAt(0);

						System.out.print("Elige posición: ");
						int posicion = sc.nextInt() - 1;

						for (int i=0; i<letras.length-1; i++) {

							if (posicion == i) {

								for (int j=letras.length-1; j>posicion; j--) {

									letras[j] = letras[j-1];
								}

								letras[i] = entrada_B;
								contador++;
							}
						} 
					} 
					break;
					
				case 'c': case 'C':
					
					System.out.println("OPCIÓN: BORRAR DATO");
					
					System.out.print("Elige posición del dato a borrar: ");
					int entrada_C = sc.nextInt() - 1;
					
					for (int i=0; i<letras.length-1; i++) {

						if (entrada_C == i) {

							for (int j=entrada_C; j<contador-1; j++) {
								letras[j] = letras[j+1];
							}
							letras[i] = letras[entrada_C];
							contador--;
						}
					} break;
						
				// Imprimir el array.	
				case 'd': case 'D':
					
					System.out.println("OPCIÓN: IMPRIMIR EL ARRAY");
					
					for (int i=0; i<contador; i++) {

							System.out.print(i+1 +"(" + letras[i] + ") ");
					} 
					System.out.print("\n");
					break;
					
				case 'e': case 'E':
					System.out.println("OPCIÓN: FINALIZAR PROGRAMA");
					break;
			}
			
		} while (opcion != 'e' && opcion != 'E');
	}
}

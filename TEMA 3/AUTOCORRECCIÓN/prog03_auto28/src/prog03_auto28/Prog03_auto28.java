package prog03_auto28;

import java.util.Arrays;
import java.util.Scanner;

public class Prog03_auto28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
        28. Un programa que pida al usuario varios números, los vaya añadiendo a un array, mantenga
		el array ordenado continuamente y muestre el contenido tras añadir cada nuevo dato
		(todos los datos se mostrarán en la misma línea, separados por espacios en blanco).
		Terminará cuando el usuario teclee el número cero.
		*/
		
		int tamano=1;
		int[] array = new int[tamano];
		
		// Pedir número.
			System.out.print("Introduce número: ");
			int numero = sc.nextInt();
			
		do {
			// Añadir número a última posición del array.
			array[array.length-1] = numero;
			
			// Ordenar array;
			Arrays.sort(array);
			
			for (int i=0; i<tamano; i++) {
				
				System.out.print(array[i] + " ");
			}
			System.out.print("\n");
			
			// Añadir espacio al array.
			tamano++;
			
			// Crear nuevo array con el espacio añadido.
			array = Arrays.copyOf(array, tamano);
			
			// Pedir número.
			System.out.print("Introduce número: ");
			numero = sc.nextInt();
			
		} while (numero!=0);
	}
}

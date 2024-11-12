package prog03_auto27;

import java.util.Arrays;
import java.util.Scanner;

public class Prog03_auto27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
          27. Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
		aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y
		se mostrará por pantalla si N existe en el array, además de cuantas veces.
		 */
		int[] array = new int[1000];

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 100);
		}

		System.out.print("Introduce un valor: ");
		int entrada = sc.nextInt();

		Arrays.sort(array);
		
		int posicion = Arrays.binarySearch(array, entrada);
		
		if (posicion>=0) {
			
			int repe = 0;
			
			for (int i=posicion; i<array.length; i++) {
				
				if (array[i] == entrada)
					repe++;
				
				else
					break;
			}
			
			System.out.println("Se ha encontrado. Está repetido " + repe + " veces.");
		}
		
		else
			System.out.println("No se ha encontrado.");
	}
}

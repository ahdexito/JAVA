package prog03_auto25;

import java.util.Arrays;
import java.util.Scanner;

public class Prog03_auto25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
          25. Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0
		y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por
		pantalla.
		 */
		int[] array = new int[30];

		// Rellenar con números aleatorios.
		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 10);
		}

		// Imprimir array desordenado.
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		// Ordenar array.
		Arrays.sort(array);

		System.out.print("\n");

		// Imprimir array ordenado.
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
	}
}

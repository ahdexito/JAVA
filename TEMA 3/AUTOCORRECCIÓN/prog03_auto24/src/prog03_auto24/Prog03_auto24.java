package prog03_auto24;
import java.util.Arrays;
import java.util.Scanner;

public class Prog03_auto24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
        24. Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un
		array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
		si son iguales o no.
		 */
		int tamano = 10;

		int[] array1 = new int[tamano];
		int[] array2 = new int[tamano];

		// Pedir array 1.
		for (int i = 0; i < tamano; i++) {

			System.out.print("Introduce dato: ");
			array1[i] = sc.nextInt();
		}

		// Pedir array 2.
		for (int i = 0; i < tamano; i++) {

			System.out.print("Introduce dato: ");
			array2[i] = sc.nextInt();
		}

		// Comparar arrays y guardar resultado en boolean.
		boolean iguales = Arrays.equals(array1, array2);

		// Imprimir arrays.
		for (int i = 0; i < tamano; i++) {

			System.out.println(array1[i] + " " + array2[i]);
		}

		// Imprimir comparación.
		System.out.println("Iguales: " + iguales);
	}
}

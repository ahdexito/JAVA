package prog03_auto26;

import java.util.Arrays;
import java.util.Scanner;

public class Prog03_auto26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
          26. Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de
		ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los
		jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las
		puntuaciones en orden descendente (de la más alta a la más baja).
		 */
		int[] datos = new int[8];
		int aux;

		for (int i = 0; i < datos.length; i++) {

			System.out.print("Introduce puntuación: ");
			datos[i] = sc.nextInt();
		}

		Arrays.sort(datos);

		for (int i = 0; i < datos.length / 2; i++) {

			aux = datos[i];
			datos[i] = datos[datos.length - 1 - i];
			datos[datos.length - 1 - i] = aux;
		}

		for (int i = 0; i < datos.length; i++) {

			System.out.println(datos[i] + " ");
		}
	}
}

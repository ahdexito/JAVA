package prog03_ejer1_02;

import java.util.Scanner;

public class PROG03_Ejer1_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EJERCICIO EVALUABLE 2
		
		
		int[] entrada = new int[10];

		// Solicitar número.
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce número: ");
			entrada[i] = sc.nextInt();
		}

		// Guardar valor del primero.
		int primero = entrada[0];

		// Cambiar posiciones del resto de números.
		for (int i = 0; i < 9; i++) {
			entrada[i] = entrada[i + 1];
		}

		//  El valor del último pasa a ser el del primero.
		entrada[entrada.length - 1] = primero;

		// Imprimir vector.
		for (int i = 0; i < 10; i++) {
			System.out.print(entrada[i] + " ");
		}
		
		sc.close();
	}
}

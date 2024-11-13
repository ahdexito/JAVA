package prog03_automatriz06;

import java.util.Scanner;

public class Prog03_autoMatriz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
          6. Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal
		principal sean 1 y el resto 0.
		 */
		int[][] tabla = new int[7][7];
		
		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < 7; j++) {
				
				tabla[i][i] = 1;
			}
		}
		
		for (int i=0; i<7; i++) {
			
			for (int j=0; j<7; j++) {
				
				System.out.print(tabla[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}

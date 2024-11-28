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
		
		for (int x=0; x<7; x++) {

			
				
				tabla[x][x] = 1;
				tabla[x][(6-x)] = 8;
			
		}
		
		for (int x=0; x<7; x++) {
			
			for (int y=0; y<7; y++) {
				
				System.out.print(tabla[x][y] + " ");
			}
			System.out.print("\n");
		}
	}
}

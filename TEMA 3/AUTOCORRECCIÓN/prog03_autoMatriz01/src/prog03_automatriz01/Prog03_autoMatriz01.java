package prog03_automatriz01;

import java.util.Scanner;

public class Prog03_autoMatriz01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
		y luego muestre la matriz por pantalla.
        */
        
        int[][] matriz = new int[5][5];
		int numero = 1;
		
		for (int i=0; i<5; i++) {
			
			for (int j=0; j<5; j++) {
				
				matriz[i][j] = numero + j;
			}
			numero+=5;
		}
		
		for (int i=0; i<5; i++) {
			
			for (int j=0; j<5; j++) {
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}
    }
}
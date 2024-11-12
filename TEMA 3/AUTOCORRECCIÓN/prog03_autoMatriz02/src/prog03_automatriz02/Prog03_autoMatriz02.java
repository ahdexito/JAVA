package prog03_automatriz02;

import java.util.Scanner;

public class Prog03_autoMatriz02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
		multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
        */
        
        int[][] matriz = new int[10][10];
        
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				int a = i+1,  b = j+1;
				matriz[i][j] = a*b;
			}
		}
		
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				System.out.println((i+1) + " * " + (j+1) + " = " + matriz[i][j]);
			}
			
			System.out.print("\n");
		}
    }
}
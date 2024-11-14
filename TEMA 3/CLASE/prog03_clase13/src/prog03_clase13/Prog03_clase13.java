package prog03_clase13;

import java.util.Scanner;

public class Prog03_clase13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        13. Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo los de los
		bordes que deben ser 1. Mostrarla.
        */
        		
        int[][] marco = new int[8][6];
		
		for (int i=0; i<8; i++) {
			
			for (int j=0; j<6; j++) {
				
				if (i == 0 || i == 7 || j == 0 || j == 5)
					marco[i][j] = 1;
			}
		}
		
		for (int i=0; i<8; i++) {
			
			for (int j=0; j<6; j++) {
				
				System.out.print(marco[i][j] + " ");
			}
			System.out.print("\n");
		}
        
    }
}

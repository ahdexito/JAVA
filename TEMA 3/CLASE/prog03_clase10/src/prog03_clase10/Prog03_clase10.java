package prog03_clase10;

import java.util.Scanner;

public class Prog03_clase10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        10. Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición
		T[n,m] debe contener n+m. Después se debe mostrar su contenido.
        */
        
        int[][] tabla = new int[5][5];
		
		for (int i=0; i<5; i++) {
			
			for (int j=0; j<5; j++) {
				
				tabla[i][j] = (i + j);
			}
		}
		
		for (int i=0; i<5; i++) {
			
			for (int j=0; j<5; j++) {
				
				System.out.print(tabla[i][j] + " ");
			}
			System.out.print("\n");
		}
        
    }
}

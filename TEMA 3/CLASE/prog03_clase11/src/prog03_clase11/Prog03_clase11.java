package prog03_clase11;

import java.util.Scanner;

public class Prog03_clase11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        11. Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma. (Las matrices se
		pueden inicializar con valores fijos.)
        */
        
        int[][] tabla1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int[][] tabla2 = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
		int[][] tabla3 = new int[3][3];
		
		for (int i=0; i<3; i++) {
			
			for (int j=0; j<3; j++) {
				
				tabla3[i][j] = tabla1[i][j] + tabla2[i][j];
				System.out.print(tabla3[i][j] + " ");
			}
			System.out.print("\n");
		}
 		
    }
}

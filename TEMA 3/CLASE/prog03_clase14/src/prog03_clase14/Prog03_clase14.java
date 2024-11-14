package prog03_clase14;

import java.util.Scanner;

public class Prog03_clase14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        14. Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla.
        */
        
        int[][] tabla = {{1, 2, 3},
						  {4, 5, 6},
						  {7, 8, 9}};
		
		for (int i=0; i<3; i++) {
			
			for (int j=0; j<3; j++) {
				
				System.out.print(tabla[j][i] + " ");
			}
			System.out.print("\n");
		}
    }
}

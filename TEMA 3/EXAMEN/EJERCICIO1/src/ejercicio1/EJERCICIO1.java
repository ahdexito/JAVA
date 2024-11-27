package ejercicio1;

import java.util.Scanner;

public class EJERCICIO1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int[][] matriz = new int[4][4];
		
		System.out.println("INTRODUCE LOS ELEMENTOS DE LA MATRIZ 4x4:");
		
		//int[][] matriz = {{16, 2, 3, 13},{5, 11, 10, 8},{9, 7, 6, 12},{4, 14, 15, 1}};
		
		// RELLENAR MATRIZ
		for (int i=0; i<4; i++) {
			
			for (int j=0; j<4; j++) {
				
				boolean valido = true;
				
				do {
					try {
						System.out.print("Introduce dato en posición (" + i + "," + j + "): ");
						matriz[i][j] = sc.nextInt();
						break;
					} 
					
					catch (Exception e) {
						System.out.println("Dato no válido.");
						valido = false;
						sc.nextLine();
					}
				} while (!valido);		
			}
		}
		
		int filas=0, columnas=0, diagonalDesc=0, diagonalAsc=0; 

		for (int i=0; i<4; i++) {
			
			for (int j=0; j<4; j++) {
				
				filas += matriz[i][j];
				columnas += matriz[j][i];
				diagonalDesc += matriz[i][i];
				diagonalAsc += matriz[i][matriz[i].length - i - 1];
			}
		}
		
		if (filas == columnas && columnas == diagonalDesc && diagonalDesc == diagonalAsc)
			System.out.println("La matriz es mágica.");
		
		else
			System.out.println("La matriz no es mágica.");
        
    }
}

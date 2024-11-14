package prog03_clase12;

import java.util.Scanner;

public class Prog03_clase12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        12. Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de cada columna.
        */
        
        int[][] tabla = new int[10][10];
		
		// Rellenar array de aleatorios.
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				tabla[i][j] = (int)(Math.random()*2);
			}
		}
		
		// Imprimir array.
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				System.out.print(tabla[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		int[] fila = new int[10];
		int[] columna = new int[10];
		
		// Sumar los valores
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				// Sumar datos de cada fila.
				fila[i] += tabla[i][j];
				//Sumar datos de cada columna.
				columna[j] += tabla[i][j];
			}
		}
        
		System.out.println("\n FILAS:");
		for (int i=0; i<10; i++) {
			System.out.print(fila[i] + " ");
		}
		
		System.out.print("\n");
		
		System.out.println("\nCOLUMNAS:");
		for (int i=0; i<10; i++) {
			System.out.print(columna[i] + " ");
		}
    }
}

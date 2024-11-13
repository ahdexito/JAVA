package prog03_automatriz05;

import java.util.Scanner;

public class Prog03_autoMatriz05 
{

     public static void main(String[] args) 
     {
          Scanner sc = new Scanner (System.in);
          
          /*
          5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
		empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
		información de N personas distintas (valor también introducido por teclado). Para cada
		persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
		guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
		género.
          */
          
          System.out.print("Introduce cantidad de personas a insertar: ");
		int n = sc.nextInt();
		
		int[][] personas = new int[n][2];
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Persona " + (i+1) + ": ");
			System.out.print("Introduce género (0 varón, 1 mujer): ");
			personas[i][0] = sc.nextInt();
			
			System.out.print("Introduce sueldo: ");
			personas[i][1] = sc.nextInt();
		}
		
		int media_varon=0, media_mujer=0, contador_varon=0, contador_mujer=0;
		
		for (int i=0; i<n; i++) {
			
			if (personas[i][0] == 0) {
				
				contador_varon++;
				media_varon += personas[i][1];
			}
			
			else {
				
				contador_mujer++;
				media_mujer += personas[i][1];
			}
		}
		
		System.out.println("\nEl sueldo medio para un varón es: " + (media_varon/contador_varon));
		System.out.println("El sueldo medio para una mujer es: " + (media_mujer/contador_mujer));
     }

}

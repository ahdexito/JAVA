package prog03_auto22;

import java.util.Arrays;

import java.util.Scanner;

public class Prog03_auto22 {

     public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          
          /*
          22. Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N
		que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
          */
          
          System.out.print("Introduce valor N: ");
		int n = sc.nextInt();
		
		System.out.print("Introduce valor M: ");
		int m = sc.nextInt();
          
		int[] array = new int[n];
		
		Arrays.fill(array, m);
		
		for (int i=0; i<array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
     }
}

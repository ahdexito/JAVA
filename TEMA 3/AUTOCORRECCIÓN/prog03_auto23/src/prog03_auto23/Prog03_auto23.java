package prog03_auto23;

import java.util.Arrays;

import java.util.Scanner;

public class Prog03_auto23 {

     public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          
          /*
          23. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
		valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
		muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
          */
          
		int tamano = 0;
		
          for (int i=1; i<=10; i++) {
			
			tamano += i;
		}
		
		int[] array = new int[tamano];
		
		
		int posicion = 0;
		
		for (int i=1; i<=10; i++) {
			
			Arrays.fill(array, posicion, posicion+i, i);
			
			posicion += i;
		}
		
		
		for (int i=0; i<tamano; i++) {
			
			System.out.println(i + ". " + array[i]);
		}
     }
}

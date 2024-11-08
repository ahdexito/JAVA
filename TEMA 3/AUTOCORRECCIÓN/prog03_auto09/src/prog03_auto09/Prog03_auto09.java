package prog03_auto09;

import java.util.Scanner;

public class Prog03_auto09 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          9. Crea un programa que permita al usuario almacenar una secuencia 
	  aritmética en un array y luego mostrarla. Una secuencia aritmética 
	  es una serie de números que comienza por un valor inicial V, y 
	  continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia
	  sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… 
	  El programa solicitará al usuario V, I además de N (nº de valores a crear).
          */
          
          System.out.print("Introduce el valor inicial: ");
	  int v = sc.nextInt();
	  
	  System.out.print("Introduce el incremento: ");
	  int i = sc.nextInt();
	  
	  System.out.print("Introduce el número de valores a crear: ");
	  int n = sc.nextInt();
	  
	  int[] array = new int[n];
	  array[0] = v;
		  
	  System.out.print("La secuencia solicitada es: " + v);
	  
	  for(int j=1; j<array.length; j++)
	  {
	       array[j] = array[j-1] + i;
	       
	       System.out.print(", " + array[j]);
	  }
	  
          System.out.print(".\n");
     }

}

package prog03_auto05;

import java.util.Scanner;

public class Prog03_auto05 
{
     public static void main(String[] args) 
     {
	  Scanner sc = new Scanner(System.in);
          /*
	  5. Crear un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
	  escriba M en todas sus posiciones y lo muestre por pantalla.
	  */
	  
          System.out.print("Introduce valor de N: ");
	  int n = sc.nextInt();
	  
	  System.out.print("Introduce valor de M: ");
	  int m = sc.nextInt();
	  
	  int[] array = new int[n];
	  
	  for(int i=0; i<n; i++)
	  {
	       array[i] = m;
	       
	       System.out.println(array[i]);
	  }
     }
 
}

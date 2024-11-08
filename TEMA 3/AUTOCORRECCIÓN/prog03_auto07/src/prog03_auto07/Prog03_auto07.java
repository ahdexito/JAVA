package prog03_auto07;

import java.util.Scanner;

public class Prog03_auto07 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          7. Crear un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
	  enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
	  mostrará en qué posiciones del array aparece N.
          */
          
          int[] array = new int[100];
	  
	  for(int i=0; i<array.length; i++)
	  {
	       array[i] = (int)(1 + Math.random()*10);
	  }
	  
	  System.out.print("Introduce un número: ");
	  int n = sc.nextInt();
	  	  
	  for(int j=0; j<array.length; j++)
	  {
	       if(array[j]==n)
		    System.out.println("Posición: " + j + ". Número: " + array[j]);
	  }
	  
          
     }
 
}

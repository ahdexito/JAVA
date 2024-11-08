package prog03_auto10;

import java.util.Scanner;

public class Prog03_auto10 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          10. Crear un programa que cree un array de enteros e introduzca la 
	  siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. 
	  hasta introducir 10 diez veces, y luego la muestre por pantalla.
          */
          	  
          int[] array = new int[10];
	  
	  for(int i=0; i<array.length; i++)
	  {
	       array[i] = i + 1;
	       
	       for(int j=0; j<array[i]; j++)
	       {
		    System.out.print(array[i] + " ");
	       }
	       
	       System.out.print("\n");
	  }
     }

}

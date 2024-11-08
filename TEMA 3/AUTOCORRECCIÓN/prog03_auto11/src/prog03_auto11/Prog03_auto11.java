package prog03_auto11;

import java.util.Scanner;

public class Prog03_auto11 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          11. Crear un programa que pida al usuario 10 reales de doble precisión, 
	  calcule su media y luego muestre los que están por encima de la media.
          */
          
          double[] array = new double[10];
	  double media=0;
	  
	  for(int i=0; i<array.length; i++)
	  {
	       System.out.print("Introduce número: ");
	       array[i] = sc.nextInt();
	       
	       media += array[i];
	  }
	  
	  media /= array.length;
	  
	  System.out.print("Están por encima de la media (" + media + "): ");
	  
	  for(int i=0; i<array.length; i++)
	  {
	       if(array[i]>media)
		    System.out.print(array[i] + " ");
	  }
	  
          System.out.print("\n");
     }

}

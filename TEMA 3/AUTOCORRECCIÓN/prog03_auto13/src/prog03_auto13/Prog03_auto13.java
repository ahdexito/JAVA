package prog03_auto13;

import java.util.Scanner;

public class Prog03_auto13 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          13. Un programa que reserve espacio para dos vectores de cinco elementos, 
	  pida al usuario sus valores y calcule su producto escalar (x1·y1+ x2·y2 + z1·z2) 
	  el cual se mostrará por pantalla.
          */
          
          int[] x = new int[5], y = new int[5], z = new int[5];
	  int total=0;
	  
	  for(int i=0; i<5; i++)
	  {
	       System.out.print("Introduce valor de x (" + (i+1) + "): ");
	       x[i] = sc.nextInt();
	       
	       System.out.print("Introduce valor de y (" + (i+1) + "): ");
	       y[i] = sc.nextInt();
	       
	       System.out.print("\n");
	       
	       z[i] = x[i] * y[i];    
	  }
	  
	  for(int i=0; i<5; i++)
	  {
	       total+=z[i];
	  }
	  
	  System.out.println("El producto escalar de ambos vectores es: " + total);
     }

}

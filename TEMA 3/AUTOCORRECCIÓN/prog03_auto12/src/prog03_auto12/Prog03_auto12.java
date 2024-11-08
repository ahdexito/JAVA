package prog03_auto12;

import java.util.Scanner;

public class Prog03_auto12 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          12. Crear un programa que sume dos vectores de cinco elementos y guarde el 
	  resultado en un tercer vector. El programa pedirá al usuario valores que se 
	  almacenarán en dos de los tres vectores, calculará la suma de ambos vectores, 
	  y almacená el resultado en el tercer vector. Posteriormente se mostrará por 
	  pantalla los elementos del tercer vector. (La suma de los dos vectores 
	  será x1+y1, x2+y2, …. xn+yn).
          */
          
          int[] x = new int[5], y = new int[5], z = new int[5];
	  
	  for(int i=0; i<5; i++)
	  {
	       System.out.print("Introduce valor de x (" + (i+1) + "): ");
	       x[i] = sc.nextInt();
	       
	       System.out.print("Introduce valor de y (" + (i+1) + "): ");
	       y[i] = sc.nextInt();
	       
	       System.out.print("\n");
	       
	       z[i] = x[i] + y[i];
	  }
	  
	  System.out.print("La suma de ambos vectores es: " + z[0]);
	  
	  for(int i=1; i<5; i++)
	  {
	       System.out.print(", " + z[i]);
	  }
	  
          System.out.print(".\n");
     }

}

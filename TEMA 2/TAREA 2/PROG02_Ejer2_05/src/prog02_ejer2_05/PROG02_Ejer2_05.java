package prog02_ejer2_05;

import java.util.Scanner;

public class PROG02_Ejer2_05 
{

     public static void main(String[] args) 
     {
	  /*
	  Realizar una aplicación que pida un número N. A continuación, la aplicación solicitará
	  introducir N sueldos, y finalmente, se mostrará el sueldo máximo.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int sueldo, sueldoMax=0;
	  
	  System.out.print("Introduzca un número: ");
	  int numero = sc.nextInt();
	  
	  System.out.print("\n");
	  
	  for(int i=0; i<numero; i++)
	  {
	       System.out.print("Introduzca sueldo: ");
	       sueldo = sc.nextInt();
	       
	       // Comparar si el sueldo es mayor al máximo. Si lo es, sustituir el dato.
	       if (sueldo>sueldoMax)
		    sueldoMax = sueldo;
	       
	       System.out.print("\n");
	  }
	  
	  System.out.println("El sueldo máximo es: " + sueldoMax);

     }
     
}

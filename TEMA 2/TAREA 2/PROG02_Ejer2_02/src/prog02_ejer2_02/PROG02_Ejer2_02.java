package prog02_ejer2_02;

import java.util.Scanner;

public class PROG02_Ejer2_02 
{

     public static void main(String[] args) 
     {
	  // Realizar una aplicación que pida 10 sueldos, y muestre: su suma, y cuantos hay mayores de 1000€.
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int suma = 0, mayores = 0;
	  
	  for(int i=0; i<10; i++)
	  {
	       System.out.print("Introduzca sueldo: ");
	       int sueldo = sc.nextInt();
	       
	       suma += sueldo;
	       
	       if (sueldo>1000)
		    mayores++;
	  }
	  
	  System.out.println("La suma de todos los sueldos es: " + suma + "€, y de estos sueldos son mayores de 1000€: " + mayores);
	  
     }
     
}

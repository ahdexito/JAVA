package prog02_ejer1_06;

import java.util.Scanner;

public class PROG02_Ejer1_06 
{

     public static void main(String[] args) 
     {
	  // Crea un programa que pida al usuario dos números enteros y diga si uno y sólo uno es par.

	  Scanner sc = new Scanner(System.in); 
	  
	  System.out.print("Introduzca el primer número: ");
	  int num1 = sc.nextInt();
	  
	  System.out.print("Introduzca el segundo número: ");
	  int num2 = sc.nextInt();
	  
	  // Evaluar si alguno de los número no es par.
	  if (num1 %2 != 0 || num2 %2 != 0)
	  {
	       // Evaluar si también alguno de los números es par.
	       if (num1 %2 == 0 || num2 %2 == 0)
		    System.out.println("Uno de los número es par.");
	       
	       // La condición se cumplirá si hay un par y un impar.
	  }
     }
     
}

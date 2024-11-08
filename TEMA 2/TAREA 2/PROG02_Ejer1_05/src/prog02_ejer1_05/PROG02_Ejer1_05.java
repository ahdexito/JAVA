package prog02_ejer1_05;

import java.util.Scanner;

public class PROG02_Ejer1_05 
{

     public static void main(String[] args) 
     {
	  // Crea un programa que pida al usuario dos números enteros y diga si al menos uno es par.
	  
	  Scanner sc = new Scanner(System.in); 
	  
	  System.out.print("Introduzca el primer número: ");
	  int num1 = sc.nextInt();
	  
	  System.out.print("Introduzca el segundo número: ");
	  int num2 = sc.nextInt();
	  
	  if (num1 %2 == 0 || num2 %2 == 0)
	       System.out.println("Uno de los números introducidos es par.");
     }
     
}

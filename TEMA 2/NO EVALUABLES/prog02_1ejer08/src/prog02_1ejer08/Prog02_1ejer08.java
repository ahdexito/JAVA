package prog02_1ejer08;

import java.util.Scanner;

public class Prog02_1ejer08 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribir un programa que lea dos números y los muestre en orden ascendente.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca el primer número:");
	  int numero1 = sc.nextInt();
	  
	  System.out.println("Introduzca el segundo número:");
	  int numero2 = sc.nextInt();
	  
	  if (numero1 >= numero2)
	       System.out.println("El orden ascendente de los números es: " + numero2 + ", " + numero1);
	  
	  else
	       System.out.println("El orden ascendente de los números es: " + numero1 + ", " + numero2);
     }
     
}

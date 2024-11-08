package prog02_1ejer07;

import java.util.Scanner;

public class Prog02_1ejer07 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribir un programa que lea 2 números distintos y muestre el mayor.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca el primer número:");
	  int numero1 = sc.nextInt();
	  
	  System.out.println("Introduzca el segundo número:");
	  int numero2 = sc.nextInt();
	  
	  if (numero1 >= numero2)
	       System.out.println("El número mayor es: " + numero1);
	  
	  else
	       System.out.println("El número mayor es: " + numero2);
     }
     
}

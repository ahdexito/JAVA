package prog02_1ejer04;

import java.util.Scanner;

public class Prog02_1ejer04 
{
    
     public static void main(String[] args) 
     {
	  /*
	  Escribe un programa que lee un número y diga si es positivo o negativo, consideraremos el
	  cero como positivo.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca un número:");
	  
	  int numero = sc.nextInt();
	  
	  if (numero < 0)
	       System.out.println("El número es negativo.");
	  
	  else
	       System.out.println("El número es positivo.");
     }
     
}

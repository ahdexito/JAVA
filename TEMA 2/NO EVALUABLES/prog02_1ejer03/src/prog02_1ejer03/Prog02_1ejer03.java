package prog02_1ejer03;

import java.util.Scanner;

public class Prog02_1ejer03 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribir un programa que pide la edad por teclado y muestre el mensaje de “eres mayor de
	  edad” o el mensaje de “eres menor de edad” en función de la edad introducida.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca su edad:");
	  int edad = sc.nextInt();
	  
	  if (edad>=18)
	      System.out.println("Eres mayor de edad.");
       
	 else
	      System.out.println("Eres menor de edad.");
       
	  
	  
     }
     
}

package prog02_1ejer05;

import java.util.Scanner;

public class Prog02_1ejer05 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribir un programa que pida un número entero por teclado y muestre un mensaje
	  indicando si el número es par o impar.
	  Pista: Un número es par si el resto que se obtiene al dividir entre dos es cero.
	  */  
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca un número:");
	  int numero = sc.nextInt();
	  
	  numero = numero %2;
	  
	  if (numero == 0)
	       System.out.println("El número es par.");
	  
	  else
	       System.out.println("El número es impar.");
	  
     }
     
}

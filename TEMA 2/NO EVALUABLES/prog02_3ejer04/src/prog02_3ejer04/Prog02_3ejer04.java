package prog02_3ejer04;

import java.util.Scanner;

public class Prog02_3ejer04 
{

     public static void main(String[] args) 
     {
	  /*
	  Realizar un programa que muestre los números desde el 1 hasta un número N que se
	  introducirá por teclado empleando la estructura ‘for’.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca un número:");
	  int numero = sc.nextInt();
	  
	  for(int i=1; i<=numero; i++)
	  {
	       System.out.print(i + ", ");
	  }
     }
     
}

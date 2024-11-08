package prog02_1ejer06;

import java.util.Scanner;

public class Prog02_1ejer06 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribir un programa que pida al usuario dos números enteros, y se comporte de la
	  siguiente forma:
	  ◦ Si el segundo número es distinto a cero, mostrará el resultado de dividir el primero con
	  el segundo número.
	  ◦ Si el segundo número es cero, se mostrará por consola: “Error: No se puede dividir entre
	  cero”.
	  */ 
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca el primer número:");
	  int numero1 = sc.nextInt();
	  
	  System.out.println("Introduzca el segundo número:");
	  int numero2 = sc.nextInt();
	  
	  if (numero2 != 0)
	       System.out.println("La división de ambos números es: " + numero1 / numero2);
	  
	  else
	       System.out.println("Error: No se puede dividir entre cero.");
     }
     
}

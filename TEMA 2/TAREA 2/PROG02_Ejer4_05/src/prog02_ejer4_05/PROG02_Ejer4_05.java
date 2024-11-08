package prog02_ejer4_05;

import java.util.Scanner;

public class PROG02_Ejer4_05 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          Escribe un programa que permita ir introduciendo una serie indeterminada de números
	  mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar
	  el total acumulado, el contador de los números introducidos y la media.
          */
          
          int numero, total=0, contador=0;
	  
	  do 
	  {	
	       System.out.print("Introduzca número: ");
	       numero = sc.nextInt();
	       
	       // Sumar el número introducido al total.
	       total += numero;
	       
	       // Contar las veces que se solicita un número.
	       contador++;
	       
	  } while (total<10000);
	  
	  // Calcular la media.
	  int media = total / contador;
	  
	  System.out.println("El total acumulado es: " + total);
	  System.out.println("La cantidad de números introducidos es: " + contador);
	  System.out.println("La media de los números es: " + media);
          
     }

}

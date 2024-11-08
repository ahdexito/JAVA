package prog02_ejer4_02;

import java.util.Scanner;

public class PROG02_Ejer4_02 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          Realiza un programa que lea y acepte únicamente aquellos números que sean mayores
	  que el último dado. La introducción de números finaliza con la introducción de un 0. Al
	  final se mostrará:
	   El total de números introducidos, excluido el 0.
	   El total de números fallados.
          */
	  
	  // Solicitar el primer número.
	  System.out.print("Introduzca un número inicial: ");
	  int numeroAnterior = sc.nextInt();
	  
	  int numero, contVueltas=0, contFallos=0;
		  
          do
	  {
	       // Solicitar n números.
	       System.out.print("Introduzca un número: ");
	       numero = sc.nextInt();
	       
	       // Si el número es menor que el anterior y no es 0, mostrar mensaje de fallo y contarlo.
	       if (numero<numeroAnterior && numero!=0)
	       {
		    System.err.println("Fallo. Es menor.");
		    contFallos++;
	       }
	       
	       // Contador de vueltas.
	       contVueltas++;
	       
	       // Guardar el valor del número actual para comparar posteriormente.
	       numeroAnterior = numero;
	       
	  // Realizar bucle mientras no se introduzca 0.
	  } while (numero!=0);
	  
	  System.out.println("Total de números introducidos: " + contVueltas);
	  System.out.println("Total de fallos: " + contFallos);
          
     }

}

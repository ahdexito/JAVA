package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 
{

     public static void main(String[] args) 
     {
	  Scanner sc = new Scanner(System.in);

	  System.out.print("Introduzca el número A: ");
	  int numeroA = sc.nextInt();
	  int numeroB = 0;

	  while (numeroA > numeroB) 
	  {
	       System.out.print("Introduce el número B (mayor que A): ");
	       numeroB = sc.nextInt();

	       if (numeroA > numeroB) 
		    System.err.println("El número B debe ser mayor que A.");
	  }

	  System.out.print("Los número desde A hasta B son: ");

	  int operador = numeroA;
	  int contadorPares = 0;

	  while (operador <= numeroB) 
	  {
	       // Mostrar números desde A hasta B.
	       System.out.print(operador + " ");

	       // Contar pares.
	       if (operador % 2 == 0) {
		    contadorPares++;
	       }

	       operador++;
	  }

	  System.out.println("\nLa cantidad de pares que se han contado es: " + contadorPares);
     }

}

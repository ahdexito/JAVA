package prog02_ejer4_03;

import java.util.Scanner;

public class PROG02_Ejer4_03 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          Escribir un programa en Java para adivinar un número entre 1 y 100 que
	  previamente se ha definido como una constante. El programa irá pidiendo números
	  al usuario y, siempre que dicho número no coincida con el número secreto, le
	  indicará si el número introducido es mayor o menor que el número secreto que tiene
	  que adivinar. Al final, el programa indicará la cantidad de intentos que se han
	  necesitado para adivinar el número. Si el número de intentos es menor que 5 se
	  mostrará “Enhorabuena!”. Si es un valor entre 5 y 10 se mostrará el mensaje “No está
	  mal”. Si el número de intentos es mayor que 10 se mostrará el mensaje “Debe practicar
	  más”.
          */
          
          final int numSecreto = 45;
	  
	  int numero, contador=0;
	  
	  do
	  {
	       // Solicitar el número.
	       System.out.print("Introduzca el número a adivinar: ");
	       numero = sc.nextInt();
	       
	       // Si es menor.
	       if (numero>numSecreto)
		    System.out.println("El número secreto es menor.");
	       
	       // Si es mayor.
	       if (numero<numSecreto)
		    System.out.println("El número secreto es mayor.");
	       
	       // Contador de intentos.
	       contador++;
	       
	  // Salir del bucle si acierta el número secreto.
	  } while (numero!=numSecreto);
	  
	  // Mostrar mensaje si es menor que 5 intentos.
	  if (contador<5)
	       System.out.println("¡Enhorabuena!");
	  
	  // Mostrar mensaje si es menos que 10 intentos.
	  else if (contador>5 && contador<=10)
	       System.out.println("No está mal.");
	  
	  // Mostrar mensaje si es mayor que 10 intentos.
	  else
	       System.out.println("Debe practicar más.");
	  
     }

}

package prog02_ejer4_04;

import java.util.Scanner;

public class PROG02_Ejer4_04 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          Modificar el ejercicio anterior para que el número máximo de intentos sea 5. Al terminar
	  el programa indicará si el usuario ha ganado (si ha adivinado el número en menos de cinco
	  intentos) o no.
          */
          
          final int numSecreto = 45;
	  
	  int numero, intentos=0;
	  
	  do
	  {
	       // Solicitar el número.
	       System.out.print("Introduce el número a adivinar: ");
	       numero = sc.nextInt();
	       
	       // Si es menor.
	       if (numero>numSecreto)
		    System.out.println("El número secreto es menor.");
	       
	       // Si es mayor.
	       if (numero<numSecreto)
		    System.out.println("El número secreto es mayor.");
	       
	       // Contador de intentos.
	       intentos++;
	  
	  // Salir del bucle si supera los intentos o acierta el número.
	  } while (intentos<5 && numero!=numSecreto);
	  
	  // Mostrar mensaje si el programa no superó 5 intentos.
	  if (intentos<=5 && numero==numSecreto)
	       System.out.println("¡Enhorabuena! Lo has adivinado en menos de 5 intentos");
	  
	  // Mostrar mensaje si el programa superó 5 intentos.
	  else
	       System.out.println("Has perdido, superaste el límite de 5 intentos.");
          
     }

}

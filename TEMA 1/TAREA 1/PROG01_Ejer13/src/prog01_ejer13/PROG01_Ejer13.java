package prog01_ejer13;

import java.util.Scanner;

public class PROG01_Ejer13 
{

     public static void main(String[] args) 
     {
	  /*
	  Ampliar el ejercicio 12 de forma que independientemente de si llueve o se han terminado las
	  tareas, el usuario podrá salir a la calle si es para ir a la biblioteca o, si no llueve y se han finalizado
	  las tareas.
	  El algoritmo solicitará al usuario (mediante variables booleanas) si llueve, si ha finalizado las tareas
	  y si necesita ir a la biblioteca.
	  Pista: utiliza los operadores lógicos que consideres oportunos.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  
	  // Preguntamos las condiciones y guardamos las respuestas en variables de tipo boolean.
	  System.out.println("¿Está lloviendo?");
	  boolean lluvia = sc.nextBoolean();
	  
	  System.out.println("¿Tareas terminadas?");
	  boolean tareas_terminadas = sc.nextBoolean();
	  
	  
	  // Añadimos la condición de la biblioteca.
	  System.out.println("¿Necesita ir a la biblioteca?");
	  boolean biblioteca = sc.nextBoolean();
	  
	  
	  // Creamos la variable "salir" con la que valoramos ambas condiciones primero, y después la biblioteca.
	  boolean salir = (lluvia==false && tareas_terminadas==true)&&biblioteca==true;
	  
	  
	  // Imprimimos por pantalla el resultado.
	  System.out.println("¿Se puede salir? = " + salir);
	  
     }
     
}

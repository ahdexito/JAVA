package prog01_ejer12;

import java.util.Scanner;

public class PROG01_Ejer12 
{

     public static void main(String[] args) 
     {
	  /*
	  Diseñar un algoritmo llamado “PROG01_Ejer12” que indique si podemos salir a la calle. Existen
	  aspectos que influirán en esta decisión, que son, si está lloviendo y si hemos terminado nuestras
	  tareas. Solo se puede salir a la calle si no está lloviendo y se han finalizado nuestras tareas.
	  El algoritmo solicitará al usuario (mediante variables booleanas) si llueve y si ha finalizado las
	  tareas.
	  Pista: utiliza los operadores lógicos que consideres oportunos.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  
	  // Preguntamos las condiciones y guardamos las respuestas en variables de tipo boolean.
	  System.out.println("¿Está lloviendo?");
	  boolean lluvia = sc.nextBoolean();
	  
	  System.out.println("¿Tareas terminadas?");
	  boolean tareas_terminadas = sc.nextBoolean();
	  
	  
	  // Creamos la variable "salir" con la que valoramos ambas condiciones.
	  boolean salir = lluvia==false && tareas_terminadas==true;
	  
	  
	  // Imprimimos por pantalla el resultado.
	  System.out.println("¿Se puede salir? = " + salir);
	  
     }
     
}

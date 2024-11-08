package prog02_ejer3_02;

import java.util.Scanner;

public class PROG02_Ejer3_02 
{

     public static void main(String[] args) 
     {
	  /*
	  Mejora el ejercicio 1 de forma que, la aplicación finalizará cuando el usuario acierte el
	  número secreto o cuando se rinda introduciendo el valor -1.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  
	  int min=1, max=100, aleatorio;  
	  
	  
	  System.out.println("Piensa en un número. Presiona ENTER cuando lo tengas.");
	  sc.nextLine();
	  
	  
	  // Añadir variable rendirse.
	  boolean correcto = false, rendirse = false;
	  
	  // Si se rinde o si acierta, terminar el programa.
	  while(correcto==false && rendirse==false)
	  {
	       aleatorio = (int)(min + Math.random() * (max - min + 1));
	       
	       System.out.println("Creo que es el " + aleatorio + ". ¿Tu número es mayor, menor, o igual?");
	       String respuesta = sc.nextLine();
	       
	       // Preguntar si es mayor o menor para actualizar el máximo o el mínimo.
	       switch (respuesta)
	       { 
		    case "menor" -> max = (aleatorio-1);
			 
		    case "mayor" -> min = (aleatorio+1);
		    
		    case "igual" -> correcto = true;
		    
		    // Si introduce -1, terminar el bucle.
		    case "-1" -> rendirse = true;
	       }
	       
	  }
	  
	  // Mostrar mensaje de victoria, si no, derrota.
	  if (correcto==true)
	       System.out.println("¡Victoria!");
	  
	  else
	       System.out.println("Te has rendido...");
	  
     }
     
     
}

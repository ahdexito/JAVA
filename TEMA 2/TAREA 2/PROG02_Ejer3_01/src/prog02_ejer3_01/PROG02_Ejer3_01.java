package prog02_ejer3_01;

import java.util.Scanner;

public class PROG02_Ejer3_01 
{

     public static void main(String[] args) 
     {
	  /*
	  Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador
	  intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta
	  adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número
	  que ha pensado).
	  Para mostrar un número al azar entre Min y Max se debe emplear la siguiente instrucción:
	  int aleatorio = (int)(Min + Math.random() * (Max – Min + 1);
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  
	  int min=1, max=100, aleatorio;  
	  
	  System.out.println("Piensa en un número. Presiona ENTER cuando lo tengas.");
	  sc.nextLine();
	  
	  
	  boolean correcto = false;
	  
	  while(correcto==false)
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
	       }
	       
	  }
	  
	  // Mostrar mensaje de victoria.
	  System.out.println("¡Victoria!");
	  
     }
     
}

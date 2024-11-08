package prog02_2ejer04;

import java.util.Scanner;

public class Prog02_2ejer04 
{

     public static void main(String[] args) 
     {
	  /*
	  Crea un programa que muestre un menú formado por las siguientes opciones:
	  El programa deberá comportarse de la siguiente manera:
	   Si se pulsa la opción 1, se mostrará por pantalla: ‘Has escogido sumar’.
	   Si se pulsa la opción 2, se mostrará por pantalla: ‘Has escogido restar’.
	   Si se pulsa la opción 3, se mostrará por pantalla: ‘Has escogido salir’.
	   Si se pulsa cualquier otra opción, se mostrará por pantalla: ‘La opción
	  seleccionada es incorrecta’.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("1. Sumar.\n2. Restar.\n3. Salir.\nEscoja una opción: ");
	  int opcion = sc.nextInt();
	  
	  switch (opcion)
	  {
	       case 1:
		    System.out.println("\nHas escogido sumar.");
		    break;
	       case 2:
		    System.out.println("\nHas escogido restar.");
		    break;
	       case 3:
		    System.out.println("\nHas escogido salir.");
		    break;
	       default:
		    System.out.println("\nLa opción seleccionada es incorrecta.");
		    break;
	  }
     }
     
}

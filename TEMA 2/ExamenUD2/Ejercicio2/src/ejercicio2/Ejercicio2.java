package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 
{

     public static void main(String[] args) 
     {
	  Scanner sc = new Scanner(System.in);

	  final int contra = 2479;
	  int numero = 0, intentos = 4;
	  
	  System.out.println("=================================================================");
	  System.out.println("\tBienvenido a la caja fuerte");
	  System.out.println("\tTienes 4 oportunidades para adivinar la combinación");
	  System.out.println("=================================================================\n");
	  
	  
	  do 
	  {
	       System.out.print("Introduzca el número secreto: ");
	       numero = sc.nextInt();
	       
	       // Validar que tenga 4 cifras.
	       if (numero>999 && numero<10000)
	       {		    
		    if (numero!=contra)
		    {
			 System.err.println("Lo siento, combinación incorrecta.");
			 
			 intentos--;
			 
			 System.err.println("Te quedan " + intentos + " oportunidades.\n");
		    }	 
	       }
	       
	       else
	       {
		    System.err.println("El número no tiene 4 cifras. Inténtalo de nuevo.\n");
	       }
	  // Validar que tenga intentos o que acierte.   
	  } while (intentos>0 && numero!=contra);
	  
	  System.out.print("\n");
	  
	  if (numero==contra)
	       System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
	  
	  else
	       System.out.println("Se han agotado las oportunidades. La caja fuerte permanece cerrada.");
     }

}

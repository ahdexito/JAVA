package prog02_ejer1_12;

import java.util.Scanner;

public class PROG02_Ejer1_12 
{

     public static void main(String[] args) 
     {
	  /*
	  Escriba un programa en Java que muestre el siguiente menú:
	  Tras mostrar el menú, se solicitará al usuario que seleccione una opción. En función
	  de la opción seleccionada el programa deberá pedir los datos necesarios para calcular el
	  área, realizar el cálculo y mostrar el resultado por pantalla.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  // Solicitar una opción del menú.
	  System.out.print("CÁLCULO DE ÁREAS\n"
		  + "==============================\n"
		  + "1 - Calcular el área de un triángulo.\n"
		  + "2 - Calcular el área de un trapecio.\n"
		  + "3 - Calcular el área de un rectángulo.\n"
		  + "4 - Salir.\n\n"
		  + "Opción: ");
	  
	  int opcion = sc.nextInt();
	  
	  switch (opcion)
	  {    
	       // Si se introduce 1, ejecutar únicamente el programa seleccionado.
	       case 1:
		    System.out.println("\nÁREA DEL TRIÁNGULO");

		    System.out.print("Base: ");
		    int base = sc.nextInt();

		    System.out.print("Altura: ");
		    int altura_triangulo = sc.nextInt();

		    System.out.println("El área del triángulo es: " + ((base*altura_triangulo)/2));
		    break;
	       
	       // Si se introduce 2, ejecutar únicamente el programa seleccionado.
	       case 2:
		    System.out.println("\nÁREA DEL TRAPECIO");
		    
		    System.out.print("Base 1: ");
		    int base1 = sc.nextInt();
		    
		    System.out.print("Base 2: ");
		    int base2 = sc.nextInt();
		    
		    System.out.print("Altura: ");
		    int altura_trapecio = sc.nextInt();
		    
		    System.out.println("El área del trapecio es: " + ((base1+base2)*altura_trapecio/2));
		    break;
		    
	       // Si se introduce 3, ejecutar únicamente el programa seleccionado.
	       case 3:
		    System.out.println("\nÁREA DEL RECTÁNGULO");
		    
		    System.out.print("Lado 1: ");
		    int lado1 = sc.nextInt();
		    
		    System.out.print("Lado 2: ");
		    int lado2 = sc.nextInt();
		    
		    System.out.println("El área del rectángulo es: " + (lado1*lado2));
		    break;
		  
	       // Si se introduce 4, salir.
	       case 4:
		    System.out.println("\nSALIR");
		    break;

	       // Si se introduce otro valor, mostrar error.
	       default:
		    System.out.println("\nError. Número no válido.");
	  }
     }
     
}

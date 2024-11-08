package prog02_ejer5_01;

import java.util.Scanner;

public class PROG02_Ejer5_01 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          1. Crea una aplicación que muestre un menú con tres opciones:
	  a) Figura 1
	  b) Figura 2
	  c) Figura 3
	  d) Salir
          */
	  
	  int tamano;
	  char opcion;
	  
	  // Repetir el programa hasta que se introduzca la opción "d" para salir.
	  do
	  {
	       // Menú de selección de figuras.
	       System.out.println("Elige una opción:");
	       System.out.println("a: Figura 1.");
	       System.out.println("b: Figura 2.");
	       System.out.println("c: Figura 3.");
	       System.out.println("d: Salir.");
	       opcion = sc.next().charAt(0);
	  
	       switch (opcion) 
	       {    
		    // Figura 1: Triángulo invertido de más a menos.
		    case 'a':
			 System.out.println("\nFigura 1:");

			 // Solicitamos el tamaño del triángulo/pirámide.
			 System.out.print("Introduce el tamaño de la figura: ");
			 tamano = sc.nextInt();

			 for (int i = tamano; i > 0; i--) 
			 {
			      // Imprimir los espacios iniciales para la sangría.
			      for (int j = 0; j < (tamano - i); j++) 
			      {
			       System.out.print(" ");
			      }

			      // Imprimir los asteriscos.
			      for (int j = 0; j < i; j++) 
			      {
			      System.out.print("*");
			      }
			      
			      // Imprimir el salto de línea.
			      System.out.print("\n");
			      
			 }
			 System.out.print("\n");
			 break;


		    // Figura 2: Pirámide centrada.    
		    case 'b':
			 System.out.println("\nFigura 2:");

			 // Solicitamos el tamaño del triángulo/pirámide.
			 System.out.print("Introduce el tamaño de la figura: ");
			 tamano = sc.nextInt();

			 for (int i = 1; i <= tamano; i++) 
			 {
			      // Imprimir los espacios iniciales para centrar la pirámide.
			      for (int j = 0; j < (tamano - i); j++) 
			      {
				  System.out.print(" ");
			      }
			      // Imprimir los asteriscos de cada fila.
			      for (int k = 1; k <= (2 * i - 1); k++) 
			      {
				  System.out.print("*");
			      }
			      
			      // Imprimir el salto de línea.
			      System.out.print("\n");
			      
			 }
			 System.out.print("\n");
			 break;


		    // Figura 3: Triángulo invertido de menos a más.    
		    case 'c':
			 System.out.println("\nFigura 3:");

			 // Solicitamos el tamaño del triángulo/pirámide.
			 System.out.print("Introduce el tamaño de la figura: ");
			 tamano = sc.nextInt();

			 for (int i = 1; i <= tamano; i++) 
			 {
			      // Imprimir los espacios iniciales para la sangría.
			      for (int j = 0; j < (tamano - i); j++) {
				  System.out.print(" ");
			      }
			      // Imprimir los asteriscos.
			      for (int j = 0; j < i; j++) {
				  System.out.print("*");
			      }
			      // Imprimir el salto de línea.
			      System.out.print("\n");
			      
			 }
			 System.out.print("\n");
			 break;


		    case 'd':
			 // Salir del bucle.
			 System.err.println("\nSaliendo...");
			 break;

			 
		    default:
			 // Pedir una opción correcta.
			 System.err.println("\nOpción no válida. Debes elegir entre a, b, c, d.");
			 break;
	       }
	       
	  } while (opcion!='d');

     }

}

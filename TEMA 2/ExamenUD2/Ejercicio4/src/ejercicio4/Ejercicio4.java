package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 
{

     public static void main(String[] args) 
     {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("OPERACIONES MATEMÁTICAS BÁSICAS");
	  System.out.println("======================================");
	  System.out.println("1. Suma");
	  System.out.println("2. Resta");
	  System.out.println("3. Multiplicación");
	  System.out.println("4. División\n");
	  
	  System.out.print("Introduce una opción (1-4): ");
	  int opcion = sc.nextInt();
	  
	  System.out.print("\n");
	  
	  int numero1, numero2, resultado;
	  
	  // Variables de la división para poder mostrar el resultado con más exactitud (2 decimales).
	  double numero1Div, numero2Div, resultadoDiv;
	  
	  switch (opcion)
	  {
	       case 1:
		    System.out.println("OPCIÓN: SUMA\n");
		    
		    System.out.print("Introduce el primer número: ");
		    numero1 = sc.nextInt();
		    
		    System.out.print("Introduce el segundo número: ");
		    numero2 = sc.nextInt();
		    
		    resultado = numero1 + numero2;
		    
		    System.out.println("La suma entre ambos número es: " + resultado);
		    
		    break;
		    
	       case 2:
		    System.out.println("OPCIÓN: RESTA\n");
		    
		    System.out.print("Introduce el primer número: ");
		    numero1 = sc.nextInt();
		    
		    System.out.print("Introduce el segundo número: ");
		    numero2 = sc.nextInt();
		    
		    resultado = numero1 - numero2;
		    
		    System.out.println("La resta entre ambos número es: " + resultado);
		    
		    break;
		    
	       case 3:
		    System.out.println("OPCIÓN: MULTIPLICACIÓN\n");
		    
		    System.out.print("Introduce el primer número: ");
		    numero1 = sc.nextInt();
		    
		    System.out.print("Introduce el segundo número: ");
		    numero2 = sc.nextInt();
		    
		    resultado = numero1 * numero2;
		    
		    System.out.println("La multiplicación entre ambos número es: " + resultado);
		    
		    break;
		    
	       case 4:
		    System.out.println("OPCIÓN: DIVISIÓN\n");
		    
		    System.out.print("Introduce el primer número: ");
		    numero1Div = sc.nextDouble();
		    
		    System.out.print("Introduce el segundo número: ");
		    numero2Div = sc.nextDouble();
		    
		    // Si es cero, salir.
		    if (numero2Div==0)
		    {
			 System.err.println("Error: No se puede dividir entre cero.");
			 
			 break;
		    }
		    
		    // Si no es cero, operar.
		    else
		    {
			 resultadoDiv = numero1Div / numero2Div;
		    
			 System.out.printf("La división entre ambos número es: %.2f", resultadoDiv);
			 System.out.print("\n");
		    
			 break;
		    }    
	       
	       // Si no introduce una opción válida, salir.
	       default:
		    System.err.println("Este número no corresponde a una operación válida.");
		    
		    break;
	  }
	  
     }

}

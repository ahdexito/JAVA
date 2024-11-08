package prog02_ejer1_13;

import java.util.Scanner;

public class PROG02_Ejer1_13 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribir un programa que reciba un número de una carta de una baraja española e imprima
	  por pantalla: “As” si es un 1, “Sota”, si es un 10, “Caballo” si es un 11 y “Rey” si es un 12.
	  Para números de cartas entre 2 y 9 (incluidos) debe imprimir: "No es as ni figura". Para
	  otros números debe imprimir: "este no es un número de una carta de la baraja española".
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Introduzca el número de carta: ");
	  int numero = sc.nextInt();
	  
	  switch (numero)
	  {
	       case 1 -> System.out.println("As.");
		    
	       case 10 -> System.out.println("Sota.");
		    
	       case 11 -> System.out.println("Caballo.");
		    
	       case 12 -> System.out.println("Rey.");
		    
	       case 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.println("No es as ni figura.");
	   
	       default -> System.out.println("Este no es un número de una carta de la baraja española.");
	  }
	  
     }
     
}

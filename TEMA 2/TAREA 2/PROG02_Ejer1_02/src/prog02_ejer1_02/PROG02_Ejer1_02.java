package prog02_ejer1_02;

import java.util.Scanner;

public class PROG02_Ejer1_02 
{

     public static void main(String[] args) 
     {
	  // Crea un programa que pida al usuario un número entero y responda si es múltiplo de 2 y de 3 simultáneamente.
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Introduzca un número: ");
	  int numero = sc.nextInt();
	  
	  if (numero %2 == 0 && numero %3 == 0)
	       System.out.println("El número es múltiplo de 2 y de 3");
     }
     
}

package prog02_1ejer15;

import java.util.Scanner;

public class Prog02_1ejer15 
{

     public static void main(String[] args) 
     {
	  /*
	  Pedir tres número y mostrarlos ordenados de mayor a menor.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca el primer número:");
	  int numero1 = sc.nextInt();
	  
	  System.out.println("Introduzca el segundo número:");
	  int numero2 = sc.nextInt();
	  
	   System.out.println("Introduzca el tercer número:");
	  int numero3 = sc.nextInt();
	  
	  System.out.print("El orden de mayor a menor es: ");
	  
	  if (numero1>numero2 && numero1>numero3) // NUMERO 1 ES MAYOR
	  {
	       if (numero2>numero3)
		    System.out.printf("%d > %d > %d.\n", numero1, numero2, numero3);
	       
	       else
		    System.out.printf("%d > %d > %d.\n", numero1, numero3, numero2);
	  }
	  
	  else if (numero2>numero1 && numero2>numero3) // NUMERO 2 ES MAYOR
	  {
	       if (numero1>numero3)
		    System.out.printf("%d > %d > %d.\n", numero2, numero1, numero3);
	       
	       else
		    System.out.printf("%d > %d > %d.\n", numero2, numero3, numero1);
	  }
	  
	  else if (numero3>numero1 && numero3>numero2) // NUMERO 3 ES MAYOR
	  {
	       if (numero1>numero2)
		    System.out.printf("%d > %d > %d.\n", numero3, numero1, numero2);
	       
	       else
		    System.out.printf("%d > %d > %d.\n", numero3, numero2, numero1);
	  }
     }
     
}

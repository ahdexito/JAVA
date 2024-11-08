package prog02_1ejer13;

import java.util.Scanner;

public class Prog02_1ejer13 
{

     public static void main(String[] args) 
     {
	  /*
	  Pedir un número entero 0 y 9999 y decir cuantas cifras tiene.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca un número entre 0 y 9999:");
	  int numero = sc.nextInt();
	  
	  if (numero<10000 && numero>999)
	       System.out.println("El número tiene cuatro cifras.");
	  
	  else if (numero<1000 && numero>99)
	       System.out.println("El número tiene tres cifras");
	  
	  else if (numero<100 && numero>9)
	       System.out.println("El número tiene dos cifras.");
	  
	  else
	       System.out.println("El número tiene una cifra.");
     }
     
}

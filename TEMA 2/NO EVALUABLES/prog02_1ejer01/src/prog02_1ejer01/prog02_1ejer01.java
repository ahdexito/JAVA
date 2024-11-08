package prog02_1ejer01;

import java.util.Scanner;

public class prog02_1ejer01 
{

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       
       /*
       Escribe un programa que pide la edad por teclado y muestre el mensaje de “Eres mayor de
       edad” solo si lo somos.
       */
       
       
	 System.out.println("Introduzca su edad: ");
	 int edad = sc.nextInt();
	 
	 if (edad>=18)
	      System.out.println("Eres mayor de edad.");
       
       
       
       sc.close();
    }

}

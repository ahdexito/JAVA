package prog02_ejer1_08;

import java.util.Scanner;

public class PROG02_Ejer1_08 
{

     public static void main(String[] args) 
     {
	  // Escribir un programa que permita introducir 5 números enteros por teclado y muestre el menor de ellos.
	  
	  Scanner sc = new Scanner(System.in); 
	  
	  System.out.print("Introduzca el primer número: ");
	  int num1 = sc.nextInt();
	  
	  System.out.print("Introduzca el segundo número:");
	  int num2 = sc.nextInt();
	  
	  System.out.print("Introduzca el tercer número: ");
	  int num3 = sc.nextInt();
	  
	  System.out.print("Introduzca el cuarto número: ");
	  int num4 = sc.nextInt();
	  
	  System.out.print("Introduzca el quinto número: ");
	  int num5 = sc.nextInt();
	  
	  
	  if (num1>=num2 && num1>=num3 && num1>=num4 && num1>=num5)
	       System.out.println("El número mayor es " + num1);
	  
	  else if (num2>=num1 && num2>=num3 && num2>=num4 && num2>=num5)
	       System.out.println("El número mayor es " + num2);
	  
	  else if (num3>=num1 && num3>=num2 && num3>=num4 && num3>=num5)
	       System.out.println("El número mayor es " + num3);
	  
	  else if (num4>=num1 && num4>=num2 && num4>=num3 && num4>=num5)
	       System.out.println("El número mayor es " + num4);
	  
	  else
	       System.out.println("El número mayor es " + num5);
     }
     
}

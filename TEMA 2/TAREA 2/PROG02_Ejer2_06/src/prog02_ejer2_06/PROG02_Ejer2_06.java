package prog02_ejer2_06;

import java.util.Scanner;

public class PROG02_Ejer2_06 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribir un programa que calcule el valor de elevar (sin hacer uso del operador de potencia)
	  un número real, A, a un número exponente entero, B.
	  NOTA: Si el exponente es negativo, previamente es necesario pasarlo a positivo
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Introduzca un número real A: ");
	  int a = sc.nextInt();
	  
	  System.out.print("Introduzca un número exponente entero B: ");
	  int b = sc.nextInt();
	  
	  int resultado = 1;
	  
	  // Multiplicar por -1 para convertirlo a número natural.
	  if (b<0)
	       b *= -1;
	  
	  for(int i=0; i<b; i++)
	  {
	       resultado *= a;
	  }
	  
	  System.out.println("El resultado es: " + resultado);
	  
     }
     
}

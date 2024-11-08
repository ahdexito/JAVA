package prog02_1ejer11;

import java.util.Scanner;

public class Prog02_1ejer11 
{

     public static void main(String[] args) 
     {
	  /*
	  Crea un programa que pida al usuario dos números enteros y diga "Uno de los números es
	  positivo", "Los dos números son positivos" o bien "Ninguno de los números es
	  positivo", según corresponda.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca el primer número:");
	  int numero1 = sc.nextInt();

	  System.out.println("Introduzca el segundo número:");
	  int numero2 = sc.nextInt();
	  
	  if (numero1>0 && numero2>0)
	       System.out.println("Los dos número son positivos.");
	  
	  else if (numero1>0 || numero2>0)
	       System.out.println("Uno de los números es entero.");
	  
	  else
	       System.out.println("Ninguno de los números es positivo.");
     }
     
}

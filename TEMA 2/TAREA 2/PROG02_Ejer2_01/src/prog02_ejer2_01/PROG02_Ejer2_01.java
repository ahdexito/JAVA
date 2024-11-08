package prog02_ejer2_01;

import java.util.Scanner;

public class PROG02_Ejer2_01 
{

     public static void main(String[] args) 
     {
	  /*
	  Realizar una aplicación que pida 10 números, y muestre la media de los números positivos,
	  la media de los números negativos y la cantidad de ceros.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int numPosi=0, numNega=0, numCero=0, contPosi=0, contNega=0;
	  
	  for (int i=0; i<=9; i++)
	  {
	       System.out.print("Introduzca un número: ");
	       int numero = sc.nextInt();
	       
	       // Si es positivo, sumar el número y sumar 1 al contador.
	       if (numero>0)
	       {
		    numPosi += numero;
		    contPosi++;
	       }
	       
	       // Si es positivo, sumar el número y sumar 1 al contador.
	       else if (numero<0)
	       {
		    numNega += numero;
		    contNega++;
	       }
	       
	       // Si es 0, sumar 1 al contador.
	       else
		    numCero++;
	  }
	  
	  System.out.println("La media de números positivos es: " + (numPosi/contPosi));
	  System.out.println("La media de números negativos es: " + (numNega/contNega));
	  System.out.println("La cantidad de ceros es: " + numCero);

     }
     
}

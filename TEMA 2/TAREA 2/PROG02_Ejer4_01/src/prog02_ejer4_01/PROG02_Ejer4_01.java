package prog02_ejer4_01;

import java.util.Scanner;

public class PROG02_Ejer4_01 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          Crea un programa que solicite al usuario números positivos de tres o más cifras y
	  compruebe si son pares.
	  Si el número introducido es positivo, pero de una o dos cifras, se solicitará un nuevo
	  número. El programa finaliza cuando se introduce “0” o un número negativo.
          */
          
	  int numero;
	  
          do 
	  {    // Solicitar un número.
	       System.out.print("Introduzca un número de tres o más cifras: ");
	       numero = sc.nextInt();
	       
	       // Si es menor que 100 (3 cifras), mostrar mensaje.
	       if (numero<100 && numero>0)
		    System.out.println("El número introducido tiene menos de tres cifras.");
	       
	       // Si no es menor, calcular si es par y mostrar mensaje.
	       else
		    if (numero %2 == 0 && numero>0)
			   System.out.println("El número introducido es par.");
	       
	  // Realizar bucle mientras no se introduzca 0.
	  } while (numero>0);
          
     }

}

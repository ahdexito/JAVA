package prog02_ejer3_05;

import java.util.Scanner;

public class PROG02_Ejer3_05 
{

     public static void main(String[] args) 
     {
          /*
          Escribir un programa que lea secuencias de números iguales por teclado hasta que se
          introduzca el cero. En ese momento se deberá representar el número con mayor
          repeticiones, y cuantas veces se repitió.
          Ejemplo: Si se introduce 8 8 8 4 5 6 6 6 7 7 7 7 2 0, el resultado a mostrar será. ‘El número
          más repetido es el 7 y se ha escrito 4 veces’.
          */
        
          Scanner sc = new Scanner(System.in);
        
          System.out.println("Introduzca una secuencia de números, terminando con el cero: ");
	
	  // Leee el primer número.
          int numero = sc.nextInt();
          int numAnterior = numero;
        
          int contRepe = 1;
          int contRepeMax = 1;
          int numRepe = numero;
        
          while (numero != 0) 
	  {
	       // Leer el siguiente número.
               numero = sc.nextInt();
	       
	       // Si el número actual es igual al anterior, incrementar el contador.
               if (numero == numAnterior)
               contRepe++;
	       
	       // Si el número es distinto al anterior, comparar las repeticiones
	       else 
	       {
		    // Actualizar el máximo de repeticiones y el número más repetido.
		    if (contRepe > contRepeMax) 
		    {
                    contRepeMax = contRepe;
                    numRepe = numAnterior;
		    }
		    
               // Reiniciar el contador para el nuevo número.
               contRepe = 1;
               }
            
          // Actualizar el número anterior para la siguiente iteración
          numAnterior = numero;
          }
        
     System.out.println("El número más repetido es el " + numRepe + " y se ha escrito " + contRepeMax + " veces.");
     
     }
     
}
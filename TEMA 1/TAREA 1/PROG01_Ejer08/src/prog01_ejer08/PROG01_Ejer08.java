package prog01_ejer08;

import java.util.Scanner;

public class PROG01_Ejer08 
{
    
     public static void main(String[] args) 
     {
	  /*
	  Diseña un programa Java llamado “PROG01_Ejer08” que solicite un número de 5 dígitos del
	  teclado, separe el número en sus dígitos individuales y los muestre por pantalla.
	  Por ejemplo, si el número es 53123 que muestre: Resultado: 5 3 1 2 3
	  NOTA: Es necesario emplear la división (/) y el resto(%) para obtener los resultados.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  // Solicitamos los 5 dígitos.
	  System.out.println("Introduzca un número de cinco dígitos: ");
	  int num = sc.nextInt();
	  
	  
	  // Creamos una variable para guardar el nuevo valor de cada operación.
	  int x;
	  
	  
	  // Aplicamos módulo de 10 para extraer el último dígito, y después dividimos entre 10 para suprimirlo.
	  int num1 = num%10;
	  x = num / 10;
	  
	  int num2 = x%10;
	  x = x / 10;
	  
	  int num3 = x%10;
	  x = x / 10;
	  
	  int num4 = x%10;
	  x = x / 10;
	  
	  int num5 = x;
	  
	  
	  // Imprimimos el dígito de 5 cifras separado por dígitos.
	  System.out.printf("El número introducido es: %d     %d     %d     %d     %d \n", num5, num4, num3, num2, num1);
	  
     }
     
}

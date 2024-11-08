package prog02_ejer1_11;

import java.util.Scanner;

public class PROG02_Ejer1_11 
{

     public static void main(String[] args) 
     {
	  /*
	  Crea un programa que use el operador condicional para mostrar el valor absoluto de un
	  número de la siguiente forma:
	   Si el número es positivo, se mostrará tal cual.
	   Si es negativo, se mostrará el mismo número, pero cambiado de signo.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Introduzca un número: ");
	  int numero = sc.nextInt();
	  
	  numero = (numero>0) ? numero : numero*-1;
	  
	  System.out.println("El valor absoluto del número es: " + numero);
     }
     
}

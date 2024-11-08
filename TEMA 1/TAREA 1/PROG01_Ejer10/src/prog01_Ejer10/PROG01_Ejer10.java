package prog01_Ejer10;

import java.io.IOException;
import java.util.Scanner;

public class PROG01_Ejer10 
{

     public static void main(String[] args) throws IOException 
     {
	  /*
	  Escribir un programa llamado “PROG01_Ejer10” que lea las letras ‘O’, ‘R’, ‘A’, ‘C’, ‘L’, ‘E’ y
	  muestre el nombre completo por consola en orden inverso, es decir, ‘ELCARO’. Para leer letra a
	  letra, se empleará la instrucción: System.in.read(), la cual permite leer un carácter escrito desde
	  consola.
	  */ 
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca la palabra ORACLE letra a letra:");
	  
	  char letra1 = (char) sc.next().charAt(0);

	  
	  char letra2 = (char) sc.next().charAt(0);
		  
	  
	  char letra3 = (char) System.in.read();
	  System.in.read();
	  
	  char letra4 = (char) System.in.read();
	  System.in.read();
	  
	  char letra5 = (char) System.in.read();
	  System.in.read();
	  
	  char letra6 = (char) System.in.read();
	  System.in.read();
	  
	  
	  System.out.println("La palabra invertida es: " + letra6 + letra5 + letra4  + letra3 + letra2 + letra1);
     }
     
}

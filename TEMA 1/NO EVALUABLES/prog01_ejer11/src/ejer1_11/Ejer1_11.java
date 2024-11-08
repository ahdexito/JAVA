package ejer1_11;
import java.util.Scanner;

public class Ejer1_11 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       /*
          Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
	  Por ejemplo:
	  Introduce el lado de un cuadrado: 2
	  El área del cuadrado es: 4
       */
       
       System.out.print("Introduce el lado de un cuadrado: ");
       int lado = sc.nextInt();
       lado = lado*lado;
       
       System.out.println("El área del cuadrado es: " + lado);
       
       
       
       
       
       
       
       
       sc.close();
    }

}

package ejer1_15;
import java.util.Scanner;

public class Ejer1_15 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       /*
	  Escribe un programa que lea tres número enteros por teclado, 
	  y muestre la media con decimales.
       */
       
       System.out.print("Introduce el primer número: ");
       int a = sc.nextInt();
       
       System.out.print("Introduce el segundo número: ");
       int b = sc.nextInt();
       
       System.out.print("Introduce el tercer número: ");
       int c = sc.nextInt();
       
       double media = (a + b + c)/3; 
       
       System.out.println("La media de los números introducidos es: " + media);
       
       
       
       sc.close();
    }

}

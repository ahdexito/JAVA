package ejer1_12;
import java.util.Scanner;

public class Ejer1_12 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       /*
	  Escribe un programa que lea dos números reales de tipo double, calcule y muestre el valor de
	  sus suma, resta, producto, división y resto en líneas distintas:
	  Por ejemplo:
	  Introduce un número: 2
	  Introduce un número: 5
	  La suma de 2 y 5 es: 7
	  La resta de 2 y 5 es: -3
       */
       
       double x, y;
       
       System.out.print("Introduce un número: ");
       x = sc.nextInt();
       
       System.out.print("Introduce otro número: ");
       y = sc.nextInt();
       
       
       System.out.println("La suma de " + x + " y " + y + " es: " + (x+y));
       
       System.out.println("La resta de " + x + " y " + y + " es: " + (x-y));
       
       System.out.println("El producto de " + x + " y " + y + " es: " + (x*y));
       
       System.out.println("La división de " + x + " y " + y + " es: " + (x/y));
       
       System.out.println("El resto de " + x + " y " + y + " es: " + (x%y));
       
       sc.close();
    }

}

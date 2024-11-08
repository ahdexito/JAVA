package prog02_1ejer02;

import java.util.Scanner;

public class prog02_1ejer02 
{

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       
       /*
       Escribir un programa que lea dos números, de forma que, si el primer número introducido
       es mayor o igual al segundo número introducido, se mostrará por pantalla la resta de ambos
       números.
       */
       
       
       System.out.println("Introduzca el primer número: ");
       int num1 = sc.nextInt();
       
       System.out.println("Introduzca el segundo número: ");
       int num2 = sc.nextInt();
       
       
       if (num1>=num2)
	      System.out.println("La resta de ambos números es: " + (num1 - num2));
       
       
       
       
       sc.close();
    }

}

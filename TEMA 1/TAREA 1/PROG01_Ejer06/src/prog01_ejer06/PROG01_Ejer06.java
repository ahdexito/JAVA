package prog01_ejer06;
import java.util.Scanner;

public class PROG01_Ejer06 
{
     
     public static void main(String[] args) 
     {
	  /*
	  Diseñar un programa Java llamado “PROG01_Ejer06” para resolver una ecuación de segundo
	  grado con una incógnita (x), suponiendo que los coeficientes de la ecuación a, b y c se introducen
	  desde teclado.
	  
	  Nota: emplear las funciones Math.sqrt(…) y Math.pow(…) para calcular la raíz cuadrada y el
	  exponente respectivamente.
	  Los resultados de la ecuación de segundo grado, se deben mostrarse sin decimales y sin
	  redondeo, es decir, solo la parte entera.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  // Solicitamos los valores de a, b y c.
	  System.out.println("Introduzca el valor de a: ");
	  int a = sc.nextInt();
	  
	  System.out.println("Introduzca el valor de b: ");
	  int b = sc.nextInt();
	  
	  System.out.println("Introduzca el valor de c: ");
	  int c = sc.nextInt();
	  
	  
	  // Calculamos el valor del discriminante (el interior de la raíz cuadrada).
	  double discriminante = Math.pow(b, 2) - (4 * a * c);
	  
	  
	  // Calculamos el resto de la ecuación.
	  double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
	  double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
	  
	  
	  // Mostramos por pantalla las dos posibles soluciones casteadas directamente como números enteros.
	  System.out.println("El valor 1 de x es: " + (int)x1);
	  System.out.println("El valor 2 de x es: " + (int)x2);
	  
	  
	  // Realizamos la ecuación incial para comprobar que el resultado sea = 0.
	  double resultado1 = (a * Math.pow(x1, 2)) + (b * x1) + c;
	  double resultado2 = (a * Math.pow(x2, 2)) + (b * x2) + c;
	  
	  
	  // Imprimimos por pantalla las dos posibles soluciones casteadas directamente como números enteros.
	  System.out.println("El resultado 1 de la ecuación es: " + (int)resultado1);
	  System.out.println("El resultado 2 de la ecucaión es: " + (int)resultado2);
	  
	  
     }
     
}

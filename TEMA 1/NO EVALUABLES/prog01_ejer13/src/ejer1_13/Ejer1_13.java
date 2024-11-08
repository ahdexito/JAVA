package ejer1_13;
import java.util.Scanner;

public class Ejer1_13 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       /*
	  Escribe un programa que toma como dato de entrada un 
	  número que corresponde al radio de
	  una circunferencia y muestre la longitud de la circunferencia, 
	  el área del círculo y el volumen de la
	  esfera que corresponden con dicho radio.
	  Nota: crea la constante PI, cuyo valor será de 3.14
	  Por ejemplo:
	  Introduce un el radio de una circunferencia: 5
	  La longitud de la circunferencia es: XX
	  El área del círculo es: XX
	  El volumen de la esfera es: XX
       */
       
       final double PI = 3.14;
       
       System.out.print("Introduce el radio de una circunferencia: ");
       double radio = sc.nextDouble();
       
       double longitud = PI*(radio*2);
       
       double area = PI*(radio*radio);
       
       double volumen = (4*PI)*(radio*radio*radio);
       
       System.out.println("La longitud de la circunferencia es: " + longitud);
       
       System.out.println("El área de la circunferencia es: " + area);
     
       System.out.println("El volumen de la esfera es: " + volumen);
       
       sc.close();
    }

}

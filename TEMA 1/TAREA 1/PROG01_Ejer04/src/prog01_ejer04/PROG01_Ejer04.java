package prog01_ejer04;
import java.util.Scanner;

public class PROG01_Ejer04 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribir un programa llamado “PROG01_Ejer04” que permita determinar el área y volumen de
	  un cilindro dado su radio y altura. El radio y la altura serán leídos desde teclado.
	  Emplea las constantes que consideres oportunas.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  // Asignamos el valor de PI como constante.
	  final float PI = 3.14159f;
	  
	  
	  // Solicitamos que se introduzcan los datos del cilindro.
	  System.out.println("Introduzca el radio del cilindro: ");
	  float radio = sc.nextFloat();
	  System.out.println("Introduzca la altura del cilindro: ");
	  float altura = sc.nextFloat();
	  
	  
	  // Calculamos el área del cilindro y lo mostramos por pantalla.
	  float area = ((2*PI)*radio)*(radio+altura);
	  System.out.println("El valor del área del cilindro es igual a " + area);
	  
	  
	  // Calculamos el volumen del cilindro y lo mostramos por pantalla.
	  float volumen = PI*(radio*radio)*altura;
	  System.out.println("El valor del volumen del cilindro es igual a " + volumen);
	  
     }
     
}

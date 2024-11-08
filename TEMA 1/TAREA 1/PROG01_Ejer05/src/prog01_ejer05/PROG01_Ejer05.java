package prog01_ejer05;
import java.util.Scanner;

public class PROG01_Ejer05 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribir un programa llamado “PROG01_Ejer05” que solicite la base y la altura de un rectángulo
	  y devuelva su perímetro y área.
	  NOTA: Los valores base y altura, serán leídos como cadenas de texto.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  
	  // Solicitamos la base del rectángulo como String y después casteamos el dato a tipo float.
	  System.out.println("Introduzca la base del rectángulo: ");
	  String base_texto = sc.nextLine();
	  float base = Float.parseFloat(base_texto);
	  
	  
	  // Solicitamos la altura del rectángulo como String y después casteamos el dato a tipo float.
	  System.out.println("Introduzca la altura del rectángulo: ");
	  String altura_texto = sc.nextLine();
	  float altura = Float.parseFloat(altura_texto);
	  
	  
	  // Calculamos el perímetro del rectángulo y lo mostramos por pantalla.
	  float perimetro = (base*2)+(altura*2);
	  System.out.println("El perímetro del rectángulo es igual a " + perimetro);
	  
	  
	  // Calculamos el área del rectángulo y lo mostramos por pantalla.
	  float area = base*altura;
	  System.out.println("El área del rectángulo es igual a " + area);
	  
     }
     
}

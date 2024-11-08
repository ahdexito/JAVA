package prog01_ejer11;

import java.util.Scanner;

public class PROG01_Ejer11 
{

     public static void main(String[] args) 
     {
	  /*
	  Diseñar un programa llamado “PROG01_Ejer11” que muestre por pantalla el dinero que se
	  tiene (en euros y céntimos) después de que el programa pida cuantas monedas se tiene de 2e, 1e,
	  50 céntimos, 20 céntimos o 10 céntimos.
	  NOTA: se valorará el menor número de líneas empleadas
	  */ 
	  
	  Scanner sc = new Scanner(System.in);
	  
	  
	  // Solicitamos que se introduzcan las cantidades que se tiene de cada moneda.
	  System.out.println("Introduzca número de monedas de 2e: ");
	  int e2 = sc.nextInt();
	  
	  System.out.println("Introduzca número de monedas de 1e: ");
	  int e1 = sc.nextInt();
	  
	  System.out.println("Introduzca número de monedas de 50c: ");
	  int c50 = sc.nextInt();
	  
	  System.out.println("Introduzca número de monedas de 20c: ");
	  int c20 = sc.nextInt();
	  
	  System.out.println("Introduzca número de monedas de 10c: ");
	  int c10 = sc.nextInt();
	  
	  
	  // Realizamos las operaciones para calcular el valor de cada moneda.
	  float total = e1+(e2*2)+(c50*0.5f)+(c20*0.2f)+(c10*0.1f);
	  
	  
	  // Nos quedamos con la parte entera del total haciendo un cast a entero.
	  int total_euros = (int) total;
	  
	  
	  // La parte decimal la deducimos con la siguiente operación.
	  int total_centimos = (int) ((total - total_euros)*100);
	 
	  
	  // Imprimimos por pantalla la cantidad total de euros y de céntimos por separado.
	  System.out.printf("Tiene en total %d euros y %02d céntimos.\n", total_euros, total_centimos);
	  	  
     }
     
}

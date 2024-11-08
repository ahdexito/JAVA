package prog02_ejer2_07;

import java.util.Scanner;

public class PROG02_Ejer2_07 
{

     public static void main(String[] args) 
     {
	  /*
	  Introducir A y B (que sea mayor que A). Visualizar los números de A hasta B e indicar
	  cuantos hay que sean pares.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Introduzca el valor de A: ");
	  int a = sc.nextInt();
	  
	  System.out.print("Introduzca el valor de B (mayor que A): ");
	  int b = sc.nextInt();
	  
	  int pares = 0;
	  
	  for(int i=a;i<b; i++)
	  {
	       System.out.print(i + ", ");
	       
	       if (i%2==0)
		    pares++;
	  }
	  System.out.print(b + "\n");
	  System.out.println("________________________________________________");
	  System.out.println("Hay un total de " + pares + " número(s) par(es).");
     }
     
}

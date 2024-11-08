package prog02_1ejer12;

import java.util.Scanner;

public class Prog02_1ejer12 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma
	  en calificación alfabética, escribiendo el resultado.
	   ‘Muy Deficiente’, cuando la nota se mayor o igual a 0 y menor a 3
	   ‘Insuficiente’, cuando la nota sea mayor o igual a 3 y menor a 5 .
	   ‘Suficiente’, cuando la nota sea mayor o igual a 5 y menor a 6 .
	   ‘Bien’, cuando la nota sea mayor o igual a 6 y menor a 7.
	   ‘Notable’, cuando la nota sea mayor o igual a 7 y menor a 9.
	   ‘Sobresaliente’, cuando la nota sea mayor o igual a 9 y menor a 10.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca la calificación (0 - 10)");
	  int nota = sc.nextInt();
	  
	  if (nota>=0 && nota<3)
	       System.out.println("Muy deficiente.");
	  
	  else if (nota>=3 && nota<5)
	       System.out.println("Insuficiente.");
	  
	  else if (nota>=5 && nota <6)
	       System.out.println("Suficiente.");
	  
	  else if (nota>=6 && nota<9)
	       System.out.println("Notable");
	  
	  else
	       System.out.println("Sobresaliente.");
     }
     
}

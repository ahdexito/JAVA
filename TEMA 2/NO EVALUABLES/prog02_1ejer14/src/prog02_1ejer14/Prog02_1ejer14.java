package prog02_1ejer14;

import java.util.Scanner;

public class Prog02_1ejer14 
{

     public static void main(String[] args) 
     {
	  /*
	  Pedir el día, mes y año de una fecha, e indicar si la fecha es correcta suponiendo que todos
	  los meses tienen 30 días.
	  NOTA: La fecha se considerará válida si: año > 0; 1 <= mes <= 12; 1 <= día <= 30.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca el día:");
	  int dia = sc.nextInt();
	  
	  System.out.println("Introduzca el mes:");
	  int mes = sc.nextInt();
	  
	  System.out.println("Introduzca el año:");
	  int anyo = sc.nextInt();
	  
	  if ((1<=dia && dia<=30)&&(1<=mes && mes<=12)&&(anyo>=0))
	       System.out.println("La fecha es correcta.");
	  
	  else
	       System.out.println("La fecha es incorrecta.");
     }
     
}

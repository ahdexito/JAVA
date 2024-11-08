package prog02_2ejer02;

import java.util.Scanner;

public class Prog02_2ejer02 
{

     public static void main(String[] args) 
     {
	  /*
	  Imaginemos que queremos desarrollar un programa tal que al escribir un día de la
	  semana aparezca por pantalla la actividad extraescolar a la que debe acudir nuestro hijo.
	  Por ejemplo, si ejecutamos el programa y escribimos martes que aparezca “Natación”.
	  Las actividades que se realizan cada día son:
	   Lunes – psicomotricidad.
	   Martes – natación.
	   Miércoles – música.
	   Jueves – natación.
	   Viernes – descanso.
	  Los días sábado y domingo no se realizan actividades con o que si el usuario escribe por
	  error alguno de estos días de la semana se debe mostrar el mensaje: “Día sin
	  actividades”. Si por equivocación, además, se escribe un día inexistente se debe
	  mostrar en pantalla “Día erróneo”.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Introduzca el día de la semana:");
	  String dia = sc.nextLine();
	  
	  switch (dia)
	  {
	       case "lunes":
		    System.out.println("Psicomotricidad");
		    break;
		    
	       case "martes":
		    System.out.println("Natación");
		    break;
		    
	       case "miércoles":
		    System.out.println("Música");
		    break;
		    
	       case "jueves":
		    System.out.println("Natación");
		    break;
		    
	       case "viernes":
		    System.out.println("Descanso");
		    break;
		    
	       case "sábado":
		    System.out.println("Sin actividades");
		    break;
		    
	       case "domingo":
		    System.out.println("Sin actividades");
		    break;
		    
	       default:
		    System.out.println("Día erróneo");
	  }
	  
     }
     
}

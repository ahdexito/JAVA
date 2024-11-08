package prog02_ejer1_10;

import java.util.Scanner;

public class PROG02_Ejer1_10 
{

     public static void main(String[] args) 
     {
	  /*
	  Pedir el día, mes y año de una fecha y mostrar la fecha del día siguiente. Es necesario
	  comprobar primero que la fecha introducida es correcta. (Sin años bisiestos)
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Introduzca el día: ");
	  int dia = sc.nextInt();
	  
	  System.out.print("Introduzca el mes: ");
	  int mes = sc.nextInt();
	  
	  System.out.print("Introduzca el año: ");
	  int anyo = sc.nextInt();
	  
	  
	  // Comprobar si la fecha es correcta.
	  if (dia<1 || dia>30 || mes<1 || mes>12 || anyo<1)
	       System.err.println("La fecha introducida es incorrecta.");
	  
	  
	  // Si es correcta, ejecutar lo de abajo.
	  else
	  {
	       dia++;
	       
	       // Si al sumar se pasa de 30 días, pasar al siguiente mes y al primer día.
	       if (dia>30)
	       {
		    mes++;
		    dia=1;
	       }
		       
	       // Si después de esto se pasa de 12 meses, pasar al siguiente año y al primer mes.
	       if (mes>12)
	       {
		    anyo++;
		    mes=1;
	       }
	       
	       System.out.printf("El día siguiente será el %d/%d/%d.", dia, mes, anyo);
	       System.out.print("\n");
			        
	  }   
     } 
}

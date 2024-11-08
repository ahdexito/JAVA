package prog02_ejer1_09;

import java.util.Scanner;

public class PROG02_Ejer1_09 
{

     public static void main(String[] args) 
     {
	  /*
	  Escriba un programa en Java que calcule el salario semanal de un trabajador, a partir
	  de las horas trabajadas y el precio cobrado por hora. Ambos valores deben ser solicitados al
	  usuario. La jornada normal es de 40 horas semanales. Las horas extra se pagan un cincuenta
	  por ciento más caras que las normales, y pasan a pagarse al doble que las normales a partir
	  de las 50 horas trabajadas, es decir, las horas desde la 41 hasta la 49 se pagan un 50% más
	  caras, pero desde la hora 50 en adelante, se pagan al doble.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("¿Cuántas horas ha trabajado en una semana?: ");
	  double horas = sc.nextDouble();
	  
	  System.out.print("¿Cuál es su salario por hora trabajada?: ");
	  double salario_hora = sc.nextDouble();
	  
	  
	  double salario_total;
	  
	  // Si no pasa de 40 horas, el total es horas x salario.
	  if (horas<=40)
	       salario_total = salario_hora * horas;
	  
	  // Si pasa de 40, pero no pasas de 49, el total es su salario haciendo 40 horas, más las horas extras al 50%
	  else if (horas<=49)
	       salario_total = (40*salario_hora) + ((horas-40)*salario_hora*1.5);
	  
	  // Si pasa de 50 horas, sumar salario normal hasta 40, más 9 horas normales más el 50%, más las que sobren al doble.
	  else
	       salario_total = (40*salario_hora) + (9*salario_hora*1.5) + ((horas-49)*salario_hora*2);
	  
	  
	  System.out.printf("Usted debería cobrar %.2f euros.", salario_total);
	  System.out.print("\n");
	  
     }
     
}

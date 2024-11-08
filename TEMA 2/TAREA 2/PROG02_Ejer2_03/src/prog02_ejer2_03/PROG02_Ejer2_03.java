package prog02_ejer2_03;

import java.util.Scanner;

public class PROG02_Ejer2_03 
{

     public static void main(String[] args) 
     {
	  /*
	  Realizar una aplicación que pida la edad y altura de 5 alumnos, y muestre: la edad y la
	  estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que
	  miden más de 1.75.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int edadMayor = 0, edadSuma = 0, alturaMayor = 0;
	  double alturaSuma = 0;
	  
	  for(int i=1; i<=5; i++)
	  {
	       System.out.print(i + ". Introduzca la edad: ");
	       int edad = sc.nextInt();
	       edadSuma += edad;
	       
	       System.out.print(i + ". Introduzca la altura: ");
	       double altura = sc.nextDouble();
	       alturaSuma += altura;
	       
	       // Si es mayor de 18, sumar al contador.
	       if (edad>=18)
		    edadMayor++;
	       
	       // Si es mayor de 1,75, sumar al contador.
	       if (altura>1.75)
		    alturaMayor++;
	       
	       System.out.print("\n");
	  }
	  
	  System.out.printf
	       ("La edad media es de %d años, y la estatura media es %.2fm.\n"
	       + "La cantidad de alumnos mayores de 18 es: %d\n"
	       + "La cantidad de alumnos que miden más de 1,75m es: %d\n", (edadSuma/5), (alturaSuma/5), edadMayor, alturaMayor);
	       
     }
     
}

package prog02_ejer3_04;

public class PROG02_Ejer3_04 
{

     public static void main(String[] args) 
     {
	  /*
	  Mejora el ejercicio 3 de forma que, cuando se encuentre el máximo común divisor el bucle
	  finalice sin tener que llegar hasta el valor 1, y muestre dicho número.
	  */
	  
	  int a = 30;
	  int b = 60;
	  
	  int divisor;
	  
	  
	  if (a>b)
	       divisor = a;
	  
	  else
	       divisor = b;
	  
	  
	  while(divisor!=1)
	  {
	       divisor--;
	       
	       if (a %divisor == 0 && b %divisor == 0)
		    break;
	  }
	  
	  System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + divisor);
     }
     
}

package prog02_ejer3_03;

public class PROG02_Ejer3_03 
{

     public static void main(String[] args) 
     {
	  /*
	  Para dos números dados, a y b, es posible buscar el máximo común divisor (el número más
	  grande que divide a ambos) mediante un algoritmo ineficiente pero sencillo. Este algoritmo
	  se ejecuta desde el menor número entre a y b hasta llegar al número 1, e irá buscando el
	  mayor número que divide a ambos simultáneamente. 
	  */
	  
	  int a = 100;
	  int b = 50;
	  
	  int divisor, resultado=0;
	  
	  
	  if (a>b)
	       divisor = a;
	  
	  else
	       divisor = b;
	  
	  
	  while(divisor!=1)
	  {
	       divisor--;
	       
	       if (a %divisor == 0 && b %divisor == 0)
		    if (resultado<divisor)
			 resultado = divisor;
	       
	  }
	  
	  System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + resultado);
	  
     }
     
}

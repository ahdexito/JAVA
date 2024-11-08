package prog01_ejer09;

public class PROG01_Ejer09 
{

     public static void main(String[] args) 
     {
	  /*
	  Escribir un programa llamado “PROG01_Ejer09” que muestre números múltiples de 2 hasta
	  llegar al número 64. Para ello emplea los operadores de asignación que creas oportunos.
	  Los números que debe mostrar serán: 2, 4, 8, 16, 32 y 64. 
	  */  
	  
	  // Asiganamos el valor 2 a una variable.
	  int num = 2;
	  
	  
	  // Imprimimos directamente por pantalla sus múltiplos con la función Math.pow, casteando como entero.
	  System.out.printf("Los números múltiples de 2 son: %d, %d, %d, %d, %d y %d \n", 
			     num, 
			     (int)Math.pow(num, 2), 
			     (int)Math.pow(num, 3), 
			     (int)Math.pow(num, 4), 
			     (int)Math.pow(num, 5), 
			     (int)Math.pow(num, 6));
	  
     }
     
}

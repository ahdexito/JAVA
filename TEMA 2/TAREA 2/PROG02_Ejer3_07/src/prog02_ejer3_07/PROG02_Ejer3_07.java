package prog02_ejer3_07;

public class PROG02_Ejer3_07 
{
     public static void main(String[] args) 
     {
          /*
          Calcula la raíz cuadrada de un número natural mediante aproximaciones. En el caso de que
	  no sea exacta, mostrará el resto. Por ejemplo, para calcular la raíz cuadrada de 23, se
	  prueba:
	  1^1 = 1, 
	  2^2 = 4, 
	  3^2 = 9,
	  4^2 = 16,
	  5^2 = 25 (se pasa),
	  resultando 4 la raíz cuadrada de 23
	  con un resto de (23 – 16) = 7.
          */
          
          int numero = 23;
	  
	  int x = 1;
	  
	  // Comparar que su raíz cuadrada no supere el número.
	  while (Math.pow(x, 2)<numero)
	  {
	       // Aumentar la potencia.
	       x++;
	  }
	  x--;
	  
	  // Calcular el resto.
	  int resto = numero - (int) Math.pow(x, 2);
	  
	  System.out.println("La raíz cuadrada de " + numero + " es igual a " + x + ", con un resto de " + resto);
          
     }

}

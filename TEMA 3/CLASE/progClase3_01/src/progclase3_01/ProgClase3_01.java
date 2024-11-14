package progclase3_01;

import java.util.Scanner;

public class ProgClase3_01 
{

    public static void main(String[] args) 
    {
	  /*
	  Crear un array de 5 elementos y almacenar un número aleatorio entre 1 y 10 en cada una de las posiciones.
	  */

	  Scanner sc = new Scanner(System.in);

	  int min = 1, max = 10;

	  int[] casillero = new int[5];
	  
	  for (int i=0; i<5; i++)
	  {
	       int num = (int)(Math.random()*(max-min+1)+min);
	       casillero[i] = num;
	       
	       System.out.println(casillero[i]);
	  }
	  

    }

}

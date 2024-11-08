package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 
{

    public static void main(String[] args) 
    {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Introduzca un número de tres cifras: ");
	  int numero = sc.nextInt();
	  
	  int digito1=1, digito2=1, digito3=1, aux1, aux2, aux3, total;
	  
	  // Operar con el número para obtener y almacenar cada cifra por separado.
	  aux1 = numero/100;
	  aux2 = (numero/10)%10;
	  aux3 = numero%10;
	  
	  // Realizar la operación de exponente el número de veces que cifras tenga el número (en este caso 3).
	  for(int i=0; i<3; i++)
	  {
	       digito1*=aux1;
	       digito2*=aux2;
	       digito3*=aux3;
	  }
	  
	  total = digito1 + digito2 + digito3;
	  
	  if (total==numero)
	  {
	       System.out.println("El " + numero + " es un número Picasso.");
	  }
	  
	  else
	  {
	       System.out.println("El " + numero + " NO es un número Picasso.");
	  }
	  
     }

}

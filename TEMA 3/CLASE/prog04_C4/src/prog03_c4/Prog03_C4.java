package prog03_c4;

import java.util.Scanner;

public class Prog03_C4 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
	int[] c = {2, 5, 4, 8, 7, 1, 9, 3, 6, 10};
	int[] d = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
	
	boolean creciente = false;
	boolean decreciente = false;
	boolean desordenado = false;
	boolean igual = false;
		
	int[] x = d;
	
	for(int i=0; i<9; i++)
	{
	     if(x[i]<x[i+1])
		  creciente = true;
	     
	     if (x[i]>x[i+1])
		  decreciente = true;
	     
	     if (x[i]==x[i+1])
		  igual = true;
	     
	     if (creciente==true && decreciente==true)
		  desordenado = true;
	}
	
	if(desordenado==true)
	      System.out.println("El array está desordenado.");
	
	else if(creciente==true)
	      System.out.println("El array está ordenado crecientemente.");
	
	else if(igual==true)
	      System.out.println("El array es una cadena de números iguales.");
	
	else if(decreciente==true)
	      System.out.println("El array está ordenado decrecientemente.");
        
    }

}

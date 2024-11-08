package prog03_auto06;

import java.util.Scanner;

public class Prog03_auto06 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          6. Crear un programa que pida dos valores enteros P y Q, luego cree un array que contenga
	  todos los valores desde P hasta Q, y lo muestre por pantalla.
          */
          
          System.out.print("Introduce valor de P: ");
	  int p = sc.nextInt();
	  
	  System.out.print("Introduce valor de Q: ");
	  int q = sc.nextInt();
	  
	  int x;
	  if(p<q)
	  {
	       x=p; p=q; q=x;
	  }
	       
	  int n = (p-q);
	  
	  int[] array = new int[n+1];
	  
	  array[0] = q;
	  
	  System.out.println(array[0]);
	  
	  for(int i=1; i<=n; i++)
	  {
	       array[i] = array[i-1] + 1;
	       
	       System.out.println(array[i]);
	  }
	  	  
     }
 
}

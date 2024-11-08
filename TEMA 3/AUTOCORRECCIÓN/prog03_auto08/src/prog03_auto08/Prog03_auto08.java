package prog03_auto08;

import java.util.Scanner;

public class Prog03_auto08 
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);

          /*
          8. Crea un programa que cree un array de 10 enteros y luego muestre 
	  el siguiente menú con distintas opciones:
	  a) Mostrar valores.
	  b) Introducir valor.
	  c) Salir.
	  La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ 
	  pedirá un valor V y una posición P, luego escribirá V en la posición 
	  P del array. El menú se repetirá indefinidamente
	  hasta que el usuario elija la opción ‘c’ que terminará el programa.
          */
          
          int[] array = new int[10];
	  char opcion;
	  
	  do
	  {
	       System.out.println("a) Mostrar valores.");
	       System.out.println("b) Introducir valor.");
	       System.out.println("c) Salir.");
	       System.out.print("\n");
	       
	       System.out.print("Introduce opción: ");
	       opcion = sc.next().charAt(0);
	       
	       System.out.print("\n");
	       
	       switch (opcion)
	       {
		    case 'a':
			 System.out.print("Los valores del array son: ");
			 
			 for(int i=0; i<array.length; i++)
			 {
			      System.out.print(array[i] + " ");
			 }
			 
			 System.out.println("\n");
			 
			 break;
		    
		    case 'b':
			 System.out.print("Introduce un valor: ");
			 int v = sc.nextInt();
			 
			 System.out.print("Introduce una posición: ");
			 int p = sc.nextInt();
			 
			 array[p-1] = v;
			 
			 System.out.println("\n");
			 
			 break;
		    
		    case 'c':
			 System.err.println("Salir.\n");
			 
			 break;
		    
		    default:
			 System.err.println("Opción no válida. Introduce otro valor.\n");
			 
			 break;	 
	       
	       }
	       
	  } while (opcion!='c');
          
     }
 
}

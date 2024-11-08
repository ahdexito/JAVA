package prog03_auto14;

public class Prog03_auto14 
{
     public static void main(String[] args) 
     {

          /*
          14. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá 
	  en el primer array todos los valores del 1 al 100. Por último, deberá copiar todos 
	  los valores del primer array al segundo array, y mostrar ambos por pantalla.
          */
          
          int[] a = new int[100];
	  int[] b = new int[100];
	  
	  for(int i=0; i<a.length; i++)
	  {
	       a[i] = i+1;
	       
	       b[i] = a[i];
	  }
	  
	  for(int i=0; i<a.length; i++)
	  {
	       System.out.println("a: " + a[i]);
	       System.out.println("b: " + b[i]);
	       
	       System.out.print("\n");
	  }
          
     }

}

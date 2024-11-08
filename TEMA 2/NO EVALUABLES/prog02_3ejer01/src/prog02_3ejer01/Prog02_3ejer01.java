package prog02_3ejer01;

public class Prog02_3ejer01 
{

     public static void main(String[] args) 
     {
	  /*
	  Realizar un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3...
	  20) empleando la estructura ‘for’.
	  */
	  
	  int i = 1;
	  
	  System.out.print(i);
	  
	  for(i=2; i<=20; i++)
	  {
	       System.out.print(", " + i);
	  }
	  
	  System.out.println(".");     
     }
     
}

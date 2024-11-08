package prog02_ejer1_07;

import java.util.Scanner;

public class PROG02_Ejer1_07 
{

     public static void main(String[] args) 
     {
	  /*
	  Realiza un programa para una tienda tal que en función de las compras que realicen sus
	  clientes se les aplique un descuento u otro:
	   Si el importe de la compra es menor de 200 euros no se aplica descuento.
	   Si el importe es menor o igual a los 500 euros se aplica un descuento del 5%.
	   Si el importe es menor o igual a 1000 euros el descuento a aplicar es del 10%.
	   Si el importe supera los 1000 euros se aplicará un descuento del 15%.
	  El sistema solicitará el importe de la cuenta y se mostrará por pantalla el descuento a
	  aplicar.
	  */
	  
	  Scanner sc = new Scanner(System.in); 
	  
	  System.out.print("Introduzca el importe: ");
	  int precio = sc.nextInt();
	  
	  if (precio > 1000)
	       System.out.println("Se aplicará un descuento del 15%.");
	  
	  else if (500<precio && precio<=1000)
	       System.out.println("Se aplicará un descuento del 10%.");
	  
	  else if (200<=precio && precio<=500)
	       System.out.println("Se aplicará un descuento del 5%.");
	  
	  else
	       System.out.println("No hay descuento aplicable.");
     }
     
}

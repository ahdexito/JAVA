package prog02_ejer2_04;

import java.util.Scanner;

public class PROG02_Ejer2_04 
{

     public static void main(String[] args) 
     {
	  /*
	  Una empresa que se dedica a la venta de desinfectantes necesita un programa para
	  gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida en
	  litros y el precio por litro.
	  Realizar una aplicación que pida 5 facturas, y calcule:
	   Facturación total.
	   Cantidad en litros vendidos del artículo 1.
	   Cuantas facturas se emitieron de más de 600 €.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int codArticulo, cantLitros, precioLitro, factTotal=0, articulo1=0, mayor600=0;
	  
	  for(int i=1; i<6; i++)
	  {
	       System.out.println("\tFactura " + i);
	       System.out.println("-----------------------------");
	       System.out.print("Introduzca código del artículo: ");
	       codArticulo = sc.nextInt();
	       
	       System.out.print("Introduzca cantidad vendida en litros: ");
	       cantLitros = sc.nextInt();
	       
	       System.out.print("Introduzca el precio por litro: ");
	       precioLitro = sc.nextInt();
	       
	       // Calcular cada factura, y sumar al total.
	       factTotal += precioLitro*cantLitros;
	       
	       // Si es el articulo 1, guardar el valor.
	       if (codArticulo==1)
		    articulo1 = cantLitros;
	       
	       // Si la factura supera 600, sumar 1 al contador de mayores.
	       if (precioLitro*cantLitros>600)
		    mayor600++;
	       
	       System.out.println("");
		
	  }
	  
	  System.out.println("________________________________________________________");
	  System.out.println("La facturación total es: " + factTotal + "€");
	  System.out.println("La cantidad de litros vendidos del artículo 1 es: " + articulo1);
	  System.out.println("Las cantidad facturas emitidas mayores de 600€ es: " + mayor600);
	  
     }    
     
}

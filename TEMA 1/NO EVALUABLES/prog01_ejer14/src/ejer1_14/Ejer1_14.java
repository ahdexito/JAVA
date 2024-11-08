package ejer1_14;
import java.util.Scanner;

public class Ejer1_14 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       /*
	  Escribe un programa que dado el precio de un artículo 
	  y el precio de venta real nos muestre el
	  porcentaje de descuento realizado.
	  Nota: los precios pueden tener decimales.
	  Por ejemplo:
	  Introduce el precio del artículo: XX.X
	  Introduce el precio real del artículo: XX.X
	  El descuento realizado es: X%
       */
       
       System.out.print("Introduce el precio de un artículo rebajado: ");
       double precio_rebaja = sc.nextDouble();
       
       System.out.print("Introduce el precio real de un artículo: ");
       double precio_real = sc.nextDouble();
       
       double porcentaje = 100-(precio_rebaja*100)/precio_real;
       
       System.out.println("El descuento realizado es: " + porcentaje + "%");
         
       
       sc.close();
    }

}

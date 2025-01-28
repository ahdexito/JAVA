package ejercicio_a3;

import java.util.Scanner;

public class Ejercicio_A3 {

     public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          
          Articulo art1 = new Articulo();
		
		art1.nombre = "vino";
		
		art1.precio = 2.50;
		
		art1.stock = 20;
		
		System.out.println("Artículo: " + art1.nombre + ". Precio: " + art1.precio
		+ ". IVA: " + art1.iva + "%. PVP: " + (art1.precio + (art1.precio * art1.iva)));
		
		art1.precio = 3.25;
		
		System.out.println("\nArtículo: " + art1.nombre + ". Precio: " + art1.precio
		+ ". IVA: " + art1.iva + "%. PVP: " + (art1.precio + (art1.precio * art1.iva)));
	}
}

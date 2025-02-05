package ejer_auto_articulo;

import java.security.PKCS12Attribute;
import java.util.Scanner;

public class Ejer_auto_Articulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Articulo a1 = new Articulo();
		
		a1.nombre = "Vino";
		a1.precio = 3.66;
		a1.stock = 40;
		
		System.out.println(a1.nombre +
			   "\n- Precio: " + a1.precio +
			   "\n- IVA: " + a1.iva +
			   "\n- PVP: " + (a1.precio + (a1.precio * a1.iva)) +
			   "\n- Stock: " + a1.stock + "\n");
		
		a1.precio = 4.53;
		
		System.out.println(a1.nombre +
			   "\n- Precio: " + a1.precio +
			   "\n- IVA: " + a1.iva +
			   "\n- PVP: " + (a1.precio + (a1.precio * a1.iva)) +
			   "\n- Stock: " + a1.stock);
	}
}

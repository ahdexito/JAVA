package ejer_clase_coche;

import java.util.Scanner;

public class Ejer_clase_coche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Coche coche1 = new Coche("5205FHX");
		
		System.out.println("\nINFO DE COCHE");
		coche1.MostrarInfo();
		
		Conductor cond1 = new Conductor("Ángel", coche1);
		
		System.out.println("\nINFO DE CONDUCTOR");
		cond1.MostrarInfo();
		
		cond1 = null;
		
		System.out.println("\nINFO DE COCHE");
		coche1.MostrarInfo();
		
		System.out.println("\nINFO DE CONDUCTOR");
		cond1.MostrarInfo();
	}
}

package ejer_auto_punto;

import java.util.Scanner;

public class Ejer_auto_Punto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Punto p1 = new Punto();
		Punto p2 = new Punto();
		Punto p3 = new Punto();

		p1.x = 5;
		p1.y = 0;

		p2.x = 10;
		p2.y = 10;

		p3.x = -3;
		p3.y = 7;
		
		System.out.println("Punto 1: x = " + p1.x + ", y = " + p1.y);
		System.out.println("Punto 2: x = " + p2.x + ", y = " + p2.y);
		System.out.println("Punto 3: x = " + p3.x + ", y = " + p3.y);
		
		System.out.println("Distancia entre p1 y p2: " + p1.Distancia(p2));
	}
}
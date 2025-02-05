package ejer_auto_rectangulo;

import java.util.Scanner;

public class Ejer_auto_Rectangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		r1.alto = 4;
		r1.ancho = 8;
		
		r2.alto = 6;
		r2.ancho = 3;
		r2.caracter = 'o';
				
		System.out.println("Rectángulo 1");
		System.out.println("Area: " + r1.Area());
		System.out.println("Perímetro: " + r1.Perimetro());
		r1.Dibujar();
		
		System.out.println("Rectángulo 2");
		System.out.println("Area: " + r2.Area());
		System.out.println("Perímetro: " + r2.Perimetro());
		r2.Dibujar();
	}
}

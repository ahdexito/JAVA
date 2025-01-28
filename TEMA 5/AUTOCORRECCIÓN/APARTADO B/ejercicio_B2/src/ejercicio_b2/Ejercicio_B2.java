package ejercicio_b2;

import java.util.Scanner;

public class Ejercicio_B2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rectangulo rec1 = new Rectangulo();

		rec1.alto = 5;

		rec1.ancho = 8;

		rec1.Dibujar();
		
		System.out.println("");
		
		rec1.caracter = 'O';

		rec1.Dibujar();
	}
}

package ejer_auto_interfaces_04;

import java.util.Scanner;

public class Ejer_auto_interfaces_04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
		IFigura2D[] figuras = new IFigura2D[5];
		
		figuras[0] = new Cuadrado(5);
		figuras[1] = new Rectangulo(3, 4);
		figuras[2] = new Triangulo(5, 7);
		figuras[3] = new Circulo(6);
		figuras[4] = new Circulo(3);
    }
}
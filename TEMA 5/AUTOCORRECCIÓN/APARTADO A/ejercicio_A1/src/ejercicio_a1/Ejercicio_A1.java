package ejercicio_a1;

import java.util.Scanner;

public class Ejercicio_A1 {
    
    public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Punto p1 = new Punto();
			p1.x = 1;
			p1.y = 2;
			
			System.out.println("Punto 1.  X: " + p1.x + ".  Y: " + p1.y);
		
		Punto p2 = new Punto();
			p2.x = 3;
			p2.y = 7;
			
			System.out.println("Punto 2.  X: " + p2.x + ".  Y: " + p2.y);
		
		Punto p3 = new Punto();
			p3.x = 8;
			p3.y = 4;
			
			System.out.println("Punto 3.  X: " + p3.x + ".  Y: " + p3.y);
			
		System.out.println("\n\n");
//		
//		p1.x = 3;
//		p1.y = 7;
//		
//		System.out.println("Punto 1.  X: " + p1.x + ".  Y: " + p1.y);
//		
//		p2.x = 1;
//		p2.y = 9;
		
		System.out.println("Punto 2.  X: " + p2.x + ".  Y: " + p2.y);
		
		p2.Imprimir();
		
		p2.Desplaza(2, 2);
		
		p3.Distancia(p1.x, p1.y);
    }
}

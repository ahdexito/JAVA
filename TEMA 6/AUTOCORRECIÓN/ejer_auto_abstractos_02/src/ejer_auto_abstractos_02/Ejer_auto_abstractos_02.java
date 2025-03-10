package ejer_auto_abstractos_02;

import java.util.Scanner;

public class Ejer_auto_abstractos_02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Triangulo[] triangulos = new Triangulo[5];
		
		System.out.println("SELECCIONA 5 TRIÁNGULOS");
		
		for (int i = 0; i < triangulos.length; i++) {
						
			System.out.print("\nEquilátero / Isósceles / Rectángulo (E / I / R): ");
			char letra = sc.next().charAt(0);
			
			if (letra == 'E' || letra == 'I' || letra == 'R') {
				
				System.out.print("Base: ");
				double base = sc.nextDouble();
				
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
			
				switch (letra) {
					case 'E':
						triangulos[i] = new TrianguloEquilatero(base, altura);
						break;

					case 'I':
						triangulos[i] = new TrianguloIsosceles(base, altura);
						break;

					case 'R':
						triangulos[i] = new TrianguloRectangulo(base, altura);
						break;
				}
			}
			
			else {
				System.out.println("OPCIÓN NO VÁLIDA");
				i--;
			}
		}
		
		for (int i = 0; i < triangulos.length; i++) {
			
			
		}
    }
}
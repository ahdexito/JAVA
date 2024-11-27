package prog04_auto01;

import java.util.Scanner;

public class Prog04_auto01 {
	
	public static void Multiplicar(double a, double b) {
		
		System.out.println(a*b);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        1. Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
		resultado de multiplicarlos. Implementa y utiliza la función:
		Multiplica(double a, double b) // Devuelve la multiplicación de dos números
        */
        
		System.out.print("Introduce número a: ");
		double a = sc.nextInt();
        
        System.out.print("Introduce número b: ");
		double b = sc.nextInt();
		
		Multiplicar(a, b);
    }
}

package prog04_autorecursividad;

import java.util.Scanner;

public class Prog04_autoRecursividad01 {
	
	public static void HastaN(int n) {
		
		if (n > 0) {
			HastaN(n - 1);
			System.out.println(n + " ");
		}
		
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        1. Crea un método que imprima los dígitos desde 1 hasta N. Se debe pasar como
		parámetro el número N
        */
        
		int numero;
		
        System.out.print("Introduce número: ");
        numero = sc.nextInt();
		
		HastaN(numero);
    }
}

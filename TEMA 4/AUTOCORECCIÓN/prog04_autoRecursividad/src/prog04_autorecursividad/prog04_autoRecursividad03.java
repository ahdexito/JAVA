package prog04_autorecursividad;

import java.util.Scanner;

public class prog04_autoRecursividad03 {
	
	public static void NHasta1 (int n) {
		
		if (n > 0) {
			
			System.out.println(n + " ");
			NHasta1(n - 1);
		}
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        3.Crea un método que imprima los dígitos desde N hasta 1. Se debe pasar como
		parámetro el número N
        */
        
        System.out.print("Introduce numero: ");
		int numero = sc.nextInt();
		
		NHasta1(numero);
        
    }
}

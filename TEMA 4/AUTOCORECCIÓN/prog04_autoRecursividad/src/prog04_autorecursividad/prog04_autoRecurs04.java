package prog04_autorecursividad;

import java.util.Scanner;

public class prog04_autoRecurs04 {
		
	public static int CantidadDigitos (int n) {
		
		if (n <= 0) return 0;
		
		else return 1 + CantidadDigitos(n / 10);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        4.Crea un método que obtenga la can�dad de dígitos de un número N. Se debe pasar
		como parámetro el número N (N debe ser posi�vo)
        */
        
        System.out.print("Introduce número: ");
		int numero = sc.nextInt();
		
		System.out.println("El número tiene " + (CantidadDigitos(numero)) + " dígitos.");
        
    }
}

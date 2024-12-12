package prog04_autorecursividad;

import java.util.Scanner;

public class Prog04_autoRecursividad02 {
	
	public static int SumaHastaN (int n) {
		
		if (n == 1) return 1;
		
		return n + SumaHastaN(n - 1);
	}
	

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        2. Crea un método/función que obtenga la suma de los números naturales desde 1 hasta
		N. Se debe pasar como parámetro el número N
        */
        
		int numero;
		
        System.out.print("Introduce número: ");
        numero = sc.nextInt();
		
		System.out.println("La suma desde 1 hasta la entrada es: " + SumaHastaN(numero));
    }
}

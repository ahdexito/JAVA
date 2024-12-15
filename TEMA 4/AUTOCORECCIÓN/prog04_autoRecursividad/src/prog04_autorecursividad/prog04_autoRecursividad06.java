package prog04_autorecursividad;

import java.util.Scanner;

public class prog04_autoRecursividad06 {
	
	public static int ElevarNumero (int base, int expo) {
		
		if (expo == 0) return 1;
		
		return base * ElevarNumero(base, expo - 1);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        6. Crea una función que calcule el valor de elevar un número entero a otro número
		entero (por ejemplo, 5 elevado a 3 es, 53 = 5·52 = 5·5·51 = 125). Esta función se debe
		crear de forma recursiva. Piensa cuál será el caso base.
        */
        
        int base = 5;
		int expo = 3;
        
		System.out.println("El " + base + " elevado a " + expo + " es igual a " + ElevarNumero(base, expo));
    }
}
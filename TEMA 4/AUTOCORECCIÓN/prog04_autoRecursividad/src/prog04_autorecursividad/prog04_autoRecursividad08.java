package prog04_autorecursividad;

import java.util.Scanner;

public class prog04_autoRecursividad08 {
	
	public static int SumaCifras(int numero) {
				
		if (numero <= 0) return 0;
		
		return (numero % 10) + SumaCifras(numero / 10);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        8. Crear una función recursiva llamada Suma(numero), que reciba un número entero
		por parámetros, y suma las cifras del número recibo.	
        */
        
        int numero = 12345;
		
		System.out.println("La suma total es: " + SumaCifras(numero));
        
    }
}
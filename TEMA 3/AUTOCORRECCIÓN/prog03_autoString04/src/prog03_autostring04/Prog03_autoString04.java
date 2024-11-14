package prog03_autostring04;

import java.util.Scanner;

public class Prog03_autoString04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        4. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
		sin diferenciar entre mayúsculas y minúsculas.
        */
        
        System.out.print("Introduce frase 1: " );
		String frase1 = sc.nextLine().toLowerCase();
		
		System.out.print("Introduce frase 2: ");
		String frase2 =  sc.nextLine().toLowerCase();
		
		boolean iguales = frase1.equals(frase2);
		
		if (iguales)
			System.out.println("Las frases son iguales.");
		
		else
			System.out.println("Las frases NO son iguales.");
        
    }
}

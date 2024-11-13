package prog03_autostring02;

import java.util.Scanner;

public class Prog03_autoString02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        2. Un programa que pida al usuario dos frases y diga cuál sería la "mayor" de ellas, o si son
		iguales.
        */
        
        System.out.print("Introduce una frase: ");
		String frase1 = sc.nextLine();
		
		System.out.print("Introduce otra frase: ");
		String frase2 = sc.nextLine();
        
		int comparar = frase1.compareTo(frase2);
		
		if (comparar>0)
			System.out.println("La frase mayor es la primera.");
		
		else if (comparar<0)
			System.out.println("La frase mayor es la segunda.");
		
		else
			System.out.println("La frases son iguales.");
    }
}
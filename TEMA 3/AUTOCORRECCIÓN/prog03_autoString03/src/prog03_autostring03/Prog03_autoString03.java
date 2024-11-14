package prog03_autostring03;

import java.util.Scanner;

public class Prog03_autoString03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        3. Un programa que pida al usuario cinco frases, las guarde en un array y muestre la "menor"
		de ellas. Para resolver el ejercicio, utiliza las funciones más adecuadas.
        */
		
		String[] frases = new String[5];
		
		for (int i=0; i<frases.length; i++) {
			
			System.out.print("Introduce frase " + (i+1) + " : ");
			frases[i] = sc.nextLine();
		}
		
		String menor = frases[0];
		
		for (int i=1; i<frases.length; i++) {
			
			if (frases[i].length() < menor.length()) {
				
				menor = frases[i];
			}
		}
		
		System.out.println("La frase menor es: " + menor);
		
    }
}
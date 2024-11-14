package prog03_autostring07;

import java.util.Scanner;

public class Prog03_autoString07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        7. Un programa que pida una frase al usuario y la muestre en orden inverso (de la última letra
		a la primera)
        */
        
        System.out.print("Introduce una frase: ");
		String frase = sc.nextLine();
		
		for (int i=frase.length()-1; i>=0; i--) {
			
			System.out.print(frase.charAt(i));
		}
        System.out.print("\n");
    }
}

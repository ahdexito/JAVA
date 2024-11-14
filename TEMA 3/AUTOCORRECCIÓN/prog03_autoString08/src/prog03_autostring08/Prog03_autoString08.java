package prog03_autostring08;

import java.util.Scanner;

public class Prog03_autoString08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        8. Un programa que pida al usuario una frase, después una letra y finalmente diga si
		aparece esa letra como parte de esa frase o no.
		Para resolverlo, utilizar la función “Length” y una estructura “for”.
        */
        
        System.out.print("Introduce una frase: ");
		String frase = sc.nextLine();
		
		System.out.print("Introduce una letra: ");
		char letra = sc.next().charAt(0);
		
		boolean aparece = false;
		
		for (int i=0; i<frase.length(); i++) {
			
			if (frase.charAt(i) == letra)
				aparece = true;
		}
		if (aparece)
			System.out.println("La letra aparece en la frase.");
		
		else
			System.out.println("La letra NO aparece en la frase.");
    }
}

package prog03_autostring06;

import java.util.Scanner;

public class Prog03_autoString06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        6. Un programa que te pida tu nombre y lo muestre en pantalla separando cada letra de la
		siguiente con un espacio. Por ejemplo, si tu nombre es "Juan", debería aparecer en
		pantalla "J u a n"
        */
        
        System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		for (int i=0; i<nombre.length(); i++) {
			
			System.out.print(nombre.charAt(i) + " ");
		}
        
    }
}

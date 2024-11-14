package prog03_autostring05;

import java.util.Scanner;

public class Prog03_autoString05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        5. Crea un programa que pregunte al usuario su nombre y le responda cuál es su inicial.
        */
        
        System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("La inicial de tu nombre es: " + nombre.charAt(0));
    }
}

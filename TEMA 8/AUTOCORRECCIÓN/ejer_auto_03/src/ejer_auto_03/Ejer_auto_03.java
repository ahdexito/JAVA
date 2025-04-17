package ejer_auto_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer_auto_03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        ArrayList<String> lista = new ArrayList<String>();
		
		String entrada = "";
		
		while (!entrada.equals("FIN")) {
			System.out.print("Introduce frase: ");
			entrada = sc.nextLine();
			lista.add(entrada);
		}
		
		int posicion = 0;
		
		while (posicion != -1) {
			System.out.print("Introduce posición: ");
			posicion = sc.nextInt();
			System.out.println(lista.get(posicion));
		}
    }
}
package prog04_autorecursividad;

import java.util.Scanner;

public class prog04_autoRecursividad07 {
	
	public static String Invertir(String cadena) {
		
		// Caso base: si la cadena tiene 0 o 1 caracter, devolver la cadena tal cual
        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        }

        // Paso recursivo: tomar el último carácter y concatenarlo con la llamada recursiva
        return cadena.charAt(cadena.length() - 1) + Invertir(cadena.substring(0, cadena.length() - 1));
		
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        7. Crea un programa que emplee recursividad para dar la vuelta a una cadena de
		caracteres (por ejemplo, a par�r de "Hola" devolvería "aloH"). La función recursiva se
		llamará "Inver�r(cadena)". Como siempre, analiza cuál será el caso base.
		PISTA: Emplea las funciones valueOf(), charAt(), substring(), concat(), etc, que creas
		oportuno. La idea sería obtener la úl�ma letra de la cadena recibida por parámetro,
		concatenar la letra obtenida con la llamada a la función recursiva, pasando por
		parámetro la cadena, pero sin la úl�ma letra.
        */
		
		String original = "Hola";
		String invertida = Invertir(original);
        
        System.out.println("Cadena original: " + original);
		System.out.println("Cadena invertida: " + invertida);
        
    }
}
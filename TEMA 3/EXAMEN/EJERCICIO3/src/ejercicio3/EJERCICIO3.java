package ejercicio3;

import java.util.Scanner;

public class EJERCICIO3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String dialecto1 = "Javalin, javalon   ";
		String dialecto2 = "   javalen, len, len";
        
        System.out.print("Introduce una frase: ");
		String entrada = sc.nextLine();
		//String entrada = "Javalin, javalon   Frase   javalen, len, len";
		
		boolean empieza = entrada.startsWith(dialecto1);
		boolean termina = entrada.endsWith(dialecto2);
		
		// VERIFICAR FRASE
		if (empieza || termina) {
			System.out.println("El mensaje pertenece al idioma Javalandia.");
			
			String frase;
			
			// OBTENER SUBCADENA SEGUN SI EMPIEZA, TERMINA, O AMBAS
			if (empieza && termina) {
				frase = entrada.substring(19, (entrada.length() - 20));
				System.out.println(frase);
			}
			
			else if (empieza && !termina) {
				frase = entrada.substring(19, entrada.length());
				System.out.println(frase);
			}
			
			else {
				frase = entrada.substring(0, (entrada.length() - 20));
				System.out.println(frase);
			}

			
			for (int i=frase.length() - 1; i>0; i--) {
				
				System.out.print(frase.charAt(i));
			}
			System.out.println("\n");
			
			// REEMPLAZAR CARACTER O CARACTERES
			System.out.print("Introduce el carácter o carácteres a reemplazar: ");
			String reemplaza = sc.nextLine();
			
			System.out.print("Introduce el nuevo carácter o carácteres: ");
			String modificacion = sc.nextLine();
			
			String nuevaFrase = frase.replace(reemplaza, modificacion);
			
			System.out.println("La nueva frase es: " + nuevaFrase);
			
		}
			
		else
			System.out.println("El mensaje no pertenece al idioma Javalandia.");
    }
	
	
}

package ejer_auto_4_2;

import java.util.Scanner;

final class Email {
	
	static Scanner sc = new Scanner (System.in);
	
	private static int contador = 0;

	private Email() {
	}

	public static boolean SendEmail(String destinatario, String asunto, String cuerpo) {

		if (contador < 3) {
			System.out.println(CIAN + "### MENSAJE ENVIADO ###" + RESET);
			contador++;
			return true;
		}
		else {
			System.out.println(ROJO + "### ENVÍO DE MENSAJE BLOQUEADO ###" + RESET);
			System.out.print(AMARILLO + "¿Resetear contador? (S / N): " + RESET);
			char respuesta = sc.next().charAt(0);
			
			if (respuesta == 'S') {
				QuitarBloqueo();
				SendEmail(destinatario, asunto, cuerpo);
			}
			else {
				System.out.println(CIAN + "### MENSAJE ELIMINADO ###" + RESET);
				return false;
			}
		}
		return false;
	}

	public static void QuitarBloqueo() {

		contador = 0;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}

public class Ejer_auto_4_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        do {
			System.out.println("\n" + AMARILLO + "### NUEVO MENSAJE ###" + RESET);
			System.out.print("Introduce destinatario: ");
			String destinatario = sc.nextLine();

			System.out.print("Introduce asunto: ");
			String asunto = sc.nextLine();

			System.out.print("Introduce cuerpo: ");
			String cuerpo = sc.nextLine();

			Email.SendEmail(destinatario, asunto, cuerpo);
		}
		while (true);
    }
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}

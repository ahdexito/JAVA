package ejer_evaluable_3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("### GESTIÓN DE HOSPITAL ###");
		
		Hospital hospital = new Hospital
		
		int opcion;
		
		do {			
			System.out.print(""
					+ "  1. Médico\n"
					+ "  2. Enfermero\n"
					+ "  3. Paciente\n"
					+ "  0. Salir\n\n"
					+ "Selecciona una opción: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
				case 1:
					
			}
		}
		while (opcion != 0);
    }
}
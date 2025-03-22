package clinica_veterinaria;

import java.util.Scanner;

public class Clinica_veterinaria {
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		do {
			// MENÚ PRINCIPAL //
			System.out.print("\n" + AMARILLO
					+ "### GESTIÓN CLÍNICA VETERINARIA ###\n"
					+ "  1. Consultar\n"
					+ "  2. Insertar\n"
					+ "  3. Modificar\n"
					+ "  4. Borrar\n"
					+ "  0. Cerrar programa\n" + MORADO
					+ "Introduce opción: " + RESET);
			opcion = sc.nextInt();
			sc.nextLine();
						
			switch (opcion) {
				case 1:
					// MENÚ CONSULTAS //
					System.out.print("\n" + AMARILLO
							+ "### CONSULTAR ###\n"
							+ "  1. Atiende\n"
							+ "  2. Cliente\n"
							+ "  3. Mascota\n"
							+ "  4. Sala\n"
							+ "  5. Veterinario\n"
							+ "  0. Salir\n" + MORADO
							+ "Introduce opción: " + RESET);
					int opcion1 = sc.nextInt();
					sc.nextLine();
					
					System.out.println("");
					
					switch (opcion1) {
						case 1:
							// CONSULTAR TABLA ATIENDE //
							Select.atiende();
							break;
						case 2:
							// CONSULTAR TABLA CLIENTE //
							Select.cliente();
							break;
						case 3:
							// CONSULTAR TABLA MASCOTA //
							Select.mascota();
							break;
						case 4:
							// CONSULTAR TABLA SALA //
							Select.sala();
							break;
						case 5:
							// CONSULTAR TABLA VETERINARIO //
							Select.veterinario();
							break;
					}
					break;
					
				case 2:
					break;
			}
			
			if (opcion != 0) {
				System.out.print("\n" + MORADO + "CONTINUAR (ENTER)" + RESET);
				sc.nextLine();
			}
			
		}
		while (opcion != 0);
		
		System.out.println("\n" + CIAN + "### HASTA PRONTO ###" + "\n");
    }
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
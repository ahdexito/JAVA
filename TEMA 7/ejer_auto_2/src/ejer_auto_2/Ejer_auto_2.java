package ejer_auto_2;

import java.util.Scanner;

public class Ejer_auto_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int opcion;
		
		do {
			System.out.print("\n" + AMARILLO
					+ "--------- GESTIÓN CLÍNICA VETERINARIA ---------\n"
					+ "  1. Listar todos los clientes\n"
					+ "  2. Buscar clientes por nombre\n"
					+ "  3. Listar todas las mascotas\n"
					+ "  0. Salir\n" + AMARILLO
					+ "-----------------------------------------------\n"
					+ "\n" + MORADO
					+ "INTRODUCE OPCIÓN: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			System.out.println("");
			
			switch (opcion) {
				case 1:
					Consultas.clientes();
					break;
					
				case 2:
					System.out.print(MORADO + "INTRODUCE NOMBRE DE CLIENTE: " + RESET);
					String nombre = sc.nextLine();
					System.out.println("");
					Consultas.cliente(nombre);
					break;
					
				case 3:
					Consultas.mascotas();
					break;
					
				case 0:
					System.out.println(CIAN + "### HASTA PRONTO ###" + "\n");
					break;
			}
		}
		while (opcion != 0);
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
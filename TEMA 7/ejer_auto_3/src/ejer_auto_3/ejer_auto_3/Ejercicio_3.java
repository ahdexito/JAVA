package ejer_auto_3;

import java.util.Scanner;

public class Ejercicio_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int opcion;
		
		do {
			System.out.print("\n" + AMARILLO
					+ "--------- GESTIÓN CLÍNICA VETERINARIA ---------\n" + RESET
					+ "  1. Listar todos los clientes\n" + RESET
					+ "  2. Buscar clientes por nombre\n" + RESET
					+ "  3. Listar todas las mascotas\n" + RESET
					+ "  4. Insertar un nuevo cliente\n" + RESET
					+ "  5. Actualizar un cliente existente\n" + RESET
					+ "  6. Eliminar un cliente\n" + RESET
					+ "  0. Salir\n" + AMARILLO
					+ "-----------------------------------------------\n"
					+ "\n" + MORADO
					+ "INTRODUCE OPCIÓN: " + RESET);
			opcion = sc.nextInt();
			sc.nextLine();
			
			System.out.println("");
			
			switch (opcion) {
				case 1:
					Cliente.listarClientes();
					break;
					
				case 2:
					System.out.print(MORADO + "INTRODUCE NOMBRE DE CLIENTE: " + RESET);
					String nombre = sc.nextLine();
					System.out.println("");
					Cliente.listarCliente(nombre);
					break;
					
				case 3:
					Mascota.listarMascotas();
					break;
					
				case 4:
					
					break;
				
				case 0:
					System.out.println(CIAN + "### HASTA PRONTO ###" + "\n");
					break;
			}
		}
		while (opcion != 0);
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "[0m", MORADO = "[35m", ROJO = "[31m",
		AZUL = "[34m", CIAN = "[36m", VERDE = "[32m", AMARILLO = "[33m";
}
package pi_asignacion_proyectos;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int opcion;
		
		do {
			// MEN� PRINCIPAL //
			System.out.print("\n" + AMARILLO
					+ "----------- ASIGNACIÓN DE PROYECTOS -----------\n" + RESET
					+ "  1. Clientes\n" + RESET
					+ "  2. Proyectos\n" + RESET
					+ "  3. Desarrolladores\n" + RESET
					+ "  4. Asignaciones de proyectos\n" + RESET
					+ "  0. Salir\n" + AMARILLO
					+ "-----------------------------------------------\n"
					+ "\n" + MORADO
					+ "INTRODUCE OPCIÓN: " + RESET);
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
				case 1:
					// MEN� - TABLA CLIENTE //
					System.out.print("\n" + AMARILLO
							+ "--------- MANTENIMIENTO TABLA CLIENTE ---------\n" + RESET
							+ "  1. Crear\n" + RESET
							+ "  2. Consultar\n" + RESET
							+ "  3. Modificar\n" + RESET
							+ "  4. Eliminar\n" + RESET
							+ "  0. Volver\n" + AMARILLO
							+ "-----------------------------------------------\n"
							+ "\n" + MORADO
							+ "INTRODUCE OPCIÓN: " + RESET);
					int opcion1 = sc.nextInt();
					sc.nextLine();
					
					System.out.println("");
					
					switch (opcion1) {
						case 1:
							// TABLA CLIENTE - CREAR //
							
							System.out.println(AMARILLO +
									"---------- DATOS DEL CLIENTE A AÑADIR ---------" + RESET);
							
							System.out.print("  - DNI: " + RESET); String dni = sc.nextLine();
							System.out.print("  - Nombre: " + RESET); String nombre = sc.nextLine();
							System.out.print("  - Primer apellido: " + RESET); String apellido1 = sc.nextLine();
							System.out.print("  - Segundo apellido: " + RESET); String apellido2 = sc.nextLine();
							System.out.print("  - Email: " + RESET); String email = sc.nextLine();
							System.out.print("  - Teléfono: " + RESET); String telefono = sc.nextLine();
							
							Insert.cliente(dni, nombre, apellido1, apellido2, email, telefono);
							
							break;
							
						case 2:
							// TABLA CLIENTE - CONSULTAR //
							
							Select.allFromClientes();
							
							break;
							
						case 3:
							// TABLA CLIENTE - MODIFICAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
							
						case 4:
							// TABLA CLIENTE - ELIMINAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
					}
					break;
					
				case 2:
					// MEN� - TABLA PROYECTO //
					System.out.print("\n" + AMARILLO
							+ "--------- MANTENIMIENTO TABLA PROYECTO ---------\n" + RESET
							+ "  1. Crear\n" + RESET
							+ "  2. Consultar\n" + RESET
							+ "  3. Modificar\n" + RESET
							+ "  4. Eliminar\n" + RESET
							+ "  0. Volver\n" + AMARILLO
							+ "------------------------------------------------\n"
							+ "\n" + MORADO
							+ "INTRODUCE OPCIÓN: " + RESET);
					int opcion2 = sc.nextInt();
					sc.nextLine();
					
					switch (opcion2) {
						case 1:
							// TABLA PROYECTO - CREAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
							
						case 2:
							// TABLA PROYECTO - CONSULTAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
							
						case 3:
							// TABLA PROYECTO - MODIFICAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
							
						case 4:
							// TABLA PROYECTO - ELIMINAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
					}
					break;
					
				case 3:
					// MEN� - TABLA DESARROLLADOR //
					System.out.print("\n" + AMARILLO
							+ "------- MANTENIMIENTO TABLA DESARROLLADOR ------\n" + RESET
							+ "  1. Crear\n" + RESET
							+ "  2. Consultar\n" + RESET
							+ "  3. Modificar\n" + RESET
							+ "  4. Eliminar\n" + RESET
							+ "  0. Volver\n" + AMARILLO
							+ "------------------------------------------------\n"
							+ "\n" + MORADO
							+ "INTRODUCE OPCIÓN: " + RESET);
					int opcion3 = sc.nextInt();
					sc.nextLine();
					
					switch (opcion3) {
						case 1:
							// TABLA DESARROLLADOR - CREAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
							
						case 2:
							// TABLA DESARROLLADOR - CONSULTAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
							
						case 3:
							// TABLA DESARROLLADOR - MODIFICAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
							
						case 4:
							// TABLA DESARROLLADOR - ELIMINAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
					}
					break;
					
				case 4:
					// MEN� - TABLA ASIGNACI�N //
					System.out.print("\n" + AMARILLO
							+ "-------- MANTENIMIENTO TABLA ASIGNACIÓN --------\n" + RESET
							+ "  1. Crear\n" + RESET
							+ "  2. Consultar\n" + RESET
							+ "  3. Modificar\n" + RESET
							+ "  4. Eliminar\n" + RESET
							+ "  0. Volver\n" + AMARILLO
							+ "------------------------------------------------\n"
							+ "\n" + MORADO
							+ "INTRODUCE OPCIÓN: " + RESET);
					int opcion4 = sc.nextInt();
					sc.nextLine();
					
					switch (opcion4) {
						case 1:
							// TABLA ASIGNACI�N - CREAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
							
						case 2:
							// TABLA ASIGNACI�N - CONSULTAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
							
						case 3:
							// TABLA ASIGNACI�N - MODIFICAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
							
						case 4:
							// TABLA ASIGNACI�N - ELIMINAR //
							System.out.println("\n" + ROJO + "En desarrollo..." + RESET);
							break;
					}
					break;
			}
			
			System.out.print("\n" + MORADO + "CONTINUAR (ENTER): " + RESET);
			sc.nextLine();
		}
		while (opcion != 0);
		
		sc.close();
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
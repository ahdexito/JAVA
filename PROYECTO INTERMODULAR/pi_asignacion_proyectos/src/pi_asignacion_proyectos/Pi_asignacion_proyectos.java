package pi_asignacion_proyectos;

import java.util.Scanner;

public class Pi_asignacion_proyectos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int opcion;
		
		do {
			// MENÚ PRINCIPAL //
			System.out.print("\n" + AMARILLO
					+ "----------- ASIGNACIÓN DE PROYECTOS -----------\n"
					+ "  1. Clientes\n"
					+ "  2. Proyectos\n"
					+ "  3. Desarrolladores\n"
					+ "  4. Asignaciones de proyectos\n"
					+ "  0. Salir\n" + AMARILLO
					+ "-----------------------------------------------\n"
					+ "\n" + MORADO
					+ "INTRODUCE OPCIÓN: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
				case 1:
					// MENÚ - TABLA CLIENTE //
					System.out.print("\n" + AMARILLO
							+ "--------- MANTENIMIENTO TABLA CLIENTE ---------\n"
							+ "  1. Crear\n"
							+ "  2. Consultar\n"
							+ "  3. Modificar\n"
							+ "  4. Eliminar\n"
							+ "  0. Volver\n" + AMARILLO
							+ "-----------------------------------------------\n"
							+ "\n" + MORADO
							+ "INTRODUCE OPCIÓN: ");
					int opcion1 = sc.nextInt();
					sc.nextLine();
					
					System.out.println("");
					
					switch (opcion1) {
						case 1:
							// TABLA CLIENTE - CREAR //
							
							System.out.println(AMARILLO +
									"---------- DATOS DEL CLIENTE A AÑADIR ---------" + RESET);
							
							System.out.print("  - DNI: "); String dni = sc.nextLine();
							System.out.print("  - Nombre: "); String nombre = sc.nextLine();
							System.out.print("  - Primer apellido: "); String apellido1 = sc.nextLine();
							System.out.print("  - Segundo apellido: "); String apellido2 = sc.nextLine();
							System.out.print("  - Email: "); String email = sc.nextLine();
							System.out.print("  - Teléfono: "); String telefono = sc.nextLine();
							
							Insert.cliente(dni, nombre, apellido1, apellido2, email, telefono);
							
							break;
							
						case 2:
							// TABLA CLIENTE - CONSULTAR //
							
							Select.allFromClientes();
							
							break;
							
						case 3:
							// TABLA CLIENTE - MODIFICAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
							
						case 4:
							// TABLA CLIENTE - ELIMINAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
					}
					break;
					
				case 2:
					// MENÚ - TABLA PROYECTO //
					System.out.print("\n" + AMARILLO
							+ "--------- MANTENIMIENTO TABLA PROYECTO ---------\n"
							+ "  1. Crear\n"
							+ "  2. Consultar\n"
							+ "  3. Modificar\n"
							+ "  4. Eliminar\n"
							+ "  0. Volver\n" + AMARILLO
							+ "------------------------------------------------\n"
							+ "\n" + MORADO
							+ "INTRODUCE OPCIÓN: ");
					int opcion2 = sc.nextInt();
					sc.nextLine();
					
					switch (opcion2) {
						case 1:
							// TABLA PROYECTO - CREAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
							
						case 2:
							// TABLA PROYECTO - CONSULTAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
							
						case 3:
							// TABLA PROYECTO - MODIFICAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
							
						case 4:
							// TABLA PROYECTO - ELIMINAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
					}
					break;
					
				case 3:
					// MENÚ - TABLA DESARROLLADOR //
					System.out.print("\n" + AMARILLO
							+ "------- MANTENIMIENTO TABLA DESARROLLADOR ------\n"
							+ "  1. Crear\n"
							+ "  2. Consultar\n"
							+ "  3. Modificar\n"
							+ "  4. Eliminar\n"
							+ "  0. Volver\n" + AMARILLO
							+ "------------------------------------------------\n"
							+ "\n" + MORADO
							+ "INTRODUCE OPCIÓN: ");
					int opcion3 = sc.nextInt();
					sc.nextLine();
					
					switch (opcion3) {
						case 1:
							// TABLA DESARROLLADOR - CREAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
							
						case 2:
							// TABLA DESARROLLADOR - CONSULTAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
							
						case 3:
							// TABLA DESARROLLADOR - MODIFICAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
							
						case 4:
							// TABLA DESARROLLADOR - ELIMINAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
					}
					break;
					
				case 4:
					// MENÚ - TABLA ASIGNACIÓN //
					System.out.print("\n" + AMARILLO
							+ "-------- MANTENIMIENTO TABLA ASIGNACIÓN --------\n"
							+ "  1. Crear\n"
							+ "  2. Consultar\n"
							+ "  3. Modificar\n"
							+ "  4. Eliminar\n"
							+ "  0. Volver\n" + AMARILLO
							+ "------------------------------------------------\n"
							+ "\n" + MORADO
							+ "INTRODUCE OPCIÓN: ");
					int opcion4 = sc.nextInt();
					sc.nextLine();
					
					switch (opcion4) {
						case 1:
							// TABLA ASIGNACIÓN - CREAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
							
						case 2:
							// TABLA ASIGNACIÓN - CONSULTAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
							
						case 3:
							// TABLA ASIGNACIÓN - MODIFICAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
							
						case 4:
							// TABLA ASIGNACIÓN - ELIMINAR //
							System.out.println("\n" + ROJO + "En desarrollo...");
							break;
					}
					break;
			}
			
			System.out.print("\n" + MORADO + "CONTINUAR (ENTER):");
			sc.nextLine();
		}
		while (opcion != 0);
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
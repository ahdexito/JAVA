package Vista;

public class Imprimir {
    
    public static void menuPrincipal() {
	
		// MENÚ PRINCIPAL //
		
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
	}
	
	public static void menuCliente() {
		
		// MENÚ - TABLA CLIENTE //
		
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
	}
	
	public static void menuProyecto() {
		
		// MENÚ - TABLA PROYECTO //
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
	}
	
	public static void menuDesarrollador() {
		
		// MENÚ - TABLA DESARROLLADOR //
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
	}
	
	public static void menuAsignacion() {
		
		// MENÚ - TABLA ASIGNACIÓN //
		
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
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}


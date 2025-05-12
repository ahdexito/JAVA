package Vista;

import java.sql.*;

public class Imprimir {
    
	// MÉTODO QUE IMPRIME EL MENÚ PRINCIPAL //
    public static void menuPrincipal() {
		
		System.out.print("\n" + MORADO
			+ "---------------- " + AMARILLO + "[ MENÚ PRINCIPAL ]" + MORADO + " ----------------\n" + AMARILLO
			+ "  1. " + RESET + "CLIENTES\n" + AMARILLO
			+ "  2. " + RESET + "PROYECTOS\n" + AMARILLO
			+ "  3. " + RESET + "DESARROLLADORES\n" + AMARILLO
			+ "  4. " + RESET + "ASIGNACIONES DE PROYECTOS\n\n" + AMARILLO
			+ "  0. " + ROJO + "SALIR\n" + MORADO
			+ "----------------------------------------------------\n"
			+ "\n" + CIAN
			+ "INTRODUCE OPCIÓN: " + RESET);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// MÉTODO QUE IMPRIME EL MENÚ DE TABLA CLIENTE //
	public static void menuCliente() {
		
		System.out.print("\n" + MORADO
			+ "---------- " + AMARILLO + "[ MANTENIMIENTO TABLA CLIENTE ]" + MORADO + " ---------\n" + AMARILLO
			+ "  1. " + RESET + "CREAR\n" + AMARILLO
			+ "  2. " + RESET + "CONSULTAR\n" + AMARILLO
			+ "  3. " + RESET + "MODIFICAR\n" + AMARILLO
			+ "  4. " + RESET + "ELIMINAR\n\n" + AMARILLO
			+ "  0. " + ROJO + "VOLVER\n" + MORADO
			+ "----------------------------------------------------\n"
			+ "\n" + CIAN
			+ "INTRODUCE OPCIÓN: " + RESET);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// MÉTODO PARA IMPRIMIR UNA CONSULTA DE CLIENTE CON FORMATO TIPO TABLA //
	public static void consultaCliente(ResultSet rs) throws SQLException {
		
		if (rs.next()) {
			System.out.println((MORADO + "-").repeat(130));
			System.out.printf("%-20s %-25s %-50s %-40s %-25s\n", 
				MORADO + "|  " + AMARILLO + "ID", 
				MORADO + "|  " + AMARILLO + "DNI", 
				MORADO + "|  " + AMARILLO + "NOMBRE", 
				MORADO + "|  " + AMARILLO + "EMAIL", 
				MORADO + "|  " + AMARILLO + "TELÉFONO");
			System.out.println((MORADO + "-").repeat(130));
			
			System.out.printf("%-20s %-25s %-50s %-40s %-25s",
				MORADO + "|  " + VERDE + rs.getInt("id"),
				MORADO + "|  " + VERDE + rs.getString("DNI"),
				MORADO + "|  " + VERDE + rs.getString("apellido1") + " " + rs.getString("apellido2") + ", " + rs.getString("nombre"),
				MORADO + "|  " + VERDE + rs.getString("email"),
				MORADO + "|  " + VERDE + rs.getString("telefono"));
			
			System.out.println("\n" + (MORADO + "-" + RESET).repeat(130));
		}
		
		else System.out.println(VERDE + "NO SE HAN ENCONTRADO REGISTROS PARA ESE ID" + RESET);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// MÉTODO QUE IMPRIME EL MENÚ DE TABLA PROYECTO //
	public static void menuProyecto() {
		
		System.out.print("\n" + MORADO
			+ "--------- " + AMARILLO + "[ MANTENIMIENTO TABLA PROYECTO ]" + MORADO + " ---------\n" + AMARILLO
			+ "  1. " + RESET + "CREAR\n" + AMARILLO
			+ "  2. " + RESET + "CONSULTAR\n" + AMARILLO
			+ "  3. " + RESET + "MODIFICAR\n" + AMARILLO
			+ "  4. " + RESET + "ELIMINAR\n\n" + AMARILLO
			+ "  0. " + ROJO + "VOLVER\n" + MORADO
			+ "----------------------------------------------------\n"
			+ "\n" + CIAN
			+ "INTRODUCE OPCIÓN: " + RESET);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// MÉTODO QUE IMPRIME EL MENÚ DE TABLA DESARROLLADOR //
	public static void menuDesarrollador() {
		
		System.out.print("\n" + MORADO
			+ "------- " + AMARILLO + "[ MANTENIMIENTO TABLA DESARROLLADOR ]" + MORADO + " ------\n" + AMARILLO
			+ "  1. " + RESET + "CREAR\n" + AMARILLO
			+ "  2. " + RESET + "CONSULTAR\n" + AMARILLO
			+ "  3. " + RESET + "MODIFICAR\n" + AMARILLO
			+ "  4. " + RESET + "ELIMINAR\n\n" + AMARILLO
			+ "  0. " + ROJO + "VOLVER\n" + MORADO
			+ "----------------------------------------------------\n"
			+ "\n" + CIAN
			+ "INTRODUCE OPCIÓN: " + RESET);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// MÉTODO QUE IMPRIME EL MENÚ DE TABLA ASIGNACIÓN //
	public static void menuAsignacion() {
		
		System.out.print("\n" + MORADO
			+ "-------- " + AMARILLO + "[ MANTENIMIENTO TABLA ASIGNACIÓN ]" + MORADO + " --------\n" + AMARILLO
			+ "  1. " + RESET + "CREAR\n" + AMARILLO
			+ "  2. " + RESET + "CONSULTAR\n" + AMARILLO
			+ "  3. " + RESET + "MODIFICAR\n" + AMARILLO
			+ "  4. " + RESET + "ELIMINAR\n\n" + AMARILLO
			+ "  0. " + ROJO + "VOLVER\n" + MORADO
			+ "----------------------------------------------------\n"
			+ "\n" + CIAN
			+ "INTRODUCE OPCIÓN: " + RESET);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// VARIABLES PARA DAR COLOR A LA SALIDA POR CONSOLA //
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
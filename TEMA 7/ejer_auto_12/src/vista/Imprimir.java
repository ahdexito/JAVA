package vista;

import java.sql.*;

public class Imprimir {
	
	public static void menuPrincipal() {
		
		System.out.print("" + AMARILLO
				+ "---------- MENÚ PRINCIPAL ----------\n" + RESET
				+ "\n"
				+ "  1. CONSULTAR AUTORES\n"
				+ "  2. CONSULTAR LIBROS\n"
				+ "  3. CONSULTAR PRÉSTAMOS\n"
				+ "  4. CONSULTAR LIBROS POR AUTOR\n"
				+ "  5. CONSULTAR PRÉSTAMOS POR LIBRO\n"
				+ "  0. SALIR\n" + AMARILLO
				+ "------------------------------------\n"
				+ "\n" + MORADO
				+ "INTRODUCE OPCIÓN: " + RESET);
	}
	
	public static void tablaAutor(ResultSet rs) throws SQLException {
		
		try {
			System.out.println((AMARILLO + "-" + RESET).repeat(60));
			System.out.printf(AMARILLO + "%-10s %-30s %-15s\n", "|  ID", "|  NOMBRE", "|  PAÍS");
			System.out.println((AMARILLO + "-" + RESET).repeat(60));

			int par = 1;
			while (rs.next()) {
				String pintar;
				if (par % 2 == 0) {
					pintar = RESET;
				}
				else {
					pintar = CIAN;
				}

				System.out.printf(pintar + "%-10s %-30s %-15s",
						"|  " + rs.getInt("id"),
						"|  " + rs.getString("nombre"),
						"|  " + rs.getString("pais")
				);

				System.out.println("");
				System.out.println((pintar + "-" + RESET).repeat(60));

				par++;
			}
		}
		
		catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
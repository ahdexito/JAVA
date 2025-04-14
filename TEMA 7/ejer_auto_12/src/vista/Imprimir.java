package vista;

import java.sql.*;

public class Imprimir {
	
	public static void menuPrincipal() {
		
		System.out.print("\n" + AMARILLO
				+ "---------- MENÚ PRINCIPAL ----------\n" + RESET
				+ "\n" + CIAN
				+ "  1. " + RESET + "CONSULTAR AUTORES\n" + CIAN
				+ "  2. " + RESET + "CONSULTAR LIBROS\n" + CIAN
				+ "  3. " + RESET + "CONSULTAR PRÉSTAMOS\n" + CIAN
				+ "  4. " + RESET + "CONSULTAR LIBROS POR AUTOR\n" + CIAN
				+ "  5. " + RESET + "CONSULTAR PRÉSTAMOS POR LIBRO\n" + CIAN
				+ "  0. " + RESET + "SALIR\n"
				+ "\n" + AMARILLO
				+ "------------------------------------\n"
				+ "\n" + MORADO
				+ "INTRODUCE OPCIÓN: " + RESET);
	}
	
	public static void tablaAutor(ResultSet rs) throws SQLException {
		
		try {
			System.out.println((AMARILLO + "-" + RESET).repeat(80));
			System.out.printf(AMARILLO + "%-10s %-40s %-15s\n", "|  ID", "|  NOMBRE", "|  PAÍS");
			System.out.println((AMARILLO + "-" + RESET).repeat(80));

			int par = 1;
			while (rs.next()) {
				
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
			
				System.out.printf(pintar + "%-10s %-40s %-15s",
						"|  " + rs.getInt("id"),
						"|  " + rs.getString("nombre"),
						"|  " + rs.getString("pais")
				);

				System.out.println("\n" + (pintar + "-" + RESET).repeat(80));
				par++;
			}
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	public static void tablaLibro(ResultSet rs) throws SQLException {
		
		try {
			System.out.println((AMARILLO + "-" + RESET).repeat(115));
			System.out.printf(AMARILLO + "%-10s %-45s %-25s %-25s\n", "|  ID", "|  TÍTULO", "|  AÑO PUBLICACIÓN", "|  NOMBRE AUTOR");
			System.out.println((AMARILLO + "-" + RESET).repeat(115));
			
			int par = 1;
			while (rs.next()) {
				
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				System.out.printf(pintar + "%-10s %-45s %-25s %-25s",
						"|  " + rs.getInt("id"),
						"|  " + rs.getString("titulo"),
						"|  " + rs.getInt("anio_publicacion"),
						"|  " + rs.getString("nombre")
				);
				
				System.out.println("\n" + (pintar + "-" + RESET).repeat(115));
				par++;
			}
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	public static void tablaPrestamo(ResultSet rs) {
		
		try {
			System.out.println((AMARILLO + "-" + RESET).repeat(100));
			System.out.printf(AMARILLO + "%-10s %-15s %-25s %-25s\n", "|  ID", "|  ID LIBRO", "|  FECHA PRÉSTAMO", "|  FECHA DEVOLUCIÓN");
			System.out.println((AMARILLO + "-" + RESET).repeat(100));
			
			int par = 1;
			while (rs.next()) {
				
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				System.out.printf(pintar + "%-10s %-15s %-25s %-25s",
						"|  " + rs.getInt("id"),
						"|  " + rs.getInt("id_libro"),
						"|  " + rs.getDate("fecha_prestamo"),
						"|  " + rs.getDate("fecha_devolucion"));
				
				System.out.println("\n" + (pintar + "-" + RESET).repeat(100));
				par++;
			}
		}
		
		catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
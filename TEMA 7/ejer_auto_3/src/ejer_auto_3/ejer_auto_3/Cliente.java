package ejer_auto_3;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cliente {

	public static Scanner sc = new Scanner(System.in);
    
    public static void listarClientes() {
		
		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			String query = "SELECT * FROM cliente;";
			
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
			System.out.println((AMARILLO + "-" + RESET).repeat(115));
			System.out.printf(AMARILLO + "%-10s %-25s %-25s %-20s %-20s\n", "|  ID", "|  NOMBRE", "|  DIRECCIÓN", "|  TELÉFONO", "|  EMAIL");
			System.out.println((AMARILLO + "-" + RESET).repeat(115));
 			
			int par = 1;
			while (resultado.next()) {
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				System.out.printf(pintar + "%-10s %-25s %-25s %-20s %-20s",
					"|  " + resultado.getInt("id"),
					"|  " + resultado.getString("nombre"),
					"|  " + resultado.getString("direccion"),
					"|  " + resultado.getString("telefono"),
					"|  " + resultado.getString("email"));
				System.out.println("");
				System.out.println((pintar + "-" + RESET).repeat(115));
				
				par++;
			}
			conex.close();
		}
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void listarCliente() {
		
		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			System.out.print(MORADO + "INTRODUCE NOMBRE DE CLIENTE: " + RESET);
			String query = "SELECT * FROM cliente WHERE nombre LIKE '%" + sc.nextLine() + "%';";
			
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
			if (resultado.next()) {
				
				System.out.println((AMARILLO + "-" + RESET).repeat(115));
				System.out.printf(AMARILLO + "%-10s %-25s %-25s %-20s %-20s\n", "|  ID", "|  NOMBRE", "|  DIRECCIÓN", "|  TELÉFONO", "|  EMAIL");
				System.out.println((AMARILLO + "-" + RESET).repeat(115));

				int par = 1;

				do {
					String pintar;
					if (par % 2 == 0) pintar = RESET;
					else pintar = CIAN;

					System.out.printf(pintar + "%-10s %-25s %-25s %-20s %-20s",
						"|  " + resultado.getInt("id"),
						"|  " + resultado.getString("nombre"),
						"|  " + resultado.getString("direccion"),
						"|  " + resultado.getString("telefono"),
						"|  " + resultado.getString("email"));
					System.out.println("");
					System.out.println((pintar + "-" + RESET).repeat(115));

					par++;
				} while (resultado.next());
			}
			
			else System.out.println("\n" + ROJO + "NO SE HAN ENCONTRADO RESULTADOS" + RESET);
			
			conex.close();
		}
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void insertarCliente() {

		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");

			String query = "INSERT INTO cliente (nombre, direccion, telefono, email) VALUES (?, ?, ?, ?)";

			PreparedStatement ps = conex.prepareStatement(query);

			System.out.print(MORADO + "INTRODUCE NOMBRE: " + RESET);
			ps.setString(1, sc.nextLine());
	
			System.out.print(MORADO + "INTRODUCE DIRECCIÓN: " + RESET);
			ps.setString(2, sc.nextLine());
			
			System.out.print(MORADO + "INTRODUCE TELÉFONO: " + RESET);
			ps.setString(3, sc.nextLine());

			System.out.print(MORADO + "INTRODUCE EMAIL: " + RESET);
			ps.setString(4, sc.nextLine());

			int filasAfectadas = ps.executeUpdate();

			System.out.println("\n" + VERDE + "SE HAN ACTUALIZADO " + filasAfectadas + " FILAS" + RESET);

			conex.close();
		} 
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void modificarCliente() {

		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");

			System.out.print("" +
				"  1. Nombre\n" +
				"  2. Dirección\n" +
				"  3. Teléfono\n" +
				"  4. Email\n" + 
				"-----------------------------------------------\n\n" + MORADO +
				"INTRODUCE OPCIÓN: " + RESET);
			int opcion = sc.nextInt();
			
			System.out.print("\n" + MORADO + "INTRODUCE ID DEL CLIENTE: " + RESET);
			int id = sc.nextInt();
			sc.nextLine();

			String query = "";

			switch (opcion) {
				case 1:
					query = "UPDATE cliente SET nombre = ? WHERE id = ?;";
					System.out.print("\n" + MORADO + "INTRODUCE NOMBRE: " + RESET);
					break;
			
				default:
					break;
			}

			PreparedStatement ps = conex.prepareStatement(query);

			ps.setString(1, sc.nextLine());
			ps.setInt(2, id);

			int filasAfectadas = ps.executeUpdate();

			System.out.println("\n" + VERDE + "SE HAN ACTUALIZADO " + filasAfectadas + " FILAS" + RESET);

			conex.close();
		} 
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void eliminarCliente() {

		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");

			String query = "DELETE FROM cliente WHERE id = ?";

			PreparedStatement ps = conex.prepareStatement(query);

			System.out.print("\n" + MORADO + "INTRODUCE ID DEL CLIENTE: " + RESET);
			ps.setInt(1, sc.nextInt());
			
			int filasAfectadas = ps.executeUpdate();

			System.out.println("\n" + VERDE + "SE HAN ACTUALIZADO " + filasAfectadas + " FILAS" + RESET);

			conex.close();
		}
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
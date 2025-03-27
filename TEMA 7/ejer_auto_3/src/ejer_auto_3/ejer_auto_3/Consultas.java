package ejer_auto_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {
    
    public static void clientes() {
		
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
	
	public static void cliente(String nombre) {
		
		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			String query = "SELECT * FROM cliente WHERE nombre = '" + nombre + "';";
			
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
			
			else System.out.println(ROJO + "NO SE HAN ENCONTRADO RESULTADOS" + RESET);
			
			conex.close();
		}
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	public static void mascotas() {
		
		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			String query = "SELECT * FROM mascota;";
			
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
			System.out.println((AMARILLO + "-" + RESET).repeat(75));
			System.out.printf(AMARILLO + "%-15s %-15s %-20s %-20s\n", "|  ID CLIENTE", "|  NÚMERO", "|  NOMBRE", "|  FECHA NACIMIENTO");
			System.out.println((AMARILLO + "-" + RESET).repeat(75));
 			
			int par = 1;
			
			while (resultado.next()) {
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				System.out.printf(pintar + "%-15s %-15s %-20s %-20s",
					"|  " + resultado.getInt("id_cliente"),
					"|  " + resultado.getString("numero"),
					"|  " + resultado.getString("nombre"),
					"|  " + resultado.getString("fecha_nacimiento"));
				System.out.println("");
				System.out.println((pintar + "-" + RESET).repeat(75));
				
				par++;
			}
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
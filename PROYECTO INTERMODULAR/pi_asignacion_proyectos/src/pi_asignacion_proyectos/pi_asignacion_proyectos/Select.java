package pi_asignacion_proyectos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    
    public static void allFromClientes() {
		
		try {
			Connection conex = Conectar.conectar("pi_asignacion_proyectos");
			
			String query = "SELECT * FROM cliente";
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
			System.out.println((AMARILLO + "-" + RESET).repeat(125));
			System.out.printf(AMARILLO + "%-10s %-20s %-20s %-25s %-30s %-20s\n", "|  ID", "|  DNI", "|  NOMBRE", "|  APELLIDOS", "|  EMAIL", "|  TEL�FONO");
			System.out.println((AMARILLO + "-" + RESET).repeat(125));
 			
			int par = 2;
			
			while (resultado.next()) {
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				System.out.printf(pintar + "%-10s %-20s %-20s %-25s %-30s %-20s",
					"|  " + resultado.getString("id"),
					"|  " + resultado.getString("DNI"),
					"|  " + resultado.getString("nombre"),
					"|  " + resultado.getString("apellido1") + " " + resultado.getString("apellido2"),
					"|  " + resultado.getString("email"),
					"|  " + resultado.getString("telefono"));
				System.out.println("");
				System.out.println((pintar + "-" + RESET).repeat(125));
				
				par++;
			}
			conex.close();
		}
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	public static void allFromCliente(String id, String dni) {
		
		try {
			Connection conex = Conectar.conectar("pi_asignacion_proyectos");
			
			String query = "SELECT * FROM cliente WHERE id = '" + id + "' AND DNI = '" + dni + "';";
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
			System.out.println((AMARILLO + "-" + RESET).repeat(125));
			System.out.printf(AMARILLO + "%-10s %-20s %-20s %-25s %-30s %-20s\n", "|  ID", "|  DNI", "|  NOMBRE", "|  APELLIDOS", "|  EMAIL", "|  TEL�FONO");
			System.out.println((AMARILLO + "-" + RESET).repeat(125));
 			
			int par = 2;
			
			while (resultado.next()) {
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				System.out.printf(pintar + "%-10s %-20s %-20s %-25s %-30s %-20s",
					"|  " + resultado.getString("id"),
					"|  " + resultado.getString("DNI"),
					"|  " + resultado.getString("nombre"),
					"|  " + resultado.getString("apellido1") + " " + resultado.getString("apellido2"),
					"|  " + resultado.getString("email"),
					"|  " + resultado.getString("telefono"));
				System.out.println("");
				System.out.println((pintar + "-" + RESET).repeat(125));
				
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
package clinica_veterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consulta {
	
	public static void selectNombreEmail_cliente() {
		
		try {
			Connection conex = ConexionBD.conectar("ud7_clinica_veterinaria");
			
			String query = "SELECT * FROM cliente";
			
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
			System.out.printf(AMARILLO + "%-10s %-25s %-30s %-20s %-15s", "ID", "NOMBRE", "EMAIL", "DIRECCION", "TELEFONO");
			System.out.println("");
			
			while (resultado.next()) {
				
				System.out.printf(CIAN + "%-10s %-25s %-30s %-20s %-15s",
					resultado.getString("id"),
					resultado.getString("nombre"),
					resultado.getString("email"),
					resultado.getString("direccion"),
					resultado.getString("telefono")
					+ RESET
				);
				System.out.println("");
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
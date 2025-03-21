package clinica_veterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    
    public static void nombre_usuario() {
		
		try {
			Connection conex = ConexionBD.conectar("ud7_clinica_veterinaria");
			
			String query = "UPDATE cliente SET nombre = 'Ana Ramirez' WHERE id = 11";
			PreparedStatement instruction = conex.prepareStatement(query);
			
			int filasAfectadas = instruction.executeUpdate(query);
			
			System.out.println(VERDE + "Filas afectadas: " + filasAfectadas + RESET);
		}
		catch (SQLException ex) {
			
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
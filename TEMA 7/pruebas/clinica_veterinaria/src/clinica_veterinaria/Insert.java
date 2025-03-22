package clinica_veterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    
    public static void cliente(String nombre, String direccion, String telefono, String email) {
		
		try {
			
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			String query = ""
					+ "INSERT INTO cliente (id, nombre, direccion, telefono, email) "
					+ "VALUES (null, '" + nombre + "', '" + direccion + "', '" + telefono + "', '" + email + "');";
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			int filasAfectadas = instruccion.executeUpdate(query);
			
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
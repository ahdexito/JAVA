package pi_asignacion_proyectos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	
	public static void cliente(String dni, String nombre, String apellido1, String apellido2, String email, String telefono) {
		
		try {
			
			Connection conex = Conectar.conectar("pi_asignacion_proyectos");
			
			String query = ""
					+ "INSERT INTO cliente (id, DNI, nombre, apellido1, apellido2, email, telefono) "
					+ "VALUES ("
					+ "null, '"
					+ dni + "', '"
					+ nombre + "', '"
					+ apellido1 + "', '"
					+ apellido2 + "', '"
					+ email + "', '"
					+ telefono + "');";
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

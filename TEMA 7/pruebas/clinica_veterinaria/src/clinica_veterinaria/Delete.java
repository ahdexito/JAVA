package clinica_veterinaria;

import java.lang.invoke.MethodHandles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    
    public static void usuario() {
		
		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			String query = "DELETE FROM cliente WHERE id = 11";
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			int filasAfectadas = instruccion.executeUpdate(query);
			
			System.out.println(VERDE + "Filas afectadas: " + filasAfectadas + RESET);
		}
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage());
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
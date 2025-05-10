package Modelo;

import java.sql.*;

public class Cliente {
    
    public static void crear(Connection conex, 
			String dni, String nombre, String apellido1, String apellido2, String email, String telefono) 
				throws SQLException {
		
		CallableStatement cs = conex.prepareCall("{call sp_insertCliente(?, ?, ?, ?, ?, ?)}");
		
		cs.setString(1, dni);
		cs.setString(2, nombre);
		cs.setString(3, apellido1);
		cs.setString(4, apellido2);
		cs.setString(5, email);
		cs.setString(6, telefono);
		
		int filas = cs.executeUpdate();
		System.out.println("\n" + CIAN + "OPERACIÓN REALIZADA CON " + filas + " FILAS AFECTADAS.");
	}
	
	public static ResultSet consultar(Connection conex, int id) throws SQLException {
		
		CallableStatement cs = conex.prepareCall("{call sp_getCliente(?)}");
		cs.setInt(1, id);
		ResultSet rs = cs.executeQuery();
		return rs;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
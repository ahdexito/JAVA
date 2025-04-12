package ejer_auto_10;

import java.sql.*;

public class Procedimientos {
    
    public static void sp_insPrestamo (Connection conex, int idLibro, Date fechaPrestamo, Date fechaDevolucion) {
		
		try {
			CallableStatement cs = conex.prepareCall("{call sp_insPrestamo(?, ?, ?)}");
			
			cs.setInt(1, idLibro);
			cs.setDate(2, fechaPrestamo);
			cs.setDate(3, fechaDevolucion);
			
			System.out.println("FILAS INSERTADAS: " + cs.executeUpdate());
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}
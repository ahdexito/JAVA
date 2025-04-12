package ejer_auto_9;

import java.sql.*;

public class Procedimientos {
    
    public static void sp_getLibrosPorAutor (Connection conex, String nombreAutor) {
		
		try {			
			CallableStatement cs = conex.prepareCall("{call sp_getLibrosPorAutor(?)}");
			
			cs.setString(1, "%" + nombreAutor + "%");
			
			ResultSet rs = cs.executeQuery();
			
			while (rs.next()) {
				
				System.out.println("TÍTULO: " + rs.getString("titulo"));
				System.out.println("AÑO PUBLICACIÓN: " + rs.getInt("anio_publicacion"));
				System.out.println("NOMBRE AUTOR: " + rs.getString("nombre"));
				System.out.println("PAÍS AUTOR: " + rs.getString("pais"));
				
				System.out.println("");
			}
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}
package ejer_auto_11;

import java.sql.*;

public class Funciones {
    
    public static void fn_contarLibrosAutor (Connection conex, int id_autor) {
		
		try {
			String query = "SELECT fn_contarLibrosAutor(?) AS totalLibros";
			
			PreparedStatement ps = conex.prepareStatement(query);
			
			ps.setInt(1, id_autor);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) System.out.println("TOTAL DE LIBROS: " + rs.getInt("totalLibros"));
		}
		
		catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	public static void fn_getTituloLibro (Connection conex, int id_libro) {
		
		try {
			CallableStatement cs = conex.prepareCall("{? = call fn_getTituloLibro(?)}");
			
			cs.registerOutParameter(1, Types.VARCHAR);
			cs.setInt(2, id_libro);
			
			cs.executeUpdate();
			
			System.out.println("TÍTULO DEL LIBRO: " + cs.getString(1));
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	public static void fn_diasPrestamo (Connection conex, int id_prestamo) {
		
		try {
			CallableStatement cs = conex.prepareCall("{? = call fn_diasPrestamo(?)}");
			
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setInt(2, id_prestamo);
			
			cs.executeUpdate();
			
			System.out.println("PERIODO DÍAS DEL PRÉSTAMO: " + cs.getInt(1));
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	public static void fn_existeAutor (Connection conex, String nombreAutor) {
		
		try {
			String query = "SELECT fn_existeAutor(?) AS existeAutor";
			
			PreparedStatement ps = conex.prepareStatement(query);
			
			ps.setString(1, nombreAutor);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) System.out.println("EXISTE AUTOR: " + rs.getInt("existeAutor"));
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}
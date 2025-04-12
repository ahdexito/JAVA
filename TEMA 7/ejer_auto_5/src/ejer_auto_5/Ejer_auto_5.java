package ejer_auto_5;

import java.sql.*;

public class Ejer_auto_5 {
    
    public static void main(String[] args) throws SQLException {
        
        try  {
			
			Connection conex = Conectar.conectar("pg_biblioteca");
		
			insertarAutores(conex);
			
			insertarLibros(
					conex,
					"Java: The Complete Reference",
					2018, 
					idAutorPorNombre(conex, "Herbert Schildt"));
			
			insertarLibros(
					conex,
					"SQL in 10 Minutes, Sams Teach Yourself",
					2012, 
					idAutorPorNombre(conex, "Ben Forta"));

			insertarLibros(
					conex,
					"PHP and MySQL Web Development",
					2008, 
					idAutorPorNombre(conex, "Luke Welling"));
			
			conex.close();
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	public static void insertarAutores (Connection conex) {
		
		try {
			String query = "INSERT autor VALUES "
					+ "			(NULL, 'Herbert Schildt', 'Estados Unidos'),"
					+ "			(NULL, 'Ben Forta', 'Estados Unidos'),"
					+ "			(NULL, 'Luke Welling', 'Estados Unidos');";
			
			PreparedStatement ps = conex.prepareStatement(query);
			int filasAfectadas = ps.executeUpdate();
			
			System.out.println("FILAS AFECTADAS: " + filasAfectadas);
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	public static int idAutorPorNombre (Connection conex, String nombreAutor) {
		
		try {
			String query = "SELECT id FROM autor WHERE nombre LIKE ?;";
			
			PreparedStatement ps = conex.prepareStatement(query);
			ps.setString(1, "%" + nombreAutor + "%");
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) return rs.getInt("id");
			else {
				System.out.println("AUTOR NO ENCONTRADO");
				return 0;
			}
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
			return 0;
		}
	}
	
	public static void insertarLibros (Connection conex, String titulo, int anio_publicacion, int id) {
		
		try {
			
			String query = "INSERT libro VALUES(NULL, ?, ?, ?);";
			
			PreparedStatement ps = conex.prepareStatement(query);
			
			ps.setString(1, titulo);
			ps.setInt(2, anio_publicacion);
			ps.setInt(3, id);
			
			int filasAfectadas = ps.executeUpdate();
			
			System.out.println("FILAS AFECTADAS: " + filasAfectadas);
			
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}
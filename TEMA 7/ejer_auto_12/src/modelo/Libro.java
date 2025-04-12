package modelo;

import java.sql.*;

public class Libro {
    
    public static ResultSet getLibros(Connection conex) throws SQLException {
		String query = "SELECT * FROM libro l JOIN autor a ON l.id_autor = a.id;";
		PreparedStatement ps = conex.prepareStatement(query);
		return ps.executeQuery();
	}
}
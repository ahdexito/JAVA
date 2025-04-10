package modelo;

import java.sql.*;

public class Libro {
    
    public static ResultSet getLibros(Connection conex) throws SQLException {
		String query = "SELECT * FROM libro;";
		PreparedStatement ps = conex.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		return rs;
	}
}
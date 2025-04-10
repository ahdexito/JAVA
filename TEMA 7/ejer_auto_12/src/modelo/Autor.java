package modelo;

import java.sql.*;

public class Autor {
	
	public static ResultSet getAutores(Connection conex) throws SQLException {
		String query = "SELECT * FROM autor;";
		PreparedStatement ps = conex.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		return rs;
	}
}

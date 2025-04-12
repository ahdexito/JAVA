package modelo;

import java.sql.*;

public class Prestamo {
    
    public static ResultSet getPrestamos (Connection conex) throws SQLException {
		String query = "SELECT * FROM prestamo";
		PreparedStatement ps = conex.prepareStatement(query);
		return ps.executeQuery();
	}
}
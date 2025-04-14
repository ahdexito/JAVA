package modelo;

import java.sql.*;

public class Curso {
    
    public static ResultSet obtenerCurso(Connection conex, String nombreCurso, String cantCreditos) {
		try {
			String query = "SELECT * FROM cursos WHERE 1=1";
			
			if (nombreCurso != null && !nombreCurso.isEmpty()) {
				query += " AND nombre LIKE ?";
			}
			
			if (cantCreditos != null && !cantCreditos.isEmpty()) {
				query += " AND creditos = ?";
			}
			
			PreparedStatement ps = conex.prepareCall(query);
			
			int contador = 1;
			
			if (nombreCurso != null && !nombreCurso.isEmpty()) {
				ps.setString(contador++, "%" + nombreCurso + "%");
			}
			
			if (cantCreditos != null && !cantCreditos.isEmpty()) {
				ps.setInt(contador++, Integer.parseInt(cantCreditos));
			}
			ResultSet rs =  ps.executeQuery();
			return rs;
		} 
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
			return null;
		}
	}
}
package modelo;

import java.sql.*;

public class Estudiante {
    
    public static int eliminarEstudiante (Connection conex, int[] idEstudiantes) throws SQLException {
		
		int filasBorradas = 0;
		
		for (int i = 0; i < idEstudiantes.length; i++) {
			if (idEstudiantes[i] != -1) {
				String query = "DELETE FROM estudiantes WHERE id = ?";
				PreparedStatement ps = conex.prepareStatement(query);
				ps.setInt(1, idEstudiantes[i]);
				filasBorradas += ps.executeUpdate();
			}
		}
		
		return filasBorradas;
	}
}
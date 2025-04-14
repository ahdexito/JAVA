package procedimientos;

import java.sql.*;

public class Procedimientos {
    
    public static int actualizarMatricula (Connection conex, int idMatricula, String fechaMatricula) throws SQLException {
		try {
			String query = "{call sp_updateMatricula(?, ?)}";
		
			CallableStatement cs = conex.prepareCall(query);

			cs.setInt(1, idMatricula);
			cs.setDate(2, java.sql.Date.valueOf(fechaMatricula));

			int filasAfectadas = cs.executeUpdate();

			return filasAfectadas;
		}
		
		catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
			return 0;
		}
		
		finally {
			//cs.close();
		}
	}
}
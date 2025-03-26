package pi_asignacion_proyectos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
    
    private static final String USUARIO = "root";
	private static final String CLAVE = "";
	private static final String URL = "jdbc:mysql://localhost:3306/";
	
	public static Connection conectar(String nombreBD) throws SQLException {
		
		return DriverManager.getConnection(URL + nombreBD, USUARIO, CLAVE);
	}
}
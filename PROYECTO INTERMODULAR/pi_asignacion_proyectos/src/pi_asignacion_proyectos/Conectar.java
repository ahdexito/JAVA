package pi_asignacion_proyectos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
    
    private static final String usuario = "root";
	private static final String clave = "";
	private static final String url = "jdbc:mysql://localhost:3306/";
	
	public static Connection conectar(String nombreBD) throws SQLException {
		
		return DriverManager.getConnection(url + nombreBD, usuario, clave);
	}
}
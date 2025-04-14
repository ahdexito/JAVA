import java.sql.*;

public class Main {
    
	private static final String USUARIO = "root";
	private static final String CLAVE = "";
	private static final String URL = "jdbc:mysql://localhost:3306/";
		
	public static Connection conectar(String nombreBD) throws SQLException {
		return DriverManager.getConnection(URL + nombreBD, USUARIO, CLAVE);
	}
	
    public static void main(String[] args) throws SQLException {
        
		Connection conex = conectar("");
		
		String query = ""
				+ "DROP DATABASE IF NOT EXISTS GimnasioDB;"
				+ "CREATE DATABASE GimnasioDB;"
				+ "USE GimnasioDB;";
		
		Statement stmt = conex.prepareStatement(query);
    }
}
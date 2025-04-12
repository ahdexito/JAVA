package ejer_auto_7;

import java.sql.*;

public class Ejer_auto_7 {
    
    public static void main(String[] args) {
        
        try (Connection conex = Conectar.conectar("pg_biblioteca")) {
			
			int[] idsLibros = new int[] {1, 2, 3};
			String[] fechasPrestamo = new String[] {"2025-03-01", "2025-03-05", "2025-03-10"};
			String[] fechasDevolucion = new String[] {"2025-03-15", "2025-03-20", "2025-03-25"};
			
			String query = "INSERT prestamo VALUES (NULL, ?, ?, ?);";
			
			PreparedStatement ps = conex.prepareStatement(query);
			
			for (int i = 0; i < 3; i++) {
				ps.setInt(1, idsLibros[i]);
				ps.setString(2, fechasPrestamo[i]);
				ps.setString(3, fechasDevolucion[i]);
				
				System.out.println("FILAS AFECTADAS: " + ps.executeUpdate());
			}
			
			conex.close();
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
    }
}
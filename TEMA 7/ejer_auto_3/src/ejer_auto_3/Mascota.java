package ejer_auto_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mascota {

    public static void listarMascotas() {
        
        try (Connection conex = Conectar.conectar("ud7_clinica_veterinaria")) {
			
			String query = "SELECT * FROM mascota;";
			
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
			System.out.println((AMARILLO + "-" + RESET).repeat(75));
			System.out.printf(AMARILLO + "%-15s %-15s %-20s %-20s\n", "|  ID CLIENTE", "|  NÚMERO", "|  NOMBRE", "|  FECHA NACIMIENTO");
			System.out.println((AMARILLO + "-" + RESET).repeat(75));
 			
			int par = 1;
			
			while (resultado.next()) {
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				System.out.printf(pintar + "%-15s %-15s %-20s %-20s",
					"|  " + resultado.getInt("id_cliente"),
					"|  " + resultado.getString("numero"),
					"|  " + resultado.getString("nombre"),
					"|  " + resultado.getString("fecha_nacimiento"));
				System.out.println("");
				System.out.println((pintar + "-" + RESET).repeat(75));
				
				par++;
			}
		}
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
    }
    
    public static final String RESET = "[0m", MORADO = "[35m", ROJO = "[31m",
        AZUL = "[34m", CIAN = "[36m", VERDE = "[32m", AMARILLO = "[33m";
}

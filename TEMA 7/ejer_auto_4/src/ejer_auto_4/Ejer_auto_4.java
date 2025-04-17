package ejer_auto_4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejer_auto_4 {
	
    public static void main(String[] args) throws Exception {
		
        try {
            Connection conex = Conectar.conectar("pg_biblioteca");
			
			int anioMin = 2002;
            int anioMax = 2020;
            int idAutor = 2;
            String query = "SELECT titulo, anio_publicacion, id_autor FROM libro " +
                            "WHERE anio_publicacion BETWEEN ? AND ? AND id_autor = ?;";
            PreparedStatement ps = conex.prepareStatement(query);
			
			ps.setInt(1, anioMin);
			ps.setInt(2, anioMax);
			ps.setInt(3, idAutor);
			
            ResultSet rs = ps.executeQuery();
				
            System.out.println((AMARILLO + "-" + RESET).repeat(115));
            System.out.printf(AMARILLO + "%-50s %-25s %-15s\n", "|  TÍTULO", "|  AÑO PUBLICACIÓN", "|  ID AUTOR");
            System.out.println((AMARILLO + "-" + RESET).repeat(115));
            
            int par = 1;
            while (rs.next()) {
                String pintar;
                if (par % 2 == 0) pintar = RESET;
                else pintar = CIAN;
            
                System.out.printf(pintar + "%-50s %-25s %-15s",
                    "|  " + rs.getString("titulo"),
					"|  " + rs.getInt("anio_publicacion"),
					"|  " + rs.getInt("id_autor"));
            
                System.out.println("");
                System.out.println((pintar + "-" + RESET).repeat(115));
            
                par++;
            }
			
			conex.close();
        }

        catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}

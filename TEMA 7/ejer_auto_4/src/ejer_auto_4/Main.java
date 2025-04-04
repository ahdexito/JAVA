package ejer_auto_4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {

        try (Connection conex = Conectar.conectar("pg_biblioteca")) {
            String anioMin = "2015";
            String anioMax = "2020";
            String idAutor = "1";
            String query = "SELECT titulo, anio_publicacion, id_autor FROM libro " +
                            "WHERE anio_publicacion BETWEEN " + anioMin + " AND " + anioMax + 
                            " AND id_autor = " + idAutor;
            PreparedStatement ps = conex.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            System.out.println((AMARILLO + "-" + RESET).repeat(115));
            System.out.printf(AMARILLO + "%-10s\n", "|  ID");
            System.out.println((AMARILLO + "-" + RESET).repeat(115));
            
            int par = 1;
            while (rs.next()) {
                String pintar;
                if (par % 2 == 0) pintar = RESET;
                else pintar = CIAN;
            
                System.out.printf(pintar + "%-10s",
                    "|  " + rs.getInt("id"));
            
                System.out.println("");
                System.out.println((pintar + "-" + RESET).repeat(115));
            
                par++;
            }
        }

        catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }

    public static final String RESET = "[0m", MORADO = "[35m", ROJO = "[31m",
        AZUL = "[34m", CIAN = "[36m", VERDE = "[32m", AMARILLO = "[33m";
}

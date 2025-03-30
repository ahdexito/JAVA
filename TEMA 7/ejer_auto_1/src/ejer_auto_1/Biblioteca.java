package ejer_auto_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Biblioteca {

    public static void creacion() {

        try {
            Connection conex = Conectar.conectar("");

            String query = "CREATE DATABASE IF NOT EXISTS pg_biblioteca";

            PreparedStatement ps = conex.prepareStatement(query);

            ps.
        } 
        
        catch (SQLException ex) {
            System.out.println(ROJO + "ERRO: " + ex.getMessage() + RESET);
        }
    }

    public static final String RESET = "[0m", MORADO = "[35m", ROJO = "[31m",
        AZUL = "[34m", CIAN = "[36m", VERDE = "[32m", AMARILLO = "[33m";
}

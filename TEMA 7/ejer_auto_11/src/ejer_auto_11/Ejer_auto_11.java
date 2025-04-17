package ejer_auto_11;

import java.sql.*;
import java.util.Scanner;

public class Ejer_auto_11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        try (Connection conex = Conectar.conectar("pg_biblioteca")) {
			
			Funciones.fn_contarLibrosAutor(conex, 2);
			
			Funciones.fn_getTituloLibro(conex, 1);
			
			Funciones.fn_diasPrestamo(conex, 3);
			
			Funciones.fn_existeAutor(conex, "Luke Welling");
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
    }
}
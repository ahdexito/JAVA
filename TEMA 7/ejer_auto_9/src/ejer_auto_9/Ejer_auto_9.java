package ejer_auto_9;

import java.util.Scanner;
import java.sql.*;

public class Ejer_auto_9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        try (Connection conex = Conectar.conectar("pg_biblioteca")) {
			
			System.out.print("INTRODUCE AUTOR A BUSCAR: ");
			String nombreAutor = sc.nextLine();
			
			System.out.println("");
			
			Procedimientos.sp_getLibrosPorAutor(conex, nombreAutor);
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
    }
}
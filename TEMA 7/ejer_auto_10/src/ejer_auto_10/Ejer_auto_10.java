package ejer_auto_10;

import java.sql.*;
import java.util.Scanner;

public class Ejer_auto_10 {
    
    public static void main(String[] args) {
        
		try (Connection conex = Conectar.conectar("pg_biblioteca")) {
			Scanner sc = new Scanner (System.in);
        
			System.out.println("INTRODUCE LOS CAMPOS DEL NUEVO PRÉSTAMO");

			System.out.print("\nID LIBRO: ");
			int idLibro = sc.nextInt();
			sc.nextLine();

			System.out.print("\nFECHA PRÉSTAMO: ");
			java.sql.Date fechaPrestamo = java.sql.Date.valueOf(sc.nextLine());

			System.out.print("\nFECHA DEVOLUCIÓN: ");
			java.sql.Date fechaDevolucion = java.sql.Date.valueOf(sc.nextLine());

			Procedimientos.sp_insPrestamo(conex, idLibro, fechaPrestamo, fechaDevolucion);
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
    }
}
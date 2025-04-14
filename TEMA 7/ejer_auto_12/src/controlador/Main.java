package controlador;

import java.sql.*;
import java.util.Scanner;
import modelo.*;
import vista.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

		try {
			Database db = Database.getConexUnica("pg_biblioteca");
			Connection conex = db.getConex();
			
			int opcion;
			
			do {
				Imprimir.menuPrincipal();
				
				opcion = sc.nextInt();
				sc.nextLine();
				
				System.out.println("");
				
				ResultSet rs = null;
				
				switch (opcion) {
					case 1:
						rs = Autor.getAutores(conex);
						Imprimir.tablaAutor(rs);
						break;
						
					case 2:
						rs = Libro.getLibros(conex);
						Imprimir.tablaLibro(rs);
						break;
						
					case 3:
						rs = Prestamo.getPrestamos(conex);
						Imprimir.tablaPrestamo(rs);
						break;
						
					case 4:
						break;
						
					case 5:
						break;
						
					case 0:
						break;
						
					default:
						break;
				}
				
				if (rs != null) {
					rs.getStatement().close();
					rs.close();
				}
			}
			while (opcion != 0);
		}

		catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
    }
}
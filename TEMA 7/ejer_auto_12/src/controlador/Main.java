package controlador;

import java.sql.*;
import java.util.Scanner;
import modelo.*;
import vista.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
			
		int opcion;

		do {
			try {
				Database db = Database.getConex("pg_biblioteca");
				
				Connection conex = db.getConex();

				Imprimir.menuPrincipal();
				opcion = sc.nextInt();
				sc.nextLine();
				
				System.out.println("");
				
				switch (opcion) {
					case 1:
						Imprimir.tablaAutor(Autor.getAutores(conex));
						break;
						
					case 2:
						Imprimir.tablaLibro(Libro.getLibros(conex));
						break;
						
					case 3:
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
			}

			catch (SQLException ex) {
				System.out.println("ERROR: " + ex.getMessage());
			}
		}
		while (true);
    }
}
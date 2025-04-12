package ejer_auto_8;

import java.util.Scanner;
import java.sql.*;

public class Ejer_auto_8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        try (Connection conex = Conectar.conectar("pg_biblioteca")) {
			
			System.out.println("------------ BUSCAR LIBRO ------------");

			System.out.print("\nFILTRAR POR TÍTULO: ");
			String titulo = sc.nextLine();

			System.out.print("\nFILTRAR POR AÑO: ");
			String anio = sc.nextLine();

			System.out.print("\nFILTRAR POR ID DEL AUTOR: ");
			String id_autor = sc.nextLine();


			String query = "SELECT * FROM libro WHERE 1=1";

			if (!titulo.isEmpty()) query += " AND titulo LIKE ?";
			if (!anio.isEmpty()) query += " AND anio_publicacion = ?";
			if (!id_autor.isEmpty()) query += " AND id_autor = ?";

			try (PreparedStatement ps = conex.prepareStatement(query)) {
				
				int posicion = 1;
				
				if (!titulo.isEmpty()) ps.setString(posicion++, "%" + titulo + "%");
				if (!anio.isEmpty()) ps.setInt(posicion++, Integer.parseInt(anio));
				if (!id_autor.isEmpty()) ps.setInt(posicion++, Integer.parseInt(id_autor));
			
				ResultSet rs = ps.executeQuery();
				
				System.out.println((AMARILLO + "-" + RESET).repeat(120));
				System.out.printf(AMARILLO + "%-50s %-40s %-40s\n", "|  TÍTULO", "|  AÑO", "|  ID_AUTOR");
				System.out.println((AMARILLO + "-" + RESET).repeat(120));
				
				int par = 1;
				while (rs.next()) {
					
					String pintar;
					if (par % 2 == 0) pintar = RESET;
					else pintar = CIAN;
					
					System.out.printf(pintar + "%-50s %-40s %-40s",
							"|  " + rs.getString("titulo"),
							"|  " + rs.getInt("anio_publicacion"),
							"|  " + rs.getInt("id_autor"));
					
					System.out.println("");
					System.out.println((pintar + "-" + RESET).repeat(120));
					
					par++;
				}
			}
			
			catch (SQLException e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
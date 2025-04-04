package ejer_auto_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ejer_auto_1 {
    
    public static void main(String[] args) {
		
		try (Connection conex = Conectar.conectar("")) {
			// CONECTARSE AL LOCALHOST //
			
			String query = "CREATE DATABASE IF NOT EXISTS pg_biblioteca;";
			PreparedStatement crea = conex.prepareStatement(query);
			
			// EJECUTAR SENTENCIA //
			crea.executeUpdate(query);
			
			// USAR BASE DE DATOS //
			query = "USE pg_biblioteca;";
			PreparedStatement usa = conex.prepareStatement(query);
			
			// EJECUTAR SENTENCIA //
			usa.executeUpdate(query);
			
			// CREAR TABLA LIBRO //
			query = "CREATE TABLE IF NOT EXISTS libro ("
					+ "id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "titulo VARCHAR(100),"
					+ "anio_publicacion INT,"
					+ "id_autor INT"
					+ ");";
			PreparedStatement tablaLibro = conex.prepareStatement(query);
			tablaLibro.executeUpdate(query);
			
			// CREAR TABLA AUTOR //
			query = "CREATE TABLE IF NOT EXISTS autor ("
					+ "id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "nombre VARCHAR(50),"
					+ "pais VARCHAR(50)"
					+ ");";
			PreparedStatement tablaAutor = conex.prepareStatement(query);
			tablaAutor.executeUpdate(query);
			
			// CREAR TABLA PRESTAMO //
			query = "CREATE TABLE IF NOT EXISTS prestamo ("
					+ "id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "id_libro INT,"
					+ "fecha_prestamo DATE,"
					+ "fecha_devolucion DATE"
					+ ");";
			PreparedStatement tablaPrestamo = conex.prepareStatement(query);
			tablaPrestamo.executeUpdate(query);
			
			
			// CREAR CLAVE FORANEA LIBRO - AUTOR //
			query = "ALTER TABLE libro ADD CONSTRAINT "
					+ "fk_id_autor_libro_autor FOREIGN KEY (id) REFERENCES autor (id);";
			PreparedStatement fkLibro = conex.prepareStatement(query);
			fkLibro.executeUpdate(query);
			
			// CREAR CLAVE FORANEA PRESTAMO - LIBRO //
			query = "ALTER TABLE prestamo ADD CONSTRAINT "
					+ "fk_id_libro_prestamo_libro FOREIGN KEY (id_libro) REFERENCES libro (id);";
			PreparedStatement fkPrestamo = conex.prepareStatement(query);
			fkPrestamo.executeUpdate(query);
		}
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}	
	

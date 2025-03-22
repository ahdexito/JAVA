package clinica_veterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	
	public static void atiende() {
		
		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			String query = "SELECT * FROM atiende";
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
				System.out.printf(AMARILLO + "%-20s %-25s %-20s %-25s %-20s %-20s", "|  ID VETERINARIO", "|  NÚMERO DE SALA", "|  ID CLIENTE", "|  NUMERO DE MASCOTA", "|  FECHA DE CITA", "|  PRECIO");
			System.out.println("");
			
			int par = 2;
			
			while (resultado.next()) {
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				String fechaEntrada = resultado.getString("fecha_cita");
				String[] fecha = fechaEntrada.split("-");
				String fechaParse = fecha[2] + "/" + fecha[1] + "/" + fecha[0];
				
				System.out.printf(pintar + "%-20s %-25s %-20s %-25s %-20s %-20s",
					"|  " + resultado.getString("id_veterinario"),
					"|  " + resultado.getString("numero_sala"),
					"|  " + resultado.getString("id_cliente"),
					"|  " + resultado.getString("numero_mascota"),
					"|  " + fechaParse,
					"|  " + resultado.getString("precio") + " €");
				System.out.println("");
				par++;
			}
			conex.close();
		}
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	public static void cliente() {
		
		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			String query = "SELECT * FROM cliente";
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
				System.out.printf(AMARILLO + "%-15s %-25s %-30s %-20s %-15s", "|  ID CLIENTE", "|  NOMBRE", "|  EMAIL", "|  DIRECCION", "|  TELEFONO");
			System.out.println("");
			
			int par = 2;
			
			while (resultado.next()) {
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				System.out.printf(pintar + "%-15s %-25s %-30s %-20s %-15s",
					"|  " + resultado.getString("id"),
					"|  " + resultado.getString("nombre"),
					"|  " + resultado.getString("email"),
					"|  " + resultado.getString("direccion"),
					"|  " + resultado.getString("telefono"));
				System.out.println("");
				par++;
			}
			conex.close();
		}
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	public static void mascota() {
		
		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			String query = "SELECT * FROM mascota";
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
				System.out.printf(AMARILLO + "%-20s %-20s %-20s %-25s", "|  ID CLIENTE", "|  NÚMERO", "|  NOMBRE", "|  FECHA DE NACIMIENTO");
			System.out.println("");
			
			int par = 2;
			
			while (resultado.next()) {
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				String fechaEntrada = resultado.getString("fecha_nacimiento");
				String[] fecha = fechaEntrada.split("-");
				String fechaParse = fecha[2] + "/" + fecha[1] + "/" + fecha[0];
				
				System.out.printf(pintar + "%-20s %-20s %-20s %-25s",
					"|  " + resultado.getString("id_cliente"),
					"|  " + resultado.getString("numero"),
					"|  " + resultado.getString("nombre"),
					"|  " + fechaParse);
				System.out.println("");
				par++;
			}
			conex.close();
		}
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	public static void sala() {
		
		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			String query = "SELECT * FROM sala";
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
				System.out.printf(AMARILLO + "%-20s %-20s", "|  NÚMERO", "|  DESCRIPCIÓN");
			System.out.println("");
			
			int par = 2;
			
			while (resultado.next()) {
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				System.out.printf(pintar + "%-20s %-20s",
					"|  " + resultado.getString("numero"),
					"|  " + resultado.getString("descripcion"));
				System.out.println("");
				par++;
			}
			conex.close();
		}
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	public static void veterinario() {
		
		try {
			Connection conex = Conectar.conectar("ud7_clinica_veterinaria");
			
			String query = "SELECT * FROM veterinario";
			PreparedStatement instruccion = conex.prepareStatement(query);
			
			ResultSet resultado = instruccion.executeQuery();
			
				System.out.printf(AMARILLO + "%-20s %-20s %-30s %-20s %-15s %-15s", "|  ID VETERINARIO", "|  DNI", "|  NOMBRE", "|  TELÉFONO", "|  AUTÓNOMO", "|  FECHA INCORPORACIÓN");
			System.out.println("");
			
			int par = 2;
			
			while (resultado.next()) {
				String pintar;
				if (par % 2 == 0) pintar = RESET;
				else pintar = CIAN;
				
				int boolEntrada = resultado.getInt("autonomo");
				String boolString = null;
				if (boolEntrada == 0) boolString = "NO";
				if (boolEntrada == 1) boolString = "SÍ";
								
				String fechaEntrada = resultado.getString("fecha_incorporacion");
				String[] fecha = fechaEntrada.split("-");
				String fechaParse = fecha[2] + "/" + fecha[1] + "/" + fecha[0];
				
				String dato = "(VACÍO)";
				if (resultado.getString("telefono") != null) dato = resultado.getString("telefono");
				
				System.out.printf(pintar + "%-20s %-20s %-30s %-20s %-15s %-15s",
					"|  " + resultado.getString("id"),
					"|  " + resultado.getString("DNI"),
					"|  " + resultado.getString("nombre"),
					"|  " + dato,
					"|  " + boolString,
					"|  " + fechaParse);
				System.out.println("");
				par++;
			}
			conex.close();
		}
		
		catch (SQLException ex) {
			System.out.println(ROJO + "ERROR: " + ex.getMessage() + RESET);
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
package Controlador;

import Database.*;
import Modelo.*;
import Vista.*;
import java.util.Scanner;
import java.sql.*;

public class Main {
    
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
				
		try {
			// CONEXIÓN A BASE DE DATOS
			Database db = Database.getConex("pi_asignacion_proyectos");
			Connection conex = db.getConex();
			
			int opcion;
			
			do {
				ResultSet rs = null;
				
				Imprimir.menuPrincipal();
				
				opcion = sc.nextInt();
				sc.nextLine();
				
				int subOpcion;
								
				switch (opcion) {
					case 1:
						do {							
							Imprimir.menuCliente();
						
							subOpcion = sc.nextInt();
							sc.nextLine();

							System.out.println("");
							
							switch (subOpcion) {
								case 1:
									System.out.println(AMARILLO 
										+ "------------- AÑADIR NUEVO CLIENTE ------------" + RESET);

									System.out.print(MORADO + "  - DNI: " + RESET); 
									String dni = sc.nextLine();

									System.out.print(MORADO + "  - Nombre: " + RESET); 
									String nombre = sc.nextLine();

									System.out.print(MORADO + "  - Primer apellido: " + RESET); 
									String apellido1 = sc.nextLine();

									System.out.print(MORADO + "  - Segundo apellido: " + RESET); 
									String apellido2 = sc.nextLine();

									System.out.print(MORADO + "  - Email: " + RESET); 
									String email = sc.nextLine();

									System.out.print(MORADO + "  - Teléfono: " + RESET); 
									String telefono = sc.nextLine();
									
									Cliente.crear(conex, dni, nombre, apellido1, apellido2, email, telefono);
									break;
								
								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
									
								case 2: 
									System.out.println(AMARILLO 
										+ "-------------- CONSULTAR CLIENTE --------------" + RESET);
									
									System.out.print(MORADO + "  - ID: " + RESET);
									int id = sc.nextInt();
									sc.nextLine();
									
									System.out.println("");
									
									rs = Cliente.consultar(conex, id);
									Imprimir.consultaCliente(rs);
									break;
									
								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
									
								case 3:
									System.out.println(AMARILLO 
										+ "---------- MODIFICAR DATOS DE CLIENTE ----------" + RESET);
									break;
								
								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
									
								case 4:
									System.out.println(AMARILLO 
										+ "--------------- ELIMINAR CLIENTE ---------------" + RESET);
									break;
								
								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
								
								case 0:
									System.out.println(CIAN + "REGRESANDO..." + RESET);
									break;
								
								default:
									System.out.println(ROJO + "OPCIÓN NO VÁLIDA" + RESET);
									break;
							}
						}
						while (subOpcion != 0);
						
						break;
					
					//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						
					case 2:
						do {		
							Imprimir.menuAsignacion();
						
							subOpcion = sc.nextInt();
							sc.nextLine();
									
							System.out.println("");
							
							switch (subOpcion) {
								case 1: case 2: case 3: case 4:
									System.out.println(CIAN + "OPCIÓN EN DESARROLLO..." + RESET);
									break;

								case 0:
									System.out.println(CIAN + "REGRESANDO..." + RESET);
									break;

								default:
									System.out.println(ROJO + "OPCIÓN NO VÁLIDA" + RESET);
									break;
							}
						}
						while (subOpcion != 0);
						
						break;
					
					//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						
					case 3:
						do {		
							Imprimir.menuAsignacion();
						
							subOpcion = sc.nextInt();
							sc.nextLine();
												
							System.out.println("");
							
							switch (subOpcion) {
								case 1: case 2: case 3: case 4:
									System.out.println(CIAN + "OPCIÓN EN DESARROLLO..." + RESET);
									break;

								case 0:
									System.out.println(CIAN + "REGRESANDO..." + RESET);
									break;

								default:
									System.out.println(ROJO + "OPCIÓN NO VÁLIDA" + RESET);
									break;
							}
						}
						while (subOpcion != 0);
						
						break;
						
					//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						
					case 4:
						do {		
							Imprimir.menuAsignacion();
						
							subOpcion = sc.nextInt();
							sc.nextLine();
											
							System.out.println("");
							
							switch (subOpcion) {
								case 1: case 2: case 3: case 4:
									System.out.println(CIAN + "OPCIÓN EN DESARROLLO..." + RESET);
									break;

								case 0:
									System.out.println(CIAN + "REGRESANDO..." + RESET);
									break;

								default:
									System.out.println(ROJO + "OPCIÓN NO VÁLIDA" + RESET);
									break;
							}
						}
						while (subOpcion != 0);
						
						break;
					
					//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						
					case 0:
						System.out.println(CIAN + "SALIENDO... ¡HASTA PRONTO!" + RESET);
						break;
						
					default:
						System.out.println(ROJO + "OPCIÓN NO VÁLIDA" + RESET);
						break;
				}
				
				if (rs != null) {
					rs.getStatement().close();
					rs.close();
				}
			}
			while (opcion != 0);
		}
		
		catch (SQLException e) {
			System.out.println(ROJO + "ERROR: " + e.getMessage() + RESET);
		}
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
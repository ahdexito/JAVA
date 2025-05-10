package Controlador;

import Database.*;
import Modelo.*;
import Vista.*;
import java.util.Scanner;
import java.sql.*;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
		Scanner sc = new Scanner(System.in);
	
		int opcion = -1;

		do {
			try {
				// CONEXIÓN A BASE DE DATOS
				Database db = Database.getConex("pi_asignacion_proyectos");
				Connection conex = db.getConex();

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
									System.out.println(MORADO 
										+ "------------- " + AMARILLO + "[ AÑADIR NUEVO CLIENTE ]" + MORADO + " ------------" + RESET);

									System.out.print(CIAN + "  - DNI: " + RESET); 
									String dni = sc.nextLine();

									System.out.print(CIAN + "  - Nombre: " + RESET); 
									String nombre = sc.nextLine();

									System.out.print(CIAN + "  - Primer apellido: " + RESET); 
									String apellido1 = sc.nextLine();

									System.out.print(CIAN + "  - Segundo apellido: " + RESET); 
									String apellido2 = sc.nextLine();

									System.out.print(CIAN + "  - Email: " + RESET); 
									String email = sc.nextLine();

									System.out.print(CIAN + "  - Teléfono: " + RESET); 
									String telefono = sc.nextLine();

									Cliente.crear(conex, dni, nombre, apellido1, apellido2, email, telefono);
									
												
									System.out.print("\n" + CIAN + "--> CONTINUAR [ENTER] <--" + RESET);
									sc.nextLine();
									break;

								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

								case 2: 
									System.out.println(MORADO 
										+ "-------------- " + AMARILLO + "[ CONSULTAR CLIENTE ]" + MORADO + " --------------" + RESET);

									System.out.print(CIAN + "  - ID: " + RESET);
									int idConsulta = sc.nextInt();
									sc.nextLine();

									System.out.println("");

									rs = Cliente.consultar(conex, idConsulta);
									Imprimir.consultaCliente(rs);
									
												
									System.out.print("\n" + CIAN + "--> CONTINUAR [ENTER] <--" + RESET);
									sc.nextLine();
									break;

								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

								case 3:
									System.out.println(MORADO 
										+ "---------- " + AMARILLO + "[ MODIFICAR DATOS DE CLIENTE ]" + MORADO + " ----------" + RESET);
									break;

								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

								case 4:
									System.out.println(MORADO 
										+ "--------------- " + AMARILLO + "[ ELIMINAR CLIENTE ]" + MORADO + " ---------------" + RESET);
									
									System.out.print(CIAN + "  - ID: " + RESET);
									int idElimina = sc.nextInt();
									sc.nextLine();

									Cliente.eliminar(conex, idElimina);
									
									System.out.print("\n" + CIAN + "--> CONTINUAR [ENTER] <--" + RESET);
									sc.nextLine();
									break;

								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

								case 0:
									System.out.println(VERDE + "REGRESANDO..." + RESET);
									Thread.sleep(700);
									break;

								default:
									System.out.println(ROJO + "OPCIÓN NO VÁLIDA" + RESET);
									Thread.sleep(700);
									break;
							}
						}
						while (subOpcion != 0);

						break;

					//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

					case 2:
						do {		
							Imprimir.menuProyecto();

							subOpcion = sc.nextInt();
							sc.nextLine();

							System.out.println("");

							switch (subOpcion) {
								case 1: case 2: case 3: case 4:
									System.out.println(VERDE + "OPCIÓN EN DESARROLLO..." + RESET);
									Thread.sleep(700);
									break;

								case 0:
									System.out.println(VERDE + "REGRESANDO..." + RESET);
									Thread.sleep(700);
									break;

								default:
									System.out.println(ROJO + "OPCIÓN NO VÁLIDA" + RESET);
									Thread.sleep(700);
									break;
							}
						}
						while (subOpcion != 0);

						break;

					//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

					case 3:
						do {		
							Imprimir.menuDesarrollador();

							subOpcion = sc.nextInt();
							sc.nextLine();

							System.out.println("");

							switch (subOpcion) {
								case 1: case 2: case 3: case 4:
									System.out.println(VERDE + "OPCIÓN EN DESARROLLO..." + RESET);
									Thread.sleep(700);
									break;

								case 0:
									System.out.println(VERDE + "REGRESANDO..." + RESET);
									Thread.sleep(700);
									break;

								default:
									System.out.println(ROJO + "OPCIÓN NO VÁLIDA" + RESET);
									Thread.sleep(700);
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
									System.out.println(VERDE + "OPCIÓN EN DESARROLLO..." + RESET);
									Thread.sleep(700);
									break;

								case 0:
									System.out.println(VERDE + "REGRESANDO..." + RESET);
									Thread.sleep(700);
									break;

								default:
									System.out.println(ROJO + "OPCIÓN NO VÁLIDA" + RESET);
									Thread.sleep(700);
									break;
							}
						}
						while (subOpcion != 0);

						break;

					//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

					case 0:
						System.out.println("\n" + VERDE + "SALIENDO... ¡HASTA PRONTO!" + RESET);
						Thread.sleep(700);
						break;

					default:
						System.out.println("\n" + ROJO + "OPCIÓN NO VÁLIDA" + RESET);
						Thread.sleep(700);
						break;
				}

				if (rs != null) {
					rs.getStatement().close();
					rs.close();
				}
			}

			catch (SQLException e) {
				System.out.println(ROJO + "ERROR: " + e.getMessage() + RESET);
				Thread.sleep(700);
			}
		} while (opcion != 0);
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
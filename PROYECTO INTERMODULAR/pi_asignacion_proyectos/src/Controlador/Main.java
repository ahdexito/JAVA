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
				
				/* CREAR UN RESULTSET PARA LLAMAR A LAS FUNCIONES 
				QUE REALIZAN SELECT Y PODER CERRARLOS POSTERIORMENTE */
				ResultSet rs = null;
				
				// IMPRIMIR EL MENÚ PRINCIPAL //
				Imprimir.menuPrincipal();

				opcion = sc.nextInt();
				sc.nextLine();

				int subOpcion;

				switch (opcion) {
					case 1:
						do {
							// IMPRIMIR EL MENÚ MANTENIMIENTO DE CLIENTE //
							Imprimir.menuCliente();

							subOpcion = sc.nextInt();
							sc.nextLine();
							
							System.out.println("");
							
							int id;
							String dni, nombre, apellido1, apellido2, email, telefono;
							
							switch (subOpcion) {
								case 1:
									// OPCIÓN AÑADIR NUEVO CLIENTE DADOS SUS DATOS //
									System.out.println(MORADO 
										+ "-------------- " + AMARILLO + "[ AÑADIR NUEVO CLIENTE ]" + MORADO + " ------------" + RESET);
									
									// SOLICITAR LOS DATOS DEL NUEVO CLIENTE Y GUARDARLOS EN VARIABLES //
									System.out.print(CIAN + "  - DNI: " + RESET); 
									dni = sc.nextLine();

									System.out.print(CIAN + "  - NOMBRE: " + RESET); 
									nombre = sc.nextLine();

									System.out.print(CIAN + "  - PRIMER APELLIDO: " + RESET); 
									apellido1 = sc.nextLine();

									System.out.print(CIAN + "  - SEGUNDO APELLIDO: " + RESET); 
									apellido2 = sc.nextLine();

									System.out.print(CIAN + "  - EMAIL: " + RESET); 
									email = sc.nextLine();

									System.out.print(CIAN + "  - TELÉFONO: " + RESET); 
									telefono = sc.nextLine();
									
									// LLAMADA AL MÉTODO DE CREACIÓN ENVIANDO LAS VARIABLES //
									Cliente.crear(conex, dni, nombre, apellido1, apellido2, email, telefono);
									
									// DETENCIÓN DEL PROGRAMA PARA QUE EL USUARIO CONFIRME //
									System.out.print("\n" + CIAN + "--> CONTINUAR [ENTER] <--" + RESET);
									sc.nextLine();
									break;

								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

								case 2: 
									// OPCIÓN CONSULTAR UN CLIENTE DADO SU ID //
									System.out.println(MORADO 
										+ "--------------- " + AMARILLO + "[ CONSULTAR CLIENTE ]" + MORADO + " --------------" + RESET);
									
									// SOLICIAR ID DEL CLIENTE A BUSCAR //
									System.out.print(CIAN + "  - ID: " + RESET);
									id = sc.nextInt();
									sc.nextLine();

									System.out.println("");
									
									// LLAMADA AL MÉTODO DE CONSULTA CLIENTE PARA RECIBIR UN RESULTSET //
									rs = Cliente.consultar(conex, id);
									
									// ENVIAR EL RESULTSER AL MÉTODO DE IMPRIMIR //
									Imprimir.consultaCliente(rs);
									
									// DETENCIÓN DEL PROGRAMA PARA QUE EL USUARIO CONFIRME //
									System.out.print("\n" + CIAN + "--> CONTINUAR [ENTER] <--" + RESET);
									sc.nextLine();
									break;

								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

								case 3:
									// OPCIÓN MODIFICAR LOS DATOS DE UN CLIENTE ADAPTATIVAMENTE //
									System.out.println(MORADO 
										+ "---------- " + AMARILLO + "[ MODIFICAR DATOS DE CLIENTE ]" + MORADO + " ----------\n" + AMARILLO
										+ "(Si no se desea modificar un campo, pulsar [ENTER])\n" + RESET);
									
									// SOLICITAR EL ID OBLIGATORIAMENTE //
									System.out.print(CIAN + "  - ID (obligatorio): " + RESET);
									id = sc.nextInt();
									sc.nextLine();
									
									// SOLICITAR EL RESTO DE DATOS SI SE DESEAN APORTAR //
									System.out.print(CIAN + "  - DNI: " + RESET); 
									dni = sc.nextLine();

									System.out.print(CIAN + "  - NOMBRE: " + RESET); 
									nombre = sc.nextLine();

									System.out.print(CIAN + "  - PRIMER APELLIDO: " + RESET); 
									apellido1 = sc.nextLine();

									System.out.print(CIAN + "  - SEGUNDO APELLIDO: " + RESET); 
									apellido2 = sc.nextLine();

									System.out.print(CIAN + "  - EMAIL: " + RESET); 
									email = sc.nextLine();

									System.out.print(CIAN + "  - TELÉFONO: " + RESET); 
									telefono = sc.nextLine();
									
									// LLAMADA AL MÉTODO DE MODIFICAR CLIENTE ENVIANDO LAS VARIABLES //
									Cliente.modificar(conex, id, dni, nombre, apellido1, apellido2, email, telefono);
						
									// DETENCIÓN DEL PROGRAMA PARA QUE EL USUARIO CONFIRME //
									System.out.print("\n" + CIAN + "--> CONTINUAR [ENTER] <--" + RESET);
									sc.nextLine();
									break;

								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

								case 4:
									// OPCIÓN ELIMINAR UN CLIENTE DADO SU ID //
									System.out.println(MORADO 
										+ "--------------- " + AMARILLO + "[ ELIMINAR CLIENTE ]" + MORADO + " ---------------" + RESET);
									
									// SOLICITAR EL ID DEL CLIENTE A BORRAR //
									System.out.print(CIAN + "  - ID: " + RESET);
									id = sc.nextInt();
									sc.nextLine();
									
									// LLAMADA AL MÉTODO ELIMINAR CLIENTE ENVIANDO SU ID //
									Cliente.eliminar(conex, id);
									
									// DETENCIÓN DEL PROGRAMA PARA QUE EL USUARIO CONFIRME //
									System.out.print("\n" + CIAN + "--> CONTINUAR [ENTER] <--" + RESET);
									sc.nextLine();
									break;

								//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

								case 0:
									// SALIR DEL MENÚ MANTENIMIENTO DE CLIENTE //
									System.out.println(VERDE + "REGRESANDO..." + RESET);
									Thread.sleep(700);
									break;

								default:
									// RECIBIR ERROR DE ENTRADA POR OPCIÓN DIFERENTE DEL 0 AL 4 //
									System.out.println(ROJO + "OPCIÓN NO VÁLIDA" + RESET);
									Thread.sleep(700);
									break;
							}
						}
						while (subOpcion != 0);

						break;

					//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

					case 2:
						// MENÚ MANTENIMIENTO DE PROYECTOS EN DESARROLLO... //
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
						// MENÚ MANTENIMIENTO DE DESARROLLADORES EN DESARROLLO... //
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
						// MENÚ MANTENIMIENTO DE ASIGNACIONES DE PROYECTOS EN DESARROLLO... //
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
						// OPCIÓN SALIR DEL PROGRAMA Y CERRAR CONEXIÓN //
						System.out.println("\n" + VERDE + "SALIENDO... ¡HASTA PRONTO!" + RESET);
						Thread.sleep(700);
						
						db.cerrarConex();
						break;

					default:
						// RECIBIR ERROR DE ENTRADA POR OPCIÓN DIFERENTE DEL 0 AL 4 //
						System.out.println("\n" + ROJO + "OPCIÓN NO VÁLIDA" + RESET);
						Thread.sleep(700);
						break;
				}
				
				// CERRAR EL RESULTSET SI SE HA USADO //
				if (rs != null) {
					rs.getStatement().close();
					rs.close();
				}
			}
			
			// RECOGER ERRORES //
			catch (SQLException e) {
				System.out.println(ROJO + "ERROR: " + e.getMessage() + RESET);
				Thread.sleep(700);
			}
		} while (opcion != 0);
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// VARIABLES PARA DAR COLOR A LA SALIDA POR CONSOLA //
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
package examen_tema06;

import java.util.Scanner;

public class Examen_tema06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        IPersona[] trabajadores = new IPersona[10];
		int contador = 0;
		
		int opcion;
		
		do {
			// MENÚ PRINCIPAL //
			System.out.print("\n" + AMARILLO
					+ "# # # MENÚ PRINCIPAL # # #\n" + CIAN
					+ "  1. Crear trabajador\n" + CIAN
					+ "  2. Pedir baja\n" + CIAN
					+ "  3. Sueldo con complemento\n" + CIAN
					+ "  4. Mostrar información\n" + CIAN
					+ "  0. Salir\n" + RESET
					+ "\n" + AMARILLO
					+ "Introduce opción: " + RESET);
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
				
				case 1:
					// INTRODUCIR NUEVO TRABJADOR //
					System.out.print("\n" + AMARILLO
							+ "Introduce tipo de trabajador:\n" + CIAN
							+ "  1. Obrero\n" + CIAN
							+ "  2. Directivo\n" + CIAN
							+ "  3. Administrativo\n" + CIAN
							+ "\n" + AMARILLO
							+ "Introduce opción: ");
					int tipoTrabajador = sc.nextInt();
					sc.nextLine();
					
					// VARIABLES PARA CREAR EL OBJETO //
					String dni, nombre;
					double sueldo, complemento;
					Departamento departamento = null;
					LugarTrabajo lugarTrabajo = null;
					
					// SOLICITAR DATOS //
					System.out.print("\n" + AMARILLO
							+ "Introduce DNI: " + RESET);
					dni = sc.nextLine();
					
					System.out.print("\n" + AMARILLO
							+ "Introduce nombre: " + RESET);
					nombre = sc.nextLine();
					
					System.out.print("\n" +	 AMARILLO
							+ "Introduce sueldo: " + RESET);
					sueldo = sc.nextDouble();
					
					System.out.print("\n" + AMARILLO
							+ "Introduce complemento: " + RESET);
					complemento = sc.nextDouble();
					
					// SOLICITAR DEPARTAMENTO EN CASO DE SER ADMINISTRATIVO //
					if (tipoTrabajador == 3) {
						
						System.out.print("\n" + AMARILLO
								+ "Departamento:\n" + CIAN
								+ "  1. Nominas\n" + CIAN
								+ "  2. Fabrica\n" + CIAN
								+ "  3. RRHH\n" + CIAN
								+ "\n" + AMARILLO
								+ "Introduce opción: " + RESET);
						departamento = Departamento.values()[sc.nextInt() - 1];
						sc.nextLine();
					}
					
					// SOLICITAR LUGAR DE TRABAJO EN CASO DE SER OBRERO //
					if (tipoTrabajador == 1) {
						
						System.out.print("\n" + AMARILLO
								+ "Lugar de trabajo:\n" + CIAN
								+ "  1. Almacen\n" + CIAN
								+ "  2. Fabrica\n" + CIAN
								+ "  3. Transporte\n" + CIAN
								+ "\n" + AMARILLO
								+ "Introduce opción: " + RESET);
						lugarTrabajo = LugarTrabajo.values()[sc.nextInt() - 1];
						sc.nextLine();
					}
					
					// RECORRER ARRAY DE TRABAJADORES //
					for (int i = 0; i < trabajadores.length; i++) {
						
						// DETENER SI EL ARRAY ESTÁ LLENO //
						if (contador < trabajadores.length) {
							
							// COMPROBAR QUE LA POSICIÓN ACTUAL NO SEA NULL //
							if (trabajadores[i] == null) {
							
								switch (tipoTrabajador) {
									// AÑADIR OBRERO //
									case 1:
										trabajadores[i] = new Obrero(complemento, lugarTrabajo, dni, nombre, sueldo);
										System.out.println("\n" + VERDE
												+ "Obrero añadido correctamente" + RESET);
										break;
										
									// AÑADIR DIRECTIVO //
									case 2:
										trabajadores[i] = new Directivo(complemento, dni, nombre, sueldo);
										System.out.println("\n" + VERDE
												+ "Directivo añadido correctamente" + RESET);
										break;
									
									// AÑADIR ADMINISTRATIVO //
									case 3:
										trabajadores[i] = new Administrativo(complemento, departamento, dni, nombre, sueldo);
										System.out.println("\n" + VERDE
												+ "Administrativo añadido correctamente" + RESET);
										break;
								}
								// SI SE HA AÑADIDO, SUMAR 1 AL CONTADOR DE TRABAJADORES //
								contador++;
								break;
							}
						}
						// EN CASO DE NO TENER ESPACIO MOSTRAR MENSAJE //
						else {
							System.out.println("\n" + ROJO
								+ "No queda espacio para más trabajadores" + RESET);
							break;
						}
					}
					break;
					
				case 2:
					// SOLICITAR DNI DEL TRABAJADOR //
					System.out.print("\n" + AMARILLO
							+ "Introduce el DNI del trabajador: " + RESET);
					String dniBaja = sc.nextLine();
					
					// REECORRER ARRAY DE TRABAJADORES //
					for (int i = 0; i < trabajadores.length; i++) {
						
						// SI LA POSICIÓN NO ES NULL //
						if (trabajadores[i] != null) {
							
							// SI EL DNI COINCIDE CON EL INTRODUCIDO POR CONSOLA //
							if (((Trabajador)trabajadores[i]).getDni().equals(dniBaja)) {
								
								// USAR FUNCIÓN PEDIRBAJA. MOSTRAR MENSAJE SEGÚN RESULTADO //
								if (trabajadores[i].PedirBaja()) System.out.println("\n" + VERDE
										+ "Baja concedida correctamente" + RESET);
								
								else System.out.println("\n" + ROJO
										+ "La baja no ha podido ser concedida" + RESET);
							}
						}
					}
					break;
					
				case 3:
					// MOSTRAR SUELDO DEL TRABAJADOR //
					System.out.print("\n" + AMARILLO
							+ "Introduce el DNI del trabajador: " + RESET);
					String dniSueldo = sc.nextLine();
					
					// RECORRER ARRAY DE TRABAJADORES //
					for (int i = 0; i < trabajadores.length; i++) {
						
						// SI LA POSICIÓN NO ES NULL //
						if (trabajadores[i] != null) {
							
							// SI EL DNI COINCIDE CON EL INTRODUCIDO POR CONSOLA //
							if (((Trabajador)trabajadores[i]).getDni().equals(dniSueldo)) {
								
								// USAR FUNCIÓN OBTENERSUELDO //
								System.out.println("\n" + CIAN
										+ "El sueldo del trabajador es: " + RESET +
										((Trabajador)trabajadores[i]).ObtenerSueldoConComplemento() + "€");
							}
						}
					}
					break;
					
				case 4:
					// MOSTRAR INFORMACIÓN DEL TRABAJADOR //
					System.out.print("\n" + AMARILLO
							+ "Introduce el DNI del trabajador: " + RESET);
					String dniBuscar = sc.nextLine();
					
					// RECORRER ARRAY DE TRABAJADORES //
					for (int i = 0; i < trabajadores.length; i++) {
						
						// SI LA POSICIÓN NO ES NULL //
						if (trabajadores[i] != null) {
							
							// USAR FUNCIÓN MOSTRARINFORMACION //
							if (((Trabajador)trabajadores[i]).getDni().equals(dniBuscar)) {
								
								((Trabajador)trabajadores[i]).MostrarInformacion();
							}
						}
					}
					break;
					
				case 0:
					System.out.println("\n" + CIAN
							+ "HASTA LA PRÓXIMA\n");
					break;
					
				default:
					System.out.println("\n" + ROJO
							+ "Opción incorrecta");
					break;
			}
		}
		while (opcion != 0);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
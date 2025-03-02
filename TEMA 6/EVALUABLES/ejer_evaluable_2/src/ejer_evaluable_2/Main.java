package ejer_evaluable_2;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

enum Materia {
	Programacion, SistemasInformaticos, LenguajesMarcas, EntornosDesarrollo, BasesDatos, Empresas
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
		Instituto instituto = new Instituto();

		
		
		if (instituto.AnyadirProfesor(
			new Interino(3, 1580, Materia.Programacion, 0.1, "12345678A", "Pedro", "Pica", "Piedra", LocalDate.of(1980, Month.MARCH, 23))))
				System.out.println(CIAN + "Profesor interino añadido correctamente" + RESET);					
		else System.out.println(ROJO + "No se ha podido añadir el profesor interino" + RESET);
		
		if (instituto.AnyadirProfesor(
			new Titular(LocalDate.of(2013, Month.JANUARY, 12), 1250, Materia.BasesDatos, 0.10, "87654321B", "Juan", "Lopez", "Pérez", LocalDate.of(1975, Month.SEPTEMBER, 7))))
				System.out.println("\n" + CIAN + "Profesor titular añadido correctamente\n" + RESET);
		else System.out.println("\n" + ROJO + "No se ha podido añadir el profesor titular\n" + RESET);
		
		
		
		System.out.println(MORADO + "### CREACIÓN DE INSTITUTO ###" + RESET);
		
		System.out.print("\nIntroduce el nombre del instituto: ");
		instituto.setNombre(sc.nextLine());
		
		System.out.println("\n" + CIAN + "Instituto creado correctamente\n" + RESET);
		
		int opcion;
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// MENÚ - PRINCIPAL //
		do {
			System.out.print(""
					+ MORADO + "### MENÚ ###\n" + RESET
					+ "  1. Añadir profesor\n"
					+ "  2. Borrar profesor\n"
					+ "  3. Ampliar contrato\n"
					+ "  4. Mostrar profesores\n"
					+ "  0. Salir\n\n"
					+ AMARILLO + "Selecciona una opción: " + RESET);
			
			opcion = sc.nextInt();
			sc.nextLine();
			
			System.out.println("");
			
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			// VARIABLES CREACIÓN DE PROFESOR //
			String nombre, apellido1, apellido2, dni;
			LocalDate fechaNacimiento, fechaIncorporacion;
			float sueldoBruto;
			double retencion;
			int tiempoContrato;
			Materia materia;
			
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

			switch (opcion) {
				
				// OPCIÓN 1 - MENÚ AÑADIR PROFESOR //
				case 1:
					System.out.print(""
							+ MORADO + "### AÑADIR PROFESOR ###\n" + RESET
							+ "  1. Profesor interino\n"
							+ "  2. Profesor titular\n\n"
							+ AMARILLO + "Selecciona una opción: " + RESET);
					
					int opcionProfe = sc.nextInt();
					sc.nextLine();
					
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					
					// MENÚ - AÑADIR DATOS POR TIPO DE PROFESOR //
					switch (opcionProfe) {	
						
						// OPCIÓN 1 - AÑADIR PROFESOR INTERINO //
						case 1:
							System.out.print("  - Nombre: ");
							nombre = sc.nextLine();
							System.out.print("  - Primer apellido: ");
							apellido1 = sc.nextLine();
							System.out.print("  - Segundo apellido: ");
							apellido2 = sc.nextLine();
							System.out.print("  - DNI: ");
							dni = sc.nextLine();
							System.out.print("  - Fecha de nacimiento: ");
							fechaNacimiento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
							System.out.print("  - Sueldo bruto: ");
							sueldoBruto = sc.nextFloat();
							System.out.print("  - Porcentaje de retención (0,--): ");
							retencion = sc.nextDouble();
							System.out.print("  - Duración del contrato (meses): ");
							tiempoContrato = sc.nextInt();
							System.out.print(""
									+ MORADO + "  - MATERIAS:\n" + RESET
									+ "      1. Programación\n"
									+ "      2. Sistemas Informáticos\n"
									+ "      3. Lenguajes de Marcas\n"
									+ "      4. Entornos de Desarrollo\n"
									+ "      5. Bases de Datos\n"
									+ "      6. Empresas\n\n"
									+ AMARILLO + "  - Selecciona una opción: " + RESET);
							materia = Materia.values()[sc.nextInt() - 1];
							
							if (instituto.AnyadirProfesor(
								new Interino(tiempoContrato, sueldoBruto, materia, retencion, dni, nombre, apellido1, apellido2, fechaNacimiento)))
									System.out.println("\n" + CIAN + "Profesor interino añadido correctamente\n" + RESET);
							
							else System.out.println("\n" + ROJO + "No se ha podido añadir el profesor interino\n" + RESET);
							break;
						
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						
						// OPCIÓN 2 - AÑADIR PROFESOR TITULAR //
						case 2:
							System.out.print("  - Nombre: ");
							nombre = sc.nextLine();
							System.out.print("  - Primer apellido: ");
							apellido1 = sc.nextLine();
							System.out.print("  - Segundo apellido: ");
							apellido2 = sc.nextLine();
							System.out.print("  - DNI: ");
							dni = sc.nextLine();
							System.out.print("  - Fecha de nacimiento: ");
							fechaNacimiento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
							System.out.print("  - Sueldo bruto: ");
							sueldoBruto = sc.nextFloat();
							System.out.print("  - Porcentaje de retención (0,--): ");
							retencion = sc.nextDouble();
							sc.nextLine();
							System.out.print("  - Fecha de incorporación: ");
							fechaIncorporacion = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
							System.out.print(""
									+ MORADO + "  - MATERIAS:\n" + RESET
									+ "      1. Programación\n"
									+ "      2. Sistemas Informáticos\n"
									+ "      3. Lenguajes de Marcas\n"
									+ "      4. Entornos de Desarrollo\n"
									+ "      5. Bases de Datos\n"
									+ "      6. Empresas\n\n"
									+ AMARILLO + "  - Selecciona una opción: " + RESET);
							materia = Materia.values()[sc.nextInt() - 1];
							
							if (instituto.AnyadirProfesor(
								new Titular(fechaIncorporacion, sueldoBruto, materia, retencion, dni, nombre, apellido1, apellido2, fechaNacimiento)))
									System.out.println("\n" + CIAN + "Profesor titular añadido correctamente\n" + RESET);
							
							else System.out.println("\n" + ROJO + "No se ha podido añadir el profesor titular\n" + RESET);
							break;
					}
					break;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				// OPCIÓN 2 - BORRAR PROFESOR //
				case 2:
					System.out.println(MORADO + "### BORRAR PROFESOR ###\n" + RESET);
					
					System.out.print(AMARILLO + "Introduce DNI del profesor a borrar: " + RESET);
					String dniBorra = sc.nextLine();
					
					if (instituto.EliminarProfesor(dniBorra))
						System.out.println("\n" + CIAN + "Profesor con DNI (" + dniBorra + ") eliminado correctamente\n" + RESET);
					
					else System.out.println("\n" + ROJO + "No se ha podido eliminar el profesor con DNI (" + dniBorra + ")\n" + RESET);
					break;
					
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				// OPCIÓN 3 - AMPLIAR CONTRATO DE PROFESOR INTERINO //
				case 3:
					System.out.println(MORADO + "### AMPLIAR CONTRATO DE INTERINO ###\n" + RESET);
					
					System.out.print(AMARILLO + "Introduce DNI del profesor a borrar: " + RESET);
					String dniModifica = sc.nextLine();
					System.out.print("\n" + AMARILLO + "Introduce cantidad de meses a ampliar: " + RESET);
					int mesesAmplia = sc.nextInt();
					
					if (instituto.AmpliarContrato(dniModifica, mesesAmplia))
						System.out.println("\n" + CIAN + "Contrato del profesor con DNI (" + dniModifica + ") ampliado (" + mesesAmplia + ") meses correctamente\n" + RESET);
					
					else System.out.println("\n" + ROJO + "No se ha podido ampliar el contrato del profesor con DNI (" + dniModifica + ")\n" + RESET);
					break;
					
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					
				// OPCIÓN 4 - MOSTRAR PROFESORES //
				case 4:
					System.out.println(MORADO + "### MOSTRAR PROFESORES ###\n" + RESET);
					instituto.MostrarInformacion();
					break;
			}
		}
		while (opcion != 0);
    }
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
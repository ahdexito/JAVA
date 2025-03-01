package ejer_evaluable_1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

enum Materia {
	Programacion, SistemasInformaticos, LenguajesMarcas, EntornosDesarrollo, BasesDatos, Empresas
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
		/*
		String nombre = "Pedro", apellido1 = "Pica", apellido2 = "Piedra";
		String dni = "12345678A";
		LocalDate fechaNacimiento = LocalDate.of(1980, Month.MARCH, 23);
		float sueldoBruto = 1580;
		Materia materia = Materia.Programacion;
		double retencion = 0.10;
		int tiempoContrato = 3;
		LocalDate fechaIncorporacion = LocalDate.of(2013, Month.JANUARY, 12);
		*/
		
		System.out.println(AMARILLO + "### CREACIÓN DE INSTITUTO ###" + RESET);
		
		System.out.print("\nIntroduce el nombre del instituto: ");
		Instituto instituto = new Instituto();
		instituto.setNombre(sc.nextLine());
		
		System.out.println("\n" + CIAN + "Instituto creado correctamente\n" + RESET);
		
		int opcion;
		
		do {
			System.out.print(""
					+ AMARILLO + "### MENÚ ###\n" + RESET
					+ "  1. Añadir profesor\n"
					+ "  2. Borrar profesor\n"
					+ "  3. Ampliar contrato\n"
					+ "  4. Mostrar profesores\n"
					+ "  0. Salir\n\n"
					+ AMARILLO + "Selecciona una opción: " + RESET);
			
			opcion = sc.nextInt();
			
			System.out.println("");
			
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			switch (opcion) {
				case 1:
					System.out.print(""
							+ AMARILLO + "### AÑADIR PROFESOR ###\n" + RESET
							+ "  1. Profesor interino\n"
							+ "  2. Profesor titular\n\n"
							+ AMARILLO + "Selecciona una opción: " + RESET);
					int opcionProfe = sc.nextInt();
					
					switch (opcionProfe) {
						case 1:
							System.out.print("  - Nombre: ");
							String nombre = sc.nextLine();
							System.out.print("  - Primer apellido: ");
							String apellido1 = sc.nextLine();
							System.out.print("  - Segundo apellido: ");
							String apellido2 = sc.nextLine();
							System.out.print("  - DNI: ");
							String dni = sc.nextLine();
							System.out.print("  - Fecha de nacimiento: ");
							LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
							System.out.print("  - Sueldo: ");
							float sueldo = sc.nextFloat();
							System.out.print("  - Duración del contrato (meses): ");
							int meses = sc.nextInt();
							System.out.print(""
									+ AMARILLO + "  - MATERIAS:\n" + RESET
									+ "      1. Programación\n"
									+ "      2. Sistemas Informáticos\n"
									+ "      3. Lenguajes de Marcas\n"
									+ "      4. Entornos de Desarrollo\n"
									+ "      5. Bases de Datos\n"
									+ "      6. Empresas\n\n"
									+ AMARILLO + "  - Selecciona una opción: " + RESET);
							int opcionMaterias = sc.nextInt() - 1;
					}
					
			}
		}
		while (opcion != 0);
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
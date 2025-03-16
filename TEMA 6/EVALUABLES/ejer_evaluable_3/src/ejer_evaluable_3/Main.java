package ejer_evaluable_3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner (System.in);
        
		System.out.println(AMARILLO + "/ / / / / / / / / / / / / / / / / / / / / / / /" + RESET);
        System.out.println(AMARILLO + "/ / / / / / / GESTIÓN DE HOSPITAL / / / / / / /" + RESET);
		System.out.println(AMARILLO + "/ / / / / / / / / / / / / / / / / / / / / / / /" + RESET + "\n");
		
		
		// CREACIÓN DE HOSPITAL //
		Hospital hospital = new Hospital();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// CREACIÓN DE MÉDICOS //
		Medico medi1 = new Medico(
				Especialidad.Anestesista, 1, 1650, LocalDate.of(1940, 8, 11), 2, "1234A", "Ana", LocalDate.of(1930, 1, 3));
		Medico medi2 = new Medico(
				Especialidad.Endocrino, 3, 1560, LocalDate.of(2004, 2, 15), 5, "1234B", "Juan", LocalDate.of(1982, 4, 23));
		Medico medi3 = new Medico(
				Especialidad.Traumatólogo, 6, 1720, LocalDate.of(1996, 9, 27), 1, "1234C", "Pedro", LocalDate.of(1950, 12, 25));
		Medico medi4 = new Medico(
				Especialidad.MedicinaGeneral, 4, 1380, LocalDate.of(1999, 11, 2), 3, "1234D", "María", LocalDate.of(1975, 10, 14));
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// CREACIÓN DE ENFERMEROS //
		Enfermero enf1 = new Enfermero(
				5, 1, 1220, LocalDate.of(1957, 1, 20), 6, "2345A", "Daniel", LocalDate.of(1936, 7, 12));
		Enfermero enf2 = new Enfermero(
				1, 2, 1350, LocalDate.of(2020, 3, 3), 2, "2345B", "Laura", LocalDate.of(1995, 2, 10));
		Enfermero enf3 = new Enfermero(
				2, 1, 1310, LocalDate.of(2012, 9, 27), 3, "2345C", "Elena", LocalDate.of(1955, 6, 22));
		Enfermero enf4 = new Enfermero(
				5, 0, 1170, LocalDate.of(2023, 4, 17), 3, "2345D", "Miguel", LocalDate.of(2001, 4, 2));
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// CREACIÓN DE CONSULTAS //
		Consulta cons1 = new Consulta("Dolor de cabeza", enf1, TipoConsulta.Dolor);
		Consulta cons2 = new Consulta("Dolor en el pie izquierdo", enf2, TipoConsulta.Dolor);
		Consulta cons3 = new Consulta("Dolor de cabeza", enf4, TipoConsulta.Dolor);
		Consulta cons4 = new Consulta("Molestias en la cabeza", enf2, TipoConsulta.Molestias);
		Consulta cons5 = new Consulta("Molestias en la espalda", enf3, TipoConsulta.Molestias);
		Consulta cons6 = new Consulta("Herida en el brazo", enf1, TipoConsulta.Herida);
		Consulta cons7 = new Consulta("Herida en la cara", enf1, TipoConsulta.Herida);
		Consulta cons8 = new Consulta("Herida en la pierna", enf3, TipoConsulta.Herida);
		Consulta cons9 = new Consulta("Herida en el brazo", enf4, TipoConsulta.Herida);
		Consulta cons10 = new Consulta("Tumor cerebral", medi1, TipoConsulta.Cirugía);
		Consulta cons11 = new Consulta("Cáncer de hígado", medi2, TipoConsulta.Cirugía);
		Consulta cons12 = new Consulta("Disparo de bala", medi3, TipoConsulta.Cirugía);
		Consulta cons13 = new Consulta("Vegetaciones", medi4, TipoConsulta.Cirugía);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// CREACIÓN DE PACIENTES //
		Paciente paci1 = new Paciente(
				true, LocalDate.of(2025, 4, 1), "103", new Consulta[]{}, "3456A", "Manolo", LocalDate.of(2003, 5, 23));
		Paciente paci2 = new Paciente(
				true, LocalDate.of(2025, 3, 20), "23", new Consulta[]{}, "3456B", "Mónica", LocalDate.of(1992, 8, 3));
		Paciente paci3 = new Paciente(
				true, LocalDate.of(2025, 2, 4), "68", new Consulta[]{}, "3456C", "Andrés", LocalDate.of(1967, 3, 14));
		Paciente paci4 = new Paciente(
				false, LocalDate.of(2025, 4, 11), "52", new Consulta[]{}, "3456D", "Rosa", LocalDate.of(1996, 7, 19));
		Paciente paci5 = new Paciente(
				false, LocalDate.of(2025, 3, 13), "107", new Consulta[]{}, "3456E", "Jose", LocalDate.of(2002, 1, 26));
		Paciente paci6 = new Paciente(
				false, LocalDate.of(2025, 3, 24), "15", new Consulta[]{}, "3456F", "Paz", LocalDate.of(1986, 2, 5));
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// AÑADIR CONSULTAS A PACIENTES //
		paci1.setConsultas(Arrays.copyOf(new Consulta[]{cons1, cons10, cons4}, 10));
		paci2.setConsultas(Arrays.copyOf(new Consulta[]{cons2, cons3, cons6, cons9}, 10));
		paci3.setConsultas(Arrays.copyOf(new Consulta[]{cons13, cons2, cons11}, 10));
		paci4.setConsultas(Arrays.copyOf(new Consulta[]{cons12, cons7}, 10));
		paci5.setConsultas(Arrays.copyOf(new Consulta[]{cons8, cons5, cons11}, 10));
		paci6.setConsultas(Arrays.copyOf(new Consulta[]{cons4}, 10));
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// AÑADIR PERSONAS AL HOSPITAL //
		hospital.CrearPersona(medi1); hospital.CrearPersona(medi2); hospital.CrearPersona(medi3); hospital.CrearPersona(medi4);
		
		hospital.CrearPersona(enf1); hospital.CrearPersona(enf2); hospital.CrearPersona(enf3); hospital.CrearPersona(enf4); 
		
		hospital.CrearPersona(paci1); hospital.CrearPersona(paci2); hospital.CrearPersona(paci3); 
				hospital.CrearPersona(paci4); hospital.CrearPersona(paci5); hospital.CrearPersona(paci6);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
		// MOSTRAR DATOS DE MÉDICOS //
		System.out.println(CIAN + "# # # MOSTRAR LOS DATOS DE CADA MÉDICO # # #\n" + RESET);
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();
		
		int contador = 1;
		for (int i = 0; i < hospital.getPersonas().length; i++) {
			
			if (hospital.getPersonas()[i] instanceof Medico) {
				
				System.out.println(CIAN + "~ ~ MÉDICO " + contador + " ~ ~" + RESET);
				hospital.getPersonas()[i].MostrarInformacion();
				System.out.println("");
//				Thread.sleep(500);
				contador++;
			}
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// MOSTRAR DATOS DE ENFERMEROS //
		System.out.println(CIAN + "# # # MOSTRAR LOS DATOS DE CADA ENFERMERO # # #\n" + RESET);
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();
		
		contador = 1;
		for (int i = 0; i < hospital.getPersonas().length; i++) {
			
			if (hospital.getPersonas()[i] instanceof Enfermero) {
				
				System.out.println(CIAN + "~ ~ ENFERMERO " + contador + " ~ ~" + RESET);
				hospital.getPersonas()[i].MostrarInformacion();
				System.out.println("");
//				Thread.sleep(500);
				contador++;
			}
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// MOSTRAR DATOS DE PACIENTES //
		System.out.println(CIAN + "# # # MOSTRAR LOS DATOS DE CADA PACIENTE # # #\n" + RESET);
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();
		
		contador = 1;
		for (int i = 0; i < hospital.getPersonas().length; i++) {
			
			if (hospital.getPersonas()[i] instanceof Paciente) {
				
				System.out.println(CIAN + "~ ~ PACIENTE " + contador + " ~ ~" + RESET);
				hospital.getPersonas()[i].MostrarInformacion();
				System.out.println("");
//				Thread.sleep(500);
				contador++;
			}
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// CREAR NUEVA CONSULTA Y AÑADIR A PACIENTE //
		System.out.println(CIAN + "# # # CREAR NUEVA CONSULTA A UN PACIENTE # # #\n" + RESET);
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();
				
		if (paci6.NuevaConsulta("Fractura en el brazo", medi2, TipoConsulta.Cirugía)) System.out.println(VERDE + "CONSULTA AÑADIDA CORRECTAMENTE\n");
		else System.out.println(ROJO + "ERROR AL AÑADIR CONSULTA\n" + RESET);
		
		paci6.MostrarInformacion();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// HACER CIRUGÍA DE MÉDICO //
		System.out.println("\n" + CIAN + "# # # SOLICITAR A UN MÉDICO REALIZAR UNA CIRUGÍA # # #\n" + RESET);
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();
		
		System.out.println(CIAN + "~ ~ PACIENTE CON CIRUGÍAS ~ ~" + RESET);
		if (medi4.HacerCirugia(paci6)) System.out.println(VERDE + "CIRUGÍA SOLICITADA CORRECTAMENTE\n" + RESET);
		else System.out.println(ROJO + "ERROR. EL PACIENTE PODRÍA NO TENER CIRUGÍAS\n" + RESET);
		
		System.out.println("");
		
		System.out.println(CIAN + "~ ~ PACIENTE SIN CIRUGÍAS ~ ~" + RESET);
		if (medi4.HacerCirugia(paci2)) System.out.println(VERDE + "CIRUGÍA SOLICITADA CORRECTAMENTE\n" + RESET);
		else System.out.println(ROJO + "ERROR. EL PACIENTE PODRÍA NO TENER CIRUGÍAS\n" + RESET);
		
		System.out.println(AMARILLO + "/ / / / / / / / / / / / / / / / / / / / / / / /" + RESET);
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// HACER GUARDIA MÉDICO //
		System.out.println("\n" + CIAN + "# # # AÑADIR GUARDIAS A UN MÉDICO # # #");
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();
		
		System.out.println("");
		medi2.MostrarInformacion();
		
		medi2.HacerGuardia(3);
		
		System.out.println("");
		medi2.MostrarInformacion();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
		// HACER VISITA MÉDICO //
		System.out.println("\n" + CIAN + "# # # SOLICITAR VISITA DE MÉDICO A PACIENTE # # #" + RESET);
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();

		System.out.println("\n" + CIAN + "~ ~ PACIENTE QUE CORRESPONDE CON MÉDICO ~ ~" + RESET);
		medi1.HacerVisita(paci1);
		
		System.out.println("\n" + CIAN + "~ ~ PACIENTE QUE NO CORRESPONDE CON MÉDICO ~ ~" + RESET);
		medi1.HacerVisita(paci2);
		
		System.out.println("\n" + AMARILLO + "/ / / / / / / / / / / / / / / / / / / / / / / /" + RESET);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		// CONSULTAR SI MÉDICO PUEDE JUBILARSE //
		System.out.println("\n" + CIAN + "# # # CONSULTAR SI UN MÉDICO PUEDE JUBILARSE # # #" + RESET);
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();

		System.out.println("\n" + CIAN + "~ ~ MÉDICO QUE SÍ PUEDE ~ ~" + RESET);
		if (medi1.PuedeJubilarse()) System.out.println(VERDE + "SÍ PUEDE JUBILARSE" + RESET);
		else System.out.println(ROJO + "NO PUEDE JUBILARSE" + RESET);
		
		System.out.println("\n" + CIAN + "~ ~ MÉDICO QUE NO PUEDE ~ ~");
		if (medi2.PuedeJubilarse()) System.out.println(VERDE + "SÍ PUEDE JUBILARSE" + RESET);
		else System.out.println(ROJO + "NO PUEDE JUBILARSE" + RESET);
		
		System.out.println("\n" + AMARILLO + "/ / / / / / / / / / / / / / / / / / / / / / / /" + RESET);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// MÉDICO ENVÍA TRATAMEINTO //
		System.out.println("\n" + CIAN + "# # # REALIZAR ENVÍO DE TRATAMIENTO # # #" + RESET);
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();

		System.out.println("\n" + CIAN + "~ ~ ENVIAR VÍA WHATSAPP ~ ~" + RESET);
		medi3.EnviarTratamiento("WhatsApp");
		
		System.out.println(CIAN + "~ ~ ENVIAR VÍA CARTA ~ ~" + RESET);
		medi3.EnviarTratamiento("Carta");
		
		System.out.println("\n" + AMARILLO + "/ / / / / / / / / / / / / / / / / / / / / / / /" + RESET);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// HACER GUARDIA ENFERMERO //
		System.out.println("\n" + CIAN + "# # # AÑADIR GUARDIAS A UN ENFERMERO # # #");
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();
		
		System.out.println("");
		enf1.MostrarInformacion();
		
		enf1.HacerGuardia(3);
		
		System.out.println("");
		enf1.MostrarInformacion();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		// HACER VISITA ENFERMERO //
		System.out.println("\n" + CIAN + "# # # SOLICITAR VISITA DE ENFERMERO A PACIENTE # # #" + RESET);
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();

		System.out.println("\n" + CIAN + "~ ~ PACIENTE QUE CORRESPONDE CON ENFERMERO ~ ~" + RESET);
		enf3.HacerVisita(paci5);
		
		System.out.println("\n" + CIAN + "~ ~ PACIENTE QUE NO CORRESPONDE CON ENFERMERO ~ ~" + RESET);
		enf3.HacerVisita(paci2);
		
		System.out.println("\n" + AMARILLO + "/ / / / / / / / / / / / / / / / / / / / / / / /" + RESET);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// CONSULTAR SI ENFERMERO PUEDE JUBILARSE //
		System.out.println("\n" + CIAN + "# # # CONSULTAR SI UN ENFERMERO PUEDE JUBILARSE # # #" + RESET);
//		System.out.println(MORADO + "(ENTER para continuar)" + RESET); sc.nextLine();

		System.out.println("\n" + CIAN + "~ ~ ENFERMERO QUE SÍ PUEDE ~ ~" + RESET);
		if (enf1.PuedeJubilarse()) System.out.println(VERDE + "SÍ PUEDE JUBILARSE" + RESET);
		else System.out.println(ROJO + "NO PUEDE JUBILARSE" + RESET);
		
		System.out.println("\n" + CIAN + "~ ~ ENFERMERO QUE NO PUEDE ~ ~");
		if (enf2.PuedeJubilarse()) System.out.println(VERDE + "SÍ PUEDE JUBILARSE" + RESET);
		else System.out.println(ROJO + "NO PUEDE JUBILARSE" + RESET);
		
		System.out.println("\n" + AMARILLO + "/ / / / / / / / / / / / / / / / / / / / / / / /" + RESET);
	}	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
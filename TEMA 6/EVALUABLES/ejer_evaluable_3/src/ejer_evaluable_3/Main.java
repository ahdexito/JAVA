package ejer_evaluable_3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
		
        System.out.println(AMARILLO + "/// GESTIÓN DE HOSPITAL ///\n\n" + RESET);
		
		// CREACIÓN DE HOSPITAL //
		Hospital hospital = new Hospital();
		
		
		// CREACIÓN DE MÉDICOS //
		Medico medi1 = new Medico(
				Especialidad.Anestesista, 1, 1650, LocalDate.of(2013, 8, 11), 2, "1234A", "Ana", LocalDate.of(1992, 1, 3));
		Medico medi2 = new Medico(
				Especialidad.Endocrino, 3, 1560, LocalDate.of(2004, 2, 15), 5, "1234B", "Juan", LocalDate.of(1982, 4, 23));
		Medico medi3 = new Medico(
				Especialidad.Traumatólogo, 6, 1720, LocalDate.of(1996, 9, 27), 1, "1234C", "Pedro", LocalDate.of(1950, 12, 25));
		Medico medi4 = new Medico(
				Especialidad.MedicinaGeneral, 4, 1380, LocalDate.of(1999, 11, 2), 3, "1234D", "María", LocalDate.of(1954, 10, 14));
		
		
		// CREACIÓN DE ENFERMEROS //
		Enfermero enf1 = new Enfermero(
				5, 1, 1220, LocalDate.of(2002, 1, 20), 6, "2345A", "Daniel", LocalDate.of(1974, 7, 12));
		Enfermero enf2 = new Enfermero(
				1, 2, 1350, LocalDate.of(2020, 3, 3), 2, "2345B", "Laura", LocalDate.of(1995, 2, 10));
		Enfermero enf3 = new Enfermero(
				2, 1, 1310, LocalDate.of(2012, 9, 27), 3, "2345C", "Elena", LocalDate.of(1955, 6, 22));
		Enfermero enf4 = new Enfermero(
				5, 0, 1170, LocalDate.of(2023, 4, 17), 3, "2345D", "Miguel", LocalDate.of(2001, 4, 2));
		
		
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
		Consulta cons10 = new Consulta("Tumor cerebral", medi1, TipoConsulta.Cirugia);
		Consulta cons11 = new Consulta("Cáncer de hígado", medi2, TipoConsulta.Cirugia);
		Consulta cons12 = new Consulta("Disparo de bala", medi3, TipoConsulta.Cirugia);
		Consulta cons13 = new Consulta("Vegetaciones", medi4, TipoConsulta.Cirugia);
		
		
		// CREACIÓN DE PACIENTES CON CONSULTAS AÑADIDAS //
		Paciente paci1 = new Paciente(
				true, LocalDate.of(2025, 4, 1), "103", new Consulta[]{cons1, cons10, cons4}, "3456A", "Manolo", LocalDate.of(2003, 5, 23));
		Paciente paci2 = new Paciente(
				true, LocalDate.of(2025, 3, 20), "23", new Consulta[]{cons2, cons3, cons6, cons9}, "3456B", "Mónica", LocalDate.of(1992, 8, 3));
		Paciente paci3 = new Paciente(
				true, LocalDate.of(2025, 2, 4), "68", new Consulta[]{cons13, cons2, cons11}, "3456C", "Andrés", LocalDate.of(1967, 3, 14));
		Paciente paci4 = new Paciente(
				false, LocalDate.of(2025, 4, 11), "52", new Consulta[]{cons12,cons7}, "3456D", "Rosa", LocalDate.of(1996, 7, 19));
		Paciente paci5 = new Paciente(
				false, LocalDate.of(2025, 3, 13), "107", new Consulta[]{cons8, cons5, cons11}, "3456E", "Jose", LocalDate.of(2002, 1, 26));
		Paciente paci6 = new Paciente(
				false, LocalDate.of(2025, 3, 24), "15", new Consulta[]{cons4}, "3456F", "Paz", LocalDate.of(1986, 2, 5));
		
		
		// AÑADIR PERSONAS AL HOSPITAL //
		hospital.CrearPersona(medi1); hospital.CrearPersona(medi2); hospital.CrearPersona(medi3); hospital.CrearPersona(medi4);
		
		hospital.CrearPersona(enf1); hospital.CrearPersona(enf2); hospital.CrearPersona(enf3); hospital.CrearPersona(enf4); 
		
		hospital.CrearPersona(paci1); hospital.CrearPersona(paci2); hospital.CrearPersona(paci3); 
				hospital.CrearPersona(paci4); hospital.CrearPersona(paci5); hospital.CrearPersona(paci6); 
		
		
		// MOSTRAR DATOS DE MÉDICOS //
		System.out.println(AMARILLO + "### MOSTRAR LOS DATOS DE CADA MÉDICO ###\n" + RESET);
		
		for (int i = 0; i < hospital.getPersonas().length; i++) {
			
			if (hospital.getPersonas()[i] instanceof Medico) {
				
				hospital.getPersonas()[i].MostrarInformacion();
				System.out.println("");
			}
		}
		
		// MOSTRAR DATOS DE ENFERMEROS //
		System.out.println(AMARILLO + "### MOSTRAR LOS DATOS DE CADA ENFERMERO ###\n" + RESET);
		
		for (int i = 0; i < hospital.getPersonas().length; i++) {
			
			if (hospital.getPersonas()[i] instanceof Enfermero) {
				
				hospital.getPersonas()[i].MostrarInformacion();
				System.out.println("");
			}
		}
		
		// MOSTRAR DATOS DE PACIENTES //
		System.out.println(AMARILLO + "\n### MOSTRAR LOS DATOS DE CADA PACIENTE ###\n" + RESET);
		
		for (int i = 0; i < hospital.getPersonas().length; i++) {
			
			if (hospital.getPersonas()[i] instanceof Paciente) {
				
				hospital.getPersonas()[i].MostrarInformacion();
				System.out.println("");
			}
		}
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
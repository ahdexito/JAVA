package ejer_evaluable_1;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

enum Materia {
	Programacion, SistemasInformaticos, LenguajesMarcas, EntornosDesarrollo, BasesDatos, Empresas
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
		String nombre = "Pedro", apellido1 = "Pica", apellido2 = "Piedra";
		String dni = "12345678A";
		LocalDate fechaNacimiento = LocalDate.of(1980, Month.MARCH, 23);
		float sueldoBruto = 1580;
		Materia materia = Materia.Programacion;
		double retencion = 0.10;
		int tiempoContrato = 3;
		LocalDate fechaIncorporacion = LocalDate.of(2013, Month.JANUARY, 12);
		
		System.out.println("\n### PERSONA ###\n");
		
		Persona persona = new Persona(dni, nombre, apellido1, apellido2, fechaNacimiento);
		persona.MostrarInformacion();
		
		System.out.println("\n### PROFESOR ###\n");
		
		Profesor profesor = new Profesor(sueldoBruto, materia, retencion, dni, nombre, apellido1, apellido2, fechaNacimiento);
		profesor.MostrarInformacion();
		
		System.out.println("\n### TITULAR ###\n");
		
		Titular titular = new Titular(fechaIncorporacion, sueldoBruto, materia, retencion, dni, nombre, apellido1, apellido2, fechaNacimiento);
		titular.MostrarInformacion();
		
		System.out.println("\n### INTERINO ###\n");
		
		Interino interino = new Interino(tiempoContrato, sueldoBruto, materia, retencion, dni, nombre, apellido1, apellido2, fechaNacimiento);
		interino.MostrarInformacion();
    }
}
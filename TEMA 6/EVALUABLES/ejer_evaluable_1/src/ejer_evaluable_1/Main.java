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
		int retencion = 10;
		LocalDate fechaIncorporacion = LocalDate.of(2013, Month.JANUARY, 12);
		
		Titular titular = new Titular(fechaIncorporacion, sueldoBruto, materia, dni, nombre, apellido1, apellido2, fechaNacimiento);
		
		titular.MostrarInformacion(0.1);
    }
}
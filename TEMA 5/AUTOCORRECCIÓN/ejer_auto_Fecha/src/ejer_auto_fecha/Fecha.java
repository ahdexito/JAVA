package ejer_auto_fecha;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Fecha {
	
	int dia;
	int mes;
	int anyo;
	LocalDate feche = LocalDate.of(anyo, mes, dia);
	
	LocalDate DiaSiguiente() {
		
		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		
		return fecha.plusDays(1);
	}
	
	void MostrarFecha() {
		
		System.out.println("La fecha es: " + DiaSiguiente().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
	
	boolean MayorA(LocalDate f) {
		
		return this.feche.isBefore(f);
	}
	
	boolean MayorB(LocalDate f) {
		
		return this.feche.isAfter(f);
	}
	
	boolean IgualA(LocalDate f) {
		
		return this.feche.isEqual(f);
	}
}

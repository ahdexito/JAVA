package pruebas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Fecha de nacimiento (dd/mm/yyyy): ");
		String entrada = sc.nextLine();
		
		var cumple = LocalDate.parse(entrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		var formato = DateTimeFormatter
				.ofLocalizedDate(FormatStyle.FULL)
				.withLocale(new Locale("es", "ES"));
		
		var hoy = LocalDate.now();
		
		cumple = cumple.withYear(hoy.getYear());
		
		if (cumple.isBefore(hoy) || cumple.isEqual(hoy)) cumple = cumple.plusYears(1);
		
		var periodo = ChronoUnit.DAYS.between(hoy, cumple);
		
		System.out.println("Tu siguiente cumpleaños será: " + cumple.format(formato));
		
		System.out.println("Quedan " + periodo + " días.");
		
		
    }
}

package funciones_fechahora;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class Funciones_fechahora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("La fecha actual es: " + LocalDate.now());
		System.out.println("La hora actual es: " + LocalTime.now());
		System.out.println("La fecha y hora actual es: " + LocalDateTime.now());
		System.out.println("La fecha y hora actual con zona horaria es: " + ZonedDateTime.now());
		
		System.out.println("");//////////////////////////////////////////////////////////////////////////////////////
		
		var cumple = LocalDate.of(2000, Month.JANUARY, 12);
		System.out.println("La fecha de mi cumpleaños: " + cumple);
		
		System.out.println("");//////////////////////////////////////////////////////////////////////////////////////
		
		var hoy = LocalDateTime.now();
		System.out.println("La fecha y hora actual: " + hoy);
		System.out.println("Año: " + hoy.getYear());
		System.out.println("Mes: " + hoy.getMonth());
		System.out.println("Número del mes: " + hoy.getMonthValue());
		System.out.println("Día: " + hoy.getDayOfWeek());
		System.out.println("Día del mes: " + hoy.getDayOfMonth());
		System.out.println("Hora: " + hoy.getHour());
		System.out.println("Minuto: " + hoy.getMinute());
		System.out.println("Segundo: " + hoy.getSecond());
		
		System.out.println("");//////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Cumple de Timy: " + cumple.plusWeeks(2));
		
		System.out.println("");//////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("El primer día del próximo mes es: " + 
			   LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());
		
		System.out.println("El último día de este mes: " +
			   LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));
		
		System.out.println("");//////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Mi edad es de: " +
			   ChronoUnit.YEARS.between(cumple, LocalDate.now()) + " años.");
		
		var hoyFecha = LocalDate.now();
		
		LocalDate finAnio = hoyFecha.with(TemporalAdjusters.lastDayOfYear());
		
		Period hastaFin = hoyFecha.until(finAnio);
		//Period hastaFin = Period.between(hoyFecha, finAnio);
		
		int meses =  hastaFin.getMonths();
		int dias = hastaFin.getDays();
		
		System.out.println("Tiempo restante hasta fin de año: " + dias + " días y " + meses + " meses.");
		
		System.out.println("");//////////////////////////////////////////////////////////////////////////////////////
		
		LocalDate fecha1 = LocalDate.parse("2020-07-06");
		LocalDate fecha2 = LocalDate.parse("06/11/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println(fecha1);
		System.out.println(fecha2);
		
		System.out.println("");//////////////////////////////////////////////////////////////////////////////////////
		
		LocalDateTime fechaHora1 = LocalDateTime.now();
		System.out.println("Formato por defecto: " + fechaHora1);
		System.out.println("Formato ISO 8601 (explícito) (solo fecha): " + fechaHora1.format(DateTimeFormatter.ISO_DATE));
		
		DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Formato español (manual): " + fechaHora1.format(esDateFormat));
		
		System.out.println("");//////////////////////////////////////////////////////////////////////////////////////
		
		LocalDateTime fechaHora2 = LocalDateTime.now();
		
		DateTimeFormatter esDateFormatLargo = 
			DateTimeFormatter
				   .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss")
				   .withLocale(new Locale("es", "ES"));
			
			System.out.println("Formato español (largo, localizado): " + fechaHora2.format(esDateFormatLargo));
			
		System.out.println("");//////////////////////////////////////////////////////////////////////////////////////
		
		LocalDateTime fechaHora3 = LocalDateTime.now();
		String idiomaLocal = System.getProperty("user.language");
		String paisLocal = System.getProperty("user.country");
		
		System.out.println("");//////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Formato actual del sistema (" + idiomaLocal + "-" + paisLocal + "): " +
			   fechaHora3.format(DateTimeFormatter
					 .ofLocalizedDateTime(FormatStyle.SHORT)
					 .withLocale(new Locale(idiomaLocal, paisLocal))));
		
		
		
	}
}

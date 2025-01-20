package ejerfechas2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class EjerFechas2 {

     public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          
         LocalDate hoy = LocalDate.now();
	    
	    System.out.print("Introduce fecha de nacimiento (día/mes/año): ");
	    
	    LocalDate nacimiento = LocalDate.parse(sc.nextLine(), 
			  DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    
	    
	    Period edad = nacimiento.until(hoy);
	    
	    System.out.println("Edad: " + edad.getYears() + " años");
	    
	    System.out.println("Nacido día de la semana: " + nacimiento.getDayOfWeek());
	    
	    
	    
	    LocalDate proxCumple = nacimiento.withYear(hoy.getYear());
	    System.out.println("PROX CUMPLE: " + proxCumple);
	    
	    if (proxCumple.isBefore(hoy) || proxCumple.isEqual(hoy)) {
		    proxCumple = proxCumple.plusYears(1);
	    }
	    
	    System.out.println("PROX CUMPLE: " + proxCumple);
	    
	    Period periodo = Period.between(hoy, proxCumple);
	    
	    long diasRestantes = ChronoUnit.DAYS.between(hoy, proxCumple);
	    
	    System.out.println("Próximo cumpleaños: " + diasRestantes);
     }
}

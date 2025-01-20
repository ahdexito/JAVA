package ejerfechas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import java.util.Scanner;

public class EjerFechas {

     public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          
          LocalDateTime fecha = LocalDateTime.of(1985, 05, 06, 20, 52, 05);
		
		
		
		DateTimeFormatter formato1 = DateTimeFormatter
			   .ofPattern("dd/MM/yyyy");
		
		System.out.println("Formato 1: " + fecha.format(formato1));
		
		//////////////////////
		
		var formato2 = DateTimeFormatter
			   .ofPattern("MM-dd-yyyy");
		
		System.out.println("Formato 2: " + fecha.format(formato2));
		
		////////////////////
		
		var formato3 = DateTimeFormatter
			   .ofPattern("yyyy/MM/dd");
		
		System.out.println("Formato 3: " + fecha.format(formato3));
		
		////////////////////
		
		var formato4 = DateTimeFormatter
			   .ofPattern("hh:mm:ss");
		
		System.out.println("Formato 4: " + fecha.format(formato4));
		
		/////////////////////
		
		var formato5 = DateTimeFormatter
			   .ofPattern("HH:mm:ss");
		
		System.out.println("Formato 5: " + fecha.format(formato5));
		
		/////////////////////
		
		var formato6 = DateTimeFormatter
			   .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy HH:mm:ss");
		
		System.out.println("Formato 6: " + fecha.format(formato6));
		
		///////////////////
		
		var formato7 = DateTimeFormatter
			   .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy HH:mm:ss")
			   .withLocale(new Locale("it", "IT"));
			   
		System.out.println("Formato 7: " + fecha.format(formato7) + " - ITALIANO");
		
		//////////////////
		
		var formato8 = DateTimeFormatter
			   .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy HH:mm:ss")
			   .withLocale(new Locale("fr", "FR"));
		
		System.out.println("Formato 8: " + fecha.format(formato8) + " - FRANCÉS");
		
     }

}

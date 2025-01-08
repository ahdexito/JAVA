package practica_loteria;

import java.util.Scanner;
import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class PRACTICA_Loteria {

     public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          
		int opcion;
		
          do {
			var hoy = LocalDate.now();
			
			System.out.println("La fecha actual es: " + MORADO + hoy + ", " + hoy.getDayOfWeek() + RESET + "\n");
			
			System.out.print(""
				   + AMARILLO + "$$$ LOTERÍAS Y APUESTAS DEL ESTADO $$$\n\n" + RESET
				   + VERDE +	 "    a) La Primitiva (1€)\n" + RESET
				   + ROJO +	 "    b) La Quiniela\n" + RESET
				   + CIAN +	 "    c) Lotería Nacional\n\n" + RESET
				   +			 "Selecciona una opcion: ");
			
			opcion = sc.nextInt();
			
			System.out.print("\n");
				   
			switch (opcion) {
				case 1:
					System.out.println(VERDE + "    ### LA PRIMITIVA ###" + RESET + "\n");
					
					LocalDate nextSorteo = hoy.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
					Period hastaNextSorteo = hoy.until(nextSorteo);
					int diasFaltan = hastaNextSorteo.getDays();
					
					// Imprimir el siguiente día del sorteo
					if (hoy == nextSorteo) System.out.println("El sorteo es " + MORADO + "HOY" + RESET);
					else System.out.println("El próximo sorteo será el día: " + MORADO + nextSorteo + RESET);
					
					// Imprimir días restantes para el siguiente sorteo
					System.out.println("Quedan " + MORADO + diasFaltan + RESET + " días hasta el siguiente sorteo.\n");
					
					
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					break; 
			}
			
		} while (opcion != 4);
     }
	
	public static void ApostarPrimitiva () {
		
		
	}
	
	// VARIABLES GLOBALES PARA DAR COLOR AL TEXTO DE SALIDA POR CONSOLA
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
	
}



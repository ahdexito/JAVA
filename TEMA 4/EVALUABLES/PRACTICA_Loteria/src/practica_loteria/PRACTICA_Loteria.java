package practica_loteria;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class PRACTICA_Loteria {
	public static Scanner sc = new Scanner (System.in);
	
     public static void main(String[] args) {
		
		int opcion;
		double gastoTotal = 0;
		
          do {
			LimpiarConsola();
						
			System.out.print(""
				   + AMARILLO + "$$$ LOTERÍAS Y APUESTAS DEL ESTADO $$$\n\n" + RESET
				   + VERDE + "    1) La Primitiva \n" + RESET
				   + ROJO + "    2) La Quiniela\n" + RESET
				   + CIAN + "    3) Lotería Nacional\n" + RESET
				   + MORADO + "    0) Terminar\n\n" + RESET
				   +			 "Selecciona una opcion: ");
			
			opcion = sc.nextInt();
			sc.nextLine();
			
			System.out.print("\n");
				   
			gastoTotal += EjecutarOpcionMenu(opcion);
			
		} while (opcion != 0);
		
		System.out.println("El total a pagar es de: " + MORADO + gastoTotal + "€" + RESET);
     }
	
	// EJECUTAR LA OPCIÓN SELECCIONADA DEL MENÚ
	public static double EjecutarOpcionMenu(int opcion) {
		
		var hoy = LocalDate.now();
		double gasto = 0;
		
		switch (opcion) {
				case 1:
					LimpiarConsola();
					InfoPrimitiva(hoy);
					ApostarPrimitiva();
					gasto = 1;
					break;
				case 2:
					gasto = 0.5;
					break;
				case 3:
					gasto = 12;
					break;
				case 0:
					System.out.print(MORADO + "\nOPERACIONES GUARDADAS." + RESET + "\n\nSALIR " + MORADO + "[ENTER]" + RESET);
					sc.nextLine();
					System.out.print("\n");
					break;
			}
		return gasto;
	}
	
	// MOSTRAR INFORMACIÓN DEL PRÓXIMO SORTEO DE LA PRIMITIVA
	public static void InfoPrimitiva (LocalDate hoy) {
		System.out.println(VERDE + "    ### LA PRIMITIVA ###" + RESET + "\n");
					
		// Variable fecha que almacena próximo jueves. Tiene en cuenta si jueves es hoy
		LocalDate nextSorteo = hoy.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));

		// Crear patrón de formato y en español
		DateTimeFormatter nextSorteoFormat =
			   DateTimeFormatter
				.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy")
				.withLocale(new Locale("es", "ES"));

		// Contar cuánto falta hasta la fecha, y guardar días restantes en un entero
		Period hastaNextSorteo = hoy.until(nextSorteo);
		int diasFaltan = hastaNextSorteo.getDays();

		// Imprimir el siguiente día del sorteo
		if (hoy == nextSorteo) System.out.println("El sorteo es " + MORADO + "HOY" + RESET);
		else System.out.println("El próximo sorteo será el día: " + MORADO + nextSorteo.format(nextSorteoFormat) + RESET);

		// Imprimir días restantes para el siguiente sorteo
		System.out.println("Quedan " + MORADO + diasFaltan + RESET + " días hasta el siguiente sorteo.\n");
	}
	
	// REALIZAR APUESTA DE LA PRIMITIVA
	public static void ApostarPrimitiva () {
		
		int[] numeros = new int[8];
				
		for (int i=0; i<numeros.length; i++) {
			RellenarArray(numeros, i);
		}
		
		System.out.print("\nApuesta: ");
		for (int i=0; i<6; i++) {
				System.out.print(MORADO + numeros[i] + "  " + RESET);
			}
		
		System.out.println("\nComplementario: " + MORADO + numeros[6] + RESET + "    Reintegro: " + MORADO + numeros[7] + RESET + "\n\n");
		
		System.out.print("CONTINUAR " + MORADO + "[ENTER]" + RESET);
		sc.nextLine();
	}
	
	// RELLENAR ARRAY DE NÚMEROS ALEATORIOS PARA PRIMITIVA
	public static int [] RellenarArray (int[] numeros, int i) {
		
		boolean repetido;
		
		do {
				repetido = false;
				
				int random49 = (int) (Math.random() * 49) + 1;
				int random9 = (int) (Math.random() * 10);
				
				// Verificar si el número ya está en el array
				for (int j=0; j<i; j++) {
					if (i < 6) {
						if (random49 == numeros[j]) {
							repetido = true;
							break;
						}
					}
					
					else {
						if (random9 == numeros[j]) {
							repetido = true;
							break;
						}
					}
				}

				if (!repetido) {
					if (i<6) numeros[i] = random49;
					else numeros[i] = random9;
				}
				
			// Repetir bucle hasta que no se genere un número repetido	
			} while (repetido);
		return numeros;
	}
	
	// LIMPIAR CONSOLA CON SALTOS DE LINEA
	public static void LimpiarConsola() {
		for (int i=0; i<50; i++){
			System.out.println("");
		}
	}
	
	// VARIABLES GLOBALES PARA DAR COLOR AL TEXTO DE SALIDA POR CONSOLA
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
	
}



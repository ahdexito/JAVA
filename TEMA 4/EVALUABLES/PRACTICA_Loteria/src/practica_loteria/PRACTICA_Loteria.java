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
		
		LocalDate hoy = LocalDate.now();
		LocalDate nextSorteo;
		double gasto = 0;
		String titulo;
		
		switch (opcion) {
				case 1:
					LimpiarConsola();
					titulo = VERDE + "    ### LA PRIMITIVA ###" + RESET;
					nextSorteo = hoy.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
					InfoNextSorteo(hoy, nextSorteo, titulo);
					ApostarPrimitiva();
					gasto = 1;
					break;
					
				case 2:
					LimpiarConsola();
					titulo = ROJO + "    ### LA QUINIELA ###" + RESET;
					nextSorteo = hoy.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
					InfoNextSorteo(hoy, nextSorteo, titulo);
					gasto = 0.5 * ApostarQuiniela();
					break;
					
				case 3:
					LimpiarConsola();
					titulo = CIAN + "    ### LOTERÍA NACIONAL ###" + RESET;
					nextSorteo = hoy.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
					InfoNextSorteo(hoy, nextSorteo, titulo);
					ApostarLoteria();
					gasto = 12;
					break;
					
				case 0:
					System.out.print(MORADO + "\nOPERACIONES GUARDADAS." + RESET + "\n\n    > SALIR " + MORADO + "[ENTER]" + RESET + " <");
					sc.nextLine();
					System.out.print("\n");
					break;
			}
		return gasto;
	}
	
	// MOSTRAR INFORMACIÓN DEL PRÓXIMO JUEGO
	public static void InfoNextSorteo (LocalDate hoy, LocalDate nextSorteo, String juego) {
					
		// Crear patrón de formato y en español
		DateTimeFormatter nextSorteoFormat =
			   DateTimeFormatter
				.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy")
				.withLocale(new Locale("es", "ES"));

		// Contar cuánto falta hasta la fecha, y guardar días restantes en un entero
		Period hastaNextSorteo = hoy.until(nextSorteo);
		int diasFaltan = hastaNextSorteo.getDays();
		
		System.out.println(juego + "\n");

		// Imprimir el siguiente día del sorteo
		if (hoy == nextSorteo) System.out.println("El sorteo es " + MORADO + "HOY" + RESET);
		else System.out.println("El próximo sorteo será el día: " + MORADO + nextSorteo.format(nextSorteoFormat) + RESET);

		// Imprimir días restantes para el siguiente sorteo, si no es hoy
		if (hoy != nextSorteo) System.out.println("Quedan " + MORADO + diasFaltan + RESET + " días hasta el siguiente sorteo.\n");
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
		
		System.out.print("  > CONTINUAR " + MORADO + "[ENTER]" + RESET + " <");
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
	
	// REALIZAR APUESTA DE LA QUINIELA
	public static int ApostarQuiniela () {
		
		int entrada;
		
		do {
			System.out.print("\n¿Cuántas apuestas quieres? " + MORADO + "(2 - 8)" + RESET + ": ");
			entrada = sc.nextInt();
			sc.nextLine();
			
			if (entrada < 2 || entrada > 8) System.out.println(ROJO + "Número de apuestas incorrecto.\n" + RESET);
			
		} while (entrada < 2 || entrada > 8);
		
		int[][] apuestas = new int[entrada][15];
		
		// Rellenar cada fila de la matriz con números aleatorios entre el 0 y el 2 incluidos
		for (int[] apuesta : apuestas) {
			for (int j = 0; j<apuestas[0].length; j++) {
				apuesta[j] = (int) (Math.random() * 3);
			}
		}
		
		System.out.print("\n\n");
		
		// Imprimir apuestas. En caso de ser 0, imprime X
		for (int i=0; i<apuestas.length; i++) {
			System.out.print("Apuesta " + CIAN + (i + 1) + RESET + ": ");
			
			for (int j=0; j<apuestas[0].length; j++) {
				if (apuestas[i][j] == 0) System.out.print(MORADO + "X " + RESET);
				else System.out.print(MORADO + apuestas[i][j] + " " + RESET);
			}
			System.out.print("\n");
		}
		
		System.out.print("\n\n  > CONTINUAR " + MORADO + "[ENTER]" + RESET + " <");
		sc.nextLine();
		
		return entrada;
	}
	
	// REALIZAR APUESTA DE LOTERÍA NACIONAL
	public static void ApostarLoteria () {
		
		// Generar número aleatorio y convertirlo en String
		int random = (int)(Math.random() * 10000);		
		String entrada, randomStr = String.valueOf(random);
				
		// Añadir ceros a la izquierda a la cadena de texto hasta que tenga 5 cifras
		if (randomStr.length() < 5) {
			do {				
				randomStr = '0' + randomStr;
			} while (randomStr.length() < 5);
		}
				
		boolean repetir;
		
		// Solicitar la terminación 
		do {
			repetir = true;
			
			System.out.println("\nSi quieres elegir la " + MORADO + "terminación" + RESET + ", escribe debajo (" + MORADO + "hasta 3 cifras" + RESET + ").");
			System.out.println("    > En caso contrario, pulsa " + MORADO + "[ENTER]" + RESET + " <");
			System.out.print("\nIntroduce número: ");
			entrada = sc.nextLine();
			
			// Recoger error de entrada que no sea número entero o salto de linea
			if (!"".equals(entrada)) {
				try {				
					Integer.parseInt(entrada);
					repetir = false;
				} 
				catch (NumberFormatException e) {
					LimpiarConsola();
					System.out.println(ROJO + "[ERROR DE ENTRADA]: Solo se permiten caracteres numéricos.\n" + RESET);
				}
			}
			else {
				repetir = false;
				System.out.println("    ");
			}
			
			if (entrada.length() > 3) {
				LimpiarConsola();
				System.out.println(ROJO + "[ERROR DE ENTRADA]: No se permiten más de 3 cifras.\n" + RESET);
			}
		} while (entrada.length() > 3 || repetir);	
		
		// Concatenar el número aleatorio con la terminación elegida, seleccionando la parte del aleatorio que no se ha elegido
		entrada = randomStr.substring(0, (5 - entrada.length())) + entrada;
		
		System.out.println("\n\nNÚMERO ELEGIDO: " + MORADO + entrada + RESET);
		System.out.print("\n\n  > CONTINUAR " + MORADO + "[ENTER]" + RESET + " <");
		sc.nextLine();
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



package ud4examen;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Ud4Examen {
    
    public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
    
	public static Scanner sc = new Scanner (System.in);
	
    public static void main(String[] args) {
		
		int opcion = 0;
		
		do {			
			ImprimirMenu();
			
			try {
				System.out.print("Introduce opción: ");
				opcion = sc.nextInt();
				
				if (opcion > 5 || opcion < 1) {
					System.out.println(ROJO + "ERROR: ENTRADA INCORRECTA." + RESET + "\n");
				}
			} 
				
			catch (Exception e) {
				System.out.println(ROJO + "ERROR: ENTRADA INCORRECTA." + RESET + "\n");
				sc.nextLine();
			}
			
			switch (opcion) {
				case 1:
					Opcion1();
					break;
				
				case 2:
					Opcion2();
					break;
					
				case 3:
					Opcion3();
					break;
					
				case 4:
					Opcion4();
					break;
					
				case 5:
					System.out.println("\n" + VERDE + "SALIENDO..." + RESET + "\n");
					break;
			}	
		} while (opcion != 5);
    }
	
	public static void ImprimirMenu () {
		System.out.println(""
				+ AMARILLO + "**********************************\n" + RESET
				+ MORADO + "1. " + RESET + "Rotar array\n"
				+ MORADO + "2. " + RESET + "Cálculo de fechas\n"
				+ MORADO + "3. " + RESET + "Suma Recursiva\n"
				+ MORADO + "4. " + RESET + "Juego Lotería\n"
				+ MORADO + "5. " + RESET + "Salir\n"
				+ AMARILLO + "**********************************\n" + RESET);
	}
	
	public static void Opcion1 () {
		
		int[] array = new int[5];
					
					// Solicitar números
					for (int i = 0; i < 5; i++) {
						System.out.print("\nIntroduce número " + MORADO + (i + 1) + RESET + ": ");
						array[i] = sc.nextInt();
					}
					
					array = RotarArray(array);
						
					System.out.println("\nArray rotado " + AMARILLO + "(**HACIA LA IZQUIERDA): " + MORADO + Arrays.toString(array) + "\n" + RESET);
	}
	
	public static void Opcion2 () {
		
		sc.nextLine();
					System.out.print("\nIntroduce tu fecha de nacimiento " + AMARILLO + "(dd/mm/aaaa)" + RESET + ": ");
					String entrada = sc.nextLine();
					
					// Parsear entrada del usuario
					LocalDate nacimiento = LocalDate.parse(entrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					
					CalculaFecha(nacimiento);
	}
	
	public static void Opcion3 () {
		
		int numero;
					// Repetir hasta que el número sea válido
					do {						
						try {
							System.out.print("\nIntroduce un número positivo " + AMARILLO + "(hasta 5 cifras)" + RESET + ": ");
							numero = sc.nextInt();
							
							if (ValidarNum(numero)) break;
							
							else System.out.println(ROJO + "ERROR: EL NÚMERO NO ES VÁLIDO" + RESET);
						}
						
						catch (Exception e) {
							System.out.println(ROJO + "ERROR: ENTRADA INCORRECTA." + RESET);
							sc.nextLine();
						}
						
					} while (true);
					
					SumaNumero(numero);
	}
	
	public static void Opcion4 () {
		
		int [] numeros = new int[5];
					
					// Solicitar los 5 números de array
					for (int i = 0; i < 5; i++) {
						
						// Repetir hasta que cada uno sea correcto
						do {
							
							// Recoger error por entrada no númerica
							try {
								System.out.print("\nIntroduce número " + MORADO + (i + 1) + RESET + ": ");
								numeros[i] = sc.nextInt();
								
								if (numeros[i] > 0 && numeros[i] < 21) {
									
									if (!ComprobarRepetidos(numeros)) break;
									
									// Recoger error por número repetido
									else System.out.println(ROJO + "ERROR: NÚMERO REPETIDO." + RESET);
								}
								
								// Recoger error por número fuera de rango
								else System.out.println(ROJO + "ERROR: ENTRADA INCORRECTA." + RESET);
							} 
							
							catch (Exception e) {
								System.out.println(ROJO + "ERROR: ENTRADA INCORRECTA." + RESET);
								sc.nextLine();
							}
							
						} while (true);
					}
					
					System.out.println("\n" + VERDE + "El número total de aciertos es: " + GeneraAleatorio(numeros) + RESET + "\n");
	}
	
	public static int [] RotarArray (int [] array) {
		
		// **TERMINÉ HACIÉNDOLO QUE ROTASE HACIA LA IZQUIERDA POR EL ERROR EN EL ENUNCIADO
		int [] arrayRotado = new int[array.length];
		
		// Del mínimo al máximo siempre será igual
		arrayRotado[array.length - 1] = array[0];
		
		// Asignar valores rotados del array original al nuevo array
		for (int i = 0; i < 4; i++) {
			
			arrayRotado[i] = array[i + 1];
		}
		
		// Devolver el array nuevo
		return arrayRotado;
	}
	
	public static void CalculaFecha (LocalDate fecha) {
		
		System.out.println("\nFecha introducida: " + MORADO + fecha + "\n" + RESET);
		
		// Restar 1 día
		System.out.println("La fecha del día anterior: " + MORADO + fecha.minusDays(1) + "\n" + RESET);
		
		// Sumar 1 día
		System.out.println("La fecha del día posterior: " + MORADO + fecha.plusDays(1) + "\n" + RESET);
		
		// Sumar 5 días
		System.out.println("La fecha 5 días después: " + MORADO + fecha.plusDays(5) + "\n" + RESET);
	}
	
	public static boolean ValidarNum (int numero) {
		
		// Verificar que esté dentro de rango
		if (numero < 0 || numero > 99999) return false;
		
		else return true;
	}
	
	public static void SumaNumero (int numero) {
		
		System.out.println("\nEl resultado de la suma es: " + MORADO + Suma(numero) + RESET + "\n");
	}
	
	public static int Suma (int numero) {
		
		if (numero <= 0) return 0;
		
		// Llegar hasta 0, y en la vuelta sumar el número que esté a la izquierda
		else return (numero % 10) + (Suma(numero / 10));
	}
	
	public static boolean ComprobarRepetidos (int [] numeros) {
		
		boolean repe = false;
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if (numeros[i] != 0 && numeros[i] == numeros[j] && i != j) repe = true;
			}
		}
		
		return repe;
	}
	
	public static int GeneraAleatorio (int [] numeros) {
		
		int [] aleatorios = new int[5];
		
		// Generar array de números aleatorios
		do {
			for (int i = 0; i < 5; i++) {

				aleatorios[i] = (int)(Math.random() * (20 - 1 - 1) + 1);
			}
			
		} while (ComprobarRepetidos(aleatorios));
		
		System.out.println("\nNúmeros introducido: " + MORADO + Arrays.toString(numeros) + RESET);
		
		System.out.println("\nNúmeros aleatorio: " + MORADO + Arrays.toString(aleatorios) + RESET + "\n");
		
		
		int aciertos = 0;
		
		// Contar aciertos indistintamente de la posición en el array
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if (numeros[i] == aleatorios[j]) aciertos++;
			}
		}
		
		return aciertos;
	}
}
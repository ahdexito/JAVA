package practica_hundirflota;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICA_HundirFlota {
	
	public static Scanner sc = new Scanner (System.in);
	
	// VARIABLES GLOBALES
	public static char letras = 'A', vacio = '-', tocado = 'X', agua = 'A',
		lancha = 'L', buque = 'B', acorazado = 'Z', portaavion = 'P';
	
	// FUNCIÓN MAIN
    public static void main(String[] args) {
		
		int intentos, filas, columnas, lanchas, buques, acorazados, portaaviones;
				
		switch (MenuModoJuego()) {

		case 1:
			intentos = 50; filas = 10; columnas = 10; 
				lanchas = 5; buques = 3; acorazados = 1; portaaviones = 1;

			JugarPartida(intentos, filas, columnas, lanchas, buques, acorazados, portaaviones);
			break;

		case 2:
			intentos = 30; filas = 10; columnas = 10;
				lanchas = 2; buques = 1; acorazados = 1; portaaviones = 1;

			JugarPartida(intentos, filas, columnas, lanchas, buques, acorazados, portaaviones);
			break;

		case 3:
			intentos = 10; filas = 10; columnas = 10;
				lanchas = 1; buques = 1; acorazados = 0; portaaviones = 0;

			JugarPartida(intentos, filas, columnas, lanchas, buques, acorazados, portaaviones);
			break;

		case 4:
			int[] valores = Personalizada();

			JugarPartida(valores[0], valores[1], valores[2],
				valores[3], valores[4], valores[5], valores[6]);
			break;
		}
    }
	
	// SOLICITAR VALORES DE PARTIDA PERSONALIZADA
	public static int[] Personalizada () {
		
		System.out.print("Introduce cantidad de intentos: ");
		int intentos = sc.nextInt();
				
		System.out.print("Introduce cantidad de filas: ");
		int filas = sc.nextInt();

		System.out.print("Introduce cantidad de columnas: ");
		int columnas = sc.nextInt();

		System.out.print("Introduce cantidad de lanchas: ");
		int lanchas = sc.nextInt();
		
		System.out.print("Introduce cantidad de buques: ");
		int buques = sc.nextInt();
		
		System.out.print("Introduce cantidad de acorazados: ");
		int acorazados = sc.nextInt();
		
		System.out.print("Introduce cantidad de portaaviones: ");
		int portaaviones = sc.nextInt();
		
		sc.nextLine();
		System.out.print("\n");
		
		int[] valores = {intentos, filas, columnas, lanchas, buques, acorazados, portaaviones};
		
		return valores;
	}
	
	public static int MenuModoJuego () {
		
		int opcion;
		
		do {
			System.out.print(""
				+ "            HUNDIR LA FLOTA\n"
				+ "========================================\n"
				+ "1. Fácil\n"
				+ "2. Medio\n"
				+ "3. Difícil\n"
				+ "4. Personalizado\n\n"
				+ "Elegir dificultad: ");
			
			try {
				opcion = sc.nextInt();
				sc.nextLine();
				
				if (opcion > 0 && opcion < 5) {
					System.out.print("\n");
					return opcion;
				}
					
				
				else {
					System.out.println("\nOPCIÓN NO VÁLIDA.\n");
				}
			} 
			
			catch (Exception e) {
				System.out.println("\nERROR DE ENTRADA.\n");
				sc.nextLine();
			}
		} while (true);
	}
	
	// JUGAR PARTIDA
	public static void JugarPartida (int intentos, int filas, int columnas, int lanchas, int buques, int acorazados, int portaaviones) {
		
		char[][] tableroUsuario = CrearTablero(filas, columnas);
		char[][] tableroMaquina = CrearTablero(filas, columnas);
		
		InsertarBarcos(tableroMaquina, lanchas, buques, acorazados, portaaviones, filas, columnas);
		
		int[] coordenadas;
		int flota = lanchas + (buques * 3) + (acorazados * 4) + (portaaviones * 5);
		
		do {
			ImprimirTablero(tableroUsuario, filas, columnas);
			System.out.print("\n");
			ImprimirTablero(tableroMaquina, filas, columnas);
			
			coordenadas = SolicitarDisparo(filas);
			
			int[] intentos_flota = RestarIntentos_Flota
				(VerificarDisparo(coordenadas, tableroUsuario, tableroMaquina),
					intentos, flota);
			
			
			
			intentos = intentos_flota[0]; flota = intentos_flota[1];
			
		} while (intentos > 0);	
	}
	
	// CREAR Y RELLENAR EL TABLERO DE "AGUA" -> " - "
	public static char[][] CrearTablero (int filas, int columnas) {
		
		char[][] tablero = new char[filas][columnas];
		
		for (int i=0; i<tablero.length; i++) {
			Arrays.fill(tablero[i], vacio);
		}
		return tablero;
	}
	
	// IMPRIMIR FLOTA HUNDIDA
	public static void ImprimirHundidos (char[][] tableroUsuario, char[][] tableroMaquina) {
		
		
	}
	
	// RESTAR INTENTOS Y/O CANTIDAD DE BARCOS
	public static int[] RestarIntentos_Flota (int tirada, int intentos, int flota) {
				
		switch (tirada) {
			case 1 -> {
				flota--;
				intentos--;
			}
			case 2 -> intentos--;
			default -> System.out.println("\nYa has disparado en esa posición.");
		}
			
		System.out.println("\nIntentos restantes: " + intentos);
		System.out.println("Flota restante: " + flota + "\n");
		
		int[] intentos_flota = {intentos, flota};

		return intentos_flota;
	}
	
	// INSERTAR TODOS LOS BARCOS
	public static void InsertarBarcos (char[][] tablero, int lanchas, int buques, int acorazados, int portaaviones, int filas, int columnas) {
		
		for (int i=0; i<lanchas; i++) {
			GenerarLancha(tablero, filas, columnas);
		}
		
		for (int i=0; i<buques; i++) {
			GenerarBuque(tablero, filas, columnas);
		}
		
		for (int i=0; i<acorazados; i++) {
			GenerarAcorazado(tablero, filas, columnas);
		}
		
		for (int i=0; i<portaaviones; i++) {
			GenerarPortaaviones(tablero, filas, columnas);
		}
	}
	
	// GENERAR Y COLOCAR LANCHA
	public static char[][] GenerarLancha (char[][] tablero, int filas, int columnas) {
		
		boolean repetir = true;
		
		do {	
			int randomFilas = (int)(Math.random() * filas);
			int randomColumnas = (int)(Math.random() * columnas);
			
			if (tablero[randomFilas][randomColumnas] == vacio) {
				
				tablero[randomFilas][randomColumnas] = lancha;
				repetir = false;
			}
		} while (repetir);
		
		return tablero;
	}
	
	// GENERAR Y COLOCAR BUQUE
	public static char[][] GenerarBuque (char[][] tablero, int filas, int columnas) {
		
		boolean coincide;
		int randomFilas;
		int randomColumnas;
		
		do {
			coincide = false;
			randomFilas = (int)(Math.random() * filas);
			randomColumnas = (int)(Math.random() * (columnas - 2));
			
			for (int i=0; i<3; i++) {
				if (tablero[randomFilas][randomColumnas + i] != vacio)
					coincide = true;
			}
		} while (coincide);
		
		for (int i=0; i<3; i++) {
			tablero[randomFilas][randomColumnas + i] = buque;
		}
		return tablero;
	}
	
	// GENERAR Y COLOCAR ACORAZADO
	public static char[][] GenerarAcorazado (char[][] tablero, int filas, int columnas) {
		
		boolean coincide;
		int randomFilas;
		int filasColumnas;
		
		do {
			coincide = false;
			randomFilas = (int)(Math.random() * filas);
			filasColumnas = (int)(Math.random() * (columnas - 3));
			
			for (int i=0; i<4; i++) {
				if (tablero[randomFilas][filasColumnas + i] != vacio)
					coincide = true;
			}
		} while (coincide);
		
		for (int i=0; i<4; i++) {
			tablero[randomFilas][filasColumnas + i] = acorazado;
		}
		return tablero;
	}
	
	// GENERAR Y COLOCAR PORTAAVIONES
	public static char[][] GenerarPortaaviones (char[][] tablero, int filas, int columnas) {
		
		boolean coincide;
		int randomFilas;
		int randomColumnas;
		
		do {
			coincide = false;
			randomFilas = (int)(Math.random() * (filas - 4));
			randomColumnas = (int)(Math.random() * columnas);
			
			for (int i=0; i<5; i++) {
				if (tablero[randomFilas + i][randomColumnas] != vacio)
					coincide = true;
			}
		} while (coincide);
		
		for (int i=0; i<5; i++) {
			tablero[randomFilas + i][randomColumnas] = portaavion;
		}
		return tablero;
	}
	
	// IMPRIMIR TABLERO
	public static void ImprimirTablero(char[][] tablero, int filas, int columnas) {
				
		// Imprimir posiciones numéricas
		System.out.print("   ");
		for (int i=0; i<columnas; i++) {
			if (i > 9) System.out.print(i + " ");
			else System.out.print(i + "  ");
		}
		System.out.print("\n");
		
		for (int i=0; i<filas; i++) {
			
			// Imprimir posiciones alfabéticas
			System.out.print((char)(letras + i) + "  ");
			
			// Imprimir mapa
			for (int j=0; j<columnas; j++) {
				System.out.print(tablero[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
	
	// SOLICITAR DISPARO
	public static int[] SolicitarDisparo (int filas) {
		
		boolean repetir;
		String disparo;
		int[] entrada = new int [2];
		
		do {
			repetir = true;
			try {
				do {	
					System.out.print("\nElige coordenada para disparar: ");
					disparo = sc.nextLine();

					if (disparo.length() == 3) {
						repetir = false;
						
						if (filas < (int)disparo.toUpperCase().charAt(0) - (int)letras) {
							System.out.println("\nERROR DE ENTRADA.");
							repetir = true;
						}
					}
					else {
						repetir = true;
						System.out.println("\nERROR DE ENTRADA.");
					}
				} while (repetir);
				
				// Devolver entrada como array de enteros
				entrada = FilaStringToInt(disparo);
			} 

			catch (Exception e) {
				System.out.println("\nERROR DE ENTRADA.");
				repetir = true;
			}
			
		} while (repetir);
		
		return entrada;
	}
	
	// TRANSFORMAR STRING A INT
	public static int[] FilaStringToInt (String cadena) {
		
		int[] salida = new int[2];
		
		// Separar el String
		String[] coorDisparo = cadena.split(" ");

		// Convertir la letra en mayúscula para evitar error
		coorDisparo[0] = coorDisparo[0].toUpperCase();

		// Convertir la entrada a tipo int
		int coordX = (int)(coorDisparo[0].charAt(0) - letras);
		int coordY = Integer.parseInt(coorDisparo[1]);

		salida[0] = coordX; salida[1] = coordY;
		
		return salida;
	}
	
	// COMPROBAR SI SE HA ACERTADO EL DISPARO
	public static int VerificarDisparo (int[] coord, char[][] tableroUsuario, char[][] tableroMaquina) {
		
		int x = coord[0], y = coord[1];
		
		if (tableroUsuario[x][y] != vacio)
			return 0;
		
		else {
			
			if (tableroMaquina[x][y] != vacio) {
				
				System.out.println("\n¡Tocado!");
				tableroUsuario[x][y] = tocado;
				return 1;
			}
			
			else {
				System.out.println("\n¡Agua!");
				tableroUsuario[x][y] = agua;
				return 2;
			}
		}
	}
}
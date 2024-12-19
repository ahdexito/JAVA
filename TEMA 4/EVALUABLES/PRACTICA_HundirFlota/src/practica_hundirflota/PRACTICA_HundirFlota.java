package practica_hundirflota;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICA_HundirFlota {
	
	public static Scanner sc = new Scanner (System.in);
	
	// VARIABLES GLOBALES
	public static char letras = 'A', vacio = '~', tocado = 'X', agua = 'O',
		lancha = 'L', buque = 'B', acorazado = 'Z', portaavion = 'P';
	
	// FUNCIÓN MAIN
    public static void main(String[] args) {
		
		int intentos, filas, columnas, lanchas, buques, acorazados, portaaviones;
				
		switch (MenuModoJuego()) {
		
		// Generar partida fácil
		case 1:
			intentos = 50; filas = 10; columnas = 10; 
				lanchas = 5; buques = 3; acorazados = 1; portaaviones = 1;

			JugarPartida(intentos, filas, columnas, lanchas, buques, acorazados, portaaviones);
			break;
			
		// General partida medio
		case 2:
			intentos = 30; filas = 10; columnas = 10;
				lanchas = 2; buques = 1; acorazados = 1; portaaviones = 1;

			JugarPartida(intentos, filas, columnas, lanchas, buques, acorazados, portaaviones);
			break;
		
		// Generar partida difícil
		case 3:
			intentos = 10; filas = 10; columnas = 10;
				lanchas = 1; buques = 1; acorazados = 0; portaaviones = 0;

			JugarPartida(intentos, filas, columnas, lanchas, buques, acorazados, portaaviones);
			break;
			
		// Generar partida personalizada
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
				+ "   1. Fácil\n"
				+ "   2. Medio\n"
				+ "   3. Difícil\n"
				+ "   4. Personalizado\n\n"
				+ "Elegir dificultad: ");
			
			// Recoger errores de entrada para la entrada de opción
			try {
				opcion = sc.nextInt();
				sc.nextLine();
				
				// Error por número fuera de rango
				if (opcion > 0 && opcion < 5) {
					System.out.print("\n");
					return opcion;
				}
				
				else {
					System.out.println("\nERROR DE ENTRADA. LA OPCIÓN DEBE SER -> 1, 2, 3 o 4\n");
				}
			} 
			
			// Error por entrada no numérica
			catch (Exception e) {
				System.out.println("\nERROR DE ENTRADA. LA OPCIÓN DEBE SER -> 1, 2, 3 o 4\n");
				sc.nextLine();
			}
		} while (true);
	}
	
	// JUGAR PARTIDA
	public static void JugarPartida (int intentos, int filas, int columnas, int lanchas, int buques, int acorazados, int portaaviones) {
		
		char[][] tableroUsuario = CrearTablero(filas, columnas);
		char[][] tableroMaquina = CrearTablero(filas, columnas);
		int totalIntentos = intentos;
		
		// Insertar barcos en el tablero, y recoger array de int con la cantidad de no generados
		int[] noGenerados = InsertarBarcos(tableroMaquina, lanchas, buques, acorazados, portaaviones, filas, columnas);
		
		// Restar cantidad de barcos iniciales con los no generados
		lanchas -= noGenerados[0]; buques -= noGenerados[1]; acorazados -= noGenerados[2]; portaaviones -= noGenerados[3];
		
		// Sumar cantidad de disparos por acertar
		int flota = (lanchas + (buques * 3) + (acorazados * 4) + (portaaviones * 5));
		
		MensajeBarcosRestantes(intentos, flota, lanchas, buques, acorazados, portaaviones);
		
		do {
			ImprimirTablero(tableroUsuario, filas, columnas);
			System.out.print("\n");
			
///////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////// ¡IMPORTANTE! //////////////////////////////////////////////////////////////
//////////////// DEBAJO IMPRIMIR TABLERO_MÁQUINA PARA PRUEBAS /////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
			ImprimirTablero(tableroMaquina, filas, columnas);
			
			int[] coordenadas = SolicitarDisparo(filas, columnas);
			
			int[] intentos_flota = RestarIntentos_Flota
				(VerificarDisparo(coordenadas, tableroUsuario, tableroMaquina),
					intentos, flota);
			
			intentos = intentos_flota[0]; flota = intentos_flota[1];
			
		} while (intentos > 0 && flota > 0);
		
		ResultadoPartida(tableroUsuario, tableroMaquina, intentos, totalIntentos, flota, filas, columnas);
	}
	
	// IMPRIMIR MENSAJE DE BARCOS A ACERTAR
	public static void MensajeBarcosRestantes (int intentos, int flota, int lanchas, int buques, int acorazados, int portaaviones) {
		
		System.out.println("Tienes " + intentos + " intentos para acertar:");
		if (lanchas > 0) System.out.println("   - " + lanchas + " lanchas.");
		if (buques > 0) System.out.println("   - " + buques + " buques.");
		if (acorazados > 0) System.out.println("   - " + acorazados + " acorazados.");
		if (portaaviones > 0) System.out.println("   - " + portaaviones + " portaaviones.");
		System.out.println("\nEn total debes acertar " + flota + " veces.\n");
	}
	
	// RESULTADO DE GANAR O PERDER PARTIDA
	public static void ResultadoPartida (char[][] tableroUsuario, char[][] tableroMaquina, int intentos, int totalIntentos, int flota, int filas, int columnas) {
		
		if (flota == 0) {
			System.out.println("¡VICTORIA!");
			System.out.println("Has hundido la flota en " + (totalIntentos - intentos) + " intentos.");
		}
		
		else {
			ImprimirTablero(tableroUsuario, filas, columnas);
			System.out.println("\nDERROTA...");
			System.out.println("Has agotado el número de intentos.\n");
			
			ImprimirTablero(tableroMaquina, filas, columnas);
		}
	}
	
	// CREAR Y RELLENAR EL TABLERO DE "AGUA"
	public static char[][] CrearTablero (int filas, int columnas) {
		
		char[][] tablero = new char[filas][columnas];
		
		for (int i=0; i<tablero.length; i++) {
			Arrays.fill(tablero[i], vacio);
		}
		return tablero;
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
	public static int[] InsertarBarcos (char[][] tablero, int lanchas, int buques, int acorazados, int portaaviones, int filas, int columnas) {
		
		// Contadores de cada tipo para saber los que no se generan por falta de espacio
		int contLanchas = lanchas, contBuques = buques, contAcorazados = acorazados, contPortaaviones = portaaviones;
		
		for (int i=0; i<lanchas; i++) {
			if (ComprobarEspacioLibre(tablero, filas, columnas, 1, false)) {
				GenerarLancha(tablero, filas, columnas);
				contLanchas--;
			}
			else break;
		}
		
		for (int i=0; i<buques; i++) {
			if (ComprobarEspacioLibre(tablero, filas, columnas, 3, false)) {
				GenerarBuque(tablero, filas, columnas);
				contBuques--;
			}
			else break;
		}
		
		for (int i=0; i<acorazados; i++) {
			if (ComprobarEspacioLibre(tablero, filas, columnas, 4, false)) {
				GenerarAcorazado(tablero, filas, columnas);
				contAcorazados--;
			}
			else break;
		}
		
		for (int i=0; i<portaaviones; i++) {
			if (ComprobarEspacioLibre(tablero, filas, columnas, 5, true)) {
				GenerarPortaaviones(tablero, filas, columnas);
				contPortaaviones--;
			}
			else break;
		}
		
		// Imprimir por pantalla los que no se han generado
		if (contLanchas > 0 || contBuques > 0 || contAcorazados > 0 || contPortaaviones > 0) {
			System.out.println("No se han podido generar: ");
			if (contLanchas > 0) System.out.println("   - " + contLanchas + " lanchas.");
			if (contBuques > 0) System.out.println("   - " + contBuques + " buques.");
			if (contAcorazados > 0) System.out.println("   - " + contAcorazados + " acorazados.");
			if (contPortaaviones > 0) System.out.println("   - " + contPortaaviones + " portaaviones.");
			System.out.print("\n");
		}
		int[] noGenerados = {contLanchas, contBuques, contAcorazados, contPortaaviones};
		return noGenerados;
	}
	
	// GENERAR Y COLOCAR LANCHA
	public static char[][] GenerarLancha (char[][] tablero, int filas, int columnas) {
		
		boolean colocada = false;
		int intentos = 100;
		
		do {	
			int randomFilas = (int)(Math.random() * filas);
			int randomColumnas = (int)(Math.random() * columnas);
			
			if (tablero[randomFilas][randomColumnas] == vacio) {
				
				tablero[randomFilas][randomColumnas] = lancha;
				colocada = true;
			}
			intentos--;
			
		} while (!colocada && intentos > 0);
		
		return tablero;
	}
	
	// GENERAR Y COLOCAR BUQUE
	public static char[][] GenerarBuque (char[][] tablero, int filas, int columnas) {
		
		boolean coincide;
		int intentos = 100;
		
		do {
			coincide = false;
			int randomFilas = (int)(Math.random() * filas);
			int randomColumnas = (int)(Math.random() * (columnas - 2));
			
			// Verificar que no se superponga el barco a colocar con otro
			for (int i=0; i<3; i++) {
				if (tablero[randomFilas][randomColumnas + i] != vacio) {
					coincide = true;
					break;
				}	
			}
			
			// Colocar el barco
			if (!coincide) {
				for (int i=0; i<3; i++) {
				tablero[randomFilas][randomColumnas + i] = buque;
				}
				return tablero;
			}
			intentos--;
			
		} while (coincide && intentos > 0);
		
		return tablero;
	}
	
	// GENERAR Y COLOCAR ACORAZADO
	public static char[][] GenerarAcorazado (char[][] tablero, int filas, int columnas) {
		
		boolean coincide;
		int intentos = 100;
		
		do {
			coincide = false;
			int randomFilas = (int)(Math.random() * filas);
			int filasColumnas = (int)(Math.random() * (columnas - 3));
			
			// Verificar que no se superponga el barco a colocar con otro
			for (int i=0; i<4; i++) {
				if (tablero[randomFilas][filasColumnas + i] != vacio) {
					coincide = true;
					break;
				}	
			}
			
			// Colocar el barco
			if (!coincide) {
				for (int i=0; i<4; i++) {
					tablero[randomFilas][filasColumnas + i] = acorazado;
				}
				return tablero;
			}
			intentos--;
			
		} while (coincide && intentos > 0);
		
		return tablero;
	}
	
	// GENERAR Y COLOCAR PORTAAVIONES
	public static char[][] GenerarPortaaviones (char[][] tablero, int filas, int columnas) {
		
		boolean coincide;
		int intentos = 100;
		
		do {
			coincide = false;
			int randomFilas = (int)(Math.random() * (filas - 4));
			int randomColumnas = (int)(Math.random() * columnas);
			
			// Verificar que no se superponga el barco a colocar con otro
			for (int i=0; i<5; i++) {
				if (tablero[randomFilas + i][randomColumnas] != vacio) {
					coincide = true;
					break;
				}
			}
			
			// Colocar el barco
			if (!coincide) {
				for (int i=0; i<5; i++) {
					tablero[randomFilas + i][randomColumnas] = portaavion;
				}
				return tablero;
			}
			intentos--;
			
		} while (coincide & intentos > 0);
		
		return tablero;
	}
	
	// COMPROBAR QUE SE PUEDA INSERTAR BARCO EN EL TABLERO
	public static boolean ComprobarEspacioLibre (char[][] tablero, int filas, int columnas, int barco, boolean esPortaaviones) {
		
		if (esPortaaviones) {
			for (int i=0; i<filas; i++) {			
				for (int j=0; j<columnas; j++) {				
					for (int k=0; k<barco; k++) {
						if (i + barco <= filas && EspacioDisponible(tablero, i, j, barco, true)) {
							return true;
						}	
					}
				}
			}
		}
		
		else {
			for (int i=0; i<filas; i++) {
				for (int j=0; j<columnas; j++) {
					if (j + barco <= columnas && EspacioDisponible(tablero, i, j, barco, false)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	// COMPROBAR QUE HAYA ESPACIO LIBRE PARA EL BARCO
	public static boolean EspacioDisponible(char[][] tablero, int fila, int columna, int barco, boolean vertical) {
		
		for (int i=0; i<barco; i++) {
			if (!vertical && (columna + i >= tablero[0].length || tablero[fila][columna + i] != vacio)) {
				return false;
			}
			
			if (vertical && (fila + i >= tablero.length || tablero[fila + i][columna] != vacio)) {
			return false;
			}
		}
		return true;
	}
	
	// IMPRIMIR TABLERO
	public static void ImprimirTablero(char[][] tablero, int filas, int columnas) {
				
		// Imprimir posiciones numéricas
		System.out.print("     ");
		for (int i=0; i<columnas; i++) {
			if (i > 9) System.out.print(i + " ");
			else System.out.print(i + "  ");
		}
		System.out.print("\n    ");
		
		// Imprimir guiones
		for (int i=0; i<columnas; i++) {
			System.out.print("---");
		}
		System.out.print("\n");
		
		for (int i=0; i<filas; i++) {
			
			// Imprimir posiciones alfabéticas y barras laterales
			System.out.print((char)(letras + i) + " |  ");
			
			// Imprimir mapa
			for (int j=0; j<columnas; j++) {
				System.out.print(tablero[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
	
	// SOLICITAR DISPARO
	public static int[] SolicitarDisparo (int filas, int columnas) {
		
		boolean repetir;
		String disparo;
		int[] entrada = new int [2];
		
		do {
			repetir = true;
			try {
				do {	
					System.out.print("\nElige coordenada para disparar: ");
					disparo = sc.nextLine();
					
					// Verificar que la entrada esté compuesta de solo 3 carácteres
					if (disparo.length() == 3) {
						repetir = false;
						
						int filaCoord = (int)disparo.toUpperCase().charAt(0) - (int)letras;
						int columnaCoord = Integer.parseInt(disparo.substring(2));

						// Verificar si las coordenadas están dentro del tablero
						if (filaCoord < 0 || filaCoord >= filas || columnaCoord < 0 || columnaCoord >= columnas) {
							System.out.println("\nERROR DE ENTRADA. EL FORMATO DEBE SER -> A 9");
							repetir = true;
						}
					}
					// Repetir en caso de no ser 3 carácteres
					else {
						repetir = true;
						System.out.println("\nERROR DE ENTRADA. EL FORMATO DEBER SER -> A 9");
					}
				} while (repetir);
				
				// Devolver entrada como array de enteros
				entrada = FilaStringToInt(disparo);
			} 
			// Repetir en caso de introducir una carácter en lugar de un número
			catch (Exception e) {
				System.out.println("\nERROR DE ENTRADA. EL FORMATO DEBE SER -> A 9");
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

		salida[0] = coordX; 
		salida[1] = coordY;
		
		return salida;
	}
	
	// COMPROBAR SI SE HA ACERTADO EL DISPARO
	public static int VerificarDisparo (int[] coord, char[][] tableroUsuario, char[][] tableroMaquina) {
		
		int x = coord[0], y = coord[1];
		
		// Si ya se había disparado en la misma posición
		if (tableroUsuario[x][y] != vacio)
			return 0;
		
		else {
			// Si no se había disparado y hay barco
			if (tableroMaquina[x][y] != vacio) {
				
				System.out.println("\n¡TOCADO!");
				tableroUsuario[x][y] = tocado;
				return 1;
			}
			// Si no se había disparado y hay agua
			else {
				System.out.println("\n¡AGUA!");
				tableroUsuario[x][y] = agua;
				return 2;
			}
		}
	}
}
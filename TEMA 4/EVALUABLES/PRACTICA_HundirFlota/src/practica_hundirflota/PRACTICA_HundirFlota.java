package practica_hundirflota;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICA_HundirFlota {
	
	public static Scanner sc = new Scanner (System.in);
	
	public static char letras = 'A', vacio = '-', tocado = 'X', agua = 'A',
		lancha = 'L', buque = 'B', acorazado = 'Z', portaavion = 'P';

    public static void main(String[] args) {
		
		int opcion = MenuModoJuego();
		int intentos, filas, columnas, lanchas, buques, acorazados, portaaviones;
		
		switch (opcion) {

			case 1:
				intentos = 50; filas = 10; columnas = 10; 
				lanchas = 5; buques = 3; acorazados = 1; portaaviones = 1;
				
				JugarPartida(intentos, filas, columnas, lanchas, buques, acorazados, portaaviones);
			break;

//			case 2: GenerarTableroMedio();
//			break;
//			
//			case 3: GenerarTableroDificil();
//			break;
//			
//			case 4: GenerarTableroCustom();
//			break;
//			
//			case 5: salir = true;
//			break;
			default:
				System.out.println("Opción no válida. Introduce de nuevo");
				break;
		}
    }
	
	public static int MenuModoJuego () {
		
		System.out.print(""
				+ "            HUNDIR LA FLOTA\n"
				+ "========================================\n"
				+ "1. Fácil\n"
				+ "2. Medio\n"
				+ "3. Difícil\n"
				+ "4. Personalizado\n"
				+ "5. Salir\n\n"
				+ "Elegir dificultad: \n");
		
		//int opcion = sc.nextInt();
		
		return 1;
	}
	
	// FUNCIÓN QUE CREA Y RELLENA EL TABLERO DE "AGUA" -> " - "
	public static char[][] CrearTablero (int filas, int columnas) {
		
		char[][] tablero = new char[filas][columnas];
		
		for (int i=0; i<tablero.length; i++) {
			Arrays.fill(tablero[i], vacio);
		}
		return tablero;
	}
	
	// FUNCIÓN PARA JUGAR PARTIDA
	public static void JugarPartida (int intentos, int filas, int columnas, int lanchas, int buques, int acorazados, int portaaviones) {
		
		char[][] tableroUsuario = CrearTablero(filas, columnas);
		char[][] tableroMaquina = CrearTablero(filas, columnas);
		
		InsertarBarcos(tableroMaquina, lanchas, buques, acorazados, portaaviones, filas, columnas);
		
		int[] coordenadas;
		int flota = lanchas + buques + acorazados + portaaviones;
		
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
	
	// FUNCIÓN QUE RESTA INTENTOS Y/O CANTIDAD DE BARCOS
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
	
	// FUNCIÓN QUE INSERTA TODOS LOS BARCOS
	public static void InsertarBarcos (char[][] tablero, int lanchas, int buques, int acorazados, int portaaviones, int filas, int columnas) {
		
		for (int i=0; i<lanchas; i++) {
			GenerarLancha(tablero);
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
	
	// FUNCIÓN QUE GENERA Y COLOCA LANCHA
	public static char[][] GenerarLancha (char[][] tablero) {
		
		boolean repetir = true;
		
		do {	
			int aleatorioX = (int)(Math.random() * tablero[0].length);
			int aleatorioY = (int)(Math.random() * tablero.length);
			
			if (tablero[aleatorioX][aleatorioY] == vacio) {
				
				tablero[aleatorioX][aleatorioY] = lancha;
				repetir = false;
			}
		} while (repetir);
		
		return tablero;
	}
	
	// FUNCIÓN QUE GENERA Y COLOCA BUQUE
	public static char[][] GenerarBuque (char[][] tablero, int filas, int columnas) {
		
		boolean coincide;
		int aleatorioX;
		int aleatorioY;
		
		do {
			coincide = false;
			aleatorioX = (int)(Math.random() * filas);
			aleatorioY = (int)(Math.random() * (columnas - 2));
			
			for (int i=0; i<3; i++) {
				if (tablero[aleatorioX][aleatorioY + i] != vacio)
					coincide = true;
			}
		} while (coincide);
		
		for (int i=0; i<3; i++) {
			tablero[aleatorioX][aleatorioY + i] = buque;
		}
		return tablero;
	}
	
	// FUNCIÓN QUE GENERA Y COLOCA ACORAZADO
	public static char[][] GenerarAcorazado (char[][] tablero, int filas, int columnas) {
		
		boolean coincide;
		int aleatorioX;
		int aleatorioY;
		
		do {
			coincide = false;
			aleatorioX = (int)(Math.random() * filas);
			aleatorioY = (int)(Math.random() * (columnas - 3));
			
			for (int i=0; i<4; i++) {
				if (tablero[aleatorioX][aleatorioY + i] != vacio)
					coincide = true;
			}
		} while (coincide);
		
		for (int i=0; i<4; i++) {
			tablero[aleatorioX][aleatorioY + i] = acorazado;
		}
		return tablero;
	}
	
	// FUNCIÓN QUE GENERA Y COLOCA PORTAAVIONES
	public static char[][] GenerarPortaaviones (char[][] tablero, int filas, int columnas) {
		
		boolean coincide;
		int aleatorioX;
		int aleatorioY;
		
		do {
			coincide = false;
			aleatorioX = (int)(Math.random() * (filas - 4));
			aleatorioY = (int)(Math.random() * columnas);
			
			for (int i=0; i<5; i++) {
				if (tablero[aleatorioX + i][aleatorioY] != vacio)
					coincide = true;
			}
		} while (coincide);
		
		for (int i=0; i<5; i++) {
			tablero[aleatorioX + i][aleatorioY] = portaavion;
		}
		return tablero;
	}
	
	// FUNCIÓN QUE IMPRIME TABLERO
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
	
	// FUNCION QUE SOLICITA DISPARO
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
						
						if ((int)disparo.charAt(0) - (int)letras > filas) {
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
	
	// FUNCIÓN TRANSFORMAR STRING A INT
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
	
	// FUNCIÓN QUE COMPRUEBA SI SE HA ACERTADO EL DISPARO
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
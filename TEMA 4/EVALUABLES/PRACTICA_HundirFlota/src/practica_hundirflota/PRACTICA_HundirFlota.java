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
	
	// FUNCIÓN QUE RELLENA EL TABLERO DE "AGUA" -> " - "
	public static char[][] RellenarAgua (char[][] tablero) {
		
		for (int i=0; i<tablero.length; i++) {
			Arrays.fill(tablero[i], vacio);
		}
		return tablero;
	}
	
	// FUNCIÓN PARA JUGAR PARTIDA
	public static void JugarPartida (int intentos, int filas, int columnas, int lanchas, int buques, int acorazados, int portaaviones) {
		
		char[][] tableroUsuario = new char [filas][columnas];
		RellenarAgua(tableroUsuario);
		
		char[][] tableroMaquina = new char [filas][columnas];
		RellenarAgua(tableroMaquina);
				
		for (int i=0; i<lanchas; i++) {
			GenerarLancha(tableroMaquina);
		}
		
		int[] coordenadas;
		int cantidadBarcos = lanchas + buques + acorazados + portaaviones;
		do {
			ImprimirTablero(tableroUsuario, filas, columnas);
			System.out.print("\n");
			ImprimirTablero(tableroMaquina, filas, columnas);
			
			coordenadas = SolicitarDisparo();
			
			switch (VerificarDisparo(coordenadas, tableroUsuario, tableroMaquina)) {
				case 1:
					cantidadBarcos--;
					intentos--;
					break;
				case 2:
					intentos--;
					break;
				default:
					System.out.println("\nYa has disparado en esa posición.");
					break;
			}
			
			System.out.println("Intentos restantes: " + intentos + "\n");
			
		} while (intentos > 0);
			
	}
	
	// FUNCIÓN QUE GENERA Y COLOCA LANCHA
	public static char[][] GenerarLancha (char[][] tablero) {
		
		boolean repetir = true;
		
		do {	
			int aleatorioX = (int)(Math.random() * tablero.length);
			int aleatorioY = (int)(Math.random() * tablero[0].length);
			
			if (tablero[aleatorioX][aleatorioY] == vacio) {
				
				tablero[aleatorioX][aleatorioY] = lancha;
				repetir = false;
			}
		} while (repetir);
		
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
	public static int[] SolicitarDisparo () {
		
		boolean repetir;
		String disparo;
		int[] entrada = new int [2];
		
		do {
			repetir = true;
			try {
				do {	
					System.out.print("\nElige coordenada para disparar: ");
					disparo = sc.nextLine();

					if (disparo.length() == 3) repetir = false;
					else {
						repetir = true;
						System.out.println("\nError de entrada.");
					}
				} while (repetir);

				// DEVOLVER ENTRADA COMO ARRAY DE ENTEROS
				
				// Separar el String
				String[] coorDisparo = disparo.split(" ");
				
				// Convertir la letra en mayúscula para evitar error
				coorDisparo[0] = coorDisparo[0].toUpperCase();
				
				// Convertir la entrada a tipo int
				int coordX = (int)(coorDisparo[0].charAt(0) - letras);
				int coordY = Integer.parseInt(coorDisparo[1]);
				
				entrada[0] = coordX; entrada[1] = coordY;
			} 

			catch (Exception e) {
				System.out.println("\nError de entrada.");
				repetir = true;
			}
			
		} while (repetir);
		
		return entrada;
	}
	
	// FUNCIÓN QUE COMPRUEBA SI SE HA ACERTADO EL DISPARO
	public static int VerificarDisparo (int[] coord, char[][] tableroUsuario, char[][] tableroMaquina) {
				
		if (tableroUsuario[coord[0]][coord[1]] != vacio)
			return 0;
		
		else {
			
			if (tableroMaquina[coord[0]][coord[1]] != vacio) {
				
				System.out.println("\n¡Tocado!");
				tableroUsuario[coord[0]][coord[1]] = tocado;
				return 1;
			}
			
			else {
				System.out.println("\n¡Agua!");
				tableroUsuario[coord[0]][coord[1]] = agua;
				return 2;
			}
		}
	}
}
package ejercicioclase;

import java.util.Scanner;

public class EjercicioClase {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        char[][] tablero = new char[3][3];
		char jugadorO = 'o', jugadorX = 'x', jugador;
		int turno = 2, coordX, coordY;
		
		// Alternar turnos hasta que sea victoria o tablas
		do {
			boolean correcto;
			coordX = 0; coordY = 0;
			
			if (turno % 2 == 0) {
				System.out.println("Turno de 'o'.");
				jugador = jugadorO;
			}
			
			else {
				System.out.println("Turno de 'x'.");
				jugador = jugadorX;
			}
			
			// Pedir movimiento y comprobarlo
			do {
				correcto = false;
				
				System.out.print("Introduce movimiento: ");
				String[] entrada = sc.nextLine().split(" ");

				coordX = Integer.parseInt(entrada[0]);
				coordY = Integer.parseInt(entrada[1]);
				
				if (MovimientoValido(tablero, coordX, coordY)) {
					
					correcto = true;
					
					GuardarMovimiento(tablero, coordX, coordY, jugador);
					
					MostrarTablero(tablero);
				}		

			} while (!correcto);
		
			turno++;
		} while (!EsJugadaGanadora(tablero, jugador));
		
		if (EsJugadaGanadora(tablero,  jugador)) System.out.println("Gana el jugador '" + jugador + "'.");
	}     
	
	public static boolean CoordenadaValida (int coordX, int coordY) {
		
		if (((coordX > 0) && (coordX < 4)) && ((coordY > 0) && (coordY < 4)))
			return true;
			
			else return false;
	}
	
	public static boolean CasillaOcupada (char [][] tablero, int coordX, int coordY) {
		
		if (tablero[coordX - 1][coordY - 1] == '\u0000') return false;
		
		else return true;
	}
	
	public static boolean MovimientoValido (char [][] tablero, int coordX, int coordY) {
		
		if (CoordenadaValida(coordX, coordY)) {
					if (!CasillaOcupada(tablero, coordX, coordY)) {
						System.out.println("Movimiento correcto.");
						return true;
					}
					
					else {
						System.out.println("Casilla ocupada.");
						return false;
					}
				}
				
		else {
			System.out.println("Coordenada no válida.");
			return false;
		}
	}
	
	public static void GuardarMovimiento (char [][] tablero, int coordX, int coordY, char jugador) {
		
		tablero[coordX - 1][coordY - 1] = jugador;
	}
	
	public static void MostrarTablero (char [][] tablero) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if (tablero[i][j] != '\u0000') System.out.print("[" + tablero[i][j] + "]");
				else System.out.print("[ ]");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static boolean EsJugadaGanadora (char [][] tablero, char jugador) {
		
		return ComprobarColumna(tablero, jugador) 
				|| ComprobarFila(tablero, jugador)
				|| ComprobarDiagonales(tablero, jugador);
	}
	
	public static boolean ComprobarColumna (char [][] tablero, char jugador) {
		
		int contadorLinea = 0;
		
		for (int i = 0; i < 3; i++) {
			contadorLinea = 0;
					
			for (int j = 0; j < 3; j++) {
				
				if (tablero[j][i] == jugador) contadorLinea++;
			}
		}
		
		return contadorLinea == 3;
	}
	
	public static boolean ComprobarFila (char [][] tablero, char jugador) {
		
		int contadorLinea = 0;
		
		for (int i = 0; i < 3; i++) {
			contadorLinea = 0;
					
			for (int j = 0; j < 3; j++) {
				
				if (tablero[i][j] == jugador) contadorLinea++;
			}
		}
		
		return contadorLinea == 3;
	}
	
	public static boolean ComprobarDiagonales (char [][] tablero, char jugador) {

		int contadorLinea1 = 0;
				
		for (int i = 0; i < 3; i++) {
				
			if (tablero[i][i] == jugador) contadorLinea1++;
		}
		
		int contadorLinea2 = 0;
		
		for (int j = 0; j < 3; j++) {
			
			if (tablero[j][j] == jugador) contadorLinea2++;
		}
		
		return (contadorLinea1 == 3 || contadorLinea2 == 3);
	}
	/*
	public static boolean EsPartidaEnTablas (char [][] tablero) {
		
	}
	*/
}

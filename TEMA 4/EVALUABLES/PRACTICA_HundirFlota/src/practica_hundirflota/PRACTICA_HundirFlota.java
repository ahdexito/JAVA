package practica_hundirflota;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICA_HundirFlota {
	
	static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        
        Menu();
		
        //ImprimirTablero();
		
        //GenerarTableroFacil();
		
		
    }
	
	public static String letras = "ABCDEFGHIJ";
	
	public static String numeros = "   0  1  2  3  4  5  6  7  8  9";
	
	public static char vacio = '-', tocado = 'X', agua = 'A',
		lancha = 'L', buque = 'B', acorazado = 'Z', portaaviones = 'P';
	
	// FUNCIÓN QUE IMPRIME MENÚ
	public static void Menu () {
		
		System.out.print(""
				+ "            HUNDIR LA FLOTA\n"
				+ "========================================\n"
				+ "1. Fácil\n"
				+ "2. Medio\n"
				+ "3. Difícil\n"
				+ "4. Personalizado\n"
				+ "5. Salir\n\n"
				+ "Elegir dificultad: ");
		
		//int opcion = sc.nextInt();
		int opcion = 1;
		
		System.out.print("\n");
		
		OpcionesMenu(opcion);
		}
	
	
	// FUNCION QUE OPERA LAS OPCIONES DEL MENU
	public static void OpcionesMenu (int opcion) {
		
		switch (opcion) {
			
			case 1: GenerarTableroFacil();
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
			
			default: System.out.println("Opción no válida. Introduce de nuevo");
			break;
		}
	}
	
	// FUNCIÓN QUE RELLENA EL TABLERO DE "AGUA" -> " - "
	public static char[][] RellenarAgua (char[][] tablero) {
		
		for (int i=0; i<10; i++) {
			
			Arrays.fill(tablero[i], vacio);
		}
		return tablero;
	}
	
	// FUNCIÓN QUE IMPRIME EL TABLERO QUE JUEGA EL USUARIO
	public static void ImprimirTablero() {
		
		char[][] tableroUsuario = new char[10][10];
		RellenarAgua(tableroUsuario);
		
		// Imprimir posiciones numéricas horizontales
		System.out.println(numeros);
						
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				// Imprimir posiciones alfabéticas verticales
				if (j == 0) System.out.print(letras.charAt(i) + "  ");
				
				// Imprimir mapa
				System.out.print(tableroUsuario[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
	
	// FUNCION QUE GENERA EL TABLERO EN DIFICULTAD FÁCIL
	public static void GenerarTableroFacil () {
				
		char[][] tableroFacil = new char[10][10];
		RellenarAgua(tableroFacil);
		
		for (int i=0; i<5; i++) {
			
			GenerarLancha(tableroFacil);
		}
		
		// IMPRIMIR TABLERO FÁCIL PARA PRUEBAS
		System.out.println(numeros);
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				if (j == 0) System.out.print(letras.charAt(i) + "  ");
				System.out.print(tableroFacil[i][j] + "  ");
			}
			System.out.print("\n");
		}

		SolicitarDisparo();	
	}
	
	// FUNCION QUE SOLICITA DISPARO
	public static void SolicitarDisparo () {
		
		ImprimirTablero();
		
		boolean repetir = true;
		
		do {	
			System.out.print("\nElige coordenada para disparar: ");
			String disparo = sc.nextLine();
			
			if (disparo.length() == 3) repetir = true;
			
		} while (repetir);
		
			String[] coorDisparo = sc.nextLine().split(" ");

			int coordX = letras.indexOf(coorDisparo[0].toUpperCase());
			System.out.println(coordX);
	}
	
	// FUNCION QUE VERIFICA EL DISPARO
	public static void VerificarDisparo (String disparo, char[][] tableroUsuario, char[][] tableroMaquina) {
		
		
	}
	
	// FUNCION QUE GENERA Y COLOCA LANCHA
	public static char[][] GenerarLancha (char[][] tablero) {
		
		boolean repetir = true;
		
		do {	
			int aleatorioX = (int)(Math.random() * 10);
			
			int aleatorioY = (int)(Math.random() * 10);
			
			if (tablero[aleatorioX][aleatorioY] == vacio) {
				
				tablero[aleatorioX][aleatorioY] = lancha;
				
				repetir = false;
			}
			
		} while (repetir);
		
		return tablero;
	}
}
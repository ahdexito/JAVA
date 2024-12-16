package practica_hundirflota;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICA_HundirFlota {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //ImprimirTablero();
        GenerarTableroFacil();
        
        
    }
	
	public static String letras = "ABCDEFGHIJ";
	
	public static String numeros = "   0  1  2  3  4  5  6  7  8  9";
	
	public static char lancha = 'L', buque = 'B', acorazado = 'Z', portaaviones = 'P';
	
	// FUNCION QUE RELLENA EL TABLERO DE "AGUA" -> " - "
	public static char[][] RellenarAgua (char[][] tablero) {
		
		for (int i=0; i<10; i++) {
			
			Arrays.fill(tablero[i], '-');
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
				
				// Imprimir "X" si tocado, sino imprimir agua
				if (tableroUsuario[i][j] != '-') System.out.print("X ");
				else System.out.print(tableroUsuario[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
	
	// FUNCION QUE GENERA EL TABLERO EN DIFICULTAD FÁCIL
	public static void GenerarTableroFacil () {
				
		char[][] tableroFacil = new char[10][10];
		RellenarAgua(tableroFacil);
		
		boolean vacio;
		
		
		
		// IMPRIMIR TABLERO FÁCIL PARA PRUEBAS
		System.out.println(numeros);
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				if (j == 0) System.out.print(letras.charAt(i) + "  ");
				System.out.print(tableroFacil[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
}
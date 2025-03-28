package prog03_ejer1_01;

import java.util.Scanner;

public class PROG03_Ejer1_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EJERCICIO EVALUABLE 1
		
		
		String separador2 = "========================================================";
		System.out.println(separador2);
		System.out.println
		  ("BIENVENIDO AL JUEGO DEL CINCO\n\n"
		+ "¡Adivina el número secreto de 5 cifras!\n\n"
		+ "- Debe estar entre el 0 y el 9, ambos incluidos.\n"
		+ "- Ningún número se puede repetir.\n"
		+ "- (Si te rindes, introduce 999 en cualquier entrada)");
		System.out.println(separador2);
		
		int[] contra = new int[5];
		int contador = 0, random;
		String separador = "--------------------------------------------------------";

		while (contador < contra.length) {
			
			// Generar un número entre 0 y 9 aleatorio.
			random = (int) (Math.random() * 10);

			boolean repetido = false;

			// Revisar si el número random está repetido en el array.
			for (int i = 0; i < contador; i++) {
				
				if (contra[i] == random) {
					repetido = true;
					break;
				}
			}

			// Si no hay un repetido, la posición actual del array toma el valor de random.
			if (!repetido) {
				contra[contador] = random;
				contador++;
			}
		}

		int[] acertados = {-1, -1, -1, -1, -1};
		boolean victoria = false, rendirse = false;
		int intentos = 0, contadorAciertos = 0;

		
		// IMPRIMIR CONTRASEÑA PARA PROBAR EL PROGRAMA
//		for (int i=0; i<5; i++)
//		{
//			 System.out.print(contra[i] + "  ");
//		}
//		System.out.print("\n");


		do {
			intentos++;

			int posicionCorrecta = 0;

			// Pedir los números a adivinar.
			for (int i = 0; i < 5; i++) {
				
				boolean entradaValida = false;
				int entrada;

				// Si no hay número previo o no fue correcto, solicitar número.
				if (acertados[i] == -1) {
					
					do {
						// Salir del bucle si se rinde.
						if (rendirse) break;
						
						System.out.print("DÍGITO " + (i + 1) + ": ");
						
						// Recoger error al introducir número.
						try {
							entrada = sc.nextInt();

							// Activar check para rendirse.
							if (entrada == 999) {
								rendirse = true;
								break;
							} 
							
							// Error número fuera de rango.
							else if (entrada < 0 || 9 < entrada) {
								System.err.println("Número fuera de rango. Introduce un número del 0 al 9.");
								System.out.println(separador);
							} 
							
							// Si la entrada es válida, se puede pasar a revisar si es acierto o fallo.
							else {
								entradaValida = true;

								// Si adivina número, añadir al array de acertados.
								if (entrada == contra[i]) {
									acertados[i] = entrada;
									contadorAciertos++;
								} 
								
								// Revisar qué números se han acertado en cualquier posición.
								else {
									
									for (int j = 0; j < 5; j++) {
										
										if (entrada == contra[j]) {
											posicionCorrecta++;
											break;
										}
									}
								}
							}
						}
						
						// Error entrada no válida.
						catch (Exception e) {
							System.err.println("Entrada no válida. Introduce un número entero.");
							System.out.println(separador);
							sc.next();
						}
					} while (!entradaValida);
				} 

				// Si ya se acertó, imprimirlo y omitir la petición.
				else
					System.out.println("DÍGITO " + (i + 1) + ": " + acertados[i] + " (ACIERTO)");
			}

			// Imprimir los números acertados.
			System.out.println(separador);
			System.out.print("Aciertos en su posición: ");
			for (int i = 0; i < 5; i++) {
				
				// Si no acertó, valdrá -1, imprimir 'X'.
				if (acertados[i] == -1) {
					System.out.print("X  ");
				} 
				
				else
					System.out.print(acertados[i] + "  ");
			}

			// Si acierta 5, terminar el bucle e imprimir intentos.
			if (contadorAciertos == 5) {
				System.out.println("\n" + separador);
				System.out.println("¡Ganaste! Has terminado la partida con " + intentos + " intentos.");
				System.out.println(separador2);
				victoria = true;
			} 

			// Si se rinde, imprimir el resultado.
			else if (rendirse) {
				System.out.println("\n" + separador);
				System.out.print("Te has rendido... La solución era: ");
				
				for (int i = 0; i < 5; i++) {
					System.out.print(contra[i] + "  ");
				}
				System.out.println("\n" + separador);
			} 
			
			// Imprimir aciertos NO en la misma posición.
			else {
				System.out.println("\n" + separador);
				System.out.println("Aciertos NO en su posición: " + posicionCorrecta);
				System.out.println(separador);
				System.out.println("¡Sigue intentándolo!");
				System.out.println(separador2);
			}
		} while (!victoria && !rendirse);

		sc.close();
	}
}

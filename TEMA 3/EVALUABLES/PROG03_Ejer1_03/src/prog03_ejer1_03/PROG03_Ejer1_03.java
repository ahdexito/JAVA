package prog03_ejer1_03;

import java.util.Arrays;
import java.util.Scanner;

public class PROG03_Ejer1_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // EJERCICIO EVALUABLE 3
		
		// EMPEZAR EL PROGRAMA CON NOTAS GENERADAS
//		int[] notas = new int[16];
//		for (int i=0; i<notas.length; i++) {
//			
//			notas[i] = (int)(Math.random() * 11);
//		}

		// EMPEZAR EL PROGRAMA SIN NOTAS GENERADAS
        int[] notas = new int[0];
		
		char opcion;
		int entrada = 0;
		boolean valida;
		String separador = "----------------------------------------------";
		
		do {
			System.out.println("==============================================");
			System.out.println("GESTIÓN DE NOTAS");
			System.out.println(separador);
			System.out.println("" +
			"   a) Añadir nota.\n" +
			"   b) Borrar nota.\n" +
			"   c) Borrar posición.\n" +
			"   d) Ordenar notas.\n" +
			"   e) Mostrar notas.\n" +
			"   f) Calcular media.\n" +
			"   g) Obtener nota máxima.\n" +
			"   h) Obtener nota mínima.\n" +
			"   i) Salir.");
			System.out.println(separador);
			System.out.print("   Introduce opción: ");
			opcion = sc.next().charAt(0);
			
			switch (opcion) {
			///////////////////////////////////////////////////////////////////////////////////////
				case 'a': case 'A':
					System.out.println("OPCIÓN: AÑADIR NOTA");
					System.out.println(separador);
					
					valida = false;
					
					// Verificar entrada.
					do {						
						System.out.print("   Introduce nota: ");
						
						try {
							entrada = sc.nextInt();
							
							// Verificar si está dentro de rango.
							if (entrada<0 || entrada>10) {
								System.out.println("   Nota fuera de rango. Prueba de nuevo.");
								System.out.println(separador);
							}
							else 
								valida = true;
						}
						// Verificar si es valor numérico.
						catch (Exception e) {
							System.out.println("   Valor no válido. Prueba de nuevo.");
							System.out.println(separador);
							sc.nextLine();
						}
					} while (!valida);
					
					// Aumentar tamaño del array, y añadir la nota.
					notas = Arrays.copyOf(notas, notas.length + 1);
					notas[notas.length - 1] = entrada;
					System.out.println(separador);
					System.out.println("   Nota añadida.");
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'b': case 'B':
					System.out.println("OPCIÓN: BORRAR NOTA");
					System.out.println(separador);
					
					// Verificar que hayan notas.
					if (notas.length > 0) {
						
						// Verificar entrada.
						valida = false;
						
						do {
							System.out.print("   Introduce nota: ");
							
							try {
								entrada = sc.nextInt();

								// Verificar si está dentro de rango.
								if (entrada<0 || entrada>10) {
									System.out.println("   Nota fuera de rango. Prueba de nuevo.");
									System.out.println(separador);
								}
								else 
									valida = true;
							}
							// Verificar si es valor numérico.
							catch (Exception e) {
								System.out.println("   Valor no válido. Prueba de nuevo.");
								System.out.println(separador);
								sc.nextLine();
							}
						} while (!valida);

						int contador = 0;
						System.out.println(separador);

						for (int i=0; i<notas.length; ) {
							
							// Buscar número introducido en el array.
							if (notas[i] == entrada) {

								// Contador de veces repetido el número a eliminar.
								contador++;
								// Sobreescribir el array a partir del número a borrar.
								System.arraycopy(notas, i + 1, notas, i, notas.length - i - 1);
								// Reducir tamaño del array.
								notas = Arrays.copyOf(notas, notas.length - 1);								
							}
							else
								i++;
						}	
						if (contador > 0)
							System.out.println("   Nota eliminada. Total de repeticiones: " + contador);

						else 
							System.out.println("   No se ha encontrado la nota a eliminar.");
					}
					else 
						System.out.println("   No hay notas introducidas. Añade una primero.");
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'c': case 'C':
					System.out.println("OPCIÓN: BORRAR POSICIÓN");
					System.out.println(separador);
					
					// Verificar que hayan notas.
					if (notas.length > 0) {
						try {
							System.out.print("   Introduce la posición de la nota (1-" + notas.length + "): ");
							entrada = sc.nextInt();
							// SI IMPRIMIMOS EL ARRAY EN ORDEN INVERSO, LA POSICIÓN A BORRAR SERÁ INVERTIDA TAMBIÉN
							int indice = notas.length - entrada;

							System.arraycopy(notas, indice + 1, notas, indice, notas.length - indice - 1);
							notas = Arrays.copyOf(notas, notas.length - 1);
							System.out.println("   Nota en posición " + entrada + " eliminada.");
						} 
						// Recoger error debido a entrada no válida o posición introducida no existente.
						catch (Exception e) {
							System.out.println("   No se ha podido eliminar nada.");
							sc.nextLine();
						}
					}
					else
						System.out.println("   No hay notas introducidas. Añade una primero.");
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'd': case 'D':
					System.out.println("OPCIÓN: ORDENAR NOTAS");
					System.out.println(separador);
					
					// Verificar que hayan datos suficientes.
					if (notas.length > 1) {
						Arrays.sort(notas);
						System.out.println("   Notas ordenadas.");
					}
					else
						System.out.println("   No hay notas suficientes, añade alguna.");
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'e': case 'E':
					System.out.println("OPCIÓN: MOSTRAR NOTAS");
					System.out.println(separador);
					
					// Verificar si hay datos en el array.
					if (notas.length == 0)
						System.out.println("   No hay notas añadidas.");
					
					// Imprimir array.
					else {
						for (int i=notas.length - 1; i>=0; i--) {

							System.out.print("(" + notas[i] + ")  ");
							if (notas[i] != 10) System.out.print(" ");
							if ((notas.length - i) % 8 == 0) System.out.print("\n");
						}
						if (notas.length % 8 != 0) System.out.print("\n");
					}
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'f': case 'F':
					System.out.println("OPCIÓN: CALCULAR MEDIA");
					System.out.println(separador);
					
					double media = 0;
					
					// Verificar que hayan datos suficientes.
					if (notas.length > 1) {
						
						// Recorrer array para sumar todos los valores en la variable media.
						for (int i=0; i<notas.length; i++) {

							media += notas[i];
						}
						//Calcular media.
						media /= notas.length;
						
						System.out.printf("   La media total es: %.1f\n", media);
					}
					else
						System.out.println("   No hay notas suficientes, añade alguna.");
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'g': case 'G':
					System.out.println("OPCIÓN: OBTENER NOTA MÁXIMA");
					System.out.println(separador);
					
					int maxima = 0;
					
					// Verificar que hayan datos suficientes.
					if (notas.length > 1) {
						
						// Recorrer array para encontrar el dato mayor.
						for (int i=0; i<notas.length; i++) {

							if (notas[i] > maxima)
								maxima = notas[i];
						}
						System.out.println("   La nota máxima es: " + maxima);
					}
					else
						System.out.println("   No hay notas suficientes, añade alguna.");
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'h': case 'H':
					System.out.println("OPCIÓN: OBTENER NOTA MÍNIMA");
					System.out.println(separador);
					
					int minima = 10;
					
					// Verificar que hayan datos suficientes.
					if (notas.length > 1) {
						
						// Recorrer array para encontrar el dato menor.
						for (int i=0; i<notas.length; i++) {

							if (notas[i] < minima)
								minima = notas[i];
						}
						System.out.println("   La nota mínima es: " + minima);
					}
					else
						System.out.println("   No hay notas suficientes, añade alguna.");
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'i': case 'I':
					System.out.println("OPCIÓN: SALIR");
					System.out.println(separador);
					System.out.println("   ¡Hasta pronto!");
					System.out.println(separador);
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				default:
					System.out.println("OPCIÓN: NO VÁLIDA");
				break;
			}
		} while (opcion!='i' && opcion!='I'); 
    }
}
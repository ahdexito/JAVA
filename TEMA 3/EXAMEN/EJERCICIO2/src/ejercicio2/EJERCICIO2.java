package ejercicio2;

import java.util.Scanner;

public class EJERCICIO2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int[] array = new int[5];
		
		int opcion, contador = 0;
		
		do {
			System.out.println("- - - Menú - - -");
			System.out.println("1. Insertar un número.");
			System.out.println("2. Borrar un número.");
			System.out.println("3. Mostrar los números almacenados.");
			System.out.println("4. Salir.");
			
			System.out.print("Selecciona una opción: ");
			opcion = sc.nextInt();
			
			int posicion, entrada;
			
			switch (opcion) {
				
				case 1:
					
					System.out.print("Introduce la posición (0 a " + contador + "): ");
					posicion = sc.nextInt();
					
					// Si no hay números en el array
					if (contador == 0) {
						
						// Verificar entrada de la posición
						if (posicion > contador || posicion < 0)
							System.out.println("Posicion incorrecta.");

						else {
							// Solicitar número
							System.out.print("Introduce el número a insertar: ");
							entrada = sc.nextInt();
							
							// Añadir el número en posición 0 porque es el primero
							array[0] = entrada;
							
							contador++;
							System.out.println("Número insertado.");
						}
					}
					
					else if (contador < array.length) {
						
						// Verificar entrada de la posición
						if (posicion > contador || posicion < 0)
							System.out.println("Posicion incorrecta.");
						
						else {
														
							// Solicitar número
							System.out.print("Introduce el número a insertar: ");
							entrada = sc.nextInt();
							
							// Desplazar hacia derecha si va a reemplazar otro número
							if (posicion < contador) {
								for (int i=contador; i>=posicion; i--) {
									
									array[i] = array[i - 1];
								}
							}
							
							// Añadir el número en posición elegida
							array[posicion] = entrada;
							
							contador++;
							System.out.println("Número insertado en su posición");
						}
					}
					
					else
						System.out.println("El array está completo. Borra uno primero");
				break;
				
				/////////////////////////////////////////////////////////////////
				case 2:
					
					if (contador > 0) {
						System.out.print("Introduce posición del número a borrar: ");
						posicion = sc.nextInt();

						if (posicion > contador && posicion < 0)
							System.out.println("Error, la posición insertada es mayor al número de elementos.");
						
						// Desplazar datos para llenar el hueco.
						else {

							for (int i=posicion; i<contador; i++) {

								array[i] = array[i + 1];
							}
							
							System.out.println("Número en su posición borrado.");
							contador--;
						}
					}
					
					else
						System.out.println("No hay números para borrar.");
					
				break;
				/////////////////////////////////////////////////////////////////
				case 3:
					
					if (contador > 0) {
						for (int i=0; i<contador; i++) {

							System.out.print(array[i] + "  ");
						}
						System.out.print("\n");
					}
					
					else
						System.out.println("El array está vacío.");
				break;
			}
			
			System.out.println("=====================================");
			
		} while (opcion!=4);
        
        
    }
}

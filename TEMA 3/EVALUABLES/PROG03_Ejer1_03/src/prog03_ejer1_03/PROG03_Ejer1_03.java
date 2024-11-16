package prog03_ejer1_03;

import java.util.Arrays;
import java.util.Scanner;

public class PROG03_Ejer1_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        3. Queremos desarrollar una aplicación que nos ayude a gestionar las notas de los alumnos de
		un centro educativo. Cada alumno tiene diversas notas por cada uno de los módulos, siendo el
		profesor de cada módulo el encargado de introducir, borrar y modificar las notas del módulo de
		cada alumno. Se necesita crear una aplicación en la que cada profesor pueda gestionar sus notas
		por cada alumno. Para simplificar la aplicación, ésta (la aplicación), sólo va a poder gestionar las
		notas de un alumno en un sólo módulo, pero se tiene un problema, el número de notas de los
		alumnos por módulo se desconoce.
		
		Se pide realizar una aplicación que muestre un menú semejante al de la siguiente imagen, que
		permita ‘Añadir nota’, ‘Borrar nota’, ‘Borrar posición’, ‘Ordenar notas’, ‘Mostrar notas’,
		‘Calcular la Media’, ‘Obtener Nota Máxima’ y ‘Obtener Nota Mínima’ de un alumno en un
		determinado módulo.
		
		Para cada una de las funciones, se tiene que tener en cuanta los siguientes aspectos:
		
		a) Añadir nota : El sistema solicitará una nota que será validad entre 0 y 10, y se añadirá una
		nota al final de todas las notas. Si la nota no es correcta, el sistema volverá a solicitar la nota
		hasta que la nota introducida sea correcta.
		
		b) Borrar nota: la aplicación solicitará que se introduzca el valor de una nota y se eliminará todas
		las notas que coincidan con el valor introducido. Después de borrar las notas, la aplicación
		indicará cuantas notas se han borrado, pudiendo no borrar ninguna nota porque la nota a borrar
		no exista.
		
		c) Borrar posición: la aplicación solicitará la posición de la nota que se quiere borrar. La aplicación
		indicará si el borrado tuvo éxito (la posición existe y se ha borrado), o por el contrario, si la
		posición no existe, la aplicación indicará que ‘no se ha podido borrar ninguna nota’.
		
		d) Ordenar notas: las notas se ordenarán de forma ascendente.
		
		e) Mostrar notas: las notas se mostrarán de la más reciente a la más antigua.
		
		f) Calcular Media: se mostrará la media de todas las notas existentes.
		
		g) Obtener Nota Máxima: se obtendrá la nota máxima de entre todas las notas.
		
		h) Obtener Nota Mínima: se obtendrá la nota mínima de entre todas las notas.
		
		IMPORTANTE : cada que se añada o borren notas, el tamaño del array deberá ser recalculado al
		nuevo número de notas.
		NOTA : emplea los métodos de la clase Arrays que creas oportunos para el desarrollo de la
		actividad.
        */
        
        int[] notas = new int[0];
		char opcion;
		int entrada;
		String separador = "-----------------------------------------";
		
		do {
			System.out.println("=========================================\n" +
			"a) Añadir nota.\n" +
			"b) Borrar nota.\n" +
			"c) Borrar posición.\n" +
			"d) Ordenar notas.\n" +
			"e) Mostrar notas.\n" +
			"f) Calcular media.\n" +
			"g) Obtener nota máxima.\n" +
			"h) Obtener nota mínima.\n" +
			"i) Salir.");
			System.out.println(separador);
			System.out.print("Introduce opción: ");
			opcion = sc.next().charAt(0);
			
			switch (opcion) {
			///////////////////////////////////////////////////////////////////////////////////////
				case 'a':
					System.out.println("OPCIÓN: AÑADIR NOTA");
					System.out.println(separador);
					
					// Verificar entrada.
					do {						
						System.out.print("Introduce nota: ");
						entrada = sc.nextInt();
						
						if (entrada<0 || entrada>10) {
							System.out.println("Nota NO válida. Prueba de nuevo.");
							System.out.println(separador);
						}
					} while (entrada<0 || entrada>10);
					
					// Aumentar tamaño del array, y añadir la nota.
					notas = Arrays.copyOf(notas, notas.length + 1);
					notas[notas.length - 1] = entrada;
					System.out.println("Nota añadida.");
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'b':
					System.out.println("OPCIÓN: BORRAR NOTA");
					System.out.println(separador);
					
					// Verificar entrada.
					do {						
						System.out.print("Introduce nota: ");
						entrada = sc.nextInt();
						
						if (entrada<0 || entrada>10) {
							System.out.println("Nota NO válida. Prueba de nuevo.");
							System.out.println(separador);
						}
					} while (entrada<0 || entrada>10);
					
					int contador = 0;
					
					for (int i=0; i<notas.length; i++) {
						
						if (notas[i] == entrada) {
							
							// Contador de veces repetido el número a eliminar.
							contador++;
							// Sobreescribir el array a partir del número a borrar.
							System.arraycopy(notas, i + 1, notas, i, notas.length - i - 1);
							// Reducir tamaño del array.
							notas = Arrays.copyOf(notas, notas.length - 1);
						}
					}	
					if (contador > 0)
						System.out.println("La nota introducida se ha eliminado " + contador + " veces.");

					else
						System.out.println("No se ha encontrado la nota a eliminar.");
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'c':
					System.out.println("OPCIÓN: BORRAR POSICIÓN");
					System.out.println(separador);
					
					try {
						System.out.print("Introduce la posición de la nota: ");
						entrada = sc.nextInt();
						
						System.arraycopy(notas, entrada, notas, entrada - 1, notas.length - entrada);
						notas = Arrays.copyOf(notas, notas.length - 1);
						System.out.println("Nota en posición " + entrada + " eliminada.");
					} 
					
					catch (Exception ArrayIndexOutOfBoundsException) {
						System.out.println("No se ha podido eliminar nada.");
					}
				break;
			///////////////////////////////////////////////////////////////////////////////////////
				case 'e':
					System.out.println("OPCIÓN: MOSTRAR NOTAS");
					System.out.println(separador);
					
					if (notas.length == 0)
						System.out.print("No hay notas añadidas.");
					
					for (int i=0; i<notas.length; i++) {
						
						System.out.print("(" + notas[i] + ")  ");
					}
					System.out.print("\n");
				break;
			}
		} while (opcion!='i'); 
    }
}
package prog03_automatriz07;

import java.util.Arrays;
import java.util.Scanner;

public class Prog03_autoMatriz07 {
	
	
    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
        7. Un centro escolar nos ha pedido mantener las notas de las 5 asignaturas que cursan los
		alumnos. En cada asignatura puede haber un número distintos de alumnos:
		a) Asignatura 1: 3 alumnos.
		b) Asignatura 2: 5 alumnos.
		c) Asignatura 3: 4 alumnos.
		d) Asignatura 4: 2 alumnos.
		e) Asignatura 5: 4 alumnos
		Se debe mantener la información mediante una variable que gráficamente presenta esta
		estructura:
		
		Crear una aplicación que permita:
		a) Instar las notas de la asignatura seleccionada.
		b) Calcular la nota media de la asignatura seleccionada.
		c) Ordenar las notas de una asignatura de forma ascendente.
		d) Estadísticas de porcentajes de aprobados y suspensos por cada asignatura.
		e) Salir.
		*/
		
		//int[][] notas = {{5, 6, 5},{3, 7, 8, 2, 1},{5, 6, 3, 7},{3, 6},{6, 7, 8, 3}};
		
		int[][] notas = new int [5][];
		
		notas[0] = new int[3];
		notas[1] = new int[5];
		notas[2] = new int[4];
		notas[3] = new int[2];
		notas[4] = new int[4];
		
		char opcion;
		
		do {
			
			System.out.println("" +
			"==================================================\n" +
			"a) Insertar las notas de la asignatura seleccionada.\n" +
			"b) Calcular la nota media de la asignatura \n" +
			"   seleccionada.\n" +
			"c) Ordenar las notas de una asignatura de forma\n" +
			"   ascendente.\n" +
			"d) Estadísticas de porcentajes de aprobados \n" +
			"   y suspensos por cada asignatura.\n" +
			"e) Mostrar todas las notas.\n" +
			"f) Salir.");
			
			double media = 0;
			
			System.out.println("==================================================");
			System.out.print("Introduce opción (a, b, c, d, e, f): ");
			opcion = sc.next().charAt(0);
			
			switch (opcion) {
				
				case 'a': case 'A':
										
					System.out.println("OPCIÓN A: INTRODUCIR NOTAS\n");
					System.out.print("Introduce asignatura (1, 2, 3, 4, 5): ");
					int entrada_A = sc.nextInt() - 1;
					
					for (int i=0; i<notas[entrada_A].length; i++) {
						
						System.out.print("Alumno " + (i+1) + " : ");
						notas[entrada_A][i] = sc.nextInt();
					}
				break;
					
				case 'b': case 'B':
					
					System.out.println("OPCIÓN B: MEDIA DE NOTAS\n");
					System.out.print("Introduce asignatura (1, 2, 3, 4, 5): ");
					int entrada_B = sc.nextInt() - 1;
					
					for (int i=0; i<notas[entrada_B].length; i++) {
						
						media += notas[entrada_B][i];
					}
					
					System.out.printf("La media de notas de la asignatura %d es: %.1f", (entrada_B + 1), (media/notas[entrada_B].length));
					System.out.println("\n");
				break;
					
				case 'c': case 'C':
					
					System.out.println("OPCIÓN C: ORDENAR NOTAS\n");
					System.out.print("Introduce asignatura (1, 2, 3, 4, 5): ");
					int entrada_C = sc.nextInt() - 1;
					
					Arrays.sort(notas[entrada_C]);
					
					System.out.println("\nNotas de la asignatura " + (entrada_C + 1) + " ordenadas.\n");
				break;
					
				case 'e': case 'E':
										
					System.out.println("OPCIÓN E: MOSTRAR NOTAS\n");
					for (int i=0; i<5; i++) {
			
						System.out.print("ASIGNATURA " + (i+1) + ": ");

						for (int j=0; j<notas[i].length; j++) {

							System.out.print(notas[i][j] + "  ");
						}
						System.out.println("\n");
					}
				break;
				
				case 'f': case 'F':
					
					System.out.println("\nOPCIÓN F: SALIR DEL PROGRAMA");
				break;
				
				default:
					System.out.println("OPCIÓN NO VÁLIDA. INTRODUZCA OTRA");
				break;
			}
			
		} while (opcion!='f' && opcion!='F');
	}
}

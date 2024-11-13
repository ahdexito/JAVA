package prog03_automatriz07;

import java.util.Scanner;

public class Prog03_autoMatriz07 {

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
		
		int[][] notas = new int[5][];
		
		notas[0] = new int[3];
		notas[1] = new int[5];
		notas[2] = new int[4];
		notas[3] = new int[2];
		notas[4] = new int[4];
		
		// Imprimir notas.
		for (int i=0; i<5; i++) {
			
			System.out.print("ASIGNATURA " + (i+1) + ": ");
			
			for (int j=0; j<notas[i].length; j++) {
				
				System.out.print(notas[i][j] + "  ");
			}
			System.out.println("\n");
		}
		
		do {
			System.out.print("Introduce opción: ");
			char opcion = sc.next().charAt(0);
			
			switch (opcion) {
				
				
				
			}
			
			
		} (while opcion!='e' || opcion!='E')
		
	}

}

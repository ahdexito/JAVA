package prog03_automatriz04;

import java.util.Scanner;

public class Prog03_autoMatriz04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
		1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
		programa mostrará la nota mínima, máxima y media de cada alumno.
        */
        
        int[][] notas = new int[4][5];
		
		for (int i=0; i<4; i++) {
			
			System.out.println("Alumno " + (i+1));
			
			for (int j=0; j<5; j++) {
				
				System.out.print("Nota asignatura " + (j+1) + ": ");
				notas[i][j] = sc.nextInt();
			}
			System.out.print("\n");
		}
		
		System.out.println("=================================\n");
		
		for (int i=0; i<4; i++) {
			
			int media = 0, minima = notas[i][0], maxima = notas[i][0];
			
				for (int j=0; j<5; j++) {
					
					int nota = notas[i][j];
					
					media += nota;
					
					if (nota<minima)
						minima = nota;
					
					if (nota>maxima)
						maxima = nota;
				}
				
			System.out.println("Alumno " + (i+1));
			System.out.println("Nota media: " + (media/5));
			System.out.println("Nota mínima: " + minima);
			System.out.println("Nota máxima: " + maxima);
			System.out.print("\n");
		}
    }
}
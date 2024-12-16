package prog04_autorecursividad;

import java.util.Scanner;

public class prog04_autoRecursividad09 {
	
	public static int SumaVector(int[] vector, int desde, int hasta) {
		
		if (desde > hasta) return 0;
		
		return vector[desde] + SumaVector(vector, desde + 1, hasta);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        9. Crea un programa que emplee recursividad para calcular la suma de los elementos de
		un vector de números enteros, desde su posición inicial a la final, usando una función
		recursiva que tendrá la apariencia: SumaVector(v, desde, hasta). Nuevamente, piensa
		cuál será el caso base (cuántos elementos podrías sumar para que dicha suma sea
		trivial) y cómo pasar del caso "n-1" al caso "n" (por ejemplo, si conoces la suma de los 6
		primeros elementos y el valor del sép�mo elemento, cómo podrías emplear esta
		información para conocer la suma de los 7 primeros).
        */
        
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8};
        int desde = 3;
		int hasta = 5;
		
		System.out.println("La suma es: " + SumaVector(vector, desde, hasta));
    }
}
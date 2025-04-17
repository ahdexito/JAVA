package ejer_auto_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer_auto_02 {
    
    public static void main(String[] args) {
		
        ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int tamanyo = (int) (Math.random() * 11) + 10;
		
		while (lista.size() < tamanyo) {
			if (lista.size() < tamanyo) {
				lista.add((int)(Math.random() * 100));
			}
		}
		
		for (Integer num : lista) {
			System.out.print(num + ", ");
		}
		
			System.out.print("CANTIDAD: " + tamanyo + "\n");
		
		int suma = 0, max = lista.get(0), min = lista.get(0);
			
		for (Integer num : lista) {
			suma += num;
			if (num > max) max = num;
			if (num < min) min = num;
		}
		
		System.out.println("SUMA TOTAL: " + suma);
		System.out.println("VALOR MÍNIMO: " + min);
		System.out.println("VALOR MÁXIMO: " + max);
		System.out.println("MEDIA: " + (suma / tamanyo));
    }
}
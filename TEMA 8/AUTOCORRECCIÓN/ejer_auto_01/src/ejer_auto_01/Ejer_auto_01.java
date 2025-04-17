package ejer_auto_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer_auto_01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("rojo");
		lista.add("verde");
		lista.add("amarillo");
		lista.add("azul");
		lista.add("naranja");
		lista.add("magenta");
		
		for (String color : lista) {
			System.out.println(color);
		}
    }
}
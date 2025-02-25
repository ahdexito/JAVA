package ejer_auto_herencia_1;

import java.util.Scanner;

public class Ejer_auto_herencia_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
		Trabajador trab = new Trabajador(12, (float)1256.7, "Industria", "Paco", 36, (float)70.5);
		
		trab.Mostrar();
	}
}
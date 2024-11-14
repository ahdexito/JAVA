package prog03_autostring10;

import java.util.Scanner;

public class Prog03_autoString10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        10. Un programa que pida tu nombre, tu día de nacimiento y tu mes de nacimiento y lo junte
		todo en una cadena, separando el nombre de la fecha por una coma, y el día y el mes por
		una barra inclinada, así: "Juan, nacido el 31/12"
        */
        
        System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Introduce tu día de nacimiento: ");
		int dia = sc.nextInt();
		
		System.out.print("Introduce tu mes de nacimiento: ");
		int mes = sc.nextInt();
        
		
    }
}

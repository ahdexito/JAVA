package prog04_autofuncionesmat;

import java.util.Scanner;

public class Prog04_autoFuncionesMat01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        1. Nos han pedido realizar una aplicación que simule una calculadora científica la cual realice
		las siguientes operaciones:
		a) Valor absoluto
		b) Raíz cuadrada
		c) Logaritmo neperiano
		d) Potencia
		e) Seno
		f) Coseno
		g) Tangente
		Crea un menú en el cual se pueda elegir una opción entre las indicadas y realice los cálculos
		que se piden utilizando funciones matemáticas. Para cada opción del menú se deberá crear
		una función donde se realice la operación.
        */
        
		System.out.println(""
				+ "           MENÚ\n"
				+ "============================\n"
				+ "a) Valor absoluto\n"
				+ "b) Raíz cuadrada\n"
				+ "c) Logaritmo neperiano\n"
				+ "d) Potencia\n"
				+ "e) Seno\n"
				+ "f) Coseno\n"
				+ "g) Tangente\n"
				+ "");
		System.out.print("Elige opción: ");
		char opcion = sc.next().charAt(0);
		
		double entrada;
		
		switch (opcion) {
			
			case 'a':
				
				System.out.print("Introduce número: ");
				entrada = sc.nextDouble();
				
				entrada = Math.abs(entrada);
				
				System.out.println("EL valor absoluto es: " + entrada);
				
			break;
			//////////////////////////////////////////////////////////////////
			
			case 'b':
				
				System.out.print("Introduce número: ");
				entrada = sc.nextDouble();
				
				entrada = Math.sqrt(entrada);
				
				System.out.println("La raíz cuadrada es: " + entrada);
				
			break;
			//////////////////////////////////////////////////////////////////
			
			case 'c':
				
				System.out.print("Introduce número: ");
				entrada = sc.nextDouble();
				
				entrada = Math.log(entrada);
				
				System.out.println("El logaritmo neperiano es: " + entrada);
			
		}
        
    }
}

package prog03_autostring01;

import java.util.Scanner;

public class Prog03_autoString01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        1. Crea un programa que pida al usuario dos números enteros y la operación a realizar con
		ellos, posteriormente mostrará el resultado de dicha operación. La operación podrá ser
		"suma", "resta", multiplicación" y "división", que también se podrán escribir de forma
		abreviado con los operadores matemáticos "+", "-", "*" y "/". Pudiendo también utilizar para
		multiplicar la letra "x", tanto minúscula o mayúscula. La operación se debe tomar como una
		cadena de texto y analizarla con un "switch".
        */
		
        System.out.print("Introduce la operación a realizar: ");
		String entrada = sc.nextLine();
		int num = entrada.length();
		
		String operacion = " ";
		
		for (int i=0; i<num; i++) {
			
			if (entrada.charAt(i)=='+')
				operacion = "sumar";
			
			if (entrada.charAt(i)=='-')
				operacion = "restar";
			
			if (entrada.charAt(i)=='*' || entrada.charAt(i)=='x' || entrada.charAt(i)=='X')
				operacion = "multiplicar";
			
			if (entrada.charAt(i)=='/')
				operacion = "dividir";
		}
		
		int a, b;
		
		switch (operacion) {
			
			case "sumar":
				String[] suma = entrada.split("\\+");
				
				a = Integer.parseInt(suma[0]);
				b = Integer.parseInt(suma[1]);
				
				System.out.println("La suma es: " + (a+b));
			break;
				
			case "restar":
				String[] resta = entrada.split("\\-");
				
				a = Integer.parseInt(resta[0]);
				b = Integer.parseInt(resta[1]);
				
				System.out.println("La resta es: " + (a-b));
			break;
			
			case "multiplicar":
				String[] multiplicar = entrada.split("[xX*]+");
				
				a = Integer.parseInt(multiplicar[0]);
				b = Integer.parseInt(multiplicar[1]);
				
				System.out.println("La multiplicación es: " + (a*b));
			break;
			
			case "dividir":
				String[] dividir = entrada.split("\\/");
				
				a = Integer.parseInt(dividir[0]);
				b = Integer.parseInt(dividir[1]);
				
				System.out.println("La división es: " + (a/b));
			break;
		}
        
    }
}
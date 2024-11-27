package prog04_auto01;

import java.util.Scanner;

public class Prog04_auto01 {
	
	public static void Multiplicar(double a, double b) {
		
		System.out.println(a*b);
	}
	
	public static void EsMayorEdad(int edad) {
		
		if (edad >= 18) System.out.println("Es mayor de edad.");
		else System.out.println("Es menor de edad.");
	}
	
	public static void Minimo(int a, int b) {
		
		if (a > b) System.out.println("El mayor es " + a);
		else System.out.println("El mayor es " + b);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		
		int entrada1, entrada2;
        
        /*
        1. Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
		resultado de multiplicarlos. Implementa y utiliza la función:
		Multiplica(double a, double b) // Devuelve la multiplicación de dos números
        */
        
		System.out.print("Introduce número a: ");
		entrada1 = sc.nextInt();
        
        System.out.print("Introduce número b: ");
		entrada2 = sc.nextInt();
		
		Multiplicar(entrada1, entrada2);
		
		/*
		2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de
		edad o no. Implementa y utiliza la función:
		EsMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
		*/
		
		System.out.print("Introduce edad: ");
		entrada1 = sc.nextInt();
		
		EsMayorEdad(entrada1);

		/*
		3. Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual
		es el mínimo. Implementa y utiliza la función:
		Minimo(int a, int b) // Devuelve el menor entre a y b
		*/
		
		System.out.print("Introduce el primer número: ");
		entrada1 = sc.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		entrada2 = sc.nextInt();
		
		Minimo(entrada1, entrada2);

		/*
		4. Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
		positivo, negativo o cero. Implementa y utiliza la función:
		DimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
		*/
		
		System.out.print("Introduce número: ");
		entrada1 = sc.nextInt();
		
		DimeSigno(entrada1);
    }
}

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
	
	public static void DimeSigno(int a) {
		
		if (a > 0) System.out.println("1");
		else if (a < 0) System.out.println("-1");
		else System.out.println("0");
	}
	
	public static void MillasKilometros(int a) {
		
		System.out.println("La conversión a kilómetros es: " + (a * 1.60934));
	}
	
	public static void PrecioIVA(double[] precios) {
		
		for (int i=0; i<5; i++) {
			
			precios[i] += (precios[i] * 0.21);
			System.out.println("Precio con IVA de producto " + (i + 1) + ": " + precios[i]);
		}
	}
	
	public static double PerimetroRectangulo(double a, double b) {
		
		double resultado = a + a + b + b;
		return resultado;
	}
	
	public static double AreaRectangulo(double a, double b) {
		
		double resultado = a * b;
		return resultado;
	}
	
	public static int Suma1aN(int a) {
		
		int resultado = 0;
		
		for (int i=1; i<=a; i++) {
			
			resultado += i;
		}
		
		return resultado;
	}
	
	public static int Producto1aN(int a) {
		
		int resultado = 1;
		
		for (int i=1; i<=a; i++) {
			
			resultado *= i;
		}
		
		return resultado;
	}
	
	public static int Intermedio1aN(int a) {
		
		int resultado = (1 + a) / 2;
		
		return resultado;
	}

	public static int Maximo(int a, int b) {
		
		if (a > b) return a;
		else return b;
	}
	
	public static int SumaArray(int[] array) {
		
		int resultado = 0;
		
		for (int i=0; i<array.length; i++) {
			
			resultado += array[i];
		}
		
		return resultado;
	}
	
	public static int MediaArray(int[] array) {
		
		int resultado = SumaArray(array) / array.length;
		return resultado;
	}
	
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		
		int entrada1, entrada2, a, b;
		double deci1, deci2;
		double[] precios = new double[5];
		
//        /*
//        1. Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
//		resultado de multiplicarlos. Implementa y utiliza la función:
//		Multiplica(double a, double b) // Devuelve la multiplicación de dos números
//        */
//        
//		System.out.print("Introduce número a: ");
//		deci1 = sc.nextDouble();
//		
//        System.out.print("Introduce número b: ");
//		deci2 = sc.nextDouble();
//		
//		Multiplicar(deci1, deci2);
//		
//		/*
//		2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de
//		edad o no. Implementa y utiliza la función:
//		EsMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
//		*/
//		
//		System.out.print("Introduce edad: ");
//		entrada1 = sc.nextInt();
//		
//		EsMayorEdad(entrada1);
//
//		/*
//		3. Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual
//		es el mínimo. Implementa y utiliza la función:
//		Minimo(int a, int b) // Devuelve el menor entre a y b
//		*/
//		
//		System.out.print("Introduce el primer número: ");
//		entrada1 = sc.nextInt();
//		
//		System.out.print("Introduce el segundo número: ");
//		entrada2 = sc.nextInt();
//		
//		Minimo(entrada1, entrada2);
//
//		/*
//		4. Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
//		positivo, negativo o cero. Implementa y utiliza la función:
//		DimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
//		*/
//		
//		System.out.print("Introduce número: ");
//		entrada1 = sc.nextInt();
//		
//		DimeSigno(entrada1);
//		
//		/*
//		5. Escribe un programa que pida un valor entero en millas y muestre su equivalente en
//		kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
//		MillasAkilometros(int millas) // Devuelve la conversión de millas a
//		kilómetros
//		*/
//		
//		System.out.print("Introduce cantidad de millas: ");
//		entrada1 =  sc.nextInt();
//		
//		MillasKilometros(entrada1);
//
//		/*
//		6. Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de
//		cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
//		PrecioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de
//		IVA
//		*/
//		
//		for (int i=0; i<5; i++) {
//			
//			System.out.print("Introduce precio: ");
//			precios[i] = sc.nextDouble();
//		}
//		
//		PrecioIVA(precios);
//		
//		/*
//		7. Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su
//		área y su perímetro. Implementa y utiliza las funciones:
//		PerimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
//		AreaRectangulo(double ancho, double alto) // Devuelve el área
//		*/
//		
//		System.out.print("Introduce el ancho del rectángulo: ");
//		deci1 = sc.nextDouble();
//		
//		System.out.print("Introduce el alto del rectángulo: ");
//		deci2 = sc.nextDouble();
//		
//		System.out.println("El perímetro es: " + PerimetroRectangulo(deci1, deci2));
//		
//		System.out.println("El área es: " + AreaRectangulo(deci1, deci2));
//
//		/*
//		8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio desde 1 a N, el
//		productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
//		Suma1aN(int n) // Devuelve la suma de enteros de 1 a n
//		Producto1aN(int n) // Devuelve el producto de enteros de 1 a n
//		Intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
//		*/
//		
//		System.out.print("Introduce N: ");
//		entrada1 = sc.nextInt();
//		
//		System.out.println("La suma desde 1 a " + entrada1 + " es: " + Suma1aN(entrada1));
//		
//		System.out.println("El producto de enteros de 1 a " + entrada1 + " es: " + Producto1aN(entrada1));
//		
//		System.out.println("El valor intermedio entre 1 a " + entrada1 + " es: " + Intermedio1aN(entrada1));
//		
//		/*
//		10. Diseñar una función llamada Maximo que tenga como parámetros dos números, y que
//		devuelva el máximo.
//		*/
//		a = 3; b = 7;
//		
//		System.out.println("El máximo es: " + Maximo(a, b));
//		
		/*
		11. Escribe un programa que cree un array de tamaño 100 con los primeros 100 números
		naturales. Luego muestra la suma total y la media. Implementa una función llamada
		SumaArray que calcule la suma de un array y devuelva la suma, y otra llamada MediaArray
		que calcule la media de un array y devuelva la media
		*/
		
		int[] array = new int[100];
		
		for (int i=1; i<=array.length; i++) {
			
			array[i - 1] = i;
		}
		
		System.out.println("La suma es: " + SumaArray(array));
		
		System.out.println("La media es: " + MediaArray(array));
		
		}
}

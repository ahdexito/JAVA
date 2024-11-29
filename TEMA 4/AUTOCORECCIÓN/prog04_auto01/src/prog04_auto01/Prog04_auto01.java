package prog04_auto01;

import java.util.Arrays;
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
	
	public static int[] ArrayAleatorio(int[] array) {
		
		for (int i=0; i<array.length; i++) {
			
			array[i] = (int)(Math.random() * 10);
		}
		
		return array;
	}
	
	public static boolean EsPrimo(int entrada) {
		
		boolean primo = true;
		
		for (int i=2; i<entrada; i++) {
			
			if (entrada % i == 0) primo = false;
		}
		
		if (entrada == 1) primo = false;
		
		return primo;
	}
	
	public static char LetraDNI(int entrada) {
		
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		char resultado = letras[entrada % 23];
		
		return resultado;
	}
	
	public static boolean Pitagoras(int a, int b, int c) {
		
		boolean resultado;
		
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) resultado = true;
		
		else resultado = false;
		
		return resultado;
		
	}
	
	public static int DivisoresNumero(int entrada) {
		
		int cantidad = 0;
		
		for (int i=1; i<entrada; i++) {
			
			if (EsPrimo(i)) cantidad++;
		}
		
		return cantidad;
	}
	
	public static boolean BuscarNumeroEnArray(int[] array, int numero) {
		
		boolean encontrado = false;
		
		for (int i=0; i<array.length; i++) {
			
			if (array[i] == numero) encontrado = true;
		}
		
		return encontrado;
	}
	
	public static int[] SumarArrays(int[] array1, int[] array2) {
		
		int[] resultado = new int[array1.length];
		
		for (int i=0; i<array1.length; i++) {
			
			resultado[i] = array1[i] + array2[i];
		}
		
		return resultado;
	}
	
	public static int[] RestarArrays(int[] array1, int[] array2) {
		
		int[] resultado = new int[array1.length];
		
		for (int i=0; i<array1.length; i++) {
			
			resultado[i] = array1[i] - array2[i];
		}
		
		return resultado;
	}
	
	public static int[] MultiplicarArrays(int[] array1, int[] array2) {
		
		int[] resultado = new int[array1.length];
		
		for (int i=0; i<array1.length; i++) {
			
			resultado[i] = array1[i] * array2[i];
		}
		
		return resultado;
	}
	
	public static int[] DividirArrays(int[] array1, int[] array2) {
		
		int[] resultado = new int[array1.length];
		
		for (int i=0; i<array1.length; i++) {
			
			resultado[i] = array1[i] / array2[i];
		}
		
		return resultado;
	}
	
	public static int[] CalculadoraArrays(int[] array1, int[] array2) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("CALCULADORA. Elige opción (s, r, m, d): ");
		char opcion = sc.next().charAt(0);
		
		int[] resultado = new int[array1.length];
		
		switch (opcion) {
			
			case 's':
				resultado = SumarArrays(array1, array2);
			break;
			
			case 'r':
				resultado = RestarArrays(array1, array2);
			break;
			
			case 'm':
				resultado = MultiplicarArrays(array1, array2);
			break;
			
			case 'd':
				resultado = DividirArrays(array1, array2);
			break;
		}
		
		return resultado;
	}
	
	public static int AciertosApuesta(int[] array1,  int[] array2) {
		
		int contador = 0;
		
		for (int i=0; i<array1.length; i++) {
			
			for (int j=0; j<array1.length; j++) {
				
				if (array1[i] == array2[j]) contador++;
			}
		}
		
		return contador;
	}
	
	public static int[] ArrayCuadrado(int[] array) {
		
		
	}
	
	
	
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		
		int a, b, c, entrada;
		double deci1, deci2;
		double[] precios = new double[5];
		char opcion;
		
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
//		/*
//		11. Escribe un programa que cree un array de tamaño 100 con los primeros 100 números
//		naturales. Luego muestra la suma total y la media. Implementa una función llamada
//		SumaArray que calcule la suma de un array y devuelva la suma, y otra llamada MediaArray
//		que calcule la media de un array y devuelva la media
//		*/
//		
//		int[] array = new int[100];
//		
//		for (int i=1; i<=array.length; i++) {
//			
//			array[i - 1] = i;
//		}
//		
//		System.out.println("La suma es: " + SumaArray(array));
//		
//		System.out.println("La media es: " + MediaArray(array));
//		
//		/*
//		12. Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene
//		con valores aleatorios (utiliza Math.random()). Implementa la función llamada
//		ArrayAleatorio que rellena un array con valores aleatorios y devuelva el array.
//		*/
//		
//		System.out.print("Introduce tamaño del array: ");
//		entrada1 = sc.nextInt();
//		
//		int[] array = new int[entrada1];
//		
//		int[] arrayLleno = ArrayAleatorio(array);
//		
//		for (int i=0; i<array.length; i++) {
//			
//			System.out.println(arrayLleno[i]);
//		}
//
//		/*
//		13. Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el
//		más elevado. Implementarlo creando únicamente una función a la que le pasemos dos
//		valores (no tres) y nos devuelva el máximo de los dos valores.
//		*/
//		
//		System.out.print("Introduce valor 1: ");
//		a = sc.nextInt();
//		
//		System.out.print("Introduce valor 2: ");
//		b = sc.nextInt();
//		
//		System.out.print("Introduce valor 3: ");
//		c = sc.nextInt();
//		
//		int maximo = Maximo(a, Maximo(b, c));
//		
//		System.out.println("El valor máximo es: " + maximo);
//		
//		/*
//		14. Realiza un programa que nos pida número enteros hasta que se introduzca el 0,
//		diciéndonos, para cada número introducido si es primo o no. Hay que recordar que un
//		número es primo si es divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe
//		crear una función llamada EsPrimo que pasándole un número entero devuelva si es primo o
//		no.
//		*/
//		
//		do {
//			
//			System.out.print("Introduce dato: ");
//			entrada = sc.nextInt();
//			
//			if (entrada == 0) break;
//			
//			System.out.println("Es primo: " + EsPrimo(entrada));
//			
//		} while (entrada!=0);
//
//		/*
//		15. El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de
//		DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
//		0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12:
//		"N", 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
//		Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se
//		deberá crear una función llamada LetraDni a la que se le pase el número y devuelva la letra.
//		Ejemplo: para el DNI 56321122 el NIF es ‘X’.
//		Nota: se puede emplear un array para almacenar las letras.
//		*/
//		
//		System.out.print("Introduce número de DNI: ");
//		entrada = sc.nextInt();
//		
//		System.out.println("La letra es: " + LetraDNI(entrada));
//
//		/*
//		16. Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se
//		ajusta a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y,
//		z. Se deberá crear una función llamada Pitagoras a la que se le pase x, y, z y devuelva si son
//		iguales o no.
//		Por ejemplo: 3 ² + 4 ² = 5 ².
//		*/
//		
//		System.out.print("Introduce valor a: ");
//		a = sc.nextInt();
//		
//		System.out.print("Introduce valor b: ");
//		b = sc.nextInt();
//		
//		System.out.print("Introduce valor c: ");
//		c = sc.nextInt();
//		
//		System.out.println("Se ajusta a la ecuación Pitágoras: " + Pitagoras(a, b, c));
//
//		/*
//		17. Diseña una función llamada DivisoresNumero a la que se le pasa un número entero y
//		devuelve el número de divisores primos que tiene.
//		*/
//		
//		System.out.print("Introduce número: ");
//		entrada = sc.nextInt();
//		
//		System.out.println("Cantidad de divisores primos que tiene: " + DivisoresNumero(entrada));
//
//		/*
//		18. Diseñar una función llamada BuscarNumeroEnArray a la que se le pasa una array de enteros
//		y un número. Debemos buscar el número en la tabla e indicar si se encuentra o no.
//		*/
//		
//		int[] array = new int[5];
//		
//		for (int i=0; i<array.length; i++) {
//			
//			array[i] = (int)(Math.random() * 10);
//		}
//		
//		System.out.print("Introduce número a buscar: ");
//		entrada = sc.nextInt();
//		
//		if (BuscarNumeroEnArray(array, entrada)) System.out.println("El número se ha encontrado.");
//		else System.out.println("El número NO se ha encntrado.");
//
//		/*
//		19. Diseñar una función CalculadoraArrays, a la que se le pasa dos arrays y que operación se
//		desea realizar: sumar, restar, multiplicar o dividir (mediante un carácter: 's', 'r', 'm', 'd'). La
//		función debe devolver un array con los resultados.
//
//		A su vez, cada operación deberá ser una función.
//		*/
//		
//		int[] array1 = {3, 5, 7, 9}, array2 = {1, 2, 3, 4};
//		
//		int[] resultado = CalculadoraArrays(array1, array2);
//		
//		System.out.println(Arrays.toString(resultado));
//
//		/*
//		20. Diseñar una función llamada AciertosApuesta que toma como parámetros dos tablas. La
//		primera con los 6 números de una apuesta de la primitiva, y la segunda con los 6
//		números ganadores. La función debe devolver el número de aciertos.
//		*/
//		
//		int[] tablaGanadora = {5, 2, 8, 4, 7, 2}, tablaAdivinar = new int[6];
//		
//		System.out.println("Introduce tu apuesta (6 dígitos): ");
//		
//		for (int i=0; i<tablaGanadora.length; i++) {
//			
//			System.out.print("Número " + (i+1) + ": ");
//			tablaAdivinar[i] = sc.nextInt();
//		}
//		
//		System.out.println("Has acertado: " + AciertosApuesta(tablaAdivinar, tablaGanadora));
		
		/*
		25. Crear una función llamada ArrayCuadrado, que reciba un array de enteros de 10 elementos,
		devuelva el mismo array pero elevando al cuadrado los valores del array. Emplea el paso de
		parámetros por referencia
		*/
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(Arrays.toString(ArrayCuadrado(array)));
	}
}

package ejer1_16;
import java.util.Scanner;

public class Ejer1_16 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       /*
	  Escribir un programa que solicite un número de dos cifras,
	  y muestre por consola el número
	  invertido. Para poder mostrar el número invertido, se deben
	  obtener el número de decenas y
	  unidades, y una vez obtenidas se mostrarán en orden inverso.
	  Para obtener las decenas, se debe dividir el número 
	  introducido entre el valor 10; mientras que
	  para obtener las unidades, se debe obtener el resto (módulo: %) 
	  del número introducido entre el
	  valor 10.

       */
       
       System.out.print("Introduzca un número de dos cifras: ");
       int num = sc.nextInt();
       
       
       
       System.out.println("El número invertido es: " + num);
       
       
       
       
       
       sc.close();
    }

}

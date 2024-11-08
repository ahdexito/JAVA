package ejer1_9;
import java.util.Scanner;

public class Ejer1_9 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       /*
       La siguiente tabla muestra un algoritmo paso a paso (lista de instrucciones). Utiliza tres variables
        A, B y C que inicialmente valen 4, 2 y 3 respectivamente. Calcula el valor de las variables a mano y
        después desde Netbeans
       */
       
       int a=4, b=2, c=3;
       
        System.out.println("El valor de A es = " + a);
        System.out.println("El valor de B es = " + b);
        System.out.println("El valor de C es = " + c);
       
       /*
       1. A += 2           a=6, b=2, c=3
       2. B -= C           a=6, b=-1, c=3
       3. C *= 4           a=6, b=-1, c=12
       4. A %= B           a=0, b=-1, c=12
       5. C /= B           a=0, b=-1, c=-12
       6. A++              a=1, b=-1, c=-12
       7. B--              a=1, b=-2, c=-12
       */
       
       a += 2;
       System.out.println("a = " + a + ", b = " + b + ", c = " + c);

       b -= c;
       System.out.println("a = " + a + ", b = " + b + ", c = " + c);

       c *= 4;
       System.out.println("a = " + a + ", b = " + b + ", c = " + c);

       a %= b;
       System.out.println("a = " + a + ", b = " + b + ", c = " + c);

       
       c /= b;
       System.out.println("a = " + a + ", b = " + b + ", c = " + c);

       a++;
       System.out.println("a = " + a + ", b = " + b + ", c = " + c);

       b--;
       System.out.println("a = " + a + ", b = " + b + ", c = " + c);

       sc.close();
    }

}


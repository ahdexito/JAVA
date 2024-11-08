package ejer1_10_2;
import java.util.Scanner;

public class Ejer1_10_2 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in); 
        
        /*
        Realiza una aplicación que permita a un vehículo circular por carretera. Un vehículo podrá
        circular por carreta si tiene las cuatro ruedas y gasolina.
       
        El algoritmo solicitará el número de ruedas, las cuales se almacenarán en tipo entero; y si tiene o no
        gasolina, que se almacenará en tipo booleano.
        */
       
        System.out.println("Introduzca número de ruedas: ");
        int ruedas = sc.nextInt();
        
        System.out.println("Introduzca (true) o (false) según tenga gasolina o no: ");
        boolean gasolina = sc.nextBoolean();
        
       if (ruedas==4 && gasolina==true)
            System.out.println("SÍ puede circular.");
       
       else System.out.println("NO puede circular.");
       
       sc.close();
    }
    
}
 

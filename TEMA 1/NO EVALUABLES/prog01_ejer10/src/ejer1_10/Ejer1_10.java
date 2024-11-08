package ejer1_10;
import java.util.Scanner;

public class Ejer1_10 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       /*
       1. 24%5 = 4
       2. 7 / 2 + 2.5 = 6
       3. ( 4 + 6 ) * 3 + 2 * ( 5 - 1 ) = 38
       4. 5 / 2 + 17 % 3 = 4,5
       5. 7 >= 5 || 27 <> 8 = true , true = true
       6. ( 45 <= 7 ) || !( 5 >= 7 ) = false , true = true
       7. (( 3 + 2 ) * ( 3 + 2 ) - 15 ) / 2 * 5 = 10 / 10 = 1
       8. ( 25 > 20 ) && ( 13 > 5 ) = true , true = true
       9. ( 4 * 2 <= 8 || 2 * 2 < 5 ) && 4 > 3 + 1 = true , false = false
       10. ( 10 <= 2 * 5 && 3 < 4 ) || ( ! ( 8 > 7 ) && 3 * 2 <= 4 * 2 - 1 ) = true
                        true                 false        false
       */
       
        System.out.println("1. 24%5 = " + 24%5);
        System.out.println("2. 7 / 2 + 2.5 = " + (7 / 2 + 2.5));
        System.out.println("3. ( 4 + 6 ) * 3 + 2 * ( 5 - 1 ) = " + (( 4 + 6 ) * 3 + 2 * ( 5 - 1 )));
        System.out.println("4. 5 / 2 + 17 % 3 = " + (5 / 2 + 17 % 3));
        System.out.println("5. 7 >= 5 || 27 <> 8 = " + (7 >= 5 || 27 != 8));
        System.out.println("6. ( 45 <= 7 ) || !( 5 >= 7 ) = " + (( 45 <= 7 ) || !( 5 >= 7 )));
        System.out.println("7. (( 3 + 2 ) * ( 3 + 2 ) - 15 ) / 2 * 5 = 10 / 10 = " + ((( 3 + 2 ) * ( 3 + 2 ) - 15 ) / (2 * 5)));
        
       
       
       
       
       
       
       
       
       
       sc.close();
    }

}


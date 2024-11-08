package prog02_ejer3_06;

import java.util.Scanner;

public class PROG02_Ejer3_06 
{
     public static void main(String[] args) 
     {
	  Scanner sc = new Scanner(System.in);
	  
          /*
          Realiza un programa que dada una cantidad de euros que el usuario introduce por
	  teclado(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
	  alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar
	  el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará
	  que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por
	  ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo número de billetes
	  posible).
          */
            
          System.out.print("Introduzca la cantidad de dinero: ");
	  int dinero = sc.nextInt();
	  
	  int billet500=0, billet200=0, billet100=0, billet50=0, billet20=0, billet10=0, billet5=0;
	  
	  while (dinero>=500)
	  {
	       billet500 += 1;
	       dinero -= 500;
	  }
	  
          while (dinero>=200)
	  {
	       billet200 += 1;
	       dinero -= 200;
	  }
	  
	  while (dinero>=100)
	  {
	       billet100 += 1;
	       dinero -= 100;
	  }
	  
	  while (dinero>=50)
	  {
	       billet50 += 1;
	       dinero -= 50;
	  }
	  
	  while (dinero>=20)
	  {
	       billet20 += 1;
	       dinero -= 20;
	  }
	  
	  while (dinero>=10)
	  {
	       billet10 += 1;
	       dinero -= 10;
	  }
	  
	  while (dinero>=5)
	  {
	       billet5 += 1;
	       dinero -= 5;
	  }
	  
	  System.out.printf("""
			   Los billetes que necesitará son:
			   ~ %d de 500€
			   ~ %d de 200€
			   ~ %d de 100€
			   ~ %d de 50€
			   ~ %d de 20€
			   ~ %d de 10€
			   ~ %d de 5€
			   """,
	  billet500, billet200, billet100, billet50, billet20, billet10, billet5);
	  
     }

}

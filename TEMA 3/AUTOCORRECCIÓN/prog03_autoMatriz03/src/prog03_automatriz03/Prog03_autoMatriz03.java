package prog03_automatriz03;

import java.util.Scanner;

public class Prog03_autoMatriz03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
		introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
		matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
		menores que cero y cuántos son igual a cero.
        */
        
		int cuentaPosi=0, cuentaNega=0, cuentaCero=0, numero;
		
		System.out.print("Introduce valor de n: ");
		int n = sc.nextInt();
		
		System.out.print("Introduce valor de m: ");
		int m = sc.nextInt();
		
        int[][] matriz = new int[n][m];
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<m; j++) {
				
				System.out.print("Introduce número: ");
				numero = sc.nextInt();
				
				matriz[i][j] = numero;
				
				if (numero<0)
					cuentaNega++;
				
				else if (numero>0)
					cuentaPosi++;
				
				else
					cuentaCero++;
			}
		}
		
		System.out.println("Total de positivos: " + cuentaPosi);
		System.out.println("Total de negativos: " + cuentaNega);
		System.out.println("Total de ceros: " + cuentaCero);
    }
}
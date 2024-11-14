package prog03_autostring09;

import java.util.Scanner;

public class Prog03_autoString09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        9. Crea un programa que pida al usuario su nombre. Si se llama como tú (por ejemplo,
		"Nacho"), responderá "Bienvenido, jefe". En caso contrario, le saludará por su nombre.
		Utiliza la función concat.
        */
        
		String miNombre = "angel";
		String saludo = "Bienvenido, ";
		String salida;

        System.out.print("Introduce tu nombre: ");
        String usuNombre = sc.nextLine().toLowerCase();
		
		if (usuNombre.equals(miNombre))
			salida = saludo.concat("JEFE!");
		
		else
			salida = saludo.concat(usuNombre);
		
		System.out.println(salida);
    }
}

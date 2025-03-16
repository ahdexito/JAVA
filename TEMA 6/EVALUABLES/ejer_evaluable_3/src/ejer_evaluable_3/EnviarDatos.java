package ejer_evaluable_3;

public class EnviarDatos {

	private EnviarDatos() {
	}
    
	// SI LOS MÉTODOS SOLO DEVUELVEN TRUE NO NECESITAN SER BOOLEAN, SIMPLEMENTE VOID //
    public static void EnviarEmail() {
		
		System.out.println(VERDE + "TRATAMIENTO ENVIADOS VÍA EMAIL\n" + RESET);
	}
	
	public static void EnviarWhatsApp() {
		
		System.out.println(VERDE + "TRATAMIENTO ENVIADOS VÍA WHATSAPP\n" + RESET);
	}
	
	public static void EnviarLlamada() {
		
		System.out.println(VERDE + "TRATAMIENTO ENVIADOS VÍA LLAMADA\n" + RESET);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
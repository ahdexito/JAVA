package ejer_evaluable_3;

public class EnviarDatos {

	private EnviarDatos() {
	}
    
	// SI LOS MÉTODOS SOLO DEVUELVEN TRUE NO NECESITAN SER BOOLEAN, SIMPLEMENTE VOID //
    public static void EnviarEmail() {
		
		System.out.println(CIAN + "TRATAMIENTO ENVIADOS VÍA EMAIL" + RESET);
	}
	
	public static void EnviarWhatsApp() {
		
		System.out.println(CIAN + "TRATAMIENTO ENVIADOS VÍA WHATSAPP" + RESET);
	}
	
	public static void EnviarLlamada() {
		
		System.out.println(CIAN + "TRATAMIENTO ENVIADOS VÍA LLAMADA" + RESET);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m",
			AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
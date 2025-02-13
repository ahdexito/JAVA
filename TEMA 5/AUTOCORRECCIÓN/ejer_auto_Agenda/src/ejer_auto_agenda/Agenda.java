package ejer_auto_agenda;

public class Agenda {
	
	private Contacto[] array = new Contacto[3];
	private int contador = 0;
	
	public boolean AnyiadirContacto(Contacto contacto) {
				
		for (int i = 0; i < this.array.length; i++) {

			if (this.array[i] == null) {

				this.array[i] = contacto;
				System.out.println(CIAN + "\nCONTACTO " + contacto.getNombre() + " AÑADIDO A LA AGENDA" + RESET);
				
				contador++;
				
				return true;
			}
		}
		System.out.println(ROJO + "\nNO SE HA AÑADIDO EL CONTACTO " + contacto.getNombre() + " A LA AGENDA" + RESET);
		return false;
	}
	
	public boolean BorrarContacto(String dni) {
		
		for (int i = 0; i < contador; i++) {
			
			if (this.array[i].getDni().equalsIgnoreCase(dni) || this.array[i] != null) {
				
				this.array[i] = null;
				System.out.println(CIAN + "\nCONTACTO CON DNI " + dni + " BORRADO" + RESET);
				
				contador--;
				
				return true;
			}
		}
		System.out.println(ROJO + "\nNO SE HA BORRADO EL CONTACTO CON DNI " + dni + RESET);
		return false;
	}
		
	//////////////////////////////////////////////////////
	
	public Agenda() {
	}
	
	// constructor de copia

	public Contacto[] getArray() {
		return array;
	}

	public void setArray(Contacto[] array) {
		this.array = array;
	}
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}

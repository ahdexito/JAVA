package ejer_auto_agenda;

public class Agenda {
	
	private Contacto[] agenda = new Contacto[3];
	private int contador = 0;
	
	public boolean AnyiadirContacto(Contacto contacto) {
				
		for (int i = 0; i < this.agenda.length; i++) {

			if (this.agenda[i] == null) {

				this.agenda[i] = contacto;
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
			
			if (this.agenda[i].getDni().equalsIgnoreCase(dni) || this.agenda[i] != null) {
				
				this.agenda[i] = null;
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
	
	// COPIAR AGENDA

	public Contacto[] getAgenda() {
		return agenda;
	}

	public void setAgenda(Contacto[] agenda) {
		this.agenda = agenda;
	}
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}

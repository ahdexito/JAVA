package ejer_auto_agenda;

import java.util.Arrays;

public class Agenda {
	
	private Contacto[] array = new Contacto[3];
	
	public boolean AnyiadirContacto(Contacto contacto) {
				
		for (int i = 0; i < this.array.length; i++) {

			if (this.array[i] == null) {

				this.array[i] = contacto;
				System.out.println("CONTACTO AÑADIDO A LA AGENDA");
				return true;
			}
		}
		System.out.println("NO SE HA AÑADIDO EL CONTACTO A LA AGENDA");
		return false;
	}
	
	public boolean BorrarContacto(String dni) {
		
		for (int i = 0; i < this.array.length; i++) {
			
			if (this.array[i].getDni().equals(dni) && this.array[i] != null) {
				
				this.array[i] = null;
				System.out.println("CONTACTO CON DNI " + dni + " BORRADO");
				return true;
			}
		}
		System.out.println("NO SE HA BORRADO EL CONTACTO CON DNI " + dni);
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
	
	
}

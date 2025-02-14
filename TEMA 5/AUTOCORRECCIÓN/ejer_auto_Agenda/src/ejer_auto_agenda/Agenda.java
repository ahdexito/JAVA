package ejer_auto_agenda;

public class Agenda {
	
	private Contacto[] agenda = new Contacto[10];
	private int contador = 0;
	
	// AÑADIR CONTACTO A LA ÚLTIMA POSICIÓN DISPONIBLE
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
	
	// BORRAR CONTACTO POR DNI
	public boolean BorrarContacto(String dni) {

		// BUSCAR DNI SI HAY CONTACTOS
		for (int i = 0; i < this.contador; i++) {

			// SI ENCUENTRA EL DNI
			if (this.agenda[i].getDni().equals(dni)) {

				// EL DNI ENCONTRADO ES MACHACADO POR EL ÚLTIMO CONTACTO EXISTENTE
				this.agenda[i] = this.agenda[this.contador - 1];

				// EL CONTACTO DUPLICADO QUE SE HA MACHACADO LO BORRAMOS
				this.agenda[this.contador - 1] = null;

				System.out.println(CIAN + "\nCONTACTO CON DNI " + dni + " BORRADO" + RESET);

				contador--;

				return true;
			}
		}
		// SI NO SE ENCUENTRA EL DNI RECIBIDO EN LA AGENDA
		System.out.println(ROJO + "\nNO SE HA BORRADO EL CONTACTO CON DNI " + dni + RESET);
		return false;
	}
	
	// BUSCAR CONTACTO POR DNI
	private Contacto BuscarContacto(String dni) {
		
		Contacto contacto = null;
		
		for (int i = 0; i < this.contador; i++) {

			// SI ENCUENTRA EL DNI
			if (this.agenda[i].getDni().equals(dni)) {

				contacto = this.agenda[i];

				System.out.println(CIAN + "\nCONTACTO CON DNI " + dni + " ENCONTRADO" + RESET);

				return contacto;
			}
		}
		// SI NO SE ENCUENTRA EL DNI RECIBIDO EN LA AGENDA
		System.out.println(ROJO + "\nNO SE HA ENCONTRADO EL CONTACTO CON DNI " + dni + RESET);
		return contacto;
	}
	
	// MODIFICAR DNI, MÓVIL Y DIRECCIÓN DE UN CONTACTO
	public boolean ModificarContacto(String dni, String movil, String direccion) {
		
		for (int i = 0; i < this.contador; i++) {
			
			if (this.agenda[i].getDni().equals(dni)) {
				
				this.agenda[i].setMovil(movil);
				
				this.agenda[i].setDireccion(direccion);
				
				System.out.println("\n" + VERDE + "EL CONTACTO CON DNI " + dni + " SE HA MODIFICADO" + RESET);
				
				return true;
			}
		}
		System.out.println("\n" + ROJO + "NO SE HA PODIDO MODIFICAR EL CONTACTO CON DNI " + dni + RESET);
		
		return false;
	}
	
	// MOSTRAR CONTACTOS QUE COINCIDAN CON EL MISMO SEXO PASADO POR PARÁMETRO
	public void MostrarContactos(char sexo) {
		
		boolean encontrado = false;
		
		System.out.print("\n" + AMARILLO + "CONTACTOS CON SEXO '" + sexo + "'" + RESET);
		
		for (int i = 0; i < this.contador; i++) {
			
			if (this.agenda[i].getSexo() == sexo) {
				
				this.agenda[i].MostrarInformacion();
				
				encontrado = true;
			}
		}
		
		if (!encontrado) System.out.println("\n\n" + ROJO + "NO SE HA ENCONTRADO NINGUNO QUE COINCIDA CON '" + sexo + "'" + RESET);
	}
	
	// MOSTRAR CONCTACTOS QUE COINCIDAN CON EL MISMO NOMBRE PASADO POR PARÁMETRO
	public void MostrarConctactos(String nombre) {
		
		boolean encontrado = false;
		
		System.out.print("\n" + AMARILLO + "CONTACTOS CON NOMBRE '" + nombre + "'" + RESET);
		
		for (int i = 0; i < this.contador; i++) {
			
			if (this.agenda[i].getNombre().equals(nombre)) {
				
				this.agenda[i].MostrarInformacion();
				
				encontrado = true;
			}
		}
		
		if (!encontrado) System.out.println("\n\n" + ROJO + "NO SE HA ENCONTRADO NINGUNO QUE COINCIDA CON '" + nombre + "'" + RESET);
	}
		
	//////////////////////////////////////////////////////
	
	// COPIAR AGENDA
	
	
	// CONSTRUCTOR POR DEFECTO
	public Agenda() {
	}
	
	//////////////////////////////////////////////////////
	
	// SETTERS Y GETTERS
	public int getContador() {	
		return contador;
	}
	
	public void setContador(int contador) {	
		this.contador = contador;
	}
	
	public Contacto[] getAgenda() {
		return agenda;
	}

	public void setAgenda(Contacto[] agenda) {
		this.agenda = agenda;
	}
	
	public Contacto getBuscarContacto(String dni) {
		return BuscarContacto(dni);
	}
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
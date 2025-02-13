package ejer_auto_agenda;

import java.util.Scanner;

public class Ejer_auto_Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// OBJETOS CONTACTO
		Contacto c1 = new Contacto("Ángel", "García", "Smakula", "12345678T", "666555444", "C/España Nº5", 'V');
		Contacto c2 = new Contacto("María", "García", "Vázquez", "12345678E", "600555444", "C/Francia Nº7", 'M');
		Contacto c3 = new Contacto("Juan", "Juan", "Juan", "12345678A", "666555777", "C/Italia Nº2", 'V');
		Contacto c4 = new Contacto("Carlos", "Juan", "López", "12345678B", "666123777", "C/Portugal Nº8", 'V');
		
		// OBJETO ARRAY DE CONTACTOS
		Agenda ag1 = new Agenda();
		
		// AÑADIR CONTACTOS
		ag1.AnyiadirContacto(c1);
		ag1.AnyiadirContacto(c2);
		ag1.AnyiadirContacto(c3);
		ag1.AnyiadirContacto(c4);
		
		MostrarContactos(ag1);
		
		// BORRAR CONTACTO
		ag1.BorrarContacto("12345678T");
		
		MostrarContactos(ag1);
		
		// AÑADIR CONTACTO
		ag1.AnyiadirContacto(c1);
		
		MostrarContactos(ag1);
		
		// BORRAR CONTACTO
		ag1.BorrarContacto("12345678B");
		ag1.BorrarContacto("12345678T");
		
		MostrarContactos(ag1);
		
		ag1.BorrarContacto("12345678T");
		
		MostrarContactos(ag1);
		
	}
	
	// MOSTRAR CONTACTOS
	public static void MostrarContactos(Agenda agenda) {
		
		for (int i = 0; i < agenda.getContador(); i++) {
			
			System.out.print("\n" + AMARILLO + "CONTACTO " + (i + 1) + ": " + RESET); 
			
			agenda.getAgenda()[i].MostrarInformacion();
		}
	}
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}

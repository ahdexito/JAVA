package ejer_auto_agenda;

import java.util.Scanner;

public class Ejer_auto_Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// OBJETOS CONTACTO
		Contacto c1 = new Contacto("Luis", "Hernandez", "Lopez", "12345678A", "654789321", "C/Granada Nº10", 'V');
		Contacto c2 = new Contacto("Marta", "Gomez", "Lopez", "23456789B", "654789322", "C/Sevilla Nº3", 'M'); // Teléfono repetido
		Contacto c3 = new Contacto("Ana", "Lopez", "Martinez", "34567890C", "678945321", "C/Malaga Nº5", 'M');
		Contacto c4 = new Contacto("Carlos", "Hernandez", "López", "45678901D", "666123777", "C/Portugal Nº8", 'V');
		Contacto c5 = new Contacto("Luis", "Fernandez", "Gomez", "56789012E", "654789321", "C/Granada Nº10", 'V'); // Nombre y dirección repetidos
		Contacto c6 = new Contacto("Elena", "Sanchez", "Ruiz", "67890123F", "600700800", "C/Toledo Nº7", 'M');
		Contacto c7 = new Contacto("Pedro", "Garcia", "Fernandez", "78901234G", "678945322", "C/Malaga Nº5", 'V'); // Teléfono y dirección repetidos
		Contacto c8 = new Contacto("David", "Perez", "Hernandez", "89012345H", "620987654", "C/Alicante Nº12", 'V');
		Contacto c9 = new Contacto("Marta", "Perez", "Martinez", "90123456I", "654789323", "C/Sevilla Nº3", 'M'); // Nombre, apellidos, teléfono y dirección repetidos
		Contacto c10 = new Contacto("Javier", "Lopez", "Martinez", "01234567J", "699888777", "C/Madrid Nº6", 'V');

		
		// OBJETO ARRAY DE CONTACTOS
		Agenda ag1 = new Agenda();
		
		MostrarContactos(ag1);
		
		// AÑADIR CONTACTOS
		ag1.AnyiadirContacto(c1);
		ag1.AnyiadirContacto(c2);
		ag1.AnyiadirContacto(c3);
		ag1.AnyiadirContacto(c4);
		ag1.AnyiadirContacto(c5);
		ag1.AnyiadirContacto(c6);
		ag1.AnyiadirContacto(c7);
		ag1.AnyiadirContacto(c8);
		ag1.AnyiadirContacto(c9);
		ag1.AnyiadirContacto(c10);
		
		MostrarContactos(ag1);
		
		// BORRAR CONTACTO
		ag1.BorrarContacto("45678901D");
		
		MostrarContactos(ag1);
		
		// AÑADIR CONTACTO
		ag1.AnyiadirContacto(c4);
		
		MostrarContactos(ag1);
		
		// BORRAR CONTACTO
		ag1.BorrarContacto("12345678B");
		
		MostrarContactos(ag1);
		
		// BUSCAR CONTACTO
		ag1.getBuscarContacto("12345678B");
		
		ag1.getBuscarContacto("45678901D").MostrarInformacion();
		
		// MODIFICAR CONTACTO POR DNI
		ag1.ModificarContacto("01234567J", "699888777", "C/Malaga Nº5");
		ag1.ModificarContacto("12345678T", "999888777", "C/Europa Nº1");
		
		MostrarContactos(ag1);
		
		// MOSTRAR CONTACTO POR ATRIBUTO SEXO
		ag1.MostrarContactos('V');
		ag1.MostrarContactos('M');
		ag1.MostrarContactos('H');
		
		// MOSTRAR CONTACTO POR ATRIBUTO NOMBRE
		ag1.MostrarConctactos("Luis");
		ag1.MostrarConctactos("Alberto");
		ag1.MostrarConctactos("Marta");
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
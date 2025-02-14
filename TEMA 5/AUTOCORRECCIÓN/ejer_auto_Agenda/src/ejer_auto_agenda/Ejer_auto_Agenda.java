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
		
		// AÑADIR CONTACTOS
		/*
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
		*/
		
		int opcion = 0;
		
		do {			
			
			ImprimirMenu();
			opcion = sc.nextInt();
			
			switch (opcion) {
				
				case 1:
					
			}
			
		} while (opcion != 7);
	}
	
	// IMPRIMIR MENÚ
	public static void ImprimirMenu() {
		
		System.out.println(""
				+ "\n" + MORADO + "###   APLICACIÓN AGENDA DE CONTACTOS   ###" + RESET
				+ "\n" + AMARILLO + "==========================================="
				+ "\n" + "Menú:"
				+ "\n" + AMARILLO + "1. " + RESET + "Insertar Contacto"
				+ "\n" + AMARILLO + "2. " + RESET + "Modificar Contacto"
				+ "\n" + AMARILLO + "3. " + RESET + "Eliminar Contacto"
				+ "\n" + AMARILLO + "4. " + RESET + "Visalizar Contactos por sexo"
				+ "\n" + AMARILLO + "5. " + RESET + "Visualizar Contactos por nombre"
				+ "\n" + AMARILLO + "6. " + RESET + "Mostrar "
				+ "\n" + AMARILLO + "7. " + RESET + "Insertar Contacto"
				+ "\nIntroduce opción: ");
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
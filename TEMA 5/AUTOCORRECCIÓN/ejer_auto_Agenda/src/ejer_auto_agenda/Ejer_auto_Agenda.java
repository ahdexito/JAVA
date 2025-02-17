package ejer_auto_agenda;

import java.util.Scanner;

public class Ejer_auto_Agenda {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// OBJETO ARRAY DE CONTACTOS
		Agenda ag1 = new Agenda();
		
		// CREAR OBJETO AGENDA
		Agenda agenda = new Agenda();
		
		// AÑADIR CONTACTOS DE EJEMPLO
		Contacto c1 = new Contacto("Carlos", "Hernandez", "López", "12345678B", "666123777", "C/Portugal Nº8", 'V');
		Contacto c2 = new Contacto("Laura", "Martínez", "Sánchez", "98765432A", "677890123", "Av. España Nº12", 'M');
		Contacto c3 = new Contacto("Carlos", "Gómez", "Fernández", "11223344C", "655321789", "C/Colón Nº3", 'V');
		Contacto c4 = new Contacto("Sofía", "López", "Martínez", "55667788D", "699876543", "Paseo del Prado Nº20", 'M');
		Contacto c5 = new Contacto("Javier", "Fernández", "Ruiz", "44332211E", "622334455", "C/San Juan Nº5", 'V');
		Contacto c6 = new Contacto("Ana", "García", "Rodríguez", "66778899F", "611223344", "Av. Libertad Nº15", 'M');
		Contacto c7 = new Contacto("Daniel", "Pérez", "Hernández", "99887766G", "644556677", "C/Mayor Nº9", 'V');
		Contacto c8 = new Contacto("Laura", "Sánchez", "Gómez", "11224455H", "688990011", "C/Gran Vía Nº1", 'M');
		Contacto c9 = new Contacto("Mario", "Ruiz", "López", "33445566I", "677889900", "Plaza Mayor Nº7", 'V');
		Contacto c10 = new Contacto("Lucía", "Núñez", "Alonso", "77889900J", "655443322", "C/Sevilla Nº22", 'M');
		agenda.AnyiadirContacto(c1); agenda.AnyiadirContacto(c2);
		agenda.AnyiadirContacto(c3); agenda.AnyiadirContacto(c4);
		agenda.AnyiadirContacto(c5); agenda.AnyiadirContacto(c6);
		agenda.AnyiadirContacto(c7); agenda.AnyiadirContacto(c8);
		agenda.AnyiadirContacto(c9); agenda.AnyiadirContacto(c10);
		
		int opcion = 0;
		
		do {	
			// IMPRIMIR MENÚ
			ImprimirMenu();
			
			// SOLICITAR OPCIÓN DEL MENÚ
			opcion = sc.nextInt();
			sc.nextLine();
			
			Contacto contacto = new Contacto();
			
			// SWITCH MENÚ
			switch (opcion) {
				
				// AÑADIR CONTACTO
				case 1:
					System.out.println("\n" + MORADO + "OPCIÓN 1: " + CIAN + "INSERTAR CONTACTO" + RESET);
					
					if (agenda.AnyiadirContacto(contacto)) agenda.AnyiadirContacto(SolicitarDatos());
					break;
					
				case 2:
					System.out.println("\n" + MORADO + "OPCIÓN 2: " + CIAN + "MODIFICAR CONTACTO" + RESET);
					
					
					break;
					
					
				
				// MOSTRAR CONTACTOS
				case 6:
					MostrarContactos(agenda);
					break;
			}
			
		} while (opcion != 7);
	}
	
	// SOLICITAR DATOS DE CONTACTO
	public static Contacto SolicitarDatos() {
		
		Contacto contacto = new Contacto();
		
		System.out.print("\n" + MORADO + "Nombre: " + RESET);
		contacto.setNombre(sc.nextLine());
		
		System.out.print(MORADO + "Primer apellido: " + RESET);
		contacto.setApellido1(sc.nextLine());
		
		System.out.print(MORADO + "Segundo apellido: " + RESET);
		contacto.setApellido2(sc.nextLine());
		
		System.out.print(MORADO + "DNI: " + RESET);
		contacto.setDni(sc.nextLine());
		
		System.out.print(MORADO + "Número de teléfono: " + RESET);
		contacto.setMovil(sc.nextLine());
		
		System.out.print(MORADO + "Dirección: " + RESET);
		contacto.setDireccion(sc.nextLine());
		
		System.out.print(MORADO + "Sexo: " + RESET);
		contacto.setSexo(sc.next().charAt(0));
		
		return contacto;
	}
	
	// IMPRIMIR MENÚ
	public static void ImprimirMenu() {
		
		System.out.print(""
				+ "\n" + MORADO + "###   " + AMARILLO + "AGENDA DE CONTACTOS" + MORADO + "   ###" + RESET
				+ "\n" + MORADO + "==============================="
				+ "\n" + AMARILLO + "Menú:" + RESET
				+ "\n\n" + MORADO + "1. " + CIAN + "Insertar Contacto" + RESET
				+ "\n" + MORADO + "2. " + CIAN + "Modificar Contacto" + RESET
				+ "\n" + MORADO + "3. " + CIAN + "Eliminar Contacto" + RESET
				+ "\n" + MORADO + "4. " + CIAN + "Visalizar Contactos por sexo" + RESET
				+ "\n" + MORADO + "5. " + CIAN + "Visualizar Contactos por nombre" + RESET
				+ "\n" + MORADO + "6. " + CIAN + "Mostrar Agenda Completa" + RESET
				+ "\n" + MORADO + "7. " + CIAN + "Insertar Contacto" + RESET
				+ "\n\n" + MORADO + "Introduce opción: " + RESET);
	}
	
	// MOSTRAR CONTACTOS
	public static void MostrarContactos(Agenda agenda) {
		
		for (int i = 0; i < agenda.getContador(); i++) {
			
			System.out.println("\n" + AMARILLO + "CONTACTO " + (i + 1) + ": " + RESET); 
			System.out.print(MORADO + "===============================" + RESET);
			agenda.getAgenda()[i].MostrarInformacion();
		}
	}
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}
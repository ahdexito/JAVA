package ejer_auto_agenda;

import java.util.Scanner;

public class Ejer_auto_Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Contacto c1 = new Contacto("Ángel", "García", "Smakula", "12345678T", "666555444", "C/España Nº5", 'V');
		
		c1.MostrarInformacion();
		
		System.out.println("");
		
		Agenda ag1 = new Agenda();
		
		ag1.AnyiadirContacto(c1);
		
		System.out.println("");
		
		c1.MostrarInformacion();
		
		System.out.println("");
		
		ag1.BorrarContacto("12345678T");
		
		System.out.println("");
		
		c1.MostrarInformacion();
		
		System.out.println("");
		
		ag1.BorrarContacto("12345678T");
	}
}

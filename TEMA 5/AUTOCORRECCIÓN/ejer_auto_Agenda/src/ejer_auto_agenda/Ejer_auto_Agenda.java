package ejer_auto_agenda;

import java.util.Scanner;

public class Ejer_auto_Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Contacto c1 = new Contacto("Ángel", "García", "Smakula", "12345678T", "666555444", "C/España Nº5", 'V');
		Contacto c2 = new Contacto("María", "García", "Vázquez", "12345678E", "600555444", "C/Francia Nº7", 'M');
		Contacto c3 = new Contacto("Juan", "Juan", "Juan", "12345678A", "666555777", "C/Italia Nº2", 'V');
		Contacto c4 = new Contacto("Carlos", "Juan", "López", "12345678B", "666123777", "C/Portugal Nº8", 'V');
		
		c1.MostrarInformacion();
				
		Agenda ag1 = new Agenda();
		
		ag1.AnyiadirContacto(c1);
		ag1.AnyiadirContacto(c2);
		ag1.AnyiadirContacto(c3);
		ag1.AnyiadirContacto(c4);
		
		ag1.getAgenda()[0].MostrarInformacion();
		
		ag1.BorrarContacto("12345678T");
				
		ag1.AnyiadirContacto(c1);
		
		ag1.getAgenda()[0].MostrarInformacion();
		
		//c1.ModificarContacto(c1.getMovil(), c1.getDireccion());
		
		//c1.MostrarInformacion();
	}
}

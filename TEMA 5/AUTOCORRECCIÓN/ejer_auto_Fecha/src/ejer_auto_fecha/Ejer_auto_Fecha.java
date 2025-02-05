package ejer_auto_fecha;
import java.time.*;
import java.util.Scanner;

public class Ejer_auto_Fecha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Fecha f1 = new Fecha();
		Fecha f2 = new Fecha();
		
		f1.dia = 12;
		f1.mes = 1;
		f1.anyo = 2000;
		
		f2.dia = 24;
		f2.mes = 7;
		f2.anyo = 2000;
		
		f1.MostrarFecha();
		
		System.out.println("");
		
		f2.MostrarFecha();
		
		LocalDate fecha1 = LocalDate.of(f1.anyo, f1.mes, f1.dia);
		LocalDate fecha2 = LocalDate.of(f2.anyo, f2.mes, f2.dia);
		
		System.out.println("");
	}
}

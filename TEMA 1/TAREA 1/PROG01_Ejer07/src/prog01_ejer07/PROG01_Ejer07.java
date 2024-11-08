package prog01_ejer07;
import java.util.Scanner;

public class PROG01_Ejer07 
{

     public static void main(String[] args) 
     {
	  /*
	  Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo de viaje
	  hasta llegar a otra ciudad B es de T segundos.
	  Escribir un programa llamado “PROG01_Ejer07” que determine la hora de llegada a la ciudad B.
	  NOTA: Como sugerencia, se pueden emplear la división (/) y el resto(%) para obtener los resultados.
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  
	  
	  // Solicitamos la hora, minutos, y segundos de salida.
	  System.out.println("Hora de salida: ");
	  int hora_salida = sc.nextInt();
	  
	  System.out.println("Minutos de salida: ");
	  int min_salida = sc.nextInt();
	  
	  System.out.println("Segundos de salida: ");
	  int seg_salida = sc.nextInt();
	  
	  
	  // Solicitamos los segundos que ha tardado.
	  System.out.println("Segundos que has tardado: ");
	  int segundos = sc.nextInt();
	  
	  
	  // Calculamos cuánto ha tardado mediante los segundos transcurridos.
	  int horas_tarda = segundos / 3600;
	  
	  int min_tarda = (segundos % 3600) / 60;
	  
	  int seg_tarda = segundos % 60;
	  
	  
	  // Sumamos lo que tarda a los valores iniciales.
	  int hora_llegada = hora_salida + horas_tarda;
	  
	  int min_llegada = min_salida + min_tarda;
	  
	  int seg_llegada = seg_salida + seg_tarda;
	  
	  
	  // Imprimimos por pantalla la hora de llegada y el tiempo que ha tardado
	  System.out.printf("Hora de llegada: %d : %d : %d \n", hora_llegada, min_llegada, seg_llegada);
	  
	  System.out.printf("Has tardado %d horas, %d minutos y %d segundos \n", horas_tarda, min_tarda, seg_tarda);
	  
	  
	  
     }
     
}

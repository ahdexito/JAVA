package vista;

import conexion.Database;
import java.sql.*;
import java.util.Scanner;
import modelo.Curso;
import procedimientos.Procedimientos;

public class Main {
    
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner (System.in);
				
		try {
			
			Database db = Database.getConexUnica("universidaddb");
			Connection conex = db.getConex();
			
			ResultSet rs = null;
			
			int opcion;
			
			do {
				System.out.print("\n"
						+ "------------ MENÚ PRINCIPAL ------------\n"
						+ "\n"
						+ "  1. Consultar curso\n"
						+ "  2. Actualizar matrícula\n"
						+ "  3. Eliminar alumno\n"
						+ "  0. Salir\n"
						+ "\n"
						+ "----------------------------------------\n"
						+ "\n"
						+ "Introduce opción: ");
				opcion = sc.nextInt();
				sc.nextLine();
				
				System.out.println("");
				
				switch (opcion) {
					case 1:
						System.out.println("CRITERIOS DE BÚSQUEDA (ENTER SI SIN CRITERIO)\n");
						
						System.out.print("Nombre de curso: ");
						String nombreCurso = sc.nextLine();
						
						System.out.print("Cantidad de créditos: ");
						String cantCreditos = sc.nextLine();
						
						System.out.println("");
						
						rs = Curso.obtenerCurso(conex, nombreCurso, cantCreditos);
						
						System.out.println(("-").repeat(115));
						System.out.printf("%-10s %-20s %-15s\n", "|  ID", "|  NOMBRE", "|  CRÉDITOS");
						System.out.println(("-").repeat(115));
						
						while (rs.next()) {
							
							System.out.printf("%-10s %-20s %-15s",
									"|  " + rs.getInt("id"),
									"|  " + rs.getString("nombre"),
									"|  " + rs.getInt("creditos"));
							
							System.out.println("\n" + ("-").repeat(115));
						}
						
						break;
						
					case 2:
						System.out.println("ACTUALIZAR FECHA DE MATRÍCULA\n");
						
						System.out.print("Introduce ID matrícula: ");
						int idMatricula = sc.nextInt();
						sc.nextLine();
						
						System.out.print("Introduce nueva fecha (AAAA-MM-DD): ");
						String nuevaFecha = sc.nextLine();
						
						int resultado = Procedimientos.actualizarMatricula(conex, idMatricula, nuevaFecha);
						
						if (resultado > 0) {
							System.out.println("MATRÍCULAS ACTUALIZADAS: " + resultado);
						}
						
						else {
							System.out.println("NO SE HAN ENCONTRADO MATRÍCULAS");
						}
						
						break;
						
					case 3:
						
						int[] idAlumnos = new int[5];
						int contador = 0;
						int entrada = -1;
						
						do {
							System.out.print("Introduce ID alumno: ");
							entrada = sc.nextInt();
							
							idAlumnos[contador] = entrada;
							
							contador++;
						} while (contador < idAlumnos.length && entrada != 0);
						
						break;
						
					case 0:
						conex.close();
						
						break;
				}
				
				if (rs != null) {
					rs.getStatement().close();
					rs.close();
				}
				
			} while (opcion != 0);
		} 
		
		catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
    }	
}
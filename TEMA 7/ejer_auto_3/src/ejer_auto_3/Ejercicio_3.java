package ejer_auto_3;

import java.util.Scanner;

public class Ejercicio_3 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int opcion;
            
            do {
                System.out.print("\n" + AMARILLO
                        + "--------- GESTIÓN CLÍNICA VETERINARIA ---------\n" + RESET
                        + "  1. Listar todos los clientes\n" + RESET
                        + "  2. Buscar clientes por nombre\n" + RESET
                        + "  3. Listar todas las mascotas\n" + RESET
                        + "  4. Insertar un nuevo cliente\n" + RESET
                        + "  5. Actualizar un cliente existente\n" + RESET
                        + "  6. Eliminar un cliente\n" + RESET
                        + "  0. Salir\n" + AMARILLO
                        + "-----------------------------------------------\n"
                                + "\n" + MORADO
                        + "INTRODUCE OPCIÓN: " + RESET);
                opcion = sc.nextInt();
                sc.nextLine();
                
                System.out.println("");
                
                switch (opcion) {
                    case 1 -> {
                        System.out.println(AMARILLO + "---------- LISTAR TODOS LOS CLIENTES ----------\n" + RESET);
                        Cliente.listarClientes();
                    }
                        
                    case 2 -> {
                        System.out.println(AMARILLO + "---------- LISTAR CLIENTE POR NOMBRE ----------\n" + RESET);
                        Cliente.listarCliente();
                    }
                        
                    case 3 -> {
                        System.out.println(AMARILLO + "---------- LISTAR TODAS LAS MASCOTAS ----------\n" + RESET);
                        Mascota.listarMascotas();
                    }
                        
                    case 4 -> {
                        System.out.println(AMARILLO + "------------ INSERTAR NUEVO CLIENTE -----------\n" + RESET);
                        Cliente.insertarCliente();
                    }
                        
                    case 5 -> {
                        System.out.println(AMARILLO + "---------- MODIFICAR DATOS DE CLIENTE ---------" + RESET);
                        Cliente.modificarCliente();
                    }
                        
                    case 6 -> {
                        System.out.println(AMARILLO + "--------------- ELIMINAR CLIENTE --------------" + RESET);
                        Cliente.eliminarCliente();
                    }
                        
                    case 0 -> System.out.println(CIAN + "### HASTA PRONTO ###" + "\n");
                }
            }
            while (opcion != 0);
        }
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RESET = "[0m", MORADO = "[35m", ROJO = "[31m",
		AZUL = "[34m", CIAN = "[36m", VERDE = "[32m", AMARILLO = "[33m";
}
package ejer_auto_06;

import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public Inventario() {
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void mostrarLista() {
		
		for(Mascota mascota: mascotas) {
			
			System.out.println("TIPO: " + mascota.getClass().getName() + "; NOMBRE: " + mascota.nombre);
			
			System.out.println("");
		}
	}
	
	public void mostrarDatos(String nombre) {
		
	}
	
	public void mostrarTodosDatos(){
		
	}
	
	public void insertar(Mascota mascota) {
		this.mascotas.add(mascota);
	}
	
	public void eliminar(String nombre) {
		
	}
	
	public void vaciar() {
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
}
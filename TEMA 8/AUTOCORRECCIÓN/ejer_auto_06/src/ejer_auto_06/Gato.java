package ejer_auto_06;

import java.time.LocalDate;

public class Gato extends Mascota {

	public Gato() {
	}

	public Gato(String nombre, String estado, LocalDate fechaNacimiento) {
		super(nombre, estado, fechaNacimiento);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public void muestra() {
	
	}

	@Override
	public void habla() {
	
	}

	@Override
	public void cumple() {
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
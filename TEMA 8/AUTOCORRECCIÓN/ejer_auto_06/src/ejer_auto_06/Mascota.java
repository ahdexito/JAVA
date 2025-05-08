package ejer_auto_06;

import java.time.*;

public abstract class Mascota {
    
    protected String nombre;
	protected String estado;
	protected LocalDate fechaNacimiento;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Mascota() {
	}

	public Mascota(String nombre, String estado, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public abstract void muestra();
	
	public abstract void habla();
	
	public abstract void cumple();
	
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
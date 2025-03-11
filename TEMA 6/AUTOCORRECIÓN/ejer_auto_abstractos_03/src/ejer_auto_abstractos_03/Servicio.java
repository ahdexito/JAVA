package ejer_auto_abstractos_03;

import java.time.*;

public abstract class Servicio {
    
    protected String trabajador;
	protected LocalDate fechaInicio;
	protected String cliente;

	public Servicio() {
	}

	public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
		this.trabajador = trabajador;
		this.fechaInicio = fechaInicio;
		this.cliente = cliente;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public abstract double costeMaterial();
	
	public abstract double costeManoObra();
	
	public abstract double costeTotal();
	
	public abstract String detalleServicio();
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(String trabajador) {
		this.trabajador = trabajador;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}
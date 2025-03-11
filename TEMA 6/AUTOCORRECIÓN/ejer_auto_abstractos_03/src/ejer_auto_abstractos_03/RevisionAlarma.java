package ejer_auto_abstractos_03;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {
    
	private int alarmas;

	public RevisionAlarma() {
	}

	public RevisionAlarma(int alarmas, String trabajador, LocalDate fechaInicio, String cliente) {
		super(trabajador, fechaInicio, cliente);
		this.alarmas = alarmas;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
    @Override
	public double costeMaterial() {
		
		return 0;
	}
	
	@Override
	public double costeManoObra() {
		
		return 0;
	}
	
	@Override
	public double costeTotal() {
		
		return 0;
	}
	
	@Override
	public String detalleServicio() {
		
		return "";
	}

	public int getAlarmas() {
		return alarmas;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public void setAlarmas(int alarmas) {
		this.alarmas = alarmas;
	}

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
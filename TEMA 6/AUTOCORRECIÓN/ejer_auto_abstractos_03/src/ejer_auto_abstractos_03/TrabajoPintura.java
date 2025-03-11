package ejer_auto_abstractos_03;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {
    
    private double superficie;
	private double precioPintura;

	public TrabajoPintura() {
	}
	
	public TrabajoPintura(double superficie, double precioPintura, String trabajador, LocalDate fechaInicio, String cliente) {
		super(trabajador, fechaInicio, cliente);
		this.superficie = superficie;
		this.precioPintura = precioPintura;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public double costeMaterial() {
		
		return (this.superficie / 7.8) * this.precioPintura;
	}
	
	@Override
	public double costeManoObra() {
		
		return (this.superficie / 10) * 9.5;
	}
	
	@Override
	public double costeTotal() {
		
		double total = costeMaterial() + costeManoObra();
		
		if (this.superficie < 50) total += (total * 0.15);
		
		return total;
	}
	
	@Override
	public String detalleServicio() {
		
		return ""
				+ "TRABAJO DE PINTURA\n"
				+ "";
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getPrecioPintura() {
		return precioPintura;
	}

	public void setPrecioPintura(double precioPintura) {
		this.precioPintura = precioPintura;
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
package prueba_tema5;

import java.time.*;

public class Libro {
    
    private String nombre;
	private String autor;
	private String codigo;
	private LocalDate fechaPublicacion;

	
	public Libro() {
	}

	public Libro(String nombre, String autor, String codigo, LocalDate fechaPublicacion) {
		this.nombre = nombre;
		this.autor = autor;
		this.codigo = codigo;
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
}
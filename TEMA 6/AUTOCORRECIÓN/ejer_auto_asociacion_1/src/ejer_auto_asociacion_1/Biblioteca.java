package ejer_auto_asociacion_1;

public class Biblioteca {
	
	// ATRIBUTOS //
	/////////////////////////////////////////////////////////////
	
	private String nombre;
	private String cip;
	private String ciudad;
	private Libro[] libros = new Libro[20];
	private int contador = 0;
	
	// FUNCIONES //
	/////////////////////////////////////////////////////////////
	
	public boolean AnyadirLibro(Libro libro) {
		
		if (this.contador < this.libros.length) {
			
			this.libros[contador] = libro;
			
			this.contador++;
			
			System.out.println(CIAN + "LIBRO AÑADIDO" + RESET);
			return true;
		}
		
		else {
			
			System.out.println(ROJO + "LIBRO NO AÑADIDO" + RESET);
			return false;
		}
	}
	
	public boolean BorrarLibro(String codigo) {
		
		boolean encontrado = false;
		
		for (int i = 0; i < this.contador; i++) {
			
			if (this.libros[i].getCodigo().equals(codigo)) {
				
				this.libros[i] = this.libros[this.contador - 1];
				
				this.libros[this.contador - 1] = null;
				
				contador--;
				
				encontrado = true;
				
				System.out.println(CIAN + "LIBRO CON CÓDIGO (" + codigo + ") BORRADO" + RESET);
				return encontrado;
			}
		}
		if (!encontrado) System.out.println(ROJO + "LIBRO CON CÓDIGO (" + codigo + ") NO ENCONTRADO" + RESET);
		return encontrado;
	}
	
	public boolean RecogidaTemporal(Libro[] libros) throws Exception {
		
		for (int i = 0; i < this.libros.length; i++) {
			
			this.libros[contador + i] = libros[i];
		}
		throw new Exception(ROJO + "ERROR, NO SE HAN PODIDO MOVER TODOS LOS LIBROS" + RESET);
	}
	
	// CONS, SET, GET //
	/////////////////////////////////////////////////////////////
	
	public Biblioteca() {
	}

	public Biblioteca(String nombre, String cip, String ciudad, int contador) {
		this.nombre = nombre;
		this.cip = cip;
		this.ciudad = ciudad;
		this.contador = contador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCip() {
		return cip;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Libro[] getLibros() {
		return libros;
	}

	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}
	
	public static final String RESET = "\u001B[0m", MORADO = "\u001B[35m", ROJO = "\u001B[31m", AZUL = "\u001B[34m", CIAN = "\u001B[36m", VERDE = "\u001B[32m", AMARILLO = "\u001B[33m";
}

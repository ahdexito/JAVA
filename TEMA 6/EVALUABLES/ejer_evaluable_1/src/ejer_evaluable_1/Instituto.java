package ejer_evaluable_1;

public class Instituto {
    
    private String nombre;
	private int tamanyo = 10;
	private Titular[] titulares = new Titular[tamanyo];
	private Interino[] interinos = new Interino[tamanyo];
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// AÑADIR PROFESOR INTERINO A ARRAY DE INTERINOS //
	public boolean AnyadirProfesor(Interino interino) {

		for (int i = 0; i < tamanyo; i++) {

			if (this.interinos[i] == null) {

				this.interinos[i] = interino;
				return true;
			}
		}
		return false;
	}
	
	// AÑADIR PROFESOR TITULAR A ARRAY DE TITULARES //
	public boolean AnyadirProfesor(Titular titular) {
		
		for (int i = 0; i < tamanyo; i++) {
			
			if (this.titulares[i] == null) {
				
				this.titulares[i] = titular;
				return true;
			}
		}
		return false;
	}
	
	public boolean EliminarProfesor(String dni) {
		
		for (int i = 0; i < tamanyo; i++) {
			
			// DEJAR DE BUSCAR CUANDO ENCUENTRE EL PRIMER NULL EN AMBOS ARRAYS //
			if (this.interinos[i] == null && this.titulares[i] == null) return false;
			
			// BUSCAR COINCIDENCIA DEL DNI DENTRO DEL ARRAY INTERINOS //
			if (this.interinos[i].getDni().equals(dni)) {
				
				// BORRAR DIRECTAMENTE SI ES EL ÚLTIMO DEL ARRAY //
				if (i == tamanyo - 1) {
					this.interinos[i] = null;
					return true;
				}
				
				// BUSCAR EL PRIMER NULL DEL ARRAY PARA ENCONTRAR AL ÚLTIMO PROFESOR AÑADIDO //
				else {
					for (int j = 0; j < tamanyo; j++) {

						if (this.interinos[j] == null) {

							// EL PROFESOR A BORRAR SE REEMPLAZA POR EL ÚLTIMO PROFESOR AÑADIDO //
							this.interinos[i] = this.interinos[j - 1];
							this.interinos[j - 1] = null;
							return true;
						}
					}
				}
			}
			
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			// BUSCAR COINCIDENCIA DEL DNI DENTRO DEL ARRAY PROFESORES //
			if (this.titulares[i].getDni().equals(dni)) {
				
				// BORRAR DIRECTAMENTE SI ES EL ÚLTIMO DEL ARRAY //
				if (i == tamanyo - 1) {
					this.titulares[i] = null;
					return true;
				}
				
				// BUSCAR EL PRIMER NULL DEL ARRAY PARA ENCONTRAR AL ÚLTIMO PROFESOR AÑADIDO //
				else {
					for (int j = 0; j < tamanyo; j++) {

						if (this.titulares[j] == null) {

							// EL PROFESOR A BORRAR SE REEMPLAZA POR EL ÚLTIMO PROFESOR AÑADIDO //
							this.titulares[i] = this.titulares[j - 1];
							this.titulares[j - 1] = null;
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public boolean AmpliarContrato(String dni, int meses) {
		
		for (int i = 0; i < tamanyo; i++) {
			
			// DEJAR DE BUSCAR CUANDO ENCUENTRE EL PRIMER NULL //
			if (this.interinos[i] == null) return false;
				
			// BUSCAR COINCIDENCIA DEL DNI DENTRO DEL ARRAY INTERINOS //
			if (this.interinos[i].getDni().equals(dni)) {

				// SI COINCIDE, REALIZAR OPERACIÓN //
				meses += this.interinos[i].getTiempoContrato();
				this.interinos[i].setTiempoContrato(meses);
				return true;
			}	
		}
		return false;
	}

	public void MostrarInformacion() {
		
		// MOSTRAR INFORMACIÓN DE INTERINOS //
		for (int i = 0; i < (tamanyo); i++) {
			
			if (this.interinos[i] != null) {
				
				this.interinos[i].MostrarInformacion();
			}
		}
		
		// MOSTRAR INFORMACIÓN DE TITULARES //
		for (int i = 0; i < (tamanyo); i++) {
			
			if (this.titulares[i] != null) {
				
				this.titulares[i].MostrarInformacion();
			}
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Instituto() {
	}

	public Instituto(String nombre, Titular[] titulares, Interino[] interinos) {
		this.nombre = nombre;
		this.titulares = titulares;
		this.interinos = interinos;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Titular[] getTitulares() {
		return titulares;
	}

	public void setTitulares(Titular[] titulares) {
		this.titulares = titulares;
	}

	public Interino[] getInterinos() {
		return interinos;
	}

	public void setInterinos(Interino[] interinos) {
		this.interinos = interinos;
	}

	public int getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}
}
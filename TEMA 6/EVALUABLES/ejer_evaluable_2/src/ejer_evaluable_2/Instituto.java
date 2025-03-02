package ejer_evaluable_2;

public class Instituto {
    
    private String nombre;
	private int tamanyo = 10;
	private Profesor[] profesores = new Profesor[tamanyo];
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// AÑADIR PROFESOR INTERINO A ARRAY DE PROFESORES //
	public boolean AnyadirProfesor(Profesor profesor) {

		for (int i = 0; i < tamanyo; i++) {
			
			if (this.profesores[i] == null) {

				this.profesores[i] = profesor;
				return true;
			}
		}
		return false;
	}
	
	public boolean EliminarProfesor(String dni) {
		
		for (int i = 0; i < tamanyo; i++) {
			
			// BUSCAR COINCIDENCIA DEL DNI DENTRO DEL ARRAY PROFESORES //
			if (this.profesores[i] != null) {
				if (this.profesores[i].getDni().equals(dni)) {
					
					this.profesores[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean AmpliarContrato(String dni, int meses) {
		
		for (int i = 0; i < tamanyo; i++) {
			
			if (this.profesores[i] != null) {
				if (this.profesores[i] instanceof Interino) {
					if (this.profesores[i].getDni().equals(dni)) {
						
						Interino interino = (Interino)this.profesores[i];
						meses += interino.getTiempoContrato();
						interino.setTiempoContrato(meses);
						return true;
					}
				}
			}	
		}
		return false;
	}

	public void MostrarInformacion() {
		
		// MOSTRAR INFORMACIÓN DE PROFESORES //
		for (int i = 0; i < (tamanyo); i++) {
			
			if (this.profesores[i] != null) {
				
				this.profesores[i].MostrarInformacion();
			}
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Instituto() {
	}

	public Instituto(String nombre, Profesor[] profesor) {
		this.nombre = nombre;
		this.profesores = profesores;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}

	public int getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}
}
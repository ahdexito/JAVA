package ejer_evaluable_3;

public class Hospital {
    
	// FALTAR ESPECIFICAR TAMAÑO MÁXIMO DE ARRAY
    private Persona[] personas;

	public Hospital() {
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean CrearPersona(Persona persona) {
		
		for (int i = 0; i < personas.length; i++) {
			
			if (personas[i] == null) {
				personas[i] = persona;
				return true;
			}
		}
		return false;
	}
	
	public boolean Despedir(String dni) {
		
		for (int i = 0; i < personas.length; i++) {
			
			if (personas[i] != null) {
				if (personas[i] instanceof Enfermero) {
					if (personas[i].getDni().equals(dni)) {
						personas[i] = null;
						return true;
					}
				}
			}
		}
		return false;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Hospital(Persona[] personas) {
		this.personas = personas;
	}

	public Persona[] getPersonas() {
		return personas;
	}

	public void setPersonas(Persona[] personas) {
		this.personas = personas;
	}
}
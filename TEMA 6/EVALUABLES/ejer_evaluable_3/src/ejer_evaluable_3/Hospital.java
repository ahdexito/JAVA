package ejer_evaluable_3;

public class Hospital {
    
    private Persona[] personas = new Persona[50];

	public Hospital() {
	}
	
	public Hospital(Persona[] personas) {
		this.personas = personas;
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
			
			// TERMINAR SI SE ENCUENTRA UN NULL //
			if (personas[i] == null) return false;
			
			// BUSCAR COINCIDENCIA DE DNI ENTRE TODAS LAS PERSONAS //
			if (personas[i].getDni().equals(dni)) {
				
				// COMPROBAR QUE ESA PERSONA SEA ENFERMERO //
				if (personas[i] instanceof Enfermero) {
					
					// SI EL ENFERMERO ERA EL ÚLTIMO DEL ARRAY, SE BORRA DIRECTAMENTE //
					if (i == personas.length - 1) {
						personas[i] = null;
						return true;
					}
					
					// SI NO ES EL ÚLTIMO, BUSCAR POSICIÓN DEL ÚLTIMO //
					for (int j = 0; j < personas.length; j++) {
						
						// SE REEMPLAZA EL ENFERMERO A BORRAR POR LA ÚLTIMA PERSONA AÑADIDA, Y SE BORRA EL ÚLTIMO //
						if (personas[j] == null) {
							
							personas[i] = personas[j - 1];
							personas[j - 1] = null;
							return true;
						}
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
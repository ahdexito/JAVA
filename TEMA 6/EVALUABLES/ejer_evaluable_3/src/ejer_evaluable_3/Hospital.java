package ejer_evaluable_3;

public class Hospital {
    
    private Persona[] personas;

	public Hospital() {
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean CrearPersona(Persona persona) {
		
		return false;
	}
	
	public boolean Despedir(String dni) {
		
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
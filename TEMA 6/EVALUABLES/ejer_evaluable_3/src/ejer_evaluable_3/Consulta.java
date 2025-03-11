package ejer_evaluable_3;

enum TipoConsulta {
	Cirugia, Molestias, Dolor, Herida
}

public class Consulta {
    
    private String motivo;
	private PersonalHospital personalHospital;
	TipoConsulta tipoConsulta;
	
	public Consulta() {
	}

	public Consulta(String motivo, PersonalHospital personalHospital, TipoConsulta tipoConsulta) {
		this.motivo = motivo;
		this.personalHospital = personalHospital;
		this.tipoConsulta = tipoConsulta;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public PersonalHospital getPersonalHospital() {
		return personalHospital;
	}

	public void setPersonalHospital(PersonalHospital personalHospital) {
		this.personalHospital = personalHospital;
	}

	public TipoConsulta getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(TipoConsulta tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
}
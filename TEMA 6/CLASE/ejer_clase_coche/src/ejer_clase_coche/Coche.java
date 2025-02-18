package ejer_clase_coche;

public class Coche {
    
	private String matricula;
	private Motor motor;
	private Rueda[] ruedas;

	public Coche(String matricula) {
		
		this.matricula = matricula;
		
		this.motor = new Motor("V8");
		
		this.ruedas = new Rueda[4];
		Rueda rueda = new Rueda(18);
		
		for (int i = 0; i < ruedas.length; i++) {
			ruedas[i] = rueda;
		}
		
	}
	
	public void MostrarInfo() {
		
		System.out.println("Matrícula: " + this.matricula);
		
		this.motor.MostrarInfo();
		
		this.ruedas[0].MostrarInfo();
	}
}


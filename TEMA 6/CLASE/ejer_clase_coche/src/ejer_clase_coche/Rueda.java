package ejer_clase_coche;

public class Rueda {
    
    private int tamanyo;

	public Rueda(int tamanyo) {
		
		this.tamanyo = tamanyo;
	}
	
	public void MostrarInfo() {
		
		System.out.println("Tamaño rueda: " + this.tamanyo);
	}
}
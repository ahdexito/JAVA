package ejer_auto_interfaces_05;

public class Coche extends Vehiculo implements IPedales, IVolante {

	public Coche() {
	}

	public Coche(String matricula, int puertas, int ruedad, int velocidad, int velocidadMaxima) {
		super(matricula, puertas, ruedad, velocidad, velocidadMaxima);
	}
	
	@Override
	public void Acelerar(int cantidad) {
		
	}

	@Override
	public void Frenar(int cantidad) {
		
	}

	@Override
	public void GirarIzquierda() {
		
	}

	@Override
	public void GirarDerecha() {
		
	}
    
    
}
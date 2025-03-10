package ejer_auto_abstractos_01;

public class Cuadrado extends FiguraGeometrica {
	
	public Cuadrado() {
	}
	
	public Cuadrado(double ladoA) {
		super(ladoA, 0);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	@Override
	public double Area() {
		
		return 2.0;
	}
	
	@Override
	public double Perimetro() {
		
		return 2.0;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
}
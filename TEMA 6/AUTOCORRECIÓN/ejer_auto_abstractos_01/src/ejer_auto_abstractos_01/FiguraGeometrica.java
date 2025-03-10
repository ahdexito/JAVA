package ejer_auto_abstractos_01;

public abstract class FiguraGeometrica {
    
    protected double ladoA;
	protected double ladoB;
	
	public FiguraGeometrica() {
	}

	public FiguraGeometrica(double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public abstract double Area();
	
	public abstract double Perimetro();
	
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
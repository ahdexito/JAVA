package ejer_auto_abstractos_01;

public class HexagonoRegular extends FiguraGeometrica {
    
    private double altura;

	public HexagonoRegular() {
	}

	public HexagonoRegular(double altura, double ladoA) {
		super(ladoA, 0);
		this.altura = altura;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

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
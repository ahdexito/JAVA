package ejer_auto_abstractos_02;

public abstract class Triangulo {
    
    protected double base;
	protected double altura;

	public Triangulo() {
		this.base = 0;
		this.altura = 0;
	}

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public double Area() {
		
		return (this.base * this.altura) / 2;
	}
	
	public double Perimetro() {
		
		return 2.0;
	}
	
	public abstract void Dibujar();
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
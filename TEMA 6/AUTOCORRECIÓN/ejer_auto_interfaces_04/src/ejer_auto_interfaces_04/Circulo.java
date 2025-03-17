package ejer_auto_interfaces_04;

public class Circulo implements IFigura2D {
    
	private final double PI = 3.14;
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}
	
    @Override
	public double Perimetro() {
		
		return (radio * 2) * PI;
	}
	
	@Override
	public double Area() {
		
		return PI * (radio * radio);
	}
	
	@Override
	public void Escalar(double escala) {
		
		this.radio *= escala;
	}
	
	@Override
	public void Imprimir() {
		
		System.out.println("Radio: " + this.radio);
		System.out.print("; Perímetro: " + Perimetro());
		System.out.print("; Área: " + Area());
	}
}
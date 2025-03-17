package ejer_auto_interfaces_04;

public class Cuadrado implements IFigura2D {
    
    private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double Perimetro() {
		
		return lado * 4;
	}
	
	@Override
	public double Area() {
		
		return lado * lado;
	}
	
	@Override
	public void Escalar(double escala) {
		
		this.lado *= escala;
	}
	
	@Override
	public void Imprimir() {
		
		System.out.println("Lado: " + this.lado);
		System.out.print("; Perímetro: " + Perimetro());
		System.out.print("; Área: " + Area());
	}
}
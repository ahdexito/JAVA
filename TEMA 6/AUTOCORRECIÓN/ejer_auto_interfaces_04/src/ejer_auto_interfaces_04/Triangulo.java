package ejer_auto_interfaces_04;

public class Triangulo implements IFigura2D {
    
	private double ancho;
	private double alto;

	public Triangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
    @Override
	public double Perimetro() {
		
		return alto + alto + ancho;
	}
	
	@Override
	public double Area() {
		
		return (alto * ancho) / 2;
	}
	
	@Override
	public void Escalar(double escala) {
		
		this.ancho *= escala;
		this.alto *= escala;
	}
	
	@Override
	public void Imprimir() {
		
		System.out.println("Ancho: " + this.ancho);
		System.out.print("; Alto: " + this.alto);
		System.out.print("; Perímetro: " + Perimetro());
		System.out.print("; Área: " + Area());
	}
}
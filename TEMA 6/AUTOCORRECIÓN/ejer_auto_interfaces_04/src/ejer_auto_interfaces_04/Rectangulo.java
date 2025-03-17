package ejer_auto_interfaces_04;

public class Rectangulo implements IFigura2D {
    
	private double ancho;
	private double alto;

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
    @Override
	public double Perimetro() {
		
		return ancho * 2 + alto * 2;
	}
	
	@Override
	public double Area() {
		
		return ancho * alto;
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
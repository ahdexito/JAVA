package ejer_auto_herencia_2;

public class Triangulo extends FiguraGeometrica {
	
	public Triangulo() {
		super();
	}

	public Triangulo(float lado1, float lado2, float lado3) {
		super(lado1, lado2, lado3);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public float Perimetro() {
		return lado1 + lado3 * 2;
	}
}
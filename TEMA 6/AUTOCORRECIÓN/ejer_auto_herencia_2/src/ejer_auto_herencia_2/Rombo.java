package ejer_auto_herencia_2;

public class Rombo extends FiguraGeometrica {

	public Rombo() {
		super();
	}

	public Rombo(float lado1, float lado2, float lado3) {
		super(lado1, lado2, lado3);
	}
    
    public float Perimetro() {
		return this.lado3 * 4;
	}
}
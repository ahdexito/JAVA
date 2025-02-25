package ejer_auto_herencia_2;

public class FiguraGeometrica {
    
    protected float lado1;
	protected float lado2;
	protected float lado3;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public float Area() {
		return (this.lado2 * this.lado3) / 2;
	}
	
	public void MostrarSalida() {
		System.out.println("FIGURA GEOMÉTRICA"
				+ "\nLado 1: " + this.lado1
				+ "\nLado 2: " + this.lado2
				+ "\nLado 3: " + this.lado3);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public FiguraGeometrica() {
	}

	public FiguraGeometrica(float lado1, float lado2, float lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getLado3() {
		return lado3;
	}

	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}
}
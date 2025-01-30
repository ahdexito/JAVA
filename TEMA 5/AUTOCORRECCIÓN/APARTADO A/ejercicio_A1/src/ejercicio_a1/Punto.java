package ejercicio_a1;

public class Punto {
	
	int x;
	
	int y;
	
	public Punto() {}
	
	public Punto(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	void Imprimir() {
		
		System.out.printf("\n(%d, %d)\n", x, y);
	}
	
	void Desplaza(int dx, int dy) {
		
		x += dx;
		y += dy;
		
		Imprimir();
	}
	
	void Distancia(int x, int y) {
		
		System.out.println("Distancia entre puntos X: " + (this.x - x));
		
		System.out.println("Distancia entre puntos Y: " + (this.y - y));
	}
}

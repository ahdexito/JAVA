package ejer_auto_punto;

public class Punto {
	
	int x;
	int y;
	
	void Imprimir() {
		
		System.out.println("(" + x + ", " + y + ")");
	}
	
	void Desplaza(int x, int y) {
		
		this.x += x;
		this.y += y;
	}
	
	double Distancia(Punto p) {
		
		double resultado = Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
		
		return resultado;
	}
}

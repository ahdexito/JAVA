package ejercicio_a1;

public class Punto {
	
	int x;
	
	int y;
	
	void Imprimir(int x, int y) {
		
		System.out.printf("\n(%d, %d)\n", x, y);
	}
	
	void Desplaza(int dx, int dy) {
		
		x += dx;
		y += dy;
		
		Imprimir(x, y);
	}
}

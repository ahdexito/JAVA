package ejercicio_a1;

public class Punto {
	
	int x;
	
	int y;
	
	public static void Imprimir(int x, int y) {
		
		System.out.printf("\n(%d, %d)\n", x, y);
	}
	
	public void Desplaza(int dx, int dy) {
		
		x += dx;
		y += dy;
		
		Imprimir(x, y);
	}
}

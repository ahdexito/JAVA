package prog04_autorecursividad;

public class prog04_autoRecurs05 {
	
	public static int ProductoAB (int a, int b) {
		
		if (b == 0) return 0;
		return a + ProductoAB(a, b - 1);
	}

    public static void main(String[] args) {
        
        /*
        5. Crea una función recursiva que calcule el producto de dos números mediante sumas
		repe�das. Producto (a, b)
		Por ejemplo:
		Producto(5,3) = 5 + Producto(5, 2) = 5 + 5 + Producto(5, 1) = 5 + 5 + 5+ Producto(5, 0) = 5
		+ 5+ 5 + 0 = 15
        */
        
        int a = 8;
		int b = 4;
		
		System.out.println("El producto entre ambos número es: " + ProductoAB(a, b));
        
    }
}

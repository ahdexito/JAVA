package ejer_auto_rectangulo;

public class Rectangulo {
	
	double ancho;
	double alto;
	char caracter = 'x';
	
	void Dibujar() {
		
		for (int i = 0; i < alto; i++) {
			
			for (int j = 0; j < ancho; j++) {
				
				System.out.print(caracter + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	double Perimetro() {
		
		return ancho * 2 + alto * 2;
	}
	
	double Area() {
		
		return ancho * alto;
	}
}

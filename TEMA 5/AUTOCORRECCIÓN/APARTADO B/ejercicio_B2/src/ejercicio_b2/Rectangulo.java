package ejercicio_b2;

public class Rectangulo {

	int ancho;
	int alto;
	char caracter = 'X';

	void Dibujar() {

		for (int i = 0; i < alto; i++) {

			for (int j = 0; j < ancho; j++) {

				System.out.print(caracter + " ");
			}

			System.out.println("");
		}
	}
	
	double Perimetro() {
		
		return (ancho * 2) + (alto * 2);
	}
	
	double Area() {
		
		return ancho * alto;
	}
}

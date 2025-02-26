package ejer_auto_herencia_3;

public class Electrodomestico {
    
    private float precio;
	private String color;
	private char consumoElectrico;
	private float peso;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private void ComprobarConsumoEnergetico(char letra) {
		
		letra = this.consumoElectrico;
		
		char r = 'a';
		
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') 
			setConsumoElectrico(letra);
		
		else
			setConsumoElectrico('F');
	}
	
	public void PrecioFinal() {
		switch (this.consumoElectrico) {
			case 'A':
				this.precio += 100;
				break;
			case 'B':
				this.precio += 80;
				break;
			case 'C':
				this.precio += 60;
				break;
			case 'D':
				this.precio += 50;
				break;
			case 'E':
				this.precio += 30;
				break;
			case 'F':
				this.precio += 10;
				break;
		}
		
		if (this.peso >= 0 && this.peso < 20) this.precio += 10;
		else if (this.peso >= 20 && this.peso < 50) this.precio += 50;
		else if (this.peso >= 50 && this.peso < 80) this.precio += 80;
		else this.precio += 100;
	}
	
	public void PrecioConDescuento() {
		
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Electrodomestico() {
		this.precio = 100;
		this.color = "blanco";
		this.consumoElectrico = 'F';
		this.peso = 5;
	}

	public Electrodomestico(float precio, String color, char consumoElectrico, float peso) {
		this.precio = precio;
		this.color = color;
		ComprobarConsumoEnergetico(consumoElectrico);
		this.peso = peso;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoElectrico() {
		return consumoElectrico;
	}

	public void setConsumoElectrico(char consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
}
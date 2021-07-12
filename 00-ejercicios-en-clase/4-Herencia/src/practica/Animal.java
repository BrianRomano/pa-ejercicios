package practica;

public class Animal {
	protected String tipoAnimal;
	protected String tipoComida;
	protected String localizacion;
	protected String tamanio;

	// Constructor por defecto
	public Animal() {
	}

	// Constructor Sobrecargado
	public Animal(String ta, String tc, String loc, String tam) {
		this.tipoAnimal = ta;
		this.tipoComida = tc;
		this.localizacion = loc;
		this.tamanio = tam;
	}

	// Método toString() sobreescrito
	public String toString() {
		return tipoAnimal + tipoComida + localizacion + tamanio;
	}

	public void comer() {
		System.out.println("Me alimento como un ...");
	}

	public void rugir() {
		System.out.println("Emito un rugido como un...");

	}

	public void hacerRuido() {
		System.out.println("Emito ruido como un...");
	}

	public void dormir() {
		System.out.println("Duermo como un Animal");
	}
}

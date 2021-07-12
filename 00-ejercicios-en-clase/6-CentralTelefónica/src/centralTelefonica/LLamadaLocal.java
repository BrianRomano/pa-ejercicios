package centralTelefonica;

public class LLamadaLocal extends LLamada {
	// Atributos
	private double precio = 15;

	// Constructores
	public LLamadaLocal(String numOrigen, String numDestino, int duracion) {
		super(numOrigen, numDestino, duracion);
	}

	// Métodos
	public double calcularPrecio() {
		return getDuracion() * precio;
	}

	public String toString() {
		return "LLamada Local #" + getNumOrigen() + " - #" + getNumDestino()
				+ " - " + getDuracion() + "sg";

	}

}

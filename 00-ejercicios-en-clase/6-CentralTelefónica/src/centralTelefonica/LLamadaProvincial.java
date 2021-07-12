package centralTelefonica;

public class LLamadaProvincial extends LLamada {

	private double precio1 = 20;
	private double precio2 = 25;
	private double precio3 = 30;
	private int franja = 0;

	public LLamadaProvincial(String numOrigen, String numDestino, int duracion,
			int franja) {
		super(numOrigen, numDestino, param3);
		this.franja = franja;
	}

	public double calcularPrecio() {
		if (franja == 1)
			return getDuracion() * precio1;
		else if (franja == 2)
			return getDuracion() * precio2;
		else
			return getDuracion() * precio3;

	}

	public String toString() {
		return "LLamada Provincial #" + getNumOrigen() + " - #"
				+ getNumDestino() + " - " + getDuracion() + "sg - #" + franja;
	}

}

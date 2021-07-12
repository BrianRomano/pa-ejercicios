package figuras;

public class Circulo extends FiguraGeometrica{
	
	private int radio;

	public Circulo(int radio) {
		super("Círculo");
		this.radio = radio;
	}

	@Override
	public double area() {
		
		return Math.PI*Math.pow(radio, 2);
	}



	
	
}

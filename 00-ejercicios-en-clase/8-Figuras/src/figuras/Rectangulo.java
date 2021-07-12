package figuras;

public class Rectangulo extends FiguraGeometrica {
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		super("Rectángulo");
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {

		return base * altura;
	}

}

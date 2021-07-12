package figuras;

public abstract class FiguraGeometrica {

	private String nombre;

	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}

	public abstract double area();

	public String toString() {
		return nombre + ":" + "area=" + area();
	}

}

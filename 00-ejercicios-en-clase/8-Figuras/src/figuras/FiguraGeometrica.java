package figuras;

public abstract class FiguraGeometrica {

	private String nombre;

	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}

	public static double areaPromedio(FiguraGeometrica arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].area();
		}
		return sum / arr.length;
	}

	public abstract double area();

	public String toString() {
		return nombre + ":" + "area=" + area();
	}

}

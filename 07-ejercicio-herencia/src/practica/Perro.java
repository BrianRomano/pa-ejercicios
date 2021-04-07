package practica;

public class Perro extends Canino {
	public Perro() {
	}

	public Perro(String ta, String tc, String tam, String loc) {
		super(ta, tc, tam, loc);
	}

	public void comer() {
		System.out.println("Me alimento como un Perro");
	}

	// Método comer() sobrecargado
	public void comer(String tipoAlimento) {
		System.out.println(tipoAlimento);

	}

	public void hacerRuido() {
		System.out.println("Emito ruido como un Perro");

	}

	public void vacunar() {
		System.out.println("Deben vacunarme regularmente");

	}
}
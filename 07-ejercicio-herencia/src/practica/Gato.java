package practica;

public class Gato extends Felino {
	public Gato() {
	}

	public Gato(String ta, String tc, String tam, String loc) {
		super(ta, tc, tam, loc);
	}

	public void comer() {
		System.out.println("Me alimento como un Gato");
	}

	// Método comer() sobrecargado
	public void comer(String tipoAlimento) {
		System.out.println(tipoAlimento);
	}

	public void hacerRuido() {
		System.out.println("Emito ruido como un Gato");

	}

	public void vacunar() {
		System.out.println("Deben vacunarme regularmente");
	}
}

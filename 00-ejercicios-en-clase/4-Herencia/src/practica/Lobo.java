package practica;

public class Lobo extends Canino {
	public Lobo() {
	};

	public Lobo(String ta, String tc, String tam, String loc) {
		super(ta, tc, tam, loc);
	}

	public void comer() {
		System.out.println("Me alimento como un Lobo");
	}

	// Método comer() sobrecargado
	public void comer(String tipoAlimento) {
		System.out.println(tipoAlimento);
	}

	public void hacerRuido() {
		System.out.println("Emito ruido como un Lobo");

	}
}

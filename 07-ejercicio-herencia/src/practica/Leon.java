package practica;

public class Leon extends Felino {
	public Leon() {
	}

	public Leon(String ta, String tc, String tam, String loc) {
		super(ta, tc, tam, loc);

	}

	public void comer() {
		System.out.println("Me alimento como un León");
	}

	// Método comer() sobrecargado
	public void comer(String tipoAlimento) {
		System.out.println(tipoAlimento);
	}

	public void hacerRuido() {
		System.out.println("Emito ruido como un León");

	}
}

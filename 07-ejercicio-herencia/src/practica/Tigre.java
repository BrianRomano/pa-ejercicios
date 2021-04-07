package practica;

public class Tigre extends Felino {
	public Tigre() {
	}

	public Tigre(String ta, String tc, String tam, String loc) {
		super(ta, tc, tam, loc);

	}

	public void comer() {
		System.out.println("Me alimento como un Tigre");
	}

	// Método comer() sobrecargado
	public void comer(String tipoAlimento) {
		System.out.println(tipoAlimento);
	}

	public void hacerRuido() {
		System.out.println("Emito ruido como un Tigre");

	}
}
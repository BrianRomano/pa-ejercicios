package notas;

public class Profesor {
	public void ponerNotas(Alumno alum) {
		alum.getAsigntaura1().setCalificacion(Math.random() * 10);
		alum.getAsigntaura2().setCalificacion(Math.random() * 10);
		alum.getAsigntaura3().setCalificacion(Math.random() * 10);
	}

	public double calcularMedia(Alumno alum) {
		double nota1 = alum.getAsigntaura1().getCalificacion();
		double nota2 = alum.getAsigntaura2().getCalificacion();
		double nota3 = alum.getAsigntaura3().getCalificacion();
		return (nota1 + nota2 + nota3) / 3;
	}
}

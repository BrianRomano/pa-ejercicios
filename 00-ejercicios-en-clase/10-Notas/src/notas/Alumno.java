package notas;

public class Alumno {
	private Asignatura asignatura1;
	private Asignatura asignatura2;
	private Asignatura asignatura3;

	public Alumno(Asignatura asig1, Asignatura asig2, Asignatura asig3) {
		asignatura1 = asig1;
		asignatura2 = asig2;
		asignatura3 = asig3;
	}

	public Alumno(int param1, int param2, int param3) {
		asignatura1 = new Asignatura(param1);
		asignatura2 = new Asignatura(param2);
		asignatura3 = new Asignatura(param3);
	} // Getters

	public Asignatura getAsigntaura1() {
		return asignatura1;
	}

	public Asignatura getAsigntaura2() {
		return asignatura2;
	}

	public Asignatura getAsigntaura3() {
		return asignatura3;

	}
}
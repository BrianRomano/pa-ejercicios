package notas;

public class Principal {

	public static void main(String[] args) {
		Asignatura programacion = new Asignatura(1);
		Asignatura redes = new Asignatura(2);
		Asignatura estadistica = new Asignatura(3);
		Alumno a = new Alumno(programacion, redes, estadistica);
		Profesor p = new Profesor();
		p.ponerNotas(a);
		System.out.println("La media del alumno es: " + p.calcularMedia(a));

	}

}

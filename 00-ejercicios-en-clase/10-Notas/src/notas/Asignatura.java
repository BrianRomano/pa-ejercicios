package notas;

public class Asignatura {
	
	public int identificador;
	public double calificacion;
	
	public Asignatura(int id)
	{
	identificador = id;
	}
	
	public int getIdentificador()
	{
	return identificador;
	}
	public double getCalificacion()
	{
	return calificacion;
	}
	
	public void setCalificacion(double cali)
	{
	calificacion = cali;
	}
	}

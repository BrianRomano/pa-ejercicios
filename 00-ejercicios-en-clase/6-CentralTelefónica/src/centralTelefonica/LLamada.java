package centralTelefonica;

public abstract class LLamada {
	//Atributos
	private String numOrigen;
	private String numDestino;
	private double duracion;
	
	//Constructores
	public LLamada(String numOrigen, String numDestino, double duracion){
		this.numOrigen=numOrigen;
		this.numDestino=numDestino;
		this.duracion=duracion;
		
	}

	public String getNumOrigen() {
		return numOrigen;
	}

	public String getNumDestino() {
		return numDestino;
	}

	public double getDuracion() {
		return duracion;
	}
	//Métodos
 public abstract double calcularPrecio();
	
	}



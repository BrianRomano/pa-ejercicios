package centralTelefonica;

public class Central {
	//Atributos
	private int cont = 0;
	private double acum = 0;
	
	//Getters
	public int totalLLamadas(){
		return cont;
	}
	public double getTotaFacturado(){
		return acum;
	}
	//M�todos
	public void registrarLlamada(LLamada param){
		System.out.println(param);
		cont++;
		acum+=param.calcularPrecio();
		
	
	}
}
	
	


